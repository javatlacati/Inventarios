package inventarios.controller;

import inventarios.service.BillingService;
import inventarios.service.EmployeeService;
import inventarios.service.LoginUsersService;
import inventarios.service.OrderService;
import inventarios.service.ProductService;
import inventarios.service.ProviderService;
import inventarios.service.PurchaseService;
import inventarios.to.LoginUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(SpringJUnit4ClassRunner.class)
@WebMvcTest
public class SimpleAuthenticationControllerIT {

    @Autowired
    private MockMvc mvc;

    @Autowired
    WebApplicationContext webApplicationContext;

    @MockBean
    private EmployeeService employeeService;

    @MockBean
    private OrderService orderService;

    @MockBean
    private ProductService productService;

    @MockBean
    private ProviderService providerService;

    @MockBean
    private PurchaseService purchaseService;

    @MockBean
    private LoginUsersService loginUsersService;

    @MockBean
    private BillingService billingService;

    @Test
    public void loginAttempt() throws Exception {
        LoginUser invalidUser = new LoginUser("wrong", "wrong");
        when(loginUsersService.login(invalidUser))
                .thenReturn(false);
        String uri = "/login";
        MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders
                .post(uri, invalidUser)
                .accept(MediaType.APPLICATION_JSON_VALUE))
                .andReturn();
        int status = mvcResult
                .getResponse()
                .getStatus();
        assertEquals(200, status);
        String content = mvcResult.getResponse().getContentAsString();
        assertEquals("false", content);
    }
}

package inventarios.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import inventarios.service.LoginUsersService;
import inventarios.to.LoginUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doReturn;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

//@RunWith(SpringJUnit4ClassRunner.class)
@RunWith(SpringRunner.class)
@WebMvcTest(controllers = SimpleAuthenticationController.class)
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//@AutoConfigureMockMvc
public class SimpleAuthenticationControllerIT {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private LoginUsersService loginUsersService;


//
//    @Before
//    public void setup() {
//
//    }

    @Test
    public void loginAttemptFailed() throws Exception {
        LoginUser invalidUser = new LoginUser("wrong", "wrong");

        doReturn(Boolean.FALSE)
                .when(loginUsersService)
                .login(
                        any(LoginUser.class)
                );

        String uri = "/login";
        MvcResult mvcResult = this.mvc.perform(MockMvcRequestBuilders
                .post(uri)
                .contentType(MediaType.APPLICATION_JSON_VALUE)
                .content(new ObjectMapper().writer().withDefaultPrettyPrinter().writeValueAsString(invalidUser))
                .accept(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().isOk())
                .andReturn();
        int status = mvcResult
                .getResponse()
                .getStatus();
        assertEquals(200, status);
        String content = mvcResult.getResponse().getContentAsString();
        assertEquals("false", content);
    }

    @Test
    public void loginAttempt() throws Exception {
        LoginUser invalidUser = new LoginUser("wrong", "wrong");

        doReturn(Boolean.TRUE)
                .when(loginUsersService)
                .login(
                        any(LoginUser.class)
                );

        String uri = "/login";
        MvcResult mvcResult = this.mvc.perform(MockMvcRequestBuilders
                .post(uri)
                .contentType(MediaType.APPLICATION_JSON_VALUE)
                .content(new ObjectMapper().writer().withDefaultPrettyPrinter().writeValueAsString(invalidUser))
                .accept(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print())
                .andExpect(status().isOk())
                .andReturn();
        int status = mvcResult
                .getResponse()
                .getStatus();
        assertEquals(200, status);
        String content = mvcResult.getResponse().getContentAsString();
        assertEquals("true", content);
    }
}

/* 
 * Copyright (C) 2019 Ruslan López Carro
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package inventarios.controller;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import inventarios.service.BillingService;
import inventarios.service.EmployeeService;
import inventarios.service.LoginUsersService;
import inventarios.service.OrderService;
import inventarios.service.ProductService;
import inventarios.service.ProviderService;
import inventarios.service.PurchaseService;
import inventarios.to.EmployeeDetail;
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

import java.io.IOException;
import java.util.Collections;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.BDDMockito.given;


/**
 *
 * @author Ruslan López Carro <scherzo16 at gmail.com>
 */
@RunWith(SpringJUnit4ClassRunner.class)
//@SpringBootTest(classes = {EmployeeController.class})
//@WebAppConfiguration
@WebMvcTest
public class EmployeeControllerIT {

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

//    protected void setUp() {
//        mvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
//    }

    @Test
    public void getEmployeeList() throws Exception {

        given(employeeService.findAll())
                .willReturn(
                        Collections.singletonList(
                                new EmployeeDetail(1L, "number", "name", "middle name", "last name", "home address", "position", "starttime", "end time")
                        )
                );

        String uri = "/employees";
        MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri)
                .accept(MediaType.APPLICATION_JSON_VALUE)).andReturn();
        int status = mvcResult.getResponse().getStatus();
        assertEquals(200, status);
        String content = mvcResult.getResponse().getContentAsString();
        EmployeeDetail[] productlist = mapFromJson(content, EmployeeDetail[].class);

        assertTrue(productlist.length == 1);
    }

    protected <T> T mapFromJson(String json, Class<T> clazz)
            throws JsonParseException, JsonMappingException, IOException {

        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(json, clazz);
    }
    
}

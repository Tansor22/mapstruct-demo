package my.demos.mapstruct.controllers

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.result.MockMvcResultMatchers
import spock.lang.Specification

@SpringBootTest
@ContextConfiguration
@AutoConfigureMockMvc
class UserControllerTest extends Specification {
    @Autowired
    MockMvc mockMvc

    def "hello test"() {
        expect:
            mockMvc.perform(MockMvcRequestBuilders.get('/rest/hello'))
                    .andExpect(MockMvcResultMatchers.status().isOk())
                    .andExpect(MockMvcResultMatchers.content().string("Hello"))
    }
}


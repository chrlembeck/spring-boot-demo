package de.chrlembeck.springbootdemo;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class) // JUnit mit Spring-Konfiguration starten
@WebMvcTest
public class HelloWorldTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void helloWorldTest() throws Exception {
        mockMvc.perform(get("/hello") // http://localhost/hello Aufrufen
                .param("name", "World")) // Parameter name=World übergeben
        .andExpect(status().isOk()) // Status auf OK (200) prüfen
        .andExpect(content().string("Hello, World\n")); // Inhalt prüfen
    }
}

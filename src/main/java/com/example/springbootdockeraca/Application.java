package com.example.springbootdockeraca;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

  @RequestMapping("/")
  public String home() {
    return "<html>" +
         "  <head>" +
         "    <title>Microsoft Azure</title>" +
         "    <link rel=\"stylesheet\" type=\"text/css\" href=\"/styles.css\">" +
         "  </head>" +
         "  <body>" +
         "    <div id='root'>" +
         "      <div>" +
         "        <h1>Azure Container Apps</h1>" +
         "      </div><br />" +
         "      <div className='logo-container'>" +
         "        <a href='https://microsoft.com' target='_blank'>" +
         "          <img src= 'https://uhf.microsoft.com/images/microsoft/RE1Mu3b.png' className='logo react' alt='Microsoft logo' />" +
         "        </a>" +
         "      </div><br />" +
         
         "      <div className='card'>" +
         "        <p>This is a demonstration of a Azure Container App for Java SpringBoot.</p>" +
         "      </div>" +
         "    </div>" +
         "  </body>" +
         "</html>";
  }

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }

}
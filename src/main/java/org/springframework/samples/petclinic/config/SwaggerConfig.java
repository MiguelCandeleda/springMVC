/*
 * Copyright 2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.samples.petclinic.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Collections;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

/**
 * Java config for Springfox swagger documentation plugin
 *
 * @author Vitaliy Fedoriv
 */
@Configuration
public class SwaggerConfig {

    @Bean
    OpenAPI customOpenAPI() {

        return new OpenAPI().components(new Components()).info(new Info()
                .title("REST Petclinic backend Api Documentation").version("1.0")
                .termsOfService("Petclinic backend terms of service")
                .description(
                        "This is REST API documentation of the Spring Petclinic backend. If authentication is enabled, when calling the APIs use admin/admin")
                .license(swaggerLicense()).contact(swaggerContact()));
    }

    private Contact swaggerContact() {
        Contact petclinicContact = new Contact();
        petclinicContact.setName("Miguel Acosta");
        petclinicContact.setEmail("miguel86acosta@gmail.com");
        petclinicContact.setUrl("https://github.com/MiguelCandeleda/SpringMVC.git");
        return petclinicContact;
    }

    private License swaggerLicense() {
        License petClinicLicense = new License();
        petClinicLicense.setName("Apache 2.0");
        petClinicLicense.setUrl("http://www.apache.org/licenses/LICENSE-2.0");
        petClinicLicense.setExtensions(Collections.emptyMap());
        return petClinicLicense;
    }

}

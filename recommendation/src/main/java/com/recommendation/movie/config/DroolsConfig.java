package com.recommendation.movie.config;

import org.drools.compiler.kie.builder.impl.KieFileSystemImpl;
import org.kie.api.KieServices;
import org.kie.api.builder.KieBuilder;
import org.kie.api.builder.KieFileSystem;
import org.kie.api.builder.KieModule;
import org.kie.api.runtime.KieContainer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DroolsConfig {
    private static final KieServices kieServices = KieServices.Factory.get();
    private static final String RULES_MEDICINE_RULES_DRL = "com.recommendation.movie.rules/medicine_symptoms.drl";
    @Bean
    public KieContainer kieContainer() {
        KieFileSystem kieFileSystem = new KieFileSystemImpl();
        kieFileSystem.write(kieServices.getResources().newClassPathResource(RULES_MEDICINE_RULES_DRL));
        KieBuilder kieBuilder = kieServices.newKieBuilder(kieFileSystem);
        kieBuilder.buildAll();
        KieModule kieModule = kieBuilder.getKieModule();
        return kieServices.newKieContainer(kieModule.getReleaseId());
    }
}

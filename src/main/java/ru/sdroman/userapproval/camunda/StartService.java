package ru.sdroman.userapproval.camunda;

import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.spring.boot.starter.event.PostDeployEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class StartService {

    private final RuntimeService runtimeService;

    public StartService(RuntimeService runtimeService) {
        this.runtimeService = runtimeService;
    }

    @EventListener
    public void processPostDeploy(PostDeployEvent event) {
        runtimeService.startProcessInstanceByKey("user-approver");
    }

}

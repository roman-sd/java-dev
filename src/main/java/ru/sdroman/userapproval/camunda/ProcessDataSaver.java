package ru.sdroman.userapproval.camunda;

import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Named;

@Named
public class ProcessDataSaver implements JavaDelegate {
    private final static Logger logger = LoggerFactory.getLogger(ProcessDataSaver.class);

    private final RuntimeService runtimeService;

    public ProcessDataSaver(RuntimeService runtimeService) {
        this.runtimeService = runtimeService;
    }

    @Override
    public void execute(DelegateExecution execution) throws Exception {
        String prId = execution.getProcessInstanceId();
        String item = (String) execution.getVariable("item");
        logger.info("ProcessInstanceId: " + prId);
        logger.info("Variables: " + runtimeService.getVariables(execution.getId()));
    }
}

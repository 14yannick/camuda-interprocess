package org.camunda.bpm.unittest;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class DummyDelegate1 implements JavaDelegate {

    @Override
    public void execute(DelegateExecution arg0) throws Exception {
        Logger.getLogger(DummyDelegate1.class.getName()).log(Level.SEVERE, "Delegate Slave", "delegate Slave");

    }

}

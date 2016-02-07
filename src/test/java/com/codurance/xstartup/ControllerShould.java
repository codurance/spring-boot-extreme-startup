package com.codurance.xstartup;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class ControllerShould {
  Controller controller = new Controller();

  @Test
  public void return_name() throws Exception {
    assertThat(answerToQuestion("what is your name"), is("Hal"));

  }

  private String answerToQuestion(String question) {
    return controller.answerQuestion("QUESTION_ID: " + question);
  }
}

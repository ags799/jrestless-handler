package com.sharpandrew.jrestlesshandler.example;

import com.sharpandrew.jrestlesshandler.JRestlessHandler;
import org.glassfish.jersey.server.ResourceConfig;

public final class ExampleHandler extends JRestlessHandler {
  public ExampleHandler() {
    super(new ResourceConfig().register(ExampleResource.class));
  }
}


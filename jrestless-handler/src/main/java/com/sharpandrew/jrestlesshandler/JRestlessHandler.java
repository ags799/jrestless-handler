package com.sharpandrew.jrestlesshandler;

import com.jrestless.aws.gateway.GatewayFeature;
import com.jrestless.aws.gateway.handler.GatewayRequestObjectHandler;
import org.glassfish.jersey.server.ResourceConfig;
import org.slf4j.bridge.SLF4JBridgeHandler;

/**
 * Extend this class with a nullary constructor that calls {@code super(ResourceConfig)}.
 */
public class JRestlessHandler extends GatewayRequestObjectHandler {
  // https://github.com/bbilger/jrestless#aws-usage-example
  protected JRestlessHandler(ResourceConfig resourceConfig) {
    SLF4JBridgeHandler.removeHandlersForRootLogger();
    SLF4JBridgeHandler.install();
    resourceConfig.register(GatewayFeature.class);
    init(resourceConfig);
    start();
  }
}

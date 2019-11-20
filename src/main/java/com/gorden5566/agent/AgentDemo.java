package com.gorden5566.agent;

import java.lang.instrument.Instrumentation;

/**
 * @author gorden5566
 * @date 2019/11/21
 */
public class AgentDemo {
    public static void premain(String agentArgs, Instrumentation inst) {
        System.out.println("agentArgs: " + agentArgs);

        boolean retransformClassesSupported = inst.isRetransformClassesSupported();
        boolean redefineClassesSupported = inst.isRedefineClassesSupported();
        boolean nativeMethodPrefixSupported = inst.isNativeMethodPrefixSupported();

        System.out.println("retransform: " + retransformClassesSupported);
        System.out.println("redefine: " + redefineClassesSupported);
        System.out.println("nativeMethodPrefix: " + nativeMethodPrefixSupported);
    }
}

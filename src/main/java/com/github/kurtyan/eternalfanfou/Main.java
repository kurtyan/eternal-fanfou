package com.github.kurtyan.eternalfanfou;

import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;

import java.lang.ref.SoftReference;

public class Main
        implements GroovyObject {

    public Main() {
        CallSite acallsite[] = $getCallSiteArray();
        MetaClass metaclass = $getStaticMetaClass();
        metaClass = metaclass;
        MetaClass _tmp = metaclass;
    }

    public static void main(String args[]) throws Throwable {
        CallSite acallsite[] = $getCallSiteArray();
        acallsite[0].callStatic(com.github.kurtyan.eternalfanfou.Main.class, "main");
    }

    protected MetaClass $getStaticMetaClass() {
        if (getClass() != Main.class)
            return ScriptBytecodeAdapter.initMetaClass(this);
        ClassInfo classinfo = $staticClassInfo;
        if (classinfo == null)

            $staticClassInfo = classinfo = ClassInfo.getClassInfo(getClass());
        return classinfo.getMetaClass();
    }

    public MetaClass getMetaClass() {
        if (metaClass == null) {
            metaClass = $getStaticMetaClass();
            return metaClass;
        } else {
            return metaClass;
        }
    }

    public void setMetaClass(MetaClass metaclass) {
        metaClass = metaclass;
    }

    public Object invokeMethod(String s, Object obj) {
        return getMetaClass().invokeMethod(this, s, obj);
    }

    public Object getProperty(String s) {
        return getMetaClass().getProperty(this, s);
    }

    public void setProperty(String s, Object obj) {
        getMetaClass().setProperty(this, s, obj);
    }

    private static void $createCallSiteArray_1(String as[]) {
        as[0] = "println";
    }

    private static CallSiteArray $createCallSiteArray() {
        String as[] = new String[1];
        $createCallSiteArray_1(as);
        return new CallSiteArray(com.github.kurtyan.eternalfanfou.Main.class, as);
    }

    private static CallSite[] $getCallSiteArray() {
        CallSiteArray callsitearray;
        if ($callSiteArray == null || (callsitearray = (CallSiteArray) $callSiteArray.get()) == null) {
            callsitearray = $createCallSiteArray();
            $callSiteArray = new SoftReference(callsitearray);
        }
        return callsitearray.array;
    }

    private static ClassInfo $staticClassInfo;
    public static transient boolean __$stMC;
    private transient MetaClass metaClass;
    private static SoftReference $callSiteArray;
}

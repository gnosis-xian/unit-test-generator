package top.agno.util;

import org.junit.Assert;
import org.junit.Test;
import top.agno.info.MethodReference;

public class ParseUtilTest {

    @Test
    public void parseClazz() {
        String reference = "top.agno.adi.services.impl.ExpressPushServiceImpl#push(top.agno.adi.dto.push.WaybillPushRequest)";
        MethodReference methodReference = ParseUtil.parseClazz(reference);
        Assert.assertNotNull(methodReference);
        Assert.assertEquals("top.agno.adi.services.impl.ExpressPushServiceImpl", methodReference.getClazzReference());
        Assert.assertEquals("push",methodReference.getMethodName());
        Assert.assertEquals("top.agno.adi.dto.push.WaybillPushRequest", methodReference.getParamClazzReference());
    }
}
package top.agno.generate;

import org.junit.Test;
import top.agno.info.MethodInfo;

import java.io.IOException;

public class ParseUnitTestTest {

    String projectLocation = "/Users/gnosis/works/myself-projects/auto-delivery-interface/share-adi";
    String srcDir = "src/main/java";

    @Test
    public void generate() throws IOException {
        String methodReference = "top.agno.adi.services.impl.ExpressPushServiceImpl#push(top.agno.adi.dto.push.WaybillPushRequest)";
        MethodInfo methodInfo = new MethodInfo();
        ParseUnitTest.parseMethod(methodInfo, projectLocation, srcDir, methodReference);
    }

}
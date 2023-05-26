package top.agno.util;

import cn.hutool.core.util.ClassUtil;
import cn.hutool.core.util.StrUtil;
import top.agno.info.MethodReference;

import java.awt.event.ComponentListener;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParseUtil {

    public static String parseClazzLocation(String methodReference) {
        String clazzReference = parseClazzReference(methodReference);
        return StrUtil.replace(clazzReference, ".", File.separator);
    }

    public static String parseClazzReference(String methodReference) {
        return parseClazz(methodReference).getClazzReference();
    }

    // top.agno.adi.services.impl.ExpressPushServiceImpl#push(top.agno.adi.dto.push.WaybillPushRequest)
    public static MethodReference parseClazz(String methodReference) {
        String regex = "(.*?)\\#(.*?)\\((.*?)\\)";
        Pattern compile = Pattern.compile(regex);
        Matcher matcher = compile.matcher(methodReference);
        MethodReference result = null;
        if (matcher.find()) {
            result = new MethodReference();
            result.setClazzReference(matcher.group(1));
            result.setMethodName(matcher.group(2));
            if (matcher.groupCount() >= 3) {
                result.setParamClazzReference(matcher.group(3));
            }
        }
        return result;
    }
}

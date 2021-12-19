package com.clsnull.gulimall;

import com.aliyun.oss.OSS;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.ByteArrayInputStream;

@SpringBootTest
class GulimallThirdPartyApplicationTests {

    @Autowired
    public OSS ossClient;

    @Test
    void contextLoads() {
        String content = "Hello OSS";
        String objectName = "\u202AF:\\项目资料\\田小道\\src=http _qqpublic.qpic.cn_qq_public_0_0-2560990657-70D3D005E7BA4F239644DF961EF64302_0 fmt=jpg&size=134&h=625&w=900&ppv=1.jpg&refer=http _qqpublic.qpic.cn&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=jpeg.jpg\u202AF:\\项目资料\\田小道\\src=http _qqpublic.qpic.cn_qq_public_0_0-2560990657-70D3D005E7BA4F239644DF961EF64302_0 fmt=jpg&size=134&h=625&w=900&ppv=1.jpg&refer=http _qqpublic.qpic.cn&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=jpeg.jpg";
        ossClient.putObject("gulimall-clsnull", objectName, new ByteArrayInputStream(content.getBytes()));
    }

}

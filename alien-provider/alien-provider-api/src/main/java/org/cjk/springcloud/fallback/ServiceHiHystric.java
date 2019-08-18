package org.cjk.springcloud.fallback;

import org.cjk.springcloud.service.ServiceHi;
import org.springframework.stereotype.Component;

/**
 * 断路器，出现问题时执行该类的方法
 * @author chenjk
 */
@Component
public class ServiceHiHystric implements ServiceHi {

    @Override
    public String saySomeByRPC(String name) {
        return "An Error Occurred: return by Hystric: ErrName = " + name;
    }

}


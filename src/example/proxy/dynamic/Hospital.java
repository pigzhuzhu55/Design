package example.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/*

 */
public class Hospital {

    public static Object proxy(Object target) {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),
                new DoctorInvationHandler(target));
    }
    private static class DoctorInvationHandler implements InvocationHandler {

        private Object target;
        public DoctorInvationHandler(Object target) {
            super();
            this.target = target;
        }

        public Object getTarget() {
            return target;
        }

        public void setTarget(Object target) {
            this.target = target;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            //前置增强
            eatBefore();
            boolean res = (boolean) method.invoke(target, args);
            if (res) {
                eatAfter();
            }
            return res;
        }

        private void eatBefore() {
            System.out.println("医生：好的，我帮你看下");
        }

        private void eatAfter() {
            System.out.println("医生：回去如果病还没好转，记得再来");
        }
    }
}

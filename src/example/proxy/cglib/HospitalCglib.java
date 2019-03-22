package example.proxy.cglib;

import net.sf.cglib.proxy.CallbackFilter;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/*

 */
public class HospitalCglib  implements MethodInterceptor {

        private Object target;
        //对类生产代理对象
        public Object getInstanceOfClass(Object target) {
           this.target = target;//给业务对象赋值
           Enhancer enhancer = new Enhancer();//创建加强器，用来创建动态代理类
            enhancer.setSuperclass(this.target.getClass());//为加强器指定要代理的业务类（即：为下面生成的代理类指定父类）
            enhancer.setInterfaces(null);
            //设置回调：对于代理类上所有方法的调用，都会调用CallBack，而Callback则需要实现intercept()方法进行拦
            enhancer.setCallback(this);
            // 创建动态代理类对象并返回
            return enhancer.create();
        }

        //对接口生成代理对象
    public Object getInstanceOfInterface(Object target) {
        this.target = target;//给业务对象赋值
        Enhancer enhancer = new Enhancer();//创建加强器，用来创建动态代理类
        enhancer.setSuperclass(null);
        enhancer.setInterfaces(this.target.getClass().getInterfaces());
        //设置回调：对于代理类上所有方法的调用，都会调用CallBack，而Callback则需要实现intercept()方法进行拦
        enhancer.setCallback(this);

        //当有多个callback时，需要通过callbackFilter来指定被代理方法使用第几个callback
        /*
        enhancer.setCallbackFilter(new CallbackFilter() {
			@Override
			public int accept(Method method) {
            return 0;
        }
    });
    */

        // 创建动态代理类对象并返回
        return enhancer.create();
    }

        // 实现回调方法
        public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
            //前置增强
            eatBefore();
            Object res = null;
            //调用父类的该方法，但是生成接口的代理时不可调用。
            //res = proxy.invokeSuper(obj,args);

            //通过method来调用被代理对象的方法
            if(this.target!=null)
            {
                res = method.invoke(target,args);
            }
            if ((boolean)res) {
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
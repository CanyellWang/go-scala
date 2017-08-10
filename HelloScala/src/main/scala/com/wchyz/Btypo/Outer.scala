package com.wchyz.Btypo

/**
  * Created by wangchangye on 2017/4/25.
  */
class Outer {
    class Inner{
    private def f(){println("f")}
    class InnerMost{
            f();    //right
        }
    }

    /**
      * (new Inner).f( ) 访问不合法是因为 f 在 Inner 中被声明为 private，而访问不在类Inner之内。
        但在 InnerMost 里访问f就没有问题的，因为这个访问包含在 Inner 类之内。
      */
    //(new Inner).f();  编译错误

}
class Super{
    protected def f(){println("f")}

}
class Sub extends Super{ f()}
//class Other{(new Super).f()} 编译错误
//Sub 类对 f 的访问没有问题，因为 f 在 Super 中被声明为 protected，而 Sub 是 Super 的子类。
// 相反，Other 对 f 的访问不被允许，因为 other 没有继承自 Super。
// 而后者在 java 里同样被认可，因为 Other 与 Sub 在同一包里。
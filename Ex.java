package study01;

import study01.Circle;

import java.security.PrivateKey;

public class Ex //picture原图中形状为private，作业直接创建了新的形状进行练习
    //每道习题对应一个方法，在main函数中调用即可查看对应结果
{
    public static void main(String[] args) {

    }
    public static void ex101()//练习1-1，直接创建了两个新的图形
    {
        Circle circle1=new Circle();
        Square square1=new Square();
        circle1.makeVisible();
        square1.makeVisible();//练习01
    }

    public static void ex102()//练习1-2，两次movedown就往下降两次；两次moveInvisible还是隐藏状态
    {
        Circle circle2=new Circle();
        Circle circle21=new Circle();
        circle2.makeVisible();
        circle21.makeVisible();//创建circle21用来对比

        circle2.moveDown();
        circle2.moveDown();
        circle2.makeInvisible();
        circle2.makeInvisible();

    }
    public static void ex103()//练习1-3，
    {
        Circle circle3=new Circle();
        Circle circle31=new Circle();
        circle3.makeVisible();
        circle31.makeVisible();//画出两个圆，其中circle31用于对比

        circle3.moveVertical(0);
        circle3.slowMoveVertical(0);
        circle3.moveHorizontal(-70);//按题目要求移动，左移70已经到了最左端，实际位移20
    }
    public static void ex104()//练习1-4
    {
        Circle circle41 =new Circle();
        circle41.moveHorizontal(70);
        Circle circle42=new Circle();
        circle41.makeVisible();
        circle42.makeVisible();//画出两个圆并将1号圆向右移来对比颜色

        circle41.changeColor("red");
        circle42.changeColor("black");
    }
    public static void ex105()//练习1-5
    {
        Circle circle51=new Circle();
        circle51.makeVisible();//创建一个圆

        circle51.changeColor("grey");//改灰色，系统无法识别，显示颜色为黑色。这是因为源码使用if语句，不能识别颜色均为黑色
    }
    public static void ex106()//练习1-6
    {
        Circle circle61=new Circle();
        circle61.makeVisible();//创建一个圆

        //circle61.changeColor(red);不加双引号，报错，无法运行,故此行全部注释
    }
    public static void ex107()//练习1-7
    {
        Circle circle71 =new Circle();
        circle71.moveHorizontal(100);
        circle71.changeSize(20);
        circle71.changeColor("green");
        circle71.makeVisible();//绿色小圆

        Circle circle72=new Circle();
        circle72.changeSize(50);
        circle72.moveVertical(60);
        circle72.changeColor("yellow");
        circle72.makeVisible();//黄色大圆

        Triangle triangle71=new Triangle();
        triangle71.changeColor("black");
        triangle71.changeSize(30,30);
        triangle71.moveHorizontal(40);
        triangle71.makeVisible();//黑色三角形

        Square square71=new Square();
        square71.changeColor("blue");
        square71.changeSize(60);
        square71.moveVertical(60);
        square71.moveHorizontal(60);
        square71.makeVisible();//蓝色正方形
    }
    public static void ex108()//练习1-8由于没有bluej，这一题只做了下移，下移后自然会改变相应属性。
    {
        Circle circle81=new Circle();
        circle81.moveDown();
    }
    public static void ex109()//练习1-10，直接调用了picture中的画房子方法。有不同的方法，比如有一步一步移动过去或者直接给定属性值等方法。
    {
        Picture picture = new Picture();
        picture.draw();
    }
    public static void ex110()//练习1-10
    {
        Picture picture = new Picture();
        picture.draw();
        picture.setBlackAndWhite();
        picture.setColor();
    }
    public static void ex111()//我觉得画得很好！
    {

    }
    public static void ex112()//这一题要求在bluej上打开源码的文本编辑器，这里不需要操作
    {

    }
    public static void ex113()//练习13
    {
        Picture picture = new Picture();
        picture.draw();
        picture.ex113_1();/*在picture类中增加了本题的方法以便调用，代码如下
        public void ex113_1()
        {
            sun.changeColor("blue");
        }*/
    }
    public static void ex114()//练习14
    {
        Picture picture = new Picture();
        picture.draw();
        Circle sun2 = new Circle();
        sun2.makeVisible();
    }
    public static void ex115()/*练习1-15，在picture中增加了代码如下：
    public void ex115_1()
    {
        sun.slowMoveVertical(150);
        sun.makeInvisible();
    }*/
    {
        Picture picture = new Picture();
        picture.draw();
        picture.ex115_1();
    }
    public static void ex116()//练习1-16，在1-15中就是用的单独方法做的，所以第十六题作答同第15题
    {
        Picture picture = new Picture();
        picture.draw();
        picture.ex115_1();
    }
}

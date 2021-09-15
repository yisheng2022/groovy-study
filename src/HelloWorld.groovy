class HelloWorld {
    static void main(String[] args) {
        def str = "hello world...";
        println(str);

        int [] array = [1,2,3]
        println "array = $array"
        println("hello world...")
        println "HelloWorld.main"
        println "args = $args"

        // ==的行为
        def a1 = "a";
        def a2 = "a";
        println "a1==a2:"+(a1==a2)
        println "a1 is a2:"+(a1.is(a2))

        // 双引号字符串支持用$嵌入变量
        def name = 'Tom'
        def greeting = "Hello ${name}"

        // 如需函数调用，则$后表达式要加大括号
        def pi = 3.14
        def piString = "Pi = ${pi.toString()}"
        println greeting

        // closure
        List<String> list1 = new ArrayList<>(["a","b","c"]);
        List<String> list2 = ["a","b","c"];
        list1.each {println it }
        list2.eachWithIndex { String entry, int i -> println "i=${i},v=${entry}"}


    }
}

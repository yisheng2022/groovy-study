package eason.com.some

class SomeGroovyClass {

    /**
     * override groovy.lang.MetaClassImpl#doInvokeMethod(java.lang.Class, java.lang.Object, java.lang.String, java.lang.Object[], boolean, boolean)
     * @param name
     * @param args
     * @return
     */
//    @Override
//    def invokeMethod(String name, Object args) {
//        return "called invokeMethod5 $name $args"
//    }

    def methodMissing(String name,args){
        return "execute when missing method!"
    }

    /**
     * 仅当Groovy运行时找不到给定属性的getter方法时才调用propertyMissing(String)方法
     */
    def propertyMissing(String name) { name }

    def test() {
        return 'method exists'
    }
}

def someGroovyClass = new SomeGroovyClass()

assert someGroovyClass.test() == 'method exists'
println someGroovyClass.invokeMethod2(12,13,"a")
assert someGroovyClass.someMethod() == 'called invokeMethod someMethod []'


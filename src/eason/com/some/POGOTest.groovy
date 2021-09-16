package eason.com.some

class POGO {

    private String field
    String property1

    void setProperty1(String property1) {
        this.property1 = "setProperty1"
    }
}

def pogo = new POGO()
pogo.metaClass.setAttribute(pogo, 'field2', 'ha')
pogo.metaClass.setAttribute(pogo, 'property1', 'ho')

assert pogo.field2 == 'ha'
assert pogo.property1 == 'ho'


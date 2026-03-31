sealed class A permits B, C {

}

non-sealed class B extends A {

}

final class C extends A {

}

 class D  extends B {

}

class Sealeds {
    public static void main(String[] args) {

    }
}

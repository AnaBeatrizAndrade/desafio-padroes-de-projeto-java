package dio.gof;

//Singleton "Lazy Holder"

public class SingletonLazyHolder {

    private static class InstanceHolder {
        public static dio.gof.SingletonLazyHolder instancia = new dio.gof.SingletonLazyHolder();
    }

        private SingletonLazyHolder() {
            super();
        }

        public static dio.gof.SingletonLazyHolder getInstancia() {
            return InstanceHolder.instancia;
        }
}

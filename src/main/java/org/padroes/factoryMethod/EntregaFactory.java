package org.padroes.factoryMethod;

public abstract class EntregaFactory {
    public static IEntrega criarEntrega(String tipo){
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("org.padroes.factoryMethod.Entrega" + tipo);

            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Entrega inexistente");
        }
        if (!(objeto instanceof IEntrega)) {
            throw new IllegalArgumentException("Entrega inválida");
        }
        return (IEntrega) objeto;
    };
}

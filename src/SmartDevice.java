class SmartDevice {
    boolean camara = true;
    boolean teclado = true;
    boolean cargador = true;

    public SmartDevice(boolean camara, boolean teclado, boolean cargador) {
        this.camara = camara;
        this.teclado = teclado;
        this.cargador = cargador;
    }
}

class SmartPhone extends SmartDevice {
    boolean funda;

    public SmartPhone(boolean camara, boolean teclado, boolean cargador, boolean funda) {
        super(camara, teclado, cargador);
        this.funda = funda;

    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "funda=" + funda +
                ", camara=" + camara +
                ", teclado=" + teclado +
                ", cargador=" + cargador +
                '}';
    }
}

class SmartWatch extends SmartDevice {
    boolean correa;

    public SmartWatch(boolean camara, boolean teclado, boolean cargador, boolean correa) {
        super(camara, teclado, cargador);
        this.correa = correa;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "correa=" + correa +
                ", camara=" + camara +
                ", teclado=" + teclado +
                ", cargador=" + cargador +
                '}';
    }
}
interface Formalidade{
    public String formalidade();
}

public class Formal implements Formalidade{
    @Override
    public String formalidade(){
        return "Bom dia, sr.";
    }
}

public class Casual implements Formalidade{
    @Override
    public String formalidade(){
        return "E aí, blz?";
    }
}

public class Intimo implements Formalidade{
    @Override
    public String formalidade(){
        return "Oi querida!";
    }
}

public class Outro implements Formalidade{
    @Override
    public String formalidade(){
        return "Oi.";
    }
}

public class Saudacao {

    public String saudar (Formalidade saudacao) {
        saudacao.formalidade();
    }
}

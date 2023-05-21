class Mundo {
    protected String[][] matriz;

    public Mundo(){
        this.matriz = new String[][]{
            {"╔", "═", "═", "═", "═", "═", "╗"},
            {"║", " ", " ", " ", " ", " ", "║"},
            {"║", " ", " ", " ", " ", " ", "║"},
            {"║", " ", " ", "J", " ", " ", "║"},
            {"║", " ", " ", " ", " ", " ", "║"},
            {"║", " ", " ", " ", " ", " ", "║"},
            {"╚", "═", "═", "═", "═", "═", "╝"}
        };
    }

    public void printMatriz() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

}

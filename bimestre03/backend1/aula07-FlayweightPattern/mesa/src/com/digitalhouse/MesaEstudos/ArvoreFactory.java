package com.digitalhouse.MesaEstudos;

import java.util.HashMap;
import java.util.Map;

public class ArvoreFactory {

    private static final Map<String, Arvore> arvoreMap = new HashMap<>();

    public static Arvore getTipoArvore(String tipoArvore) throws ArvoreException {

        if(arvoreMap.containsKey(tipoArvore.toLowerCase()))
            return arvoreMap.get(tipoArvore);
        else if(tipoArvore.equalsIgnoreCase("ornamental")) {
            arvoreMap.put(tipoArvore, new Arvore(200, 400, "verde", "ornamental"));
        } else if(tipoArvore.equalsIgnoreCase("frutífera")) {
            arvoreMap.put(tipoArvore, new Arvore(500, 300, "vermelho", "frutífera"));
        } else if(tipoArvore.equalsIgnoreCase("florífera")) {
            arvoreMap.put(tipoArvore, new Arvore(100, 200, "azul", "florífera"));
        } else
            throw new ArvoreException("Tipo de árvore indisponível.");

        System.out.print("Árvore obtida: ");
        return arvoreMap.get(tipoArvore);
    }

}

package br.faturamento;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Faturamento {
    public static void main(String[] args) throws JSONException {
        String jsonData = "{\"faturamento\": [5000, 7000, 0, 8000, 2000, 0, 0]}";
        JSONObject jsonObject = new JSONObject(jsonData);
        JSONArray faturamentoArray = jsonObject.getJSONArray("faturamento");

        double menor = Double.MAX_VALUE;
        double maior = Double.MIN_VALUE;
        double soma = 0;
        int diasContados = 0;

        for (int i = 0; i < faturamentoArray.length(); i++) {
            double valor = faturamentoArray.getDouble(i);
            if (valor > 0) {
                if (valor < menor) menor = valor;
                if (valor > maior) maior = valor;
                soma += valor;
                diasContados++;
            }
        }

        double media = soma / diasContados;
        int diasSuperiores = 0;
        for (int i = 0; i < faturamentoArray.length(); i++) {
            if (faturamentoArray.getDouble(i) > media) {
                diasSuperiores++;
            }
        }

        System.out.println("Menor: " + menor);
        System.out.println("Maior: " + maior);
        System.out.println("Dias acima da média: " + diasSuperiores);
    }
}

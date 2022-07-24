package d_exercicios_logica

/*
A padaria Hotpão vende uma certa quantidade de pães franceses e uma quantidade de broas a cada dia. 
Cada pãozinho custa R$ 0,12 e a broa custa R$ 1,50. Ao final do dia, o dono quer saber quanto arrecadou com a venda dos pães e broas (juntos), 
e quanto deve guardar numa conta de poupança (10% do total arrecadado). Você foi contratado para fazer os cálculos para o dono. Com base nestes fatos,
faça um algoritmo para ler as quantidades de pães e de broas, e depois calcular os dados solicitados.
*/


fun Ex05(pao: Int, broa: Int) {

    val precoPaozinho = 0.12
    val precoBroa = 1.5

    //Saidas
    val somaVendas = (pao*precoPaozinho)+(broa*precoBroa)            //Soma da venda dos pães e broas (juntos)
    val valorPoupanca = somaVendas/10                               //10% total arrecadasto


    print("Voce arrecadou R$ $somaVendas e precisa guardar R$ $valorPoupanca na poupança")



}
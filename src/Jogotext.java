import java.util.Scanner;

public class Jogotext{
    public static void main(String[] args){
        Scanner resposta = new Scanner(System.in);
        System.out.println(" \nVoce acordar e sente a uma brisa revigorante pela manhã,e sente que hoje será muito produtivo.");
        System.out.println("Depois de comer e limpar-se voce pensa:\n -A loja bem que poderia receber nova mercadoria. \n \n  Saindo  de casa voce vai a feira e por sorte consegue encontrar tudo muito fresco.\n  No caminho pra casa voce observa alguém no lado da estrada que o chama a atenção,\né uma velhinha com as roupas bem desgastadas , mas ainda assim cheia de jóias e colares de ouro abaixo da roupa.");
        System.out.println("Voce pensa se vale a pena falar com ela(1) ou somente seguir em frente(2)");
        int opção = resposta.nextInt();
        if(opção == 1 ){
            System.out.println("\n -Olá tudo bom, nunca vi voce por aqui é nova na cidade? \n \n -Ah sim, resolvi dar uma passada já que raramente dou uma olhada por aqui. ");
            System.out.println("  Voce Acha meio estranho o jeito que ela fala mas continua mesmmo assim. \n \n -Eu tenho algum tempo até ter que ir pra minha loja, se quiser eu poderia lhe oferece alguma ajuda?\n Voce parece que meio idosa demais para estar andando só.");
            System.out.println("\n -Saiba que eu sei me cuidar muito bem sozinha ....   mas sim aceito uma companhia  por enquanto.- \n Com um sorriso incompleto e de certa forma caloroso e amigável. O tempo passa enquanto voce mostra\n as partes mais importantes da cidade para ela até dar a hora de voltar ao trabalho.");
            System.out.println("\n -Bom foi ''interessante'' conhece-lá mas infelizmente eu tenho que ir agora.\n \n -Sim claro, porém já que foi tão gentil por que não vem para minha casa a noite pra ser recompensado \npor sua gentileza, eu moro na casa perto do rio descendo a rua da sua casa, eu insisto, acho que \nvoce pode descobrir bastante sobre si mesmo...- Diz ela enquanto mostra um olhar penetrante. \n \n -Eu não tenho muita certeza se irei, mas quem sabe.\n \n Depois do trabalho voce pensa no que a velha falou mais cedo.");
            System.out.println("-Acho que não vai adiantar nada ficara aqui pensando.- \n Já é entardecer antes de voce tomar o caminho, como passar do tempo escurece cada vez mais\naté as luzes dos postes serem a única iluminação da estrada. Até que voce chega,uma casa simples\nque podia jurar que não estava lá a tempos atrás, toda a análise do lugar é interropida pelo\nbarulho da porta se abrindo.");
            System.out.println(" -Boa noite Querido, eu sabia que voce não deixaria de vir.  \n \n -Porque voce fala como se me conhecesse muito bem? nunca nos encontramos antes. \n\n -De certa forma não... ,mas podemos dizer que eu venho prestando atenção em voce. Agora entre,\n A comida só tende a esfriar enquanto estamos aqui fora. \n \nAo sentar-se na mesa voce nota que apesar do exterior a parte de dentro é até que mais luxuosa,\nassim como a mesa tem uma comida que parece ser ótima. Após jantar ela olha pra voce constantemente\no que é um tanto desconfortável.");
            System.out.println(" -Okay pode parar com tudo isso, porque me chamar aqui , voce claramente não é normal. \n\n -Bem direto ao ponto, mas sim, eu não sou o que voce chamaria de comum eu sou a materialação de um conceito.\n\n -Eu sou Ambição, e acho que voce nega a mim em sua vida, voce trabalha em prol de ter uma vida melhor achando\nque é só em função de ter felicidade, quando na verdade não consegue admitir que faz isso \nem função de coisas materiais. Até ao me ajudar mais cedo voce chegou a pensar no que poderia ganhar\ncom isso, mas reprimiu a si mesmo logo em seguida.");
            System.out.println("\n-Onde quer chegar com tudo isso? E em que isso faz de mim uma pessoa má.\n\n-E quem falaou que isso é uma coisa má? voce não consegue ter coragem para aditir que não consegue \naceitar essa parte de mim em voce?\n -No fim só lhe resta escolher... \n\n  Voce olha pra baixou relutante, Não se consegue aceitar a si mesmo como um todo (1) ou \nse prefere a voltar a ser o que era antes(2).");
            int escolha2 = resposta.nextInt();
            if(escolha2 == 1){
                System.out.println("\n  Uma forte luz o cega momentaneamente e voce sente uma enorme cansaço. \nAo acordar voce não está certo do que viu e ouvia noite passada mas sente que não está mais do mesmo jeito. \nVoce se sente estramente feliz e sem remorso, como se o passado e suas descisões fossem mais facéis \nde conviver, voce não pensa em sair tão cedo da cama hoje.");

            }
            else{
                System.out.println("Uma forte luz o cega momentaneamente e voce sente um enorme cansaço enquanto escuta baixinho, \n'Nossa que novidade',com um ar sarcárstico. \n \nOs dias se passam e voce segue sua vida normalmente,lembra vagamente daquela noite e sinceramente\ntenta nem pensar, mas algo no fundo da sua mente dorme inquieta, voce segue mesmo com um grande desconforto\ninterno, como se algo estivesse errado.");
            }
        }
        else{
            System.out.println("Voce achar melhor só seguir, não é do seu interesse puxar conversa com alguém no momento. \n \n Chegando em casa depois de vender tudo voce dorme calmamente como qualquer outro dia, com a sensação de ter perdido algo naquele dia. \n \n Até mais"); 
            
        }
        System.out.println("\nObrigado por jogar!!");
        resposta.close();
    }
}
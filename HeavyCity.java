package HeavyCity;

public class HeavyCity {

	public static void main(String[] args) {
		HardRock hardrock = new HardRock();
		HeavyMetal heavymetal = new HeavyMetal();
		PunkRock punkrock = new PunkRock();
		PopRock poprock = new PopRock();
		RockPsico rockpsico = new RockPsico();
		Grunge grunge = new Grunge();
		AlternativeRock alternativerock = new AlternativeRock();
		
		hardrock.dadosHardRock();
		hardrock.vendasHardRock();
		heavymetal.dadosHeavyMetal();
		heavymetal.vendasHeavyMeral();
		punkrock.dadosPunkRock();
		punkrock.vendasPunkRock();
		poprock.dadosPopRock();
		poprock.vendasPopRock();
		rockpsico.dadosRockPsico();
		rockpsico.vendasRockPsico();
		grunge.dadosGrunge();
		grunge.vendasGrunge();
		alternativerock.dadosAlternativeRock();
		alternativerock.vendasAlternativeRock();

	}

}

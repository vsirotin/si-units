
function testCurrencies() {
    console.log("Start testCurrencies");    

    //Test of United States dollar
    var c1USD = USD.times(16.1);
    var c2USD = new UnitedStatesDollar(16.1);
    checkObjects(c1USD, c2USD);

    //Test of Euro
    var c1EUR = EUR.times(16.1);
    var c2EUR = new Euro(16.1);
    checkObjects(c1EUR, c2EUR);

    //Test of Japanese yen
    var c1JPY = JPY.times(16.1);
    var c2JPY = new JapaneseYen(16.1);
    checkObjects(c1JPY, c2JPY);

    //Test of Sterling
    var c1GBP = GBP.times(16.1);
    var c2GBP = new PoundSterling(16.1);
    checkObjects(c1GBP, c2GBP);

    //Test of Renminbi
    var c1CNY = CNY.times(16.1);
    var c2CNY = new Renminbi(16.1);
    checkObjects(c1CNY, c2CNY);

    //Test of Australian dollar
    var c1AUD = AUD.times(16.1);
    var c2AUD = new AustralianDollar(16.1);
    checkObjects(c1AUD, c2AUD);

    //Test of Canadian dollar
    var c1CAD = CAD.times(16.1);
    var c2CAD = new CanadianDollar(16.1);
    checkObjects(c1CAD, c2CAD);

    //Test of Swiss franc
    var c1CHF = CHF.times(16.1);
    var c2CHF = new SwissFranc(16.1);
    checkObjects(c1CHF, c2CHF);

    //Test of Hong Kong dollar
    var c1HKD = HKD.times(16.1);
    var c2HKD = new HongKongDollar(16.1);
    checkObjects(c1HKD, c2HKD);

    //Test of Singapore dollar
    var c1SGD = SGD.times(16.1);
    var c2SGD = new SingaporeDollar(16.1);
    checkObjects(c1SGD, c2SGD);

    //Test of Swedish krona
    var c1SEK = SEK.times(16.1);
    var c2SEK = new SwedishKrona(16.1);
    checkObjects(c1SEK, c2SEK);

    //Test of  South Korean won
    var c1KRW = KRW.times(16.1);
    var c2KRW = new SouthKoreanWon(16.1);
    checkObjects(c1KRW, c2KRW);

    //Test of Norwegian krone
    var c1NOK = NOK.times(16.1);
    var c2NOK = new NorwegianKrone(16.1);
    checkObjects(c1NOK, c2NOK);

    //Test of New Zealand dollar
    var c1NZD = NZD.times(16.1);
    var c2NZD = new NewZealandDollar(16.1);
    checkObjects(c1NZD, c2NZD);

    //Test of Indian rupee
    var c1INR = INR.times(16.1);
    var c2INR = new IndianRupee(16.1);
    checkObjects(c1INR, c2INR);

    //Test of Mexican peso
    var c1MXN = MXN.times(16.1);
    var c2MXN = new MexicanPeso(16.1);
    checkObjects(c1MXN, c2MXN);

    //Test of New Taiwan dollar
    var c1TWD = TWD.times(16.1);
    var c2TWD = new NewTaiwanDollar(16.1);
    checkObjects(c1TWD, c2TWD);

    //Test of South African rand
    var c1ZAR = ZAR.times(16.1);
    var c2ZAR = new SouthAfricanRand(16.1);
    checkObjects(c1ZAR, c2ZAR);

    //Test of Brazilian real
    var c1BRL = BRL.times(16.1);
    var c2BRL = new BrazilianReal(16.1);
    checkObjects(c1BRL, c2BRL);

    //Test of Danish krone
    var c1DKK = DKK.times(16.1);
    var c2DKK = new DanishKrone(16.1);
    checkObjects(c1DKK, c2DKK);

    //Test of Polish złoty
    var c1PLN = PLN.times(16.1);
    var c2PLN = new PolishZłoty(16.1);
    checkObjects(c1PLN, c2PLN);

    //Test of Thai baht
    var c1THB = THB.times(16.1);
    var c2THB = new ThaiBaht(16.1);
    checkObjects(c1THB, c2THB);

    //Test of Israeli new shekel
    var c1ILS = ILS.times(16.1);
    var c2ILS = new IsraeliNewShekel(16.1);
    checkObjects(c1ILS, c2ILS);

    //Test of Indonesian rupiah
    var c1IDR = IDR.times(16.1);
    var c2IDR = new IndonesianRupiah(16.1);
    checkObjects(c1IDR, c2IDR);

    //Test of  Czech koruna
    var c1CZK = CZK.times(16.1);
    var c2CZK = new CzechKoruna(16.1);
    checkObjects(c1CZK, c2CZK);

    //Test of UAE dirham
    var c1AED = AED.times(16.1);
    var c2AED = new UAEDirham(16.1);
    checkObjects(c1AED, c2AED);

    //Test of Turkish lira
    var c1TRY = TRY.times(16.1);
    var c2TRY = new TurkishLira(16.1);
    checkObjects(c1TRY, c2TRY);

    //Test of Hungarian forint
    var c1HUF = HUF.times(16.1);
    var c2HUF = new HungarianForint(16.1);
    checkObjects(c1HUF, c2HUF);

    //Test of Chilean peso
    var c1CLP = CLP.times(16.1);
    var c2CLP = new ChileanPeso(16.1);
    checkObjects(c1CLP, c2CLP);

    //Test of Saudi riyal
    var c1SAR = SAR.times(16.1);
    var c2SAR = new SaudiRiyal(16.1);
    checkObjects(c1SAR, c2SAR);

    //Test of Philippine peso
    var c1PHP = PHP.times(16.1);
    var c2PHP = new PhilippinePeso(16.1);
    checkObjects(c1PHP, c2PHP);

    //Test of Malaysian ringgit
    var c1MYR = MYR.times(16.1);
    var c2MYR = new MalaysianRinggit(16.1);
    checkObjects(c1MYR, c2MYR);

    //Test of Colombian peso
    var c1COP = COP.times(16.1);
    var c2COP = new ColombianPeso(16.1);
    checkObjects(c1COP, c2COP);

    //Test of Russian ruble
    var c1RUB = RUB.times(16.1);
    var c2RUB = new RussianRuble(16.1);
    checkObjects(c1RUB, c2RUB);

    //Test of Romanian leu
    var c1RON = RON.times(16.1);
    var c2RON = new RomanianLeu(16.1);
    checkObjects(c1RON, c2RON);

    console.log("Fin testCurrencies");
}
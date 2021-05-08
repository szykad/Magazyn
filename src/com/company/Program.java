package com.company;

import com.company.data.*;
import com.company.data.exception.NeverRentException;
import com.company.data.exception.TooManyThingsException;

import java.io.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Program {
    private List<Osoba> osobaList;
    private Osoba loggedOsoba;

    public Program() {
    }

    public void run(){
        try {
            this.osobaList = initializeData();
        }catch (NeverRentException e){
            System.out.println("NeverRentException: osoba musi posiadać wynajęte pomieszczenie");
        }
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println();
        System.out.println("      `7MMM.     ,MMF'      db        .g8bgd           db      MMMAM`YMM' `MM'    7MN.`7MF'    MN'                       ");
        System.out.println("        MMMb    dPMM       ;MM:     .dP'     `M       ;MM:     M'   AMV    VMA   ,V    MMN.    M       __,               ");
        System.out.println("        M YM   ,M MM      ,V^MM.    dM'       `      ,V^MM.    '   AMV      VMA ,V     M YMb   M      `7MM      ,pPYq. ");
        System.out.println("        M  Mb  M' MM     ,M  `MM    MM              ,M  `MM       AMV        VMMP      M  `MN. M        MM     6W'    `Wb");
        System.out.println("        M  YM.P'  MM     AbmmmqMA   MM.    `7MMF'   AbmmmqMA     AMV   ,      MM       M   `MM.M        MM     8M      M8");
        System.out.println("        M  `YM'   MM    A'     VML  `Mb.     MM    A'     VML   AMV   ,M      MM       M     YMM        MM  ,, YA.    ,A9");
        System.out.println("      .JML. `'  .JMML..AMA.   .AMMA.  `bmmmdPY   .AMA.   .AMMA.AMVmmmmMM    .JMML.   .JML.    YM      .JMML.db  `Ybmmd9' ");
        System.out.println();
        System.out.println(" Podaj imie i nazwisko osoby na które chcesz się zalogować");
        List<String> userNames = getUserNames();
        printUserNames(userNames);

        String inputName = null;
        try {
            inputName = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if
        (userNames.contains(inputName)){
            loggedOsoba = getLoggedPerson(inputName);
            System.out.println("Zalogowano jako "+ inputName);
        }else
            {
            System.out.println("Nie podano poprawnej ososoby, zamykanie programu");
            endProgram();
        }

        while (true){
            try {
                handleUserInput(reader);
            }catch (Exception e){
                System.out.println(e+"");
            }

        }
    }

    public List<Osoba> initializeData() throws NeverRentException {

        List<Motocykl> motocykle = new ArrayList<>();
        motocykle.add(new Motocykl("honda", 2.0D, true));
        motocykle.add(new Motocykl("suzuki", 3.0D, false));

        List<Rower> rowery = new ArrayList<>();
        rowery.add(new Rower("składak", 1.0D, 5, "Złożony"));
        rowery.add(new Rower("rower Babci", 1.0D, 2, "Rozłożony"));

        List<Samochód> samochody = new ArrayList<>();
        samochody.add(new Samochód("Fiat", 7.0D, "benzyna"));
        samochody.add(new Samochód("Mitsubishi", 7.0D, "diesel"));

        Składzik składzikSzymona = new Składzik(samochody, rowery, motocykle);


        Składzik składzikMarka = new Składzik(samochody, rowery, new ArrayList<>());
        Składzik składzikSławomira = new Składzik(samochody, rowery, new ArrayList<>());


        Składzik składzikMateusz = new Składzik(samochody, new ArrayList<>(), new ArrayList<>());
        Składzik składzikMirka = new Składzik();


        Pomieszczenie pomieszczenieSzymon = new Pomieszczenie(50.0D, składzikSzymona);
        Pomieszczenie pomieszczenieMarek = new Pomieszczenie(40.0D, składzikMarka);
        Pomieszczenie pomieszczenieSławomir = new Pomieszczenie(30.0D, składzikSławomira);
        Pomieszczenie pomieszczenieMateusz = new Pomieszczenie(20.0D, składzikMateusz);
        Pomieszczenie pomieszczenieMirek = new Pomieszczenie(10.0D, składzikMirka);

        List<Pomieszczenie> pomieszczenieSzymonList = new ArrayList<>();
        List<Pomieszczenie> pomieszczenieMarekList = new ArrayList<>();
        List<Pomieszczenie> pomieszczenieSławomirList = new ArrayList<>();
        List<Pomieszczenie> pomieszczenieMateuszList = new ArrayList<>();
        List<Pomieszczenie> pomieszczenieMirekList = new ArrayList<>();

        pomieszczenieSzymonList.add(pomieszczenieSzymon);
        pomieszczenieMarekList.add(pomieszczenieMarek);
        pomieszczenieSławomirList.add(pomieszczenieSławomir);
        pomieszczenieMateuszList.add(pomieszczenieMateusz);
        pomieszczenieMirekList.add(pomieszczenieMirek);


        Osoba szymon = new Osoba("Szymon","Wygański","5637383910","Mickiewicza","26-07-1953","13-04-2019",
                pomieszczenieSzymonList);
        Osoba marek = new Osoba("Marek","Kazubs","19345978919","Piekna","13-01-1970","14-04-2013",
                pomieszczenieMarekList);
        Osoba sławomir = new Osoba("Sławomir","Lemisz","92365676910","Pogodna","22-07-1955","18-10-2010",
                pomieszczenieSławomirList);
        Osoba mateusz = new Osoba("Mateusz","Pakusz","12345674914","Bezu","01-10-1971","26-02-2009",
                pomieszczenieMateuszList);
        Osoba mirek = new Osoba("Andrzej","Loloo","894984488","Kołataja","16-11-1960","21-06-2016",
                pomieszczenieMirekList);

        List<Osoba> listaOsob = new ArrayList<>();
        listaOsob.add(szymon);
        listaOsob.add(marek);
        listaOsob.add(sławomir);
        listaOsob.add(mateusz);
        listaOsob.add(mirek);

        return listaOsob;
    }

    private List<String> getUserNames(){
        List<String> userNames = new ArrayList<>();
        for (Osoba osoba : this.osobaList){
         String userName =  osoba.getImie() + " " + osoba.getNazwisko();
         userNames.add(userName);
        }
        return userNames;
    }

    private Osoba getLoggedPerson(String personName) {
        for (Osoba currentOsoba : this.osobaList) {
            if (personName.equals(currentOsoba.getImie() + " " + currentOsoba.getNazwisko())) {
                return currentOsoba;
            }
        }
        return null;
    }

    private void printUserNames(List<String> userNames){
        for(String name: userNames){
            System.out.print(name+ " ");
        }
        System.out.println();
    }

    private void printMenu(){
        System.out.println();
        System.out.println(" 1. Zakończ");
        System.out.println(" 2. Wypisz swoje dane");
        System.out.println(" 3. Wypisz dane osoby");
        System.out.println(" 4. Dodaj pojazd");
        System.out.println(" 5. Usuń pojazd");
        System.out.println(" 6. Wyświetl wolne pomieszcenia");
        System.out.println(" 7. Wynajmij pomieszczenie");
    }

    private void handleUserInput(BufferedReader reader) throws IOException {
        printMenu();
        String input = reader.readLine();
        if(input.equals("1")){
            endProgram();
        }
        else if(input.equals("2")){
            printCurrentUserData();
        }
        else if(input.equals("3")){
            printOtherUserData(reader);
        }
        else if(input.equals("4")){
            addVehicle(reader);
        }else if(input.equals("5")){
            deleteVehicle(reader);
        }else if(input.equals("6")){
            showRooms();
        }else if(input.equals("7")){
            createRoom(reader);
        }
    }

    private void endProgram(){
        System.exit(0);
    }

    private void printCurrentUserData(){
        System.out.println(loggedOsoba.toString());
    }

    private void printOtherUserData(BufferedReader reader) throws IOException {
        System.out.println("Podaj imie oraz nazwisko użytkownika");
        String personName = reader.readLine();
        for(Osoba osoba : this.osobaList){
            if(personName.equals(osoba.getImie() + " " + osoba.getNazwisko())){
                System.out.println(osoba);
            }
        }
    }

    private void addVehicle(BufferedReader reader) throws IOException {
        List<Pomieszczenie> avaliableRooms = new ArrayList<>();
        for(Pomieszczenie room : loggedOsoba.getPomieszczenia()){
            if(!room.isFull()){
                avaliableRooms.add(room);
            }
        }
        if(avaliableRooms.isEmpty()){
            System.out.println("Wszystkie pomieszczenia są zapełnione, wynajmij nowe");
        }else{
            System.out.println("Podaj id pomieszczenia do którego chcesz dodać pojazd");
            System.out.println(avaliableRooms);
            String userInput = reader.readLine();
            try {
              Integer roomId = Integer.parseInt(userInput);
              Pomieszczenie choosenRoom = null;
              for(Pomieszczenie room : avaliableRooms){
                  if(room.getId().equals(roomId)){
                      choosenRoom = room;
                  }
              }
              createVehicle(choosenRoom, reader);

            }catch (NumberFormatException e){
                System.out.println("Niepoprawna liczba");
            }catch (TooManyThingsException e){
                System.out.println("Skladzik jest zapchany, wynajmij nowy");
            }
        }
    }

    public void createVehicle(Pomieszczenie room, BufferedReader reader) throws IOException, TooManyThingsException {
        boolean homologacjaMotocykla = false;
        int przerzutkiRoweru = 0;
        String stanRoweru = "";
        String paliwoSamochodu = null;

        String nazwa;
        double rozmiar = 0.0D;

        if(room == null){
            System.out.println("Nie ma pomieszczenia z takim identyfikatorem");
            return;
        }
        System.out.println("Jaki typ pojazdu chcesz utworzyć ? (Rower,Motocykl,Samochód)");
        String vehicleType = reader.readLine();
        if(!"Motocykl".equals(vehicleType) && !"Rower".equals(vehicleType) && !"Samochód".equals(vehicleType)){
            System.out.println("Podałeś zły typ pojazdu");
            return;
        }

        if(vehicleType.equals("Motocykl")){
            System.out.println("Czy ma mieć homologacje ?");
            String homologationInput = reader.readLine();
            if(homologationInput.equals("tak")){
                homologacjaMotocykla = true;
            }else if(homologationInput.equals("nie")){
                homologacjaMotocykla = false;
            }else{
                System.out.println("Homologacja przyjmuje tylko wartości tak/nie");
            }
        }

        if(vehicleType.equals("Rower")){
            System.out.println("Ile przerzutek ma rower ?");
            String input = reader.readLine();
            try{
                przerzutkiRoweru = Integer.parseInt(input);
            }catch (NumberFormatException e){
                System.out.println("Nie poprawna liczba");
            }
            System.out.println("Jaki jest stan roweru ? Złożony/Rozłożony");
            stanRoweru = reader.readLine();
        }

        if(vehicleType.equals("Samochód")){
            System.out.println("Na jakie paliwo jeździ ten samochód ?");
            String input = reader.readLine();
            paliwoSamochodu = input;
        }
        System.out.println("Jaka jest nazwa pojazdu ?");
        nazwa = reader.readLine();

        System.out.println("Jaki jest rozmiar pojazdu ?");
        try{
          rozmiar = Double.parseDouble(reader.readLine());
        }catch (NumberFormatException e){
            System.out.println("Nie poprawna liczba");
        }



        if(vehicleType.equals("Rower")){
            if(stanRoweru.equals("Złożony")){
                rozmiar = rozmiar/2;
            }
            Rower rower = new Rower(nazwa, rozmiar, przerzutkiRoweru, stanRoweru);
            room.validateAvailableSize(rozmiar);
            room.getSkładzik().getListaRowerow().add(rower);
        }
        if(vehicleType.equals("Motocykl")){
            Motocykl motocykl = new Motocykl(nazwa, rozmiar, homologacjaMotocykla);
            room.validateAvailableSize(rozmiar);
            room.getSkładzik().getListaMotocykli().add(motocykl);
        }
        if(vehicleType.equals("Samochód")){
            Samochód samochód = new Samochód(nazwa, rozmiar, paliwoSamochodu);
            room.validateAvailableSize(rozmiar);
            room.getSkładzik().getListaSamochodow().add(samochód);
        }

    }

    private void deleteVehicle(BufferedReader reader) throws IOException {
        System.out.println("Jaki typ pojazdu chcesz usunąć ? (Samochód, Rower, Motocykl)");
        String vehicleType = reader.readLine();
        System.out.println("Podaj id pojazdu");
        String input = reader.readLine();
        Long id = null;
        try {
             id = Long.parseLong(input);
        }catch(NumberFormatException e){
            System.out.println("Niepoprawna liczba");
            return;
        }
        if(vehicleType.equals("Rower")){
                    for(Pomieszczenie pomieszczenie : loggedOsoba.getPomieszczenia()){
                        List<Rower> rowery = pomieszczenie.getSkładzik().getListaRowerow();
                        Rower toBeRemoved = null;
                        for(Rower rower : rowery){
                            if(rower.getId().equals(id)) {
                                toBeRemoved = rower;
                                break;
                            }
                        }
                        rowery.remove(toBeRemoved);
            }
        }
        if(vehicleType.equals("Motocykl")){
            for(Pomieszczenie pomieszczenie : loggedOsoba.getPomieszczenia()){
                List<Motocykl> motocykle = pomieszczenie.getSkładzik().getListaMotocykli();
                Motocykl toBeRemoved = null;
                for(Motocykl motocykl : motocykle){
                    if(motocykl.getId().equals(id)){
                        toBeRemoved = motocykl;
                        break;
                    }
                }
                motocykle.remove(toBeRemoved);
            }
        }
        if(vehicleType.equals("Samochód")){
            for(Pomieszczenie pomieszczenie : loggedOsoba.getPomieszczenia()){
                List<Samochód> samochody = pomieszczenie.getSkładzik().getListaSamochodow();
                Samochód toBeRemoved = null;
                for(Samochód rower : samochody){
                    if(rower.getId().equals(id)){
                        toBeRemoved = rower;
                        break;
                    }
                }
                samochody.remove(toBeRemoved);
            }
        }
    }

    private void showRooms(){
        List<Pomieszczenie> avaliableRooms = new ArrayList<>();
        for(Pomieszczenie pomieszczenie : loggedOsoba.getPomieszczenia()){
            if(pomieszczenie.isFull()){
                continue;
            }
            avaliableRooms.add(pomieszczenie);
        }
        System.out.println(avaliableRooms);
    }

    private void createRoom(BufferedReader reader) throws IOException {
        try {
            System.out.println("Podaj długość pomieszczenia");
            Double długość = Double.parseDouble(reader.readLine());
            System.out.println("Podaj szerokość pomieszczenia");
            Double szerokość = Double.parseDouble(reader.readLine());
            Double rozmiarPomieszczenia = BigDecimal.valueOf(długość).multiply(BigDecimal.valueOf(szerokość)).doubleValue();

            Pomieszczenie pomieszczenie = new Pomieszczenie(rozmiarPomieszczenia, new Składzik());
            if(loggedOsoba.getPomieszczenia().isEmpty()){
                loggedOsoba.setDataPierwszegoNajmu(LocalDateTime.now().toString());
            }
            loggedOsoba.getPomieszczenia().add(pomieszczenie);
        }catch (NumberFormatException e){
            System.out.println("Niepoprawna liczba");
        }
        exportDataToFile();
    }

    private void exportDataToFile() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("./src/com/company/file/stanMagazynu.txt"));
            String fileContent = "";
            for(Osoba osoba : osobaList){
                fileContent = fileContent + osoba.toString() + "\n";
            }
            writer.write(fileContent);
            writer.close();
            System.out.println("Zapis do pliku udany");
        } catch (IOException e) {
            System.out.println("Zapis do pliku się nie powiódł");
        }
    }
}

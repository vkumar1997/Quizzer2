package com.android.vikas.quizzer;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


/**
 * Created by Vikas on 3/24/2016.
 */
public class QuestionBank extends SQLiteOpenHelper {
    private static final String DB_NAME="Quizzer";
    private static final int DB_VERSION=1;

    QuestionBank(Context context)
    {
        super(context,DB_NAME,null,DB_VERSION);
    }

    public void onCreate(SQLiteDatabase db)
    {
        db.execSQL("Create table Quiz_topics(" + "_id INTEGER PRIMARY KEY AUTOINCREMENT," + "TOPIC TEXT," + "COMPLETION INTEGER," + "TOTAL INTEGER," + "IMG_RESOURCE INTEGER);");
        insertQuiz_topics(db, "Politics", 0, 76, R.drawable.politics_back);
        insertQuiz_topics(db, "World leaders", 0, 75, R.drawable.leaders_back);
        insertQuiz_topics(db, "Map Freaks", 0, 75, R.drawable.capitals_back);
        insertQuiz_topics(db, "IQ Test", 0, 50, R.drawable.iq_back);
        insertQuiz_topics(db, "Physics", 0, 75, R.drawable.physics_back);
        insertQuiz_topics(db, "Maths", 0, 76, R.drawable.math_back);
        insertQuiz_topics(db,"Astronomy",0,75,R.drawable.astronomy_back);
        insertQuiz_topics(db,"Computer",0,75,R.drawable.computer_back);
        insertQuiz_topics(db,"Pottermore",0,100,R.drawable.potter_back);
        insertQuiz_topics(db,"Hollywood",0,100,R.drawable.hollywood_back);
        insertQuiz_topics(db,"Sherlock",0,100,R.drawable.sherlock_back);
        insertQuiz_topics(db, "Breaking Bad", 0, 100, R.drawable.breakingbad_back);
        insertQuiz_topics(db, "Game of Thrones", 0, 103, R.drawable.gameofthrones_back);
        insertQuiz_topics(db, "Suits", 0, 100, R.drawable.suits_back);
        insertQuiz_topics(db, "House", 0, 100, R.drawable.house_back);
        insertQuiz_topics(db, "Football", 0, 72, R.drawable.football_back);
        insertQuiz_topics(db, "Cricket", 0, 70, R.drawable.cricket_back);
        insertQuiz_topics(db, "Tennis", 0, 70, R.drawable.tennis_back);
        insertQuiz_topics(db, "Word Play", 0, 61, R.drawable.anagram_back);
        insertQuiz_topics(db, "Basic Maths", 0, 60, R.drawable.basicmaths_back);

        db.execSQL("Create table 'Politics'(" + "_id INTEGER PRIMARY KEY AUTOINCREMENT," + "QUESTION TEXT," + "CORRECT_ANSWER TEXT," + "OPTION_1 TEXT," + "OPTION_2 TEXT," + "OPTION_3 TEXT," + "PRIORITY INTEGER," + "IMG_RESOURCE INTEGER);");
        db.execSQL("Create table 'World leaders'(" + "_id INTEGER PRIMARY KEY AUTOINCREMENT," + "QUESTION TEXT," + "CORRECT_ANSWER TEXT," + "OPTION_1 TEXT," + "OPTION_2 TEXT," + "OPTION_3 TEXT," + "PRIORITY INTEGER," + "IMG_RESOURCE INTEGER);");
        db.execSQL("Create table 'Map Freaks'(" + "_id INTEGER PRIMARY KEY AUTOINCREMENT," + "QUESTION TEXT," + "CORRECT_ANSWER TEXT," + "OPTION_1 TEXT," + "OPTION_2 TEXT," + "OPTION_3 TEXT," + "PRIORITY INTEGER," + "IMG_RESOURCE INTEGER);");
        db.execSQL("Create table 'IQ Test'(" + "_id INTEGER PRIMARY KEY AUTOINCREMENT," + "QUESTION TEXT," + "CORRECT_ANSWER TEXT," + "OPTION_1 TEXT," + "OPTION_2 TEXT," + "OPTION_3 TEXT," + "PRIORITY INTEGER," + "IMG_RESOURCE INTEGER);");
        db.execSQL("Create table 'Physics'(" + "_id INTEGER PRIMARY KEY AUTOINCREMENT," + "QUESTION TEXT," + "CORRECT_ANSWER TEXT," + "OPTION_1 TEXT," + "OPTION_2 TEXT," + "OPTION_3 TEXT," + "PRIORITY INTEGER," + "IMG_RESOURCE INTEGER);");
        db.execSQL("Create table 'Maths'(" + "_id INTEGER PRIMARY KEY AUTOINCREMENT," + "QUESTION TEXT," + "CORRECT_ANSWER TEXT," + "OPTION_1 TEXT," + "OPTION_2 TEXT," + "OPTION_3 TEXT," + "PRIORITY INTEGER," + "IMG_RESOURCE INTEGER);");
        db.execSQL("Create table 'Astronomy'("+"_id INTEGER PRIMARY KEY AUTOINCREMENT,"+"QUESTION TEXT,"+"CORRECT_ANSWER TEXT,"+"OPTION_1 TEXT,"+"OPTION_2 TEXT,"+"OPTION_3 TEXT,"+"PRIORITY INTEGER,"+"IMG_RESOURCE INTEGER);");
        db.execSQL("Create table 'Computer'("+"_id INTEGER PRIMARY KEY AUTOINCREMENT,"+"QUESTION TEXT,"+"CORRECT_ANSWER TEXT,"+"OPTION_1 TEXT,"+"OPTION_2 TEXT,"+"OPTION_3 TEXT,"+"PRIORITY INTEGER,"+"IMG_RESOURCE INTEGER);");
        db.execSQL("Create table 'Pottermore'("+"_id INTEGER PRIMARY KEY AUTOINCREMENT,"+"QUESTION TEXT,"+"CORRECT_ANSWER TEXT,"+"OPTION_1 TEXT,"+"OPTION_2 TEXT,"+"OPTION_3 TEXT,"+"PRIORITY INTEGER,"+"IMG_RESOURCE INTEGER);");
        db.execSQL("Create table 'Hollywood'("+"_id INTEGER PRIMARY KEY AUTOINCREMENT,"+"QUESTION TEXT,"+"CORRECT_ANSWER TEXT,"+"OPTION_1 TEXT,"+"OPTION_2 TEXT,"+"OPTION_3 TEXT,"+"PRIORITY INTEGER,"+"IMG_RESOURCE INTEGER);");
        db.execSQL("Create table 'Sherlock'(" + "_id INTEGER PRIMARY KEY AUTOINCREMENT," + "QUESTION TEXT," + "CORRECT_ANSWER TEXT," + "OPTION_1 TEXT," + "OPTION_2 TEXT," + "OPTION_3 TEXT," + "PRIORITY INTEGER," + "IMG_RESOURCE INTEGER);");
        db.execSQL("Create table 'Breaking Bad'(" + "_id INTEGER PRIMARY KEY AUTOINCREMENT," + "QUESTION TEXT," + "CORRECT_ANSWER TEXT," + "OPTION_1 TEXT," + "OPTION_2 TEXT," + "OPTION_3 TEXT," + "PRIORITY INTEGER," + "IMG_RESOURCE INTEGER);");
        db.execSQL("Create table 'Game of Thrones'(" + "_id INTEGER PRIMARY KEY AUTOINCREMENT," + "QUESTION TEXT," + "CORRECT_ANSWER TEXT," + "OPTION_1 TEXT," + "OPTION_2 TEXT," + "OPTION_3 TEXT," + "PRIORITY INTEGER," + "IMG_RESOURCE INTEGER);");
        db.execSQL("Create table 'Suits'(" + "_id INTEGER PRIMARY KEY AUTOINCREMENT," + "QUESTION TEXT," + "CORRECT_ANSWER TEXT," + "OPTION_1 TEXT," + "OPTION_2 TEXT," + "OPTION_3 TEXT," + "PRIORITY INTEGER," + "IMG_RESOURCE INTEGER);");
        db.execSQL("Create table 'House'(" + "_id INTEGER PRIMARY KEY AUTOINCREMENT," + "QUESTION TEXT," + "CORRECT_ANSWER TEXT," + "OPTION_1 TEXT," + "OPTION_2 TEXT," + "OPTION_3 TEXT," + "PRIORITY INTEGER," + "IMG_RESOURCE INTEGER);");
        db.execSQL("Create table 'Football'(" + "_id INTEGER PRIMARY KEY AUTOINCREMENT," + "QUESTION TEXT," + "CORRECT_ANSWER TEXT," + "OPTION_1 TEXT," + "OPTION_2 TEXT," + "OPTION_3 TEXT," + "PRIORITY INTEGER," + "IMG_RESOURCE INTEGER);");
        db.execSQL("Create table 'Cricket'(" + "_id INTEGER PRIMARY KEY AUTOINCREMENT," + "QUESTION TEXT," + "CORRECT_ANSWER TEXT," + "OPTION_1 TEXT," + "OPTION_2 TEXT," + "OPTION_3 TEXT," + "PRIORITY INTEGER," + "IMG_RESOURCE INTEGER);");
        db.execSQL("Create table 'Tennis'(" + "_id INTEGER PRIMARY KEY AUTOINCREMENT," + "QUESTION TEXT," + "CORRECT_ANSWER TEXT," + "OPTION_1 TEXT," + "OPTION_2 TEXT," + "OPTION_3 TEXT," + "PRIORITY INTEGER," + "IMG_RESOURCE INTEGER);");
        db.execSQL("Create table 'Word Play'(" + "_id INTEGER PRIMARY KEY AUTOINCREMENT," + "QUESTION TEXT," + "CORRECT_ANSWER TEXT," + "OPTION_1 TEXT," + "OPTION_2 TEXT," + "OPTION_3 TEXT," + "PRIORITY INTEGER," + "IMG_RESOURCE INTEGER);");
        db.execSQL("Create table 'Basic Maths'(" + "_id INTEGER PRIMARY KEY AUTOINCREMENT," + "QUESTION TEXT," + "CORRECT_ANSWER TEXT," + "OPTION_1 TEXT," + "OPTION_2 TEXT," + "OPTION_3 TEXT," + "PRIORITY INTEGER," + "IMG_RESOURCE INTEGER);");

        insertPolitics(db, "Who was Prime Minister of India with the second longest term in office?", "Indira Gandhi", "Narendra Modi", "Lalu Prasad Yadav", "Manmohan Singh", 1, -1);
        insertPolitics(db,"______ was India's first Deputy Prime Minister","Sardar Vallabhbai Patel","Atal Behari","Morarji Desai","Om Prakash",1,-1);
        insertPolitics(db,"Pratibha Patil is the _____ Preident of India","12th","8th","10th","9th",1,-1);
        insertPolitics(db,"_______ is the first Indian women who got Bharat Ratna.","Indira Gandhi","C.C. Prasad","Meena Kumari","Sarojini Naidu",1,-1);
        insertPolitics(db,"The Indian National Congress Party was founded in....","None of these","1884","1887","1897",1,-1);
        insertPolitics(db,"Article 21 of the Constitution of India protects...","Right to life","Child labor","Freedom of speech","Freedom of education",1,-1);
        insertPolitics(db,"Kerala elected first communist government with ....... as CM.","EMS Namboodripad","C Naidu","K Mangalam","None of These",1,-1);
        insertPolitics(db,"President submits his/her resignation to ...........","Cheif Justice","Vice President","CM","Prime Minister",1,-1);
        insertPolitics(db,"British India consisted of ……… provinces and 562 princely states at the time of independence.","17","12","15","18",1,-1);
        insertPolitics(db,"States in India have their own elected governments, whereas Union Territories are governed by an administrator appointed by the ……… ","None of these","Prime Minister","Chief Minister","Chief Justice",1,-1);
        insertPolitics(db,"Garibi Hatao slogan was given by.....","INC","BJP","APP","MJP",1,-1);
        insertPolitics(db,"The Sixth World Hindi Conference was held in ...... at London.","September 1999","October 1999","December 1999","October 1998",1,-1);
        insertPolitics(db,"......... lost elections in 2009 (J&K) to Farooq Abdullah.","Iftikar Ansari","Iqbal Ansari","Kumar Gaurav","Tarun Sharma",1,-1);
        insertPolitics(db,"Deve Gowda was the 14th prime minister of India during ........","1996-1997","1991-1995","1990-1994","None of these",1,-1);
        insertPolitics(db,"....... was the interim Prime Minister of India twice for thirteen days each.","Gulzarilal Nanda","Lal Singh Kamat","Ram Deshmukh","S.P. Radhakrishanan",1,-1);
        insertPolitics(db,"............... was the first Chief Minister of Maharashtra after the division of Bombay State and the fifth Deputy Prime Minister of India.","Yashwantrao Chavan","Ram Deshmukh","Shanta Ram","Yashwantrao Mitra",1,-1);
        insertPolitics(db,"In ....... Indira Gandhi declared emergency for 'internal disturbance'","1975","1977","1965","1976",1,-1);
        insertPolitics(db,"BJP (Bharatiya Janata Party) was founded in year .......","1980","1971","1978","1984",1,-1);
        insertPolitics(db,"On April 2012, .......... was sentenced to four years rigorous imprisonment for accepting a bribe of INR 100,000 from Tehelka journalists.","Bangaru Laxman","Kumar Arth","Amit Gupta","None of these",1,-1);
        insertPolitics(db,"The newspaper run by BJP is ..... ","Kamal Sandesh","Swarn Sandesh","Sarv Sandesh","Indian State Express",1,-1);
        insertPolitics(db,"After joining the Social Democratic Federation, ...... started her own campaigning newspaper called The Link.","Annie Besant","Annie Charles","Graham Tick","Hunert Clarke",1,-1);
        insertPolitics(db,"In 1947, ........ entered the diplomatic service and became India's ambassador to the Soviet Union from 1947 to 1949. ","Vijaya Lakshmi","Nayantara Sahgal","Gita Mitra","None of these",1,-1);
        insertPolitics(db,"In 1773, .......... was appointed the first Governor-General of Bengal. ","Warren Hastings","John Bath","John Davenport","Jagjivan Divas",1,-1);
        insertPolitics(db,"In the 1941, disappointed with Gandhi, ........ left India to launch a military struggle for the freedom of India with the help of foreign forces","Subhash Chandra Bose","Chandrashekhar Azad","Bhagat Singh","None of these",1,-1);
        insertPolitics(db,"....... was the last Viceroy of India (1947) and the first Governor-General of the independent Union of India (1947–48). ","None of these","Dude Victor","Louis Francis","Admiral Mika",1,-1);
        insertPolitics(db,"In 1969 ......... was expelled from the congress party by a group called the 'Syndicate.' ","Indira Gandhi","Rajendra Prasad","Jawahar Lal Nehru","Lal Bahadur Shastri",1,-1);
        insertPolitics(db,"While campaigning to regain power in May 1991, ........ was assassinated by a suicide bomber associated with the Tamil Tigers.","Rajiv Gandhi","P.V. Narasimha Rao","Indira Gandhi","Ram Prasad Gutta",1,-1);
        insertPolitics(db,"............. became the first non-Congress Prime Minister of India. ","Morarji Desai","Atal Bihari Vajpayee","Shammi Narang","Deve Gowda",1,-1);
        insertPolitics(db,"Which of the following is not a political party in India?","LLTE","IUML","AJSU","Asom Gana Parishad",1,-1);
        insertPolitics(db,"In 2007, authorities began investigating ........ for suspicion of money laundering. He stashed away billions into Swiss bank accounts.","Hasan Ali Khan","Ali Haider","Kumar Kaishiv","Pratibha Khan",1,-1);
        insertPolitics(db,"In ......., Mr. Manmohan Singh and his coalition government won an unexpectedly broad re-election victory.","None of these","2004","2010","2008",1,-1);
        insertPolitics(db,"There are ........ fundamental rights recognized by the constitution of India. ","6","5","7","8",1,-1);
        insertPolitics(db,"The Lokpal Bill was first introduced by Shanti Bhushan in .......","1968","1978","2005","1973",1,-1);
        insertPolitics(db,"Lakshadweep is under the jurisdiction of High Court of ........ ","Kerela","Karnatka","Andaman & Nicobar","None of these",1,-1);
        insertPolitics(db,"Parliament of India was founded in ........ ","1919","1947","1932","1942",1,-1);
        insertPolitics(db,"The ‘Council of States’ which is also known as ......... ","Rajya Sabha","Lok Sabha","Parliament","Assembly",1,-1);
        insertPolitics(db,"Who was first woman congress president?","Annie Besant","Indira Gandhi","Sarojini Naidu","Ambica Charan",1,-1);
        insertPolitics(db,"Who was the chairman of Committee to Review Working of the Constitution (CRWC) which was constituted in 2000?","M.N. Venkatachaliah","B.P.Jeevan Reddy","R.S.Sarkaria","None of these",1,-1);
        insertPolitics(db,"Who among the following had the longest tenure as Indian MP from same constituency?","P.M. Sayeed","Indrajit Gupta","Somnath Chatterjee","Narendra Modi",1,-1);
        insertPolitics(db,"Who among the following had the shortest tenure as Indian President?","Zakir Hussain","Rajendra Prasad","Lal Bahadur Shastri","Jawaharlal Nehru",1,-1);
        insertPolitics(db,"In which year, Sikkim became a part of India","1975","1972","1982","1992",1,-1);
        insertPolitics(db,"The National Human Rights commission is a ","1993","1995","1997","1990",1,-1);
        insertPolitics(db,"Who can be the chairperson of National Human Rights Commission","Chief Justice (SC)","Judge (SC)","Chief Justice (HC)","M.P.",1,-1);
        insertPolitics(db,"Who was the first comptroller and Auditor General of India?","V Narahari Rao","AK Roy","AK Chandra","S Ranganathan",1,-1);
        insertPolitics(db,"Which one is the 28th state of India?","Jharkhand","Chattishgarh","Goa","Uttarakhand",1,-1);
        insertPolitics(db,"A money bill in the parliament can be introduced with the recommendation of....","President","Prime Minister","Speaker","Finance Minister",1,-1);
        insertPolitics(db,"Who was the only Lok Sabha Speaker to become the President of India","Neelam Reddy","Zail Singh","VV Giri","S Radhakrishanan",1,-1);
        insertPolitics(db,"India's 'Look East policy' was started by the Prime Minister....","PV Narasimha Rao","Rajiv Gandhi","Atal Bihari Vajpayee","Manmohan Singh",1,-1);
        insertPolitics(db,"From which country has the Directive Principle of State Policy been adopted","Ireland","Germany","England","USA",1,-1);
        insertPolitics(db,"Which state is not included in the sixth schedule to the Constitution which contains provisions concerning the administration of tribal areas?","Nagaland","Assam","Meghalaya","Tripura",1,-1);
        insertPolitics(db,"Which of the following is an extra constitutional body?","Planning Commission","SC and ST commission","Finance Commission","Inter State Council",1,-1);
        insertPolitics(db,"The Chairman of which committee is generally from the opposite party","Public Accounts","Estimates","Assurances","Public Undertakings",1,-1);
        insertPolitics(db,"Which one of the following is not included in the state list in the constitution of India?","Criminal Procedure Code","Police","Law and Order","Prison",1,-1);
        insertPolitics(db,"Which one of the following word was not initially included in the preamble of India?","Socialist","Republic","Sovereign","Secular",1,-1);
        insertPolitics(db,"The vacancy of President post must be filled within a time period of....","Six Month","Three Month","One Month","One Year",1,-1);
        insertPolitics(db,"Election Commission is a _____ member body with one Chief Election Commissioner","3","2","4","5",1,-1);
        insertPolitics(db,"Total number of members in the drafting committee including the Chairman was...","7","6","8","9",1,-1);
        insertPolitics(db,"Supreme Court Judge retires after attaining the age of.....","65 years","67 years","63 years","70 years",1,-1);
        insertPolitics(db,"First Chief Justice of India is....","H J Kania","SR Das","Chand Mahajan","Patanjali Shastri",1,-1);
        insertPolitics(db,"Total number of seats in Lower House of Parliament....","545","250","530","552",1,-1);
        insertPolitics(db,"Total number of seats in Upper House of Parliament....","250","545","218","257",1,-1);
        insertPolitics(db,"When was the first session of Lok Sabha held?","13th May 1952","15th August 1952","15th August 1950","12th January 1953",1,-1);
        insertPolitics(db,"Who was the first speaker of Lok Sabha?","GV Mavlankar","MA Ayyanagar","Rajendra Prasad","None of these",1,-1);
        insertPolitics(db,"How many sessions are held in a year of Lok Sabha?","3","4","2","5",1,-1);
        insertPolitics(db,"Which state has highest no of representatives in both the houses?","Uttar Pradesh","West Bengal","Rajasthan","Madhya Pradesh",1,-1);
        insertPolitics(db,"How many high courts are present in the country India?","24","32","25","27",1,-1);
        insertPolitics(db,"Which is the oldest High Court in India?","Calcutta High Court","Madras High Court","Andra High Court","Delhi High Court",1,-1);
        insertPolitics(db,"Which is the second largest judicial complex in the world?","Madras High Court","Delhi High Court","Gauhati High Court","Bombay High Court",1,-1);
        insertPolitics(db,"The only person who defeated Indira Gandhi in Lok Sabha election, 1977","Raj Narain","Morarji Desai","Ram Manohar Lohia","No one",1,-1);
        insertPolitics(db,"Who holds the record of winning Lok Sabha election with highest no of votes?","Khagen Basu","Jawaharlal Nehru","Anil Basu","Morarji Desai",1,-1);
        insertPolitics(db, "Which state has the highest no seats for Scheduled Tribes in Lok Sabha?", "Madhya Pradesh", "Assam", "Bihar", "Chhattisgarh", 1, -1);
        insertPolitics(db, "Who is the longest serving Chief Minister in India?", "Jyoti Basu", "Narendra Modi", "Sheila Dixit", "Multiple Answers", 1, -1);
        insertPolitics(db, "Which state has no Panchayati Raj Institution?", "Nagaland", "Mizoram", "Bihar", "Sikkim", 1, -1);
        insertPolitics(db, "Right to Information Act applies to all states and Union Territories except....", "Jammu and Kashmir", "Andaman & Nicobar", "Lakshadweep", "Goa", 1, -1);
        insertPolitics(db, "Who is the first President of Indian National Congress?", "W C Bonnerjee", "M K Gandhi", "George Yule", "Dadabhai Naraoji", 1, -1);
        insertPolitics(db, "Who got Bharat Ratna Award before becoming Preident of India?", "Dr Zakir Hussain", "APJ Abdul Kalam", "Dr V V Giri", "Rajendra Prasad", 1, -1);

        insertLeaders(db, "Who founded Facebook?", "Mark Zuckerberg", "Steve Jobs", "Bill Gates", "Mukesh Ambani", 1, -1);
        insertLeaders(db,"Jamini Roy was a famous _________ ?", "Painter", "Dancer", "Actor", "Producer", 1, -1);
        insertLeaders(db,"Satyajit Ray is known for his ________ ?", "Direction", "Paintings", "Production", "Acting", 1, -1);
        insertLeaders(db,"Ashok Pandit is known for his outstanding performance in which field?", "Shooting", "Swimmimg", "Kabaddi", "Wrestling",1,-1);
        insertLeaders(db,"Charles Correa has distinguished himself in which of the following fields?","Architecture","Western Music","Ballet","Painting",1,-1);
        insertLeaders(db,"The Indian to beat computers in mathematical Wizardry is _______?","Shakunthala Devi","Ramanujan","Raja Ramanna","Rina Panigrahi",1,-1);
        insertLeaders(db,"Who among the following is a social activist campaigning against child labour?","Swami Agnivesh","Shabana Azmi","Mira Nair","Baba Amte",1,-1);
        insertLeaders(db,"Which of the following fields A. Nageshwara Rao is associated with?","Motion Pictures","Politics","Literature","Sports",1,-1);
        insertLeaders(db,"What is common between Kutty, Shankar, Laxman and Sudhir Dar?","Drawing Cartoons","Classical Dance","Instrumental Music","Film Direction",1,-1);
        insertLeaders(db,"Jude Felix is an famous Indian player in which of the fields?","Hockey","Tennis","Volleyball","Football",1,-1);
        insertLeaders(db,"Ms. Bachendri Pal had undertaken a unique expedition for focusing attention on which of these?","Spirit of adventure","The Girl Child","National Integration","One nation one family",1,-1);
        insertLeaders(db,"Amjad Ali Khan is associated with which of the following musical instruments?","Sarod","Sitar","Violin","Veena",1,-1);
        insertLeaders(db,"Pandit K.G. Ginde, was well known for his contributions in the field of?","Music","Dance","Sanskrit","Ayurveda",1,-1);
        insertLeaders(db,"Who declared that his ultimate goal was to wipe 'every tear from every eye' ?","Jawahar Lal Nehru","Sardar Patel","Mahatma Gandhi","Rajendra Prasad",1,-1);
        insertLeaders(db,"Who among the following was an eminent painter?","Sardara Ukil","Meherally","V. Shantaram","Uday Shankar",1,-1);
        insertLeaders(db,"Who is the President of Dominican Republic?","Danilo Madina","Leonel Fernandez","Rafael Trujillo","Joaquin Balaguer",1,-1);
        insertLeaders(db,"Who wrote The Book 'The Taming of the Shrew' ?","William Shakespeare","Babe Ruth","Dr. Seuss","Roald Dahl",1,-1);
        insertLeaders(db,"Who wrote the song 'Hello' ?","Adele","Kim Kardashian","Arina Grande","Justin Bieber",1,-1);
        insertLeaders(db,"Who was Plato?","Greek Philospher","English Teacher","Statue","Ancient Weatherman",1,-1);
        insertLeaders(db,"Who was Thomas Alva Edison?","Inventor of Bulb","Inventor of phone","Inventer of chairs","Inventer of Dynamites",1,-1);
        insertLeaders(db,"Who is the most subscribes and most successful Youtuber?","PewDiePie","Tayler Oakley","Markiplier","AIB",1,-1);
        insertLeaders(db,"Who was Hellen Keller?","A blind and deaf Author","A prankster","A Pop Singer","A Novelist",1,-1);
        insertLeaders(db,"Who found the way to the Indies?","Christopher Columbus","Leonardo Da Vinci","Barnet the Dinasour","Vasco De Gama",1,-1);
        insertLeaders(db,"Who was the first U.S. President?","George Washington","James Buchanan","Abraham Lincoln","James Madison",1,-1);
        insertLeaders(db,"Who is J.K. Rowling?","Author of Harry Potter","A Famous Noovelist","A Newsagent","",1,-1);
        insertLeaders(db,"Who is Bill Gates","Multiple Answers","Richest Man","Owner of Microsoft","Facebook Owner",1,-1);
        insertLeaders(db,"Who is Stacy Greggs?","Author of 17 books","Famous Traveller","Pop Singer","Scientist",1,-1);
        insertLeaders(db,"German scientist who is known as 'father of chemical warfare' is ","Fritz Haber","Louis Pasteur","William Ramsay","Ernst Rutherford",1,-1);
        insertLeaders(db,"General theory of relativity proposed by Albert Einstein is a theory of","gravitation","Electromagnetic field","light","zero point energy",1,-1);
        insertLeaders(db,"French microbiologist Louis Pastuer is renowned for discoveries of principles of ______","All of them","Pasteurization","Microbial fermentation","Vaccination",1,-1);
        insertLeaders(db,"For which field was Robin Williams known?","Actor & Comedian","Composer","Singer","Shooter",1,-1);
        insertLeaders(db,"The First PM of England was","Gladstone","Benjamin Dizrelli","Robert Walpol","Charles Andrews",1,-1);
        insertLeaders(db,"The first President of US to visit India was?","D.W. Eisenhower","John F. Kennedy","George Washington","Thomas Jefferson",1,-1);
        insertLeaders(db,"Chandigarh was designed by?","Le Cobousier","Edward Lutyens","Michelongo","Shah Jahan",1,-1);
        insertLeaders(db,"Software king Bill Gates was a dropout from which university?","Harvard","MIT","Ohio State University","Stanford",1,-1);
        insertLeaders(db,"Leo Tolestoy was novelist of?","Russia","Germany","Greece","England",1,-1);
        insertLeaders(db,"Who was the painter of Mona Lisa?","Leonardo da Vinci","F.A. Bartholdi","Henry Smith","None of these",1,-1);
        insertLeaders(db,"Who is considered the father of English Poetry ?","Geoffrey Chaucer","Frost","Robert Ped","Milton",1,-1);
        insertLeaders(db,"Who was known as “Man of Destiny”?","Napolean","Hitler","Gandhi","Leonardo da Vinci",1,-1);
        insertLeaders(db,"Saudi billionaire Osama Bin Ladan made his money through which business ?","Construction","Terrorism","Weapons Trading","Human Trafficking",1,-1);
        insertLeaders(db,"Only Pakistan scientist who won the Noble Prize is ?","Dr. Abdus Salam","Dr. Abdul Qadeer Khan","Dr. Munid Ahmad Khan","Dr. Samar Mubarak Band",1,-1);
        insertLeaders(db,"Penicillin was discovered by ?","Alexander Fleming","Louis Pasteur","Alfred Nobel","S.A. Waksman",1,-1);
        insertLeaders(db,"Who is father of early chemistry?","Jabir Bin Hayyan","Ibn-ul-Haitham","Al-Bairuni","Mohammad Jinnah",1,-1);
        insertLeaders(db,"Fiddle Castro remained president of _____ for more than thirty five years ?","Cuba","Poland","Slovenia","Spain",1,-1);
        insertLeaders(db,"Al-Bairuni discovered the radius of the earth which was ?","6338 km","6585 km","4000 km","10000km",1,-1);
        insertLeaders(db,"Einstein was awarded Nobel Prize for his work on_________","Special theory of relativity","General theory of relativity","Brownian Motion","Photoelectric Effect",1,-1);
        insertLeaders(db,"Who invented the telephone","J.L Baird","Alexander Graham Bell","Marconi","James Dewar",1,-1);
        insertLeaders(db,"Who propounded the Quantum Theory?","Max Plank","Heisenburg","Albert Einstein","James Maxwell",1,-1);
        insertLeaders(db,"Who is the inventor of printing press?","Johannes Gutenburg","William Lee","George Eastman","R.w. Thomson",1,-1);
        insertLeaders(db,"Who is the founder of modern atomic theory?","John Dalton","James Ritty","Ernst Walton","None of above",1,-1);
        insertLeaders(db,"Who invented zero?","None of them","Aristotle","Bhaskara","Varahamihira", 1, -1);
        insertLeaders(db, "Who invented the safety match?", "Landstorm", "Gillette", "Humphrey Davy","R.W. Thomson", 1, -1);
        insertLeaders(db, "Who the the co-founder and the CEO (till 2002) of Infosys?", "Narayana Murthy", "Vijay Mallya", "Sunil Mittal", "Mukesh Ambani",1,-1);
        insertLeaders(db, "Who is the founder of Amazon?", "Jeff Bezos", "Tim Cook", "Warren Buffet", "Bob Iger", 1, -1);
        insertLeaders(db,"Who is the current executive officer of Apple Inc.", "Tim Cook", "Warren Bufet", "Steve Jobs", "Bill Gates", 1, -1);
        insertLeaders(db, "Who is the first chairman and CEO of Starbucks?", "Howard Schultz", "Tim Cook", "James Dimon", "Mark Parker", 1, -1);
        insertLeaders(db, "Who is the founder of Oracle Corporation?", "Larry Ellison", "Mark Parker", "James Dimon", "Meg Whitman", 1, -1);
        insertLeaders(db, "Who is the third and cuurent CEO of company Nike?","Mark Parker","Howard Schultz","Mark Zuckerberg","Jeff Bezos",1,-1);
        insertLeaders(db,"Who of the following was considered by the British to be The Father of Indian Unrest?","Lokmanya Tilak","Madan Mohan Malviya","Gopal Krishan Gokhale","Lala Lajpat Rai",1,-1);
        insertLeaders(db,"In which language was Kesari, a newspaper started by Bal Gangadhar Tilak published?","Marathi","Hindi","English","Punjabi",1,-1);
        insertLeaders(db,"Do or Die was one of the most powerful slogans of India’s freedom struggle. Who gave it?","Gandhiji","J.L. Nehru","Bal Gangadhar Tilak","Subhash Chandra Bose",1,-1);
        insertLeaders(db,"Three of the following were awarded the Bharat Ratna in the same year. Who was awarded much later?","Abul Kalam Azad","C.V. Raman","S Radhakrishnan","C. Rajagopalchari",1,-1);
        insertLeaders(db," In 1923, who of the following became the youngest person to be elected the President of the Indian National Congress?","Abul Kalam Azad","Lala Lajpat Rai","M M MAlviya","Motilal Nehru",1,-1);
        insertLeaders(db,"Lala Lajpat Rai,Bal Gangadhar Tilak and ___________, the triumvirate of 3 militant patriots of the Congresses is called as 'Lal Bal Pal'","Bipin Chandra Pal","Niranjan Pal","Paul Lee","None of these",1,-1);
        insertLeaders(db,"Who gave the slogan 'Swaraj is my birth right and I shall have it'?","Bal Gangadhar Tilak","Sukhdev","Bhagat Singh","Rajguru",1,-1);
        insertLeaders(db,"Who was the first women president of Indian National Congress?","Annie Besant","Arun Asaf Ali","J.B. Krupalani","Sarojini Naidu",1,-1);
        insertLeaders(db,"Who was the secretary of Swaraj Party?","Motilal Nehru","Chandra Shekhar Azad","Aravind Kumar Ghosh","Bala Gangadhar Tilak",1,-1);
        insertLeaders(db,"Who were most prominent extremist leaders?","All of them","Lala Lajpathi Roy","Bipin Chandra Pal","Bal Gangadhar Tilak",1,-1);
        insertLeaders(db,"Which company did Steve Jobs found after leaving Apple?","NeXT","Pixel","Frame","Sun Technologies",1,-1);
        insertLeaders(db, "What did Steve jobs die of?", "Cancer", "Drugs Overdose", "AIDS", "Heart Attack", 1, -1);
        insertLeaders(db, "What is Steve Jobs complete name?", "Steve Paul Jobs", "Michael Steven Jobs", "Steven James Jobs", "Steven Peter Jobs", 1, -1);
        insertLeaders(db, "Bill Gates founded Microsoft in:", "1975", "1983", "1978", "1971", 1, -1);
        insertLeaders(db, "Bill Gates co-founded Microsoft with: ", "Paul Allen", "Steve Wozniak", "Warren Buffet", "Larry Ellison", 1, -1);
        insertLeaders(db, "What is the complete Birth Name of Bill Gates?", "William Henry Gates", "Bob Henry Gates", "Charles Henry Gates", "Bill Henry Gates", 1, -1);
        insertLeaders(db, "Bill Gates was taken to jail in New Mexico during 1977 due to:", "Traffic Violation", "Drug Possession", "Illegal Weapon", "Fraud", 1, -1);

        insertMap(db, "What is the capital of India?", "Delhi", "Noida", "Mumbai", "Chandigarh", 1, -1);
        insertMap(db,"The Great Barrier Reef is off the coast of which country?","Australia","Canada","New Zeadland","Japan",1,-1);
        insertMap(db,"Which country has the largest population in South America?","Brazil","Argentina","Columbia","Peru",1,-1);
        insertMap(db,"What is Earth's largest ocean by surface size?","Pacific","Atlantic","Arctic","Indian",1,-1);
        insertMap(db,"Which continent has the most independent countries (including island nations)?","Africa","Asia","Oceania","Europe",1,-1);
        insertMap(db,"What is Earth's second largest continent by surface size?","Africa","North America","South America","Europe",1,-1);
        insertMap(db,"Which country has the longest coastline in the world?","Canada","Australia","Russia","Indonesia",1,-1);
        insertMap(db,"What is the longest river in Africa?","Nile","Niger","Congo","Zambezi",1,-1);
        insertMap(db,"Disregarding Antarctica, what is the largest desert on Earth?","Sahara","Kalahari Desert","Gibson Desert","Arabian Desert",1,-1);
        insertMap(db,"What is by area the smallest independent country on Earth?","Vatican City","Monaco","Nauru","San Marino",1,-1);
        insertMap(db,"What is Earth's third largest continent by land surface size?","North America","Europe","South America","Africa",1,-1);
        insertMap(db,"What is the longest river in Europe?","Volga","Dnieper","Ural","Danube",1,-1);
        insertMap(db,"What is the longest river in Australia?","Murray","Lanchlan","Darling","Murrumbidgee",1,-1);
        insertMap(db,"Which country is the second largest in Africa by surface area?","Sudan","Algeria","Libya","Congo",1,-1);
        insertMap(db,"What is the name of the circle that lies about 23 degrees north of Earth's equator?","Tropic of Cancer","Tropic of Aries","Tropic of Capricon","Tropic of Gemini",1,-1);
        insertMap(db,"What is the highest free-standing mountain (from sea level to top) in the world?","Mount Kilimanzaro","Denali","Mount Chimborazo","Mount Kosciuszko",1,-1);
        insertMap(db,"Madrid is the capital of which country?","Spain","Canada","Japan","Philippines",1,-1);
        insertMap(db,"Berlin is the capital of which country?","Germany","Canada","Russia","Iraq",1,-1);
        insertMap(db,"Tokyo is the capital of which country?","Japan","Turkey","Austria","Spain",1,-1);
        insertMap(db,"Islamabad is the capital of which country?","Pakistan","Afganisthan","Iraq","Libya",1,-1);
        insertMap(db,"Seoul is the capital of which country?","South Korea","Iraq","Philippines","United Kingdom",1,-1);
        insertMap(db,"Rome is the capital of which country?","Itlay","Czech Republic","China","Cuba",1,-1);
        insertMap(db,"Bangkok is the capital of which country?","Thailand","Argentina","United Kingdom","Canada",1,-1);
        insertMap(db,"Ankara is the capital of which country?","Turkey","Egypt","Ontario","Thailand",1,-1);
        insertMap(db,"Brussels is the capital of which country?","Belgium","Brazil","Iraq","USA",1,-1);
        insertMap(db,"Tunis is the capital of which country?","Tunisia","Morocco","Malaysia","Afganisthan",1,-1);
        insertMap(db,"Kabul is the capital of which country?","Afganisthan","Norway","North Korea","El Savador",1,-1);
        insertMap(db,"Dublin is the capital of which country?","Ireland","Belarus","Poland","New Zeadland",1,-1);
        insertMap(db,"Naypyidaw is the capital of which country?","Myanmar","Peru","Switzerland","Afganisthan",1,-1);
        insertMap(db,"Pyongyang is the capital of which country?","North Korea","Portugal","Jamaica","Denmark",1,-1);
        insertMap(db,"San Salvador is the capital of which country?","El Salvador","Greece","Kenya","Iran",1,-1);
        insertMap(db,"Minsk is the capital of which country?","Belarus","Morocco","Afganisthan","Nepal",1,-1);
        insertMap(db,"Lisbon is the capital of which country?","Portugal","Bulgaria","Tunisia","Denmark",1,-1);
        insertMap(db,"Where can we find Iberian Peninsula?","Spain & Portugal","Greece & Bulgaria","Itlay","UK & Ireland",1,-1);
        insertMap(db,"Cape of Good Hope is in which country?","South Africa","Chile","Somalia","Senegal",1,-1);
        insertMap(db,"Name the only Asian country through which the Equator passes.","Indonesia","Vietnam","Japan","India",1,-1);
        insertMap(db,"Which city, sometimes called the Gateway to the West, is near the junction of the Mississippi and Missouri Rivers?","St. Louis","New Orleans","Baltimore","Ontario",1,-1);
        insertMap(db,"Which of these Caribbean islands is closest to the Tropic of Cancer?","Cuba","Grenada","Jamaica","Isla de Muerta",1,-1);
        insertMap(db,"Twice a month, near the times of the new and full moons, tidal ranges are much greater than normal. What is the term for these tides?","Spring tides","Equatorial tides","Autumnal tides","None of these",1,-1);
        insertMap(db,"Which country does not lie along the Mediterranean Sea?","Chile","Turkey","Egypt","All of them",1,-1);
        insertMap(db,"Earthquakes can sometimes create unusually large waves that cause destruction when they reach land. Which Japanese term is used for this kind of wave?","Tsunami","Tornado","Earthquake","Katrina",1,-1);
        insertMap(db,"Name the tallest building in the world.","Burj Khalifa","Shanghai Tower","Forum 66 Tower 2","CN Tower",1,-1);
        insertMap(db,"Where is Niagara Falls?","Ontario and Buffalo","Sydney & Zimbabwe","They dont exist","India and Pakistan",1,-1);
        insertMap(db,"Who is Bonhomme Carnaval?","A mascot","A royal servant","A strorybook teller","A cartoon character",1,-1);
        insertMap(db,"Which country has the most fresh water?","Canada","Greenland","Europe","USA",1,-1);
        insertMap(db,"Eid-al-Fitr is celebrated at the end of which event?","Ramadan","Christmas","Navratri","Hanukah",1,-1);
        insertMap(db,"Who owns one-sixth of all land on Eath?","The queen of England","Many individuals","American Government","Canadian Government",1,-1);
        insertMap(db,"Panama is located in which continent?","Europe","America","Africa","Asia",1,-1);
        insertMap(db,"What is the name of the highest mountain?","Everest","Annapuma","Manaslu","K2",1,-1);
        insertMap(db,"Which city does not belong to Russia?","Kazan","Hovd","Omsk","Saratov",1,-1);
        insertMap(db,"Oslo is the capital of which country?","Norway","Canada","Ireland","Suriname",1,-1);
        insertMap(db,"What is the capital of China?","Beijing","Shanghai","Hong Kong","Guangzhou",1,-1);
        insertMap(db,"Which is the 'City of Skyscrapers'?","New York","Los Angelos","Chicago","Miami",1,-1);
        insertMap(db,"Which city does not belongs to Canada?","Hartford","Suurey","Mississauga","Moncton",1,-1);
        insertMap(db,"What are the oldest mountains in Noth America?","Applachian Mountains","Wasatch Mountains","Manckenzie Mountains","Rocky Mountains",1,-1);
        insertMap(db,"How many states does Florida border?","2","5","3","4",1,-1);
        insertMap(db,"What is the most commonly visited tourist sights or attractions in San Francisco?","Golden Gate Bridge","Chinatown","Trasamerica Pyramid","Coit Tower",1,-1);
        insertMap(db,"Which city does not belong to Germany?","Prague","Bremen","Augsburg","Frankfurt",1,-1);
        insertMap(db,"The Island of Bali belongs to which country?","Indonesia","Mexico","Russia","Australia",1,-1);
        insertMap(db,"What is the name of the largest lake in England?","Lake District","Wast Water","Roadford Lake","Wimbleball Lake",1,-1);
        insertMap(db,"In which city is Sea World located?","San Diego","San Francisco","Los Angelos","Santa Barbara",1,-1);
        insertMap(db,"Which river makes up part of the boundaries of ten American states?","Mississipi River","Rio Grande","RedRiver","Gila River",1,-1);
        insertMap(db,"What is the oldest capital city in America, settled by the Spanish around 1539?","Tallahassee","Santiago","Machu Picchu","Sao Paulo",1,-1);
        insertMap(db,"What is the capital of Russia?","Moscow","Sochi","Samara","Kazan",1,-1);
        insertMap(db,"What is the capital of Canada?","Ottawa","Montreal","Vancouver","Toronto",1,-1);
        insertMap(db,"Where does Mississippi River start?","Lake Itasca","Appalachian Mountains","Cumberland Plateau","Allegheny Mountains",1,-1);
        insertMap(db,"What is the capital of U.S.A?","Washington D.C.","New York","Los Angelos","San Francisco",1,-1);
        insertMap(db,"Which country has the largest water area in the world?","Canada","China","Russia","USA",1,-1);
        insertMap(db,"What is World's smallest ocean?","Arctic Ocean","Atlantic Ocean","Pacific Ocean","Indian Ocean",1,-1);
        insertMap(db, "Where do you find Sahara Desert?", "Africa", "Egypt", "Itlay", "North America", 1, -1);
        insertMap(db, "Pakistan is located in which country?", "Australia", "Madagascar", "China", "Japan", 1, -1);
        insertMap(db, "What is only land locked on South East Asia?", "Laos", "Thailand", "Vietnam", "India", 1, -1);
        insertMap(db, "The island of Manhattan is surrounded by which river?", "All of them", "Harlem River", "Hudson River", "East River", 1, -1);
        insertMap(db, "Which Canadian province does not have land border with the USA?", "Nova Scotia", "Quebec", "Yukon", "Northwest Territories", 1, -1);
        insertMap(db, "What is the state capital of Punjab?", "Chandigarh", "Raipur", "Jaipur", "Darjeeling", 1, -1);


        insertIQ(db, "If five workers take five days to complete five units of works. How much will 1 worker take to complete 4 units of work?", "20 days", "5 days", "25 days", "1 day", 1, -1);
        insertIQ(db,"Which one of the following things is the least like the others?","Flower","Statue","Poem","Painting",1,-1);
        insertIQ(db,"What is the missing number in the sequence shown below?\n2-9-28-___-126-217","65","64","66","50",1,-1);
        insertIQ(db,"Ralph likes 25 but not 24; he likes 400 but not 300; he likes 144 but not 145. Which does he like:","1600","124","200","50",1,-1);
        insertIQ(db,"Which one of the numbers does not belong in the following series?\n1 - 2 - 5 - 10 - 13 - 26 - 29 - 48","48","29","10","2",1,-1);
        insertIQ(db,"If you rearrange the letters 'LNGEDNA' you have the name of an:","Country","City","Animal","No meaningful word",1,-1);
        insertIQ(db,"Choose the most similar word to trustworthy:" ,"Reliable","Relevant","Resolute","Dependable",1,-1);
        insertIQ(db,"John needs 13 bottles of water from the store. John can only carry 3 at a time. What's the minimum number of trips John needs to make to the store?","5","17/4","4","6",1,-1);
        insertIQ(db,"Choose the number that is 1/4 of 1/2 of 1/5 of 200:","5","4","50","40",1,-1);
        insertIQ(db,"If you rearrange the letters 'CIFAIPC'' you would have the name of an:","Ocean","City","Country","Animal",1,-1);
        insertIQ(db,"Finger is to hand as leaf is to...","Twig","Branch","Stem","Tree",1,-1);
        insertIQ(db,"Which one of the numbers does not belong in the following series?\n2 - 3 - 6 - 7 - 8 - 14 - 15 - 30","8","7","15","30",1,-1);
        insertIQ(db,"Mary, who is sixteen years old, is four times as old as her brother. How old will Mary be when she is twice as old as her brother?","24","20","25","26",1,-1);
        insertIQ(db,"PEACH is to HCAEP as 46251 is to:","None of these","12564","15624","15246",1,-1);
        insertIQ(db,"Complete the sequence....\n10, 5, 9, 6, 8.....","7","8","4","6",1,-1);
        insertIQ(db,"All Warts are Krongs.\nNo Krong is a Thorin.\nIs any Thorin a Wart?","No","A few of them","Incomplete question","All of them",1,-1);
        insertIQ(db,"Which number logically follows the series...?\n4, 6, 9, 6, 14, 6","19","17","21","20",1,-1);
        insertIQ(db,"Which answer expresses the meaning of the specified word best?\nReassuring","comforting","compassionate","Meddlesome","explanatory",1,-1);
        insertIQ(db,"The word, 'mineral' can be formed using the letters of....","Multiple Answers","Parlemier","Parliament","Preliminary",1,-1);
        insertIQ(db,"Which digit is missing from the number?\n761442916304","Multiple digits","5","8","1",1,-1);
        insertIQ(db,"27 minutes before 7 o'clock is how many minutes past five o' clock?","1 hour 33 minutes","33 minutes","27 minutes","1 hour 40 minutes",1,-1);
        insertIQ(db,"Find the mssing letter among these...\nThe quick brown fox jums over the lazy dog...","P","No missing letter","Q","D",1,-1);
        insertIQ(db,"A + B =C\nC+D\n= E","A+B+D\n=E","E-D\n=AB","E-D=\nC-B-A","A+B+C+D=\nE",1,-1);
        insertIQ(db,"Complete the sequence.....\n1 121 1331","14641","1234321","12345","14841",1,-1);
        insertIQ(db,"If A+B=C AND C+D=F\nB+C=......","A+2B","E","A+B+C+D","E+F",1,-1);
        insertIQ(db,"What word in the English dictionary is spelled incorrectly by people?","Incorrectly","Incorectly","Onomateopia","Carribbean",1,-1);
        insertIQ(db,"What new letter could be added (from the choices) to make new word from AID?","M","N","F","No letter",1,-1);
        insertIQ(db,"What letter could be added (from the choices) to make a new word from HAIR?","No letter","Q","R","L",1,-1);
        insertIQ(db,"If Mary is 16 years old and is four times the age of her brother, what would be her age when she twice as old as her brother....","24","40","22","28",1,-1);
        insertIQ(db,"What is the fourth consonant after the second vowel?","J","I","G","None of these",1,-1);
        insertIQ(db,"A 4 year old girl named Maria kicks the ball. It goes 30 feet far but then unbelivably changes its direction comes back and hits her...How is this possible?","Gravitational force","Centrifugal force","Not from this world","Ball swing",1,-1);
        insertIQ(db,"What word could be associated with each word present here...\nPole, Star, West","North","East","Rock","Shoot",1,-1);
        insertIQ(db,"What word could be associated with each word present here...\nJUMP, TIDE, CHAIR","HIGH","STRONG","LONG","SHORT",1,-1);
        insertIQ(db,"If %^& correspond to 'VERY RAINY STORM', @#& correspond to 'VERY LONG JUMP', &@! corresond to 'LONG RAINY NIGHT' what does % corrrespond to?","STORM","VERY","RAINY","LONG",1,-1);
        insertIQ(db,"In a family,each daughter has the same number of brothers as she has sisters and each son has twice as many sisters as he has brothers.How many sons are there in the family?","3","2","4","1",1,-1);
        insertIQ(db,"There are Deer and Peacocks in a zoo.By counting heads they are 80.The number of their legs is 200.How many peacocks are there?","60","20","40","30",1,-1);
        insertIQ(db,"A father tells his 22 year old son I was of your present age when you were born.If the father is 36 now, How old was the boy five years back?","17","19","18","none of these",1,-1);
        insertIQ(db,"Mary tells her son that she was as old as him when he was born. If Mary is 36 now, how old is her son?","Cannot be determined","13","18","20",1,-1);
        insertIQ(db,"Is any digit missing from the number....\n4241327123865239","one digit","no digit","two digits","three digits",1,-1);
        insertIQ(db,"BINS is to SNBI as  HOUR is to....","UROH","URHO","UORH","ROHU",1,-1);
        insertIQ(db,"Lets have an easy one....If a third position racer overcomes a second position racer, on which position is he runing now...","Second position","First Position","Not Possible","Third position",1,-1);
        insertIQ(db,"Find the missing number in the block....","6","7","8","15",1,R.drawable.iqq1);
        insertIQ(db,"Count the number of triangles in the image...","13","14","15","16",1,R.drawable.iqq2);
        insertIQ(db,"A monkey tries to climb a 20m pole. With every attemp it climbs 4m but slides two 2m. How many attempts will it take?","9","10","8","1",1,-1);
        insertIQ(db, "What is the value of x", "Multiple Answers", "x+x-x+x-x-x+x", "2x-x", "x is a variable", 1, -1);
        insertIQ(db, "From the list of letters below, which one CAN NOT be turned upside down, reflected in a mirror and still look correct?", "U", "B", "D", "O", 1, -1);
        insertIQ(db, "Which of these words do not form a meaningful word when reversed?", "None of these", "Desserts", "Regal", "Strops", 1, -1);
        insertIQ(db, "Which of these letters do not form a meaningful word when reversed?", "Pervert", "Straw", "Spoons", "None of these", 1, -1);
        insertIQ(db, "For math lovers....What would be the eighth term?\n 2 2 3 7 25 121...", "5041", "721", "231", "456", 1, -1);
        insertIQ(db, "Dont actually get solving this one.....How many zeroes are there at the end for 100! ?", "24", "25", "21", "20", 1, -1);


        insertPhysics(db, "If an object is at rest on a height from earth. Its contained energy depends upon what?\n(assuming energy=0 on ground level)", "Height from ground and mass", "Energy=0", "Mass of object", "Height from ground", 1, -1);
        insertPhysics(db,"The range of the projectile depends on", "Multiple Answers", "(Initial Velocity)^2", "Initaial Angle", "Gravitation", 1, -1);
        insertPhysics(db,"Rotatory motion is of two kinds:\n(i) Spin motion and (ii) ?","Orbital Motion","Circular Motion","Vibrational Motion","Translatory Motion",1,-1);
        insertPhysics(db,"A body rigid is said to possess a purely rotatory motion if every constituent particle of the body moves in a circle, the centre of which are on a straight line called?","The axis of rotation","The spinning rod","The fixed line","The line of rotation",1,-1);
        insertPhysics(db,"If the axis of rotation does not pass through the body, the rotatory motion is said to be?","Orbital motion","Oscillatory motion","Circular motion","Spin motion",1,-1);
        insertPhysics(db,"Two forces which are equal in magnitude and opposite in direction and not acting along the same line is a.....","Couple","Rotation","Motion","Torque",1,-1);
        insertPhysics(db,"If the radius of the earth were to shrink and its mass were to remain the same, the acceleration due to gravity on the surface of the earth will?","Increase","Decrease","Zero","Remain the same",1,-1);
        insertPhysics(db,"In order to derive the law of gravitation, Newton assume that the moon’s orbit is?", "Circular", "Parabolic", "Straight", "Uniform", 1, -1);
        insertPhysics(db, "A piezometer opening in pipes measures......", "static head", "velocity pressure", "total pressure", "negative static pressure", 1, -1);
        insertPhysics(db,"The maximum vacuum created at the summit of a syphon is....", "7.4m of water", "5.5m of water", "2.7m of water", "None", 1,-1);
        insertPhysics(db, "Reynold number is the ratio of initial force and", "Viscosity", "Gravitational force", "Surface tension", "Elasticity", 1, -1);
        insertPhysics(db, "An ideal flow of a liquid obeys...","Continuity Equation", "Second Law of motion", "Law of viscosity", "dynamic viscosity law", 1, -1);
        insertPhysics(db, "An independent mass of a fluid does not posses....", "Pressure energy", "Kinetic energy","Elevation energy", "None of these", 1, -1);
        insertPhysics(db, "The momentum correction factor (β) for the viscous flow through a circular pipe is...","1.33","2","1.25","1.50",1,-1);
        insertPhysics(db,"The ratio of maximum velocity to average velocity of viscous fluid through a circular pipe is....","2","0.5","0.75","1.5",1,-1);
        insertPhysics(db,"The tension in a cable supporting a lift is less when.....","Moving downwards","Moving upwards","Constant always","More always",1,-1);
        insertPhysics(db,"The locus of the instantaneous centre of a moving rigid body, is....","centroid","spiral","straight line","involute",1,-1);
        insertPhysics(db,"The forces which meet at one point and have their lines of action in different planes are called....","Multiple Answers","Concurrent forces","Non Coplanar forces","Non Concurrent forces",1,-1);
        insertPhysics(db,"If the gravitational accelerational at any place is doubled, the weight of a body, will....","be doubled","reduced to half","not be affected","none of these",1,-1);
        insertPhysics(db,"The mechanical advantage of an ideal machine is 100. For moving the local through 2 m, the effort moves through...","0.02 m","2 m","2.5 m","5 m",1,-1);
        insertPhysics(db,"Joule is the unit of....?","Work","Force","Power","Electricity",1,-1);
        insertPhysics(db,"A satellite moves in its orbit around the earth due to.....","Centripetal force","Centrifugal force","Gravitational force","None of these",1,-1);
        insertPhysics(db,"A projectile is thrown at an angle a to the horizontal with α velocity v. It will have the maximum centripetal acceleration...","at the start","else where","as it strikes ground","at top of trajectory",1,-1);
        insertPhysics(db,"The angle which an inclined surface makes with the horiontal when a body placed on it is on the point of moving down, is called...","angle of repose","angle of inclination","angle of friction","none of these",1,-1);
        insertPhysics(db,"At a given instant ship A is travelling at 6 km/h due east and ship B is travelling at 8 km/h due north. The velocity of B relative to A is...","10 km/hrs","14 km/hrs","1 km/hrs","7 km/hrs",1,-1);
        insertPhysics(db,"If a body moves in such a way that its velocity increases by equal amount in equal intervals of time, it is said to be moving with...","a variable acceleration","a variable retardation","a uniform acceleration","a uniform retardation",1,-1);
        insertPhysics(db,"The unit of electric intensity is?","A battery","A thermocouple","A Potentiometer","A generator",1,-1);
        insertPhysics(db,"If the wire of uniform area of cross-section is cut into two equal parts, the resistivity of each parts will be?","Remain the same","Four times","Halved","Doubled",1,-1);
        insertPhysics(db,"A resister carries a current I. The power dissipated is ‘P’. The power dissipated if the same resistor carries the current of 31 is?","3P","6P","9P","2P",1,-1);
        insertPhysics(db,"Kilowatt-hour (KWH) is the unit of?","energy","power","resistance","resistivity",1,-1);
        insertPhysics(db,"The rate of transfer of charges through a circuit is called?","Current","Energy","Resistance","Potential Difference",1,-1);
        insertPhysics(db,"A light bulb of 150Ω is connected to a 225 volt source, the current in it is...","1.5 A","2.5 A","3.5 A","4.5 A",1,-1);
        insertPhysics(db,"The terminal potential difference of a battery becomes equal to its e.m.f when its internal resistance, is?","Zero","Very Low","Maximum","Infinite",1,-1);
        insertPhysics(db,"Which instrument is used to measure altitudes in aircraft's ?","Altimeter","Ammeter","Audiometer","Anemometer",1,-1);
        insertPhysics(db,"Which instrument is used to measure depth of ocean ?","Fathometer","Fluxmeter","Endoscope","Galvanometer",1,-1);
        insertPhysics(db,"Which instrument is used in submarine to see the objects above sea level ?","Periscope","Photometer","Polygraph","Pykometer",1,-1);
        insertPhysics(db,"Plasma is called the 4th state of matter and is a neutral medium. Where can Plasma be found?","All listed answers","Neon signs","Static electric sparks","Fluoroscent lamps",1,-1);
        insertPhysics(db,"Fred is juggling three balls. When 1 ball is thrown up, what is the value of work being done by the gravity?","Negative","0","Positive","Gravity's not a factor",1,-1);
        insertPhysics(db,"What centre of equilibrium occurs when the centre of gravity lies above the point of support/suspension?","Unstable","Stable","Modified","Neutral",1,-1);
        insertPhysics(db,"Effects of a force on a body depends upon its","All","Magnitude","Position","Direction",1,-1);
        insertPhysics(db,"The following factor affects the orbit of a satellite up to an altitude of 720 km from the earth’s surface","None of these","Uneven Gravitation","Gravity of the sun","Aerodynamic forces",1,-1);
        insertPhysics(db,"Two forces act an angle of 120°. If the greater force is 50 kg and their resultant is perpendicular to the smaller force, the smaller force is","25 kg","30 kg","35 kg","32 kg",1,-1);
        insertPhysics(db,"The total time of collision and restitution of two bodies, is called....","All of these","Period of impact","Time of collision","Period of collision",1,-1);
        insertPhysics(db,"When a body in equilibrium undergoes an infinitely small displacement, work imagined to be done, is known as...","virtual work","negative work","imaginary work","none of these",1,-1);
        insertPhysics(db,"10-12, is called","Pica","Terra","Giga","Mega",1,-1);
        insertPhysics(db,"The ratio of elongations of a conical bar due to its own weight and that of a prismatic bar of the same length, is","1/3","1/4","1/2","1/5",1,-1);
        insertPhysics(db,"If the width of a simply supported beam carrying an isolated load at its centre is doubled, the deflection of the beam at the centre is changed by","1/2","4","2","1/8",1,-1);
        insertPhysics(db,"If two capacitors of lOμF each are connected in parallel, their equivalent capacitance will be?","20μF","10μF","5μF","7μF",1,-1);
        insertPhysics(db,"Which of these do not have identical dimensions?","Angular velocity and Moment","Torque and energy","Torque and work","K.E. and P.E.",1,-1);
        insertPhysics(db,"Which of these is not a unit distance?","milestone","millimeter","micron","light year",1,-1);
        insertPhysics(db,"In which temperature the density of water is maximum ?","4 degrees","100 degrees","30 degrees","90 degrees",1,-1);
        insertPhysics(db,"Loudness of sound depends upon ________ of the sound wave.","Amplitude","Frequency","Pitch","Wavelength",1,-1);
        insertPhysics(db,"The reason behind decrease in the boiling point of water at higher altitudes is :","low atmospheric pressure","high atmospheric pressure","colder temperatures","higher temperatures",1,-1);
        insertPhysics(db,"The moment of inertia of a body does not depend upon it's :","angular velocity","axis of rotation","form of mass","position of axis",1,-1);
        insertPhysics(db,"Which method can be applied to determine purity of a metal ?","Archimedes principle","Boyle's principle","Pascal's principle","Newton's principle",1,-1);
        insertPhysics(db,"Which device is used to measure the wavelength of X-rays ?","Spectrometer","Manometer","SWR Meter","Framing Square",1,-1);
        insertPhysics(db,"The hydraulic press depends upon....","Pascal's Principle","Boyle's Law","Bernoulli's Principle","Coulomb's Law",1,-1);
        insertPhysics(db,"The Newton's first law is also referred to as :","Law of inertia","Law of friction","Law of moments","Law of motion",1,-1);
        insertPhysics(db,"Which instrument is used to measure atomospheric humidity ?","Hygrometer","Tacheometer","Thermometer","Tintometer",1,-1);
        insertPhysics(db,"Which device is used to measure the intensity of light ?","Lux Meter","Load cell","Heliometer","Inkometer",1,-1);
        insertPhysics(db,"In a filament type light bulb most of electric power consumed appears as : ","Infrared rays","Ultraviolet rays","Fluoroscent rays","LED Light",1,-1);
        insertPhysics(db,"What is the minimum escape velocity of rocket to be launched into space ?","11 km/sec","10 km/sec","15 km/sec","11 km/hour",1,-1);
        insertPhysics(db,"Which atmospheric layer helps in radio transmission ?","Ionosphere","Stratosphere","Mesosphere","Ozonospere",1,-1);
        insertPhysics(db,"Golden view of a sea-shell is due to","Polarization","Refraction","Diffraction","Reflection",1,-1);
        insertPhysics(db,"Tesla is a standard unit of which of the following ?","Magnetic induction","Magnetic flux density","Magnetic field","Magnetic Moment",1,-1);
        insertPhysics(db,"Which type of mirror is used in the head lights of vehicles ?","Concave Mirror","Convex Mirror","Parabolic Mirror","Plane Mirror",1,-1);
        insertPhysics(db,"Ball pen functions on the principle of :","Surface Tension","Doppler Tension","Lenz's Law","Gravitation Law",1,-1);
        insertPhysics(db,"Which of the following principles is associated with Optical fibre ?","Total Internal Reflection","Interference","Scattering","Refraction",1,-1);
        insertPhysics(db,"Which metal is used for the manufacturing of heating elements used in electric iron?","Nichrome","Lead","Nickel","Chromium",1,-1);
        insertPhysics(db, "Which device is used to measure the speed of wind ?", "Anemometer", "Calorimeter", "Altimeter", "Chronometer", 1, -1);
        insertPhysics(db, "During a refrigeration cycle, heat is rejected by the refrigerant in a....", "condenser", "evaporator", "expansion valve", "compressor", 1, -1);
        insertPhysics(db, "Large angle produces?", "High Trajectory", "Curve Trajectory", "Flat Trajectory", "Straight Trajectory", 1, -1);
        insertPhysics(db, "A body is moving along a circular path with variable speed. It has...", "Multiple Answers", "Radial Acceleration", "Tangential Acceleration", "Zero Acceleration", 1, -1);
        insertPhysics(db, "A car is moving on a circular path and takes a turn. If R1 and R2 are the reactions on the inner and outer wheels respectively, then....", "R1<R2", "R1=R2", "R1>R2", "None of these", 1, -1);
        insertPhysics(db, "One degree (1°) is equal to?", "0.01745 rad", "0.001745 rad", "0.1745 rad", "None of these", 1, -1);


        insertMaths(db, "What is the probability of getting an odd number on a dice?", "Multiple Answers", "1/3", "3/6", "1/2", 1, -1);
        insertMaths(db,"The Cahill Family is going to see a movie at 5:50 P.M. It is 11:20 A.M. right now. How long do they have to wait to see the movie?","6 and a half hours","5 and a half hours","6 hours","5 hours",1,-1);
        insertMaths(db,"If you want to know how much liquid a container holds you need to measure its _______________.","capacity","weight","length","mass",1,-1);
        insertMaths(db,"Simplify: 4x^3 - 3x^2 - x^3 + 5x^2","3x^3 + 2x^2","3x^3 + 2x^2","3x^2 + 5x^3","3x^3 + 2x^3",1,-1);
        insertMaths(db,"Simplify: -6y3 - 7y - 3y3 + 8y","-9y^3+y","9y^3-y","-6y^3+3y^3","2y^3-5y",1,-1);
        insertMaths(db,"Which of the option closely expressees 10/11 in decimals.","0.909","0.9099","0.9","0.99",1,-1);
        insertMaths(db,"The mass of a gold bar is 12.4 kg. 5,000 bars of gold are stored in a vault. What is the total mass of the bars of gold in tonnes?","62000 tonnes","6200 tones","62200 tonnes","620 tones",1,-1);
        insertMaths(db,"In a grid of 80 squares, how many squares should be shaded  for 25% of the grid to be shaded?","20","10","80","40",1,-1);
        insertMaths(db,"If a box is 20'' long, 10'' wide, and 8'' tall, how many cubic inches does it hold?","1600","38","720","240",1,-1);
        insertMaths(db,"If a car gets 25 miles to the gallon, how many gallons are necessary to go 500 miles?","20","25","10","50",1,-1);
        insertMaths(db,"Ceiling tiles are 2' by 3', how many ceiling tiles do you ness to cover a ceiling that is 14' by 9' ?","21","20","126","25",1,-1);
        insertMaths(db,"If m divided by 6 has 5 as a remainder, what is the remainder if 4m is divided by 6?","2","0","1","5",1,-1);
        insertMaths(db,"Which is the approximation to the number e","2.72","2","2.14","1.72",1,-1);
        insertMaths(db,"If A+B+C=180 then sin(B+C)","sin(A)","-sin(A)","cos(C)","-cos(A)",1,-1);
        insertMaths(db,"cos(x)*sec(x)=","1","0","2","not defined",1,-1);
        insertMaths(db,"the value of tan(30) * tan(60)","1","-1","0","infinity",1,-1);
        insertMaths(db,"the value of cos(30) * cos(60) * cos(90)","0","1/2","1","root(3)/2",1,-1);
        insertMaths(db,"value of 1+tan^2(x)","sec^2(x)","cot^2(x)","sin^2(x)","cosec^2(x)",1,-1);
        insertMaths(db,"value of log(tan(1))+ log(tan(2)) +.......+ log(tan(89))","0","1","-1","undefined",1,-1);
        insertMaths(db,"Which trigonometric function has positive value of 3rd quadrant?","tan","all","sin","cos",1,-1);
        insertMaths(db,"sec(x) * sin(x)","tan(x)","sec(x)","cos(x)","cosec(x)",1,-1);
        insertMaths(db,"What is the average rate of change of the position of a vehicle that travels 210 miles on a straight highway in 3 hours?","70 miles per hour","630 miles per hour","55 miles per hour","210 miles",1,-1);
        insertMaths(db,"Integrate y(x)=1/5 from x=100 to x=300","40","200","0","60",1,-1);
        insertMaths(db,"Integrate g(x)=100 from x=3 to x=2","-100","100","-1/100","1/100",1,-1);
        insertMaths(db,"Let A=B*C. If dB/dx=2 and dC/dx=x, what is dA/dx?","cannot be determined","0","2*x","x^2",1,-1);
        insertMaths(db,"(sin(9))^2 + (cos(9))^2","1","0.76629","0","0.93012",1,-1);
        insertMaths(db,"The instantaneous rate of change can be thought of as the average rate of change between two points that....","are very close","are far apart","lie above y-axis","lie above x-axis",1,-1);
        insertMaths(db,"Consider a polar equation r(x) = 2cos(x) what is dr/dx?","-2sin(x)","2cos(x)","2","2sin(x)+x",1,-1);
        insertMaths(db,"What is the finite sum from n=1 to n=4 of h(n)=n?","10","4","4n","1",1,-1);
        insertMaths(db,"A force F(x) is applied on a box from x=0 to x=10. What is the work done on the box?","10","0","1","5",1,-1);
        insertMaths(db,"What shoud you do to the Maclaurin series expansion for e^x to obtain the series for 88*e^x","multiply series by 88","add 88 to series","expand about x=88","replace x with 88x",1,-1);
        insertMaths(db,"L'Hospital's Rule is used in order to find the limit of a fraction in _________ forum.","indeterminate","inconclusive","invertible","inconceivable",1,-1);
        insertMaths(db,"Integrate L(x)=1 from x=0 to x=10","10","0","1","1/10",1,-1);
        insertMaths(db,"The average rate of change of f'(x) from x=a to x=b is equal to the average value of ________ on the same interval.","f''(x)","f'(x)","f(x)","x",1,-1);
        insertMaths(db,"If g(x) = x*cos(x) what is g'(0)?","1","0","-1","pi",1,-1);
        insertMaths(db,"If f(x,y) = y^2, what is f(8,0)","0","8","64","1/64",1,-1);
        insertMaths(db,"Use a rectangular Riemann sum or an antiderivative to integrate g(x) = -20 from x=4 to x=6.","-40","40","-20","-10",1,-1);
        insertMaths(db,"If you pick an answer to this question at random, what is the probability that you will pick the correct answer?","25%","100%","75%","50%",1,-1);
        insertMaths(db,"If you pick a random letter from the English alphabet, what is the probability that you will choose the first letter of my name?","1/26","1/13","25/26","3/26",1,-1);
        insertMaths(db,"If there is a blue card, a purple card, and a yellow card, what is the probability of choosing the 3 cards in the order listed?","1/6","1/2","1/3","1",1,-1);
        insertMaths(db,"Eight coins are flipped. What is the probability that all of them will land heads up?","1/256","1/128","1/16","1/8",1,-1);
        insertMaths(db,"You have a 25% chance of winning a point. What is the probability of winning exactly 2 points in 3 attempts?","9/64","1/6","1/16","1/64",1,-1);
        insertMaths(db,"There is a 1/5 chance of winning a raffle. What is the probability of winning the raffle twice in a row?","1/25","2/5","4/25","1/10",1,-1);
        insertMaths(db,"There is a chance of failing a test. What is the closest percentage approximation of this probability?","6.7%","15%","13.3%","1.5%",1,-1);
        insertMaths(db,"Two 10-sided dice are rolled. What is the probability of rolling the same number on both dice?","1/10","1/100","9/100","1",1,-1);
        insertMaths(db,"Three coins are flipped. What is the probability of getting exactly two heads?","3/8","1/8","1/2","1/4",1,-1);
        insertMaths(db,"If a medicine has a 10% chance of failing, what is the probability that the medicine will last 3 doses without failing?","72.9%","0.1%","95%","89%",1,-1);
        insertMaths(db,"A card is picked from a standard 52-card deck. What is the probability of getting a face card?","3/13","4/13","3/52","1/52",1,-1);
        insertMaths(db,"If there are 3 blue and 2 orange balls, what is the probability that the first 3 balls you take are all blue?","1/60","1/125","3/5","47/60",1,-1);
        insertMaths(db,"Three 20-sided dice are rolled. What is the probability of all three dice showing the same number?","1/400","1/20","39/8000","1/8000",1,-1);
        insertMaths(db,"Four standard dice are rolled. What is the probability ofgetting exactly three sixes?","5/324","1/1296","1/432","1/216",1,-1);
        insertMaths(db,"There is a 1/15 chance of failing a test. What is the closest percentage approximation of this probability?","6.7%","15.0%","13.3%","1.5%",1,-1);
        insertMaths(db,"What is the probability of getting a 9 from two throws of a dice?","1/9","1/12","2/9","1/3",1,-1);
        insertMaths(db,"Two dice are thrown simultaneously. What is the probability of getting two numbers whose product is even ?","3/4","1/4","7/4","1/2",1,-1);
        insertMaths(db,"In a box, there are 8 red, 7 blue and 6 green balls. One ball is picked up randomly. What is the probability that it is neither blue nor green?","8/21","3/7","9/22","2/3",1,-1);
        insertMaths(db,"A card is drawn from a pack of 52 cards. The probability of getting a queen of club or a king of heart is...","1/26","1/52","2/13","1/13",1,-1);
        insertMaths(db,"What is the volume of a cuboid if l=7, w=10 and h=2?","140","115","19","164",1,-1);
        insertMaths(db,"In a right angle triangle, if the length of two sides is 10 and 24, what is the length of hypotenuse equal to?","26","25","55","30",1,-1);
        insertMaths(db,"What is 65 miles in kilometers?","104 kilometers","48.75 kilometers","40.625 kilometers","123.5 kilometers",1,-1);
        insertMaths(db,"If the sum of five interior angles of an irregular hexagon is 682, what is the value of the 6th angle?","38","29","45","9",1,-1);
        insertMaths(db,"In a right-angled triangle, if one of the angles=14, what does the third angle equal?","76","90","64","86",1,-1);
        insertMaths(db,"8*7*9=______?","504","400","500","405",1,-1);
        insertMaths(db,"If 15<14-x, which statement is correct?","x < -1","x > 1","x < 1","x > -1",1,-1);
        insertMaths(db,"15 * 18 = ______?","300","270","17","285",1,-1);
        insertMaths(db,"If x-3.50=8.37, what is x?","11.87","11.78","21.87","21.77",1,-1);
        insertMaths(db,"54 * 45=_________?","2430","2340","2034","2043",1,-1);
        insertMaths(db,"(3-18)-(11*11)","-136","-131","-133","-138",1,-1);
        insertMaths(db,"47,112-21269-=________?","25,843","26,332","25,813","25,773",1,-1);
        insertMaths(db,"(1 - 5) - (9 * 19) = ______?","-175","-177","-170","-172",1,-1);
        insertMaths(db,"If Jen has four sweaters and three skirts, and they all go together , how many outfits can she make?","12","7","256","81",1,-1);
        insertMaths(db, "What is 748 divided by 37, rounded up to the next hundredth?", "20.22", "21.22", "21.21", "26.21", 1, -1);
        insertMaths(db, "If x-110-205=521, what is the value of x?", "836", "206", "306", "411", 1, -1);
        insertMaths(db, "A card is picked from a well shuffled deck of cards. What is the probability of getting a card of hearts?", "13/52", "1/13", "13/26", "1/6", 1, -1);
        insertMaths(db, "Jon is 35 years older than his son but in 20 years he will be twice his son's age, how old is Jon?", "50", "15", "35", "70", 1, -1);
        insertMaths(db, "What is the value of x for the exponential equation '3^x=1/9'", "-2", "1/9", "3", "2", 1, -1);
        insertMaths(db, "Which is equivalent to (x-5)^2?", "x^2 - 10x + 25", "x^2 - 5^2", "x^2 + 5^2", "x-10", 1, -1);

        //1
        insertAstronomy(db, "What is the closest celestial body to earth?", "Moon", "Sun", "Venus", "Mars", 1, -1);
        //2
        insertAstronomy(db, "What is the angle of Earth's axis tilt?", "23.5°", "25°", "21°", "22°", 1, R.drawable.astronomyq1);
        //3
        insertAstronomy(db, "What would Tycho Brahe measure with a framed sextant?", "Angles between stars", "Star temperature", "Red Shift", "Distance to another planet", 1, -1);
        //4
        insertAstronomy(db, "What black body energy is predicted to be released by black holes due to quantum effects near the event horizon?", "Hawking Radiation", "Thorne Evaporation", "Coronal Mass Ejection", "Einstein Scattering", 1, -1);
        //5
        insertAstronomy(db,"What is the 2nd largest moon in the Solar System? It is larger than Mercury and is the only one with  a thick atmosphere","Titan","Ganymade","Triton","Ophelia",1,-1);
        //6
        insertAstronomy(db,"What is the name for this large system of canyons on Mars, 4000km in length?","Valles Marineris","Utopia Planitia","Grand Canyon","Verona Rupes",1,-1);
        //7
        insertAstronomy(db,"Olympus Mons is the largest volcano in the solar system. On what planet is it located?","Mars","Jupiter","Saturn","Neptune",1,-1);
        //8
        insertAstronomy(db,"Which planet has its axis nearly parallel to the axis of rotation?","Uranus","Jupiter","Earth","Neptune",1,-1);
        //9
        insertAstronomy(db,"Which planet has a cyclonic storm visible on its surface","Multiple Answers","Jupiter", "Saturn", "Uranus", 1, -1);
        //10
        insertAstronomy(db, "In a black hole, matter is crushed to infinite density in...", "Singularity", "Quantum Biflux", "Event Horizon","Apparent Horizon",1,-1);
        //11
        insertAstronomy(db, "How many classes of galaxies have been observed till date?", "3", "12", "15", "22", 1, R.drawable.astronomyq3);
        //12
        insertAstronomy(db, "Which of these is not a class of galaxy?", "Circular Galaxy", "Elliptical Galaxy", "Irregular Galaxy", "Spiral Galaxies", 1, -1);
        //13
        insertAstronomy(db,"Antimatter, which is found naturally in certain parts of space, has a devastating effect when combined with matter. What is that effect?","Mass to energy conversion", "No effect", "Energy absoption", "High residual discharge", 1, -1);
        //14
        insertAstronomy(db, "What is dark matter?","Majority of universe","Classified information", "Black holes", "Sun's fuel", 1, -1);
        //15
        insertAstronomy(db, "What is a pulsar?","Rotating neutron star","Rotating positron star","No such thing","Explosion in space",1,R.drawable.astronomyq4);
        //16
        insertAstronomy(db,"What is a quasar?","Multiple Answers","They surround a black hole","Energy Emissions","Unclear to scientists",1,R.drawable.astronomyq5);
        //17
        insertAstronomy(db,"Which of these galaxies do not exist?","NTO-900","Sunflower Galaxy","Whirlpool Galaxy","Tadpole Galaxy",1,-1);
        //18
        insertAstronomy(db,"Which of these planets do not have a moon?","All have a moon","Jupiter","Mars","Pluto",1,-1);
        //19
        insertAstronomy(db,"Which of these planets do not have a moon?","Mercury and Venus","Mercury","Venus","Both have a moon",1,-1);
        //20
        insertAstronomy(db,"Which is the hottest planet on our solar system?","Venus","Mercury","Mars","Venus or Mercury",1,-1);
        //21
        insertAstronomy(db,"What is the name of a place that uses telescopes and other scientific equipment to research space and astronomy?","An observatory","A space lab","Space Shuttle","Space Station",1,-1);
        //22
        insertAstronomy(db,"What is the name of the satellie first sent into orbit?","Sputnik","Aryabhatta","Juno-I","Lambda-4S",1,R.drawable.astronomyq6);
        //23
        insertAstronomy(db,"Who was the first creature to ever go in space?","A dog named Laika","Neil Armstrong","A monkey named Albert-1","A dog named Albert-1",1,-1);
        //24
        insertAstronomy(db,"Who was the first person to go in space?","Yuri Gagrin","Neil Armstong","Kalpana Chawla","None of these",1,-1);
        //25
        insertAstronomy(db,"How far have spacecraft from Earth traveled into space?","Over 1 light day","Over 1 light year","Over 100 light years","Over 10 light years",1,-1);
        //26
        insertAstronomy(db,"Where do most of the known asteroids orbit the Sun?","Between Mars and Jupiter","Between Earth and Mars","Between Jupiter and Saturn","Everywhere",1,-1);
        //27
        insertAstronomy(db,"A brown dwarf is...","Multiple Answers","Cooler than red dwarf","Larger than a planet","No such thing",1,-1);
        //28
        insertAstronomy(db,"A green dwarf is...","No such thing","Cooler than red dwarf", "Larger than a planet","Multiple Answers" , 1, -1);
        //29
        insertAstronomy(db,"What do we call this large spiral galaxy? It is also known as M31","Andromeda Galaxy","Milky Way Galaxy","Pinwheel Galaxy","Large Magellanic cloud",1,R.drawable.astronomyq7);
        //30
        insertAstronomy(db,"Why is the surface of Venus hotter than every other planet in the Solar System?","Runaway Greenhouse Effect","Solar Flares","Most eccentric orbit","Closeness to sun",1,-1);
        //31
        insertAstronomy(db,"How many AU(Earth's distance from Sun) are there in 1 Light year?","63,242","632","6,324","632,427",1,-1);
        //32
        insertAstronomy(db,"What is the name for the closest point of approach to the Sun by an orbiting body?","Perihelion","Aphelion","Pericles","Apostasy",1,-1);
        //33
        insertAstronomy(db,"What does the atmosphere of Jupiter mostly consist of?","Hydrogen and Helium","Ammonia & Nitrogen","Carbon Dioxide & Argon","Nitrogen and Methane",1,-1);
        //34
        insertAstronomy(db,"According to scientists, how old is our Solar System?","5 billion years old","5 million years old","50,000 years old","Impossible to tell",1,-1);
        //35
        insertAstronomy(db,"What is Saturn's ring made of?","Water ice","Frozen Carbon","Nitrogen ice","Helium",1,-1);
        //36
        insertAstronomy(db,"What region between Mars and Jupiter is occupied by numerous irregularly shaped bodies called asteroids or minor planets","Asteroid Belt","Oor Cloud","Kuiper Belt","Van Allen Belt",1,-1);
        //37
        insertAstronomy(db,"What do we call a planet that orbits a star other than the sun?","An exoplanet","An endoplanet","A rogue planet","A proto planet",1,-1);
        //38
        insertAstronomy(db,"What is Earth's atmosphere mostly made of","Nitogen and oxygen","Oxygen and Carbon Dioxide","Oxygen and Carbon monoxide","Oxygen and Hydrogen",1,-1);
        //39
        insertAstronomy(db,"What is moon's atmosphere made of?","None of these","Sodium and potassium","Thin layer of nitrogen","Carbon dioxide",1,-1);
        //40
        insertAstronomy(db,"What Danish astronomer's data did Johannes Kepler use to establish the elliptical nature of planetary orbits?","Tycho Brahe","Christiaan Huygens","Nicolas Copernicus","Galileo Galilei",1,-1);
        //41
        insertAstronomy(db,"Which Galaxy is larger?","Andromeda Galaxy","Large Magellanic Cloud","Small Magellanic Cloud","Milky Way Galaxy",1,-1);
        //42
        insertAstronomy(db,"Which asteroid is the brightest?","Vesta","Juno","Ceres","Pallas",1,-1);
        //43
        insertAstronomy(db,"Which is the brightest star ever observed in Milky Way Galaxy?","Sirius","Sun","LMC","None of these",1,-1);
        //44
        insertAstronomy(db,"Which Galaxy is the brightest of these?","Cosmos Redshift 7","Andromeda Galaxy","Large Magellenic Cloud","Sombrero Galaxy",1,R.drawable.astronomyq8);
        //45
        insertAstronomy(db,"What is the name for domed theatres where you can see shows about astronomy and the night sky?","Planetarium","Astrolabe","Observatory","Celestium",1,-1);
        //46
        insertAstronomy(db,"What do we call the path that the Sun traces along the celestial sphere","Ecliptic","Eclipse","Elliptic","Ecclestic",1,-1);
        //47
        insertAstronomy(db,"On which planet are Verona Rupes? They are the tallest cliffs, 5-10 km high","Uranus","Saturn","Triton","Mars",1,-1);
        //48
        insertAstronomy(db,"Where is this place?","Moon","Mars","Titan","Ganymede",1,R.drawable.astronomyq9);
        //49
        insertAstronomy(db,"Whose surface is this....","Mars","Saturn","Venus","Titan",1,R.drawable.astronomyq10);
        //50
        insertAstronomy(db,"What method of exoplanet detection relies on them to distort the light of backgroung stars?","gravitational microlensing","radial velocity","transit photometry","direct imaging",1,-1);
        //51
        insertAstronomy(db,"How long could a long-period comet take to orbit around the sun?","30 million years","1000 years","10,000 years","100,000 years",1,-1);
        //52
        insertAstronomy(db,"Which planet was the first planet located through mathematical predictions rather than regular observations?","Neptune","Mercury","Pluto","Uranus",1,-1);
        //53
        insertAstronomy(db,"Which planet has the fastest wind blowing at speeds over 1500 miles per hour?","Neptune","Saturn","Pluto","Uranus",1,-1);
        //54
        insertAstronomy(db,"What is the rotational period of Jupiter","10 hours","3 hours","12 days","6 days",1,-1);
        //55
        insertAstronomy(db,"What is the rotational period of Venus?","243 days", "2 hours","253 days","247 days",1,-1);
        //56
        insertAstronomy(db,"What is the comic belt outside of Pluto's orbit called","Kuiper Belt","The Oort cloud","Main asteroid belt","Halley belt",1,-1);
        //57
        insertAstronomy(db,"How many years does it take Pluto to orbit around the Sun?","248","3","97","15",1,-1);
        //58
        insertAstronomy(db,"How many moons does Jupiter have?","16","8","12","18",1,-1);
        //59
        insertAstronomy(db,"What are the Aurora Borealis also known as?","Northern Lights","Southern Lights","Western Lights","Eastern Lights",1,-1);
        //60
        insertAstronomy(db,"What seperates the terrestrial planets from the Jovian or gas planets in space?","The Asteroid Belt","Mars","Comets","Nothing",1,-1);
        //61
        insertAstronomy(db,"What is a characteristic of terrestrial planets","All of these","Small","Rocky","Closeness to Sun",1,-1);
        //62
        insertAstronomy(db,"Planet X is a small panet that has one satellite and a thin atmosphere. What is planet X?","Earth","Mercury","Jupiter","Venus",1,-1);
        //63
        insertAstronomy(db,"The dwarf planet Pluto has _____ moons?","five","eight","two","one",1,-1);
        //64
        insertAstronomy(db,"A space craft that visited Jupiter was named after what astronomer who discoveres Jupiter's four largest moons?","Galileo","Columbus","Dante","Michelangelo",1,-1);
        //65
        insertAstronomy(db,"To the size of what object would the earth have to be compressed to create a black hole?","Peanut","Bowling ball","Honda Civic","Two Story Building",1,-1);
        //66
        insertAstronomy(db,"What is at the centre of the Crab Nebula?","A pulsar","Andromeda","Sirius","a Quasar",1,R.drawable.astronomyq11);
        //67
        insertAstronomy(db,"The nearest open cluster to the Sun is only 153 ly away, but it lacks a Messier number. What is it?","Hyades","Pleidas","Beehive","Triangulum",1,-1);
        //68
        insertAstronomy(db,"In 2010 NASA fixed a bug in what spacecraft, even though it was 14 billion km away?","Voyager 2","Wanderer 2","Explorer 2","Traveller 2",1,-1);
        //69
        insertAstronomy(db,"Found in the Little Dipper, by what name is Polaris sometimes known?","North Star","Dog Star","Evening Star","Morning Star",1,-1);
        //70
        insertAstronomy(db, "In 2006, NASA admitted that it lost the original video of which historic event?", "First moon landng", "D-Day invasion", "JFK assassination", "Collision of two galaxies", 1, -1);
        //71
        insertAstronomy(db, "When is the North Pole usually pointed most directly to the Sun?", "On June 21", "On September 23", "On March 20", "On December 21", 1, -1);
        //72
        insertAstronomy(db, "Until Voyager 2 found six more in 1989, the only moons of what known planet wer Triton and Nereid?", "Neptune", "Jupiter", "Saturn", "Uranus", 1, -1);
        //73
        insertAstronomy(db, "When was Pluto reclassified as a Dwarf planet?", "2006", "2005", "2007", "2008", 1, -1);
        //74
        insertAstronomy(db, "When compared to the ecliptic plane, which planet has a sideways rotational axis?", "Uranus", "Neptune", "Pluto", "Saturn", 1, -1);
        //75
        insertAstronomy(db, "Which of these is not a zodiacal constellation?", "Draco", "Aries", "Capricornus", "Gemini", 1, -1);


        //1
        insertComputer(db, "Which of these is not an input device?", "DVST", "Light Pens", "Microphone", "Bar Code Reader", 1, -1);
        //2
        insertComputer(db,"Time Complexity of bubble sort algorithm is.....","O(n^2)","O(n/2)","O(log n)","O(n)",1,-1);
        //3
        insertComputer(db,"Time Complexity of merge sort algorithm.....","O(nlog n)","O(n/2)","O(log n)","O(n)",1,-1);
        //4
        insertComputer(db,"Average Time Complexity of shell sort algorithm is.....","Depends on time sequence","O(nlog n)","O(log n)","O(n)",1,-1);
        //5
        insertComputer(db,"What type of data structure is this....?","Doubly linked list","Doubly circular list","Singly linked list","Singly circular list",1,R.drawable.computerq1);
        //6
        insertComputer(db,"Which data structure behaves like Stack(LIFO) and Queue(FIFO)?","Deque","Array","Priority Queue","Heap",1,-1);
        //7
        insertComputer(db,"The maximum number of nodes on root to leaf path of a Tree is called as ...","Height of a tree","Level of a tree","All of these","Size of a tree",1,-1);
        //8
        insertComputer(db,"Order of insertion in a Binary Search tree of height 2h is","O(2h)","O(log (h/2))","O(4h)","O(h/2)",1,-1);
        //9
        insertComputer(db,"A 'query plan' is associated with which  of these areas of Computer Science?","Databases","Assemblers","Compilers","Interpreters",1,-1);
        //10
        insertComputer(db,"After what former CEO did IBM name its Jeopardy- beating AI system?","Thomas Watson","Larry Ellison","Lou Gerstner","Sam Palmisano",1,-1);
        //11
        insertComputer(db,"BSD is a family of operating systems derived from Unix. What does the B stand for?","Berkeley","Bill","Bash","Boston",1,-1);
        //12
        insertComputer(db,"Which of these terms indicate that the OS does not have a requested page?","Page fault","Page not found","Page crash","HTTP Error 404",1,-1);
        //13
        insertComputer(db,"In the world of object oriented design, what are 'Brigde', 'Singelton' and 'Prototype' examples of?","Design Patterns","Packages","Datatypes","Libraries", 1, -1);
        //14
        insertComputer(db, "Who is one of the founders of AVL tree?", "George Adelson", "Larry Ellison", "Both", "None", 1, -1);
        //15
        insertComputer(db,"Evaluate the following expression\n3 < 6 && 7 < 9", "True", "False", "Not Valid", "Answer is a numeric value", 1, -1);
        //16
        insertComputer(db, "Unrestricted grammar can be solved using...", "Turing Machine","Push down automata","Two stack PDA", "Finite automata", 1, -1);
        //17
        insertComputer(db, "In C, the command line arguments for the main function includes.....","Multiple answer","a character pointer array", "A string", "An integer", 1, -1);
        //18
        insertComputer(db, "In java, what is the default value of a local variable?", "Not assigned", "0", "null", "Depends on type", 1, -1);
        //19
        insertComputer(db,"In java, what is the default value of a local variable?", "Depends on type", "0", "null", "Not assigned", 1, -1);
        //20
        insertComputer(db, "In java, what is a marker interface?", "interface with no method", "interface with method mark()", "interface with method marker()", "No such thing",1,-1);
        //21
        insertComputer(db, "A C++ program contains a function with the header int function(int d). Which of the following function headers could be used within the same program?","int function(char c)", "char function(int d)", "Both", "None", 1, -1);
        //22
        insertComputer(db, "Which type of statement does not occur in computer programs?", "denial", "loop", "selection", "sequence", 1, -1);
        //23
        insertComputer(db, "If container classes are carefully constructed, then these tools are available to work with structures that are not ______", "type specific", "programmer defined", "valid without container classes", "generic",1,-1);
        //24
        insertComputer(db, "Which of the following is invalid string constant?", "'7.15 pm'", "\"epro.15\"","\"i lke you\"","\".142\"",1,-1);
        //25
        insertComputer(db,"What does the X in OS X stands for?","ten","extensible","extreme","extra",1,-1);
        //26
        insertComputer(db,"DOS was the first widely-installed operating system for personal computers. What does D stand for?","Disk","Digital","Distributed","Desktop",1,-1);
        //27
        insertComputer(db,"What year was the first version of Windows introduced?","1985","1978","1992","1982",1,-1);
        //28
        insertComputer(db,"Which of the following Operating System does not implement multitasking truly?","MS DOS","Windows XP","Windows 98","Windows 95",1,-1);
        //29
        insertComputer(db,"To display the list of all the file of the disk you would type...","DIR","DIR FILES","ECHO","NONE",1,-1);
        //30
        insertComputer(db,"How many digits of the DNIC (Data Network Identification Code) identify the country?","None of the above","first two","first five","first six",1,-1);
        //31
        insertComputer(db,"A station in a network forwards incoming packets by placing them on its shortest output queue. What routing algorithm is being used?","hot potato routing","flooding","static routing","delta routing",1,-1);
        //32
        insertComputer(db,"Frames from one LAN can be transmitted to another LAN via the device....","Bridge","Router","Repeater","Modem",1,-1);
        //33
        insertComputer(db,"Which of the following condition is used to transmit two packets over a medium at the same time?","Collision","Contention","Synchronous","Asynchronous",1,-1);
        //34
        insertComputer(db,"Which of the following is not a disadvantage of wireless LAN?","All of the above","Slow data transfer","Higher error rate","Interference in transfer",1,-1);
        //35
        insertComputer(db,"Your company has a LAN in its downtown office and has now set up a LAN in the manufacturing plant in the suburbs. To enable everyone to share data and resources between the two LANs, what type of device(s) are needed to connect them? Choose the most correct answer.","Router","Hub","Modem","Cable",1,-1);
        //36
        insertComputer(db,"Which of the following TCP/IP protocol is used for transferring electronic mail messages from one machine to another?","SMTP","FTP","ETP","STTP",1,-1);
        //37
        insertComputer(db,"How many hosts are attached to each of the local area networks at your site?","None of the above254","256","128","254",1,-1);
        //38
        insertComputer(db,"Which of the following TCP/IP protocol allows an application program on one machine to send a datagram to an application program on another machine?","UDP","X.25","VMTP","UMDP",1,-1);
        //39
        insertComputer(db,"A remote batch-processing operation in which data is solely input to a central computer would require a:","simplex lines","telegraph line","mixband channel","All of them",1,-1);
        //40
        insertComputer(db,"If you get both local and remote echoes, every character you type will appear on the screen","twice","once","infinite times","Will not appear",1,-1);
        //41
        insertComputer(db,"Which of the following is not a logical data-base structure?","chain","network","tree","relational",1,-1);
        //42
        insertComputer(db,"Each of data files has a _____ that describe the way the data is stored in the file.","File Structure","Records","Fields","Database",1,-1);
        //43
        insertComputer(db,"In SQL, which command is used to make permanent changes made by statements issue since the beginning of a transaction?","COMMIT","SAVE","CHECKPOINT","PACK",1,-1);
        //44
        insertComputer(db,"In SQL, which command(s) is(are) used to enable/disable a database trigger?","ALTER TRIGGER","MODIFY TRIGGER","UPDATE TRIGGER","All ofthem",1,-1);
        //45
        insertComputer(db,"A top-to-bottom relationship among the items in a database is established by a...","Hierarchial schema","Relational schema","Network schema","Top down schema",1,-1);
        //46
        insertComputer(db,"In SQL, The PROJECT command will create new table that has...","None of them","all fields of master table","table with no rows","Both of them",1,-1);
        //47
        insertComputer(db,"Which of the following is not a relational database?","Reflex","FoxPro","4th Dimension","dBase IV",1,-1);
        //48
        insertComputer(db,"A large computer information system maintains many different computer files. Which amongst them is called a perpetual file?","Master file","Specialized file","Update file","Log file",1,-1);
        //49
        insertComputer(db,"The logical data structure with a one-to-many relationship is a :","tree","chain","relational","network",1,-1);
        //50
        insertComputer(db,"The main idea behind computer files is that it is convenient to....","store data together","access them","arrange them","create them",1,-1);
        //51
        insertComputer(db,"byte and short in Java are promoted to ___ when the code is evaluated.","int","short","float","long",1,-1);
        //52
        insertComputer(db,"In Java, which of these is an example of marker annotation","Multiple Answers","@Override","@Retention","@MyMarker",1,-1);
        //53
        insertComputer(db,"According to java, which is an incorrect numeric literal?","12,000","12_000","200","0B1010",1,-1);
        //54
        insertComputer(db,"Java is strictly typed language which means it checks the code at....","compile time","runtime","static source analysis","debugging",1,-1);
        //55
        insertComputer(db,"In Java, Bytecode verifier checks the _____ of the bytecode","All of these","Portability","Validity","Security",1,-1);
        //56
        insertComputer(db,"Which is not a part of JRE?","Java Compiler","Java Virtual Machine","Class loader","Bytecode Verifier",1,-1);
        //57
        insertComputer(db,"Java is not a pure Object-Oriented language because of _____","Primitive Types","Inheritence","Reflection","Generics",1,-1);
        //58
        insertComputer(db,"In Java, iteration variable of _____ loop is read-only.","for-each","for","do","do while",1,-1);
        //59
        insertComputer(db,"Which of the following import statements is right?","import java.lang.*","import *.*","import java.*","import java.*.*",1,-1);
        //60
        insertComputer(db,"Which of the following languages can't be interpreted by JVM?","Haskell","Clojure","Groovy","Scala",1,-1);
        //61
        insertComputer(db,"Programming language and web application development platform invented in 1995 and purchased by Adobe in 2006. It was originally designed to connect simple HTML pages to a database...","ColdFusion","ASP","DELPHI","Python",1,-1);
        //62
        insertComputer(db,"Compiled computer programming language created in 1959 and primarily used in business, finance, and administrative systems","Cobol","Prolog","Lingo","Lisp",1,-1);
        //63
        insertComputer(db,"Educational programming language, designed in 1967 and modeled on the LISP programming language....","Logo","Lingo","R","Pascal",1,-1);
        //64
        insertComputer(db,"Who is the inventor of the C++ programming language?","Bjarne Stroustrup","Dennis Ritchie","David Filo","James Gosling",1,-1);
        //65
        insertComputer(db,"For initialization a=2,c=1, value of a and c after this code will be\nc=(c)?a=0:2","a=2, c=2","a=0, c=0","a=3, c=3","a=1, c=1",1,-1);
        //66
        insertComputer(db,"Which operators are known as ternary operators?","? and :",":: and ?","None","? and ;;",1,-1);
        //67
        insertComputer(db,"The phenomenon of having a continuous glow of beam on the screen even after it is removed is called?","Persistence","Floroscence","Incadescence","Phosphorence",1,-1);
        //68
        insertComputer(db,"In Computer Graphics, the perspective anomaly in which the object behind the center of projection is projected upside down and backward onto the view plane is called ?","View Confusion","Perspective View","Vanishing View","View Distortion",1,-1);
        //69
        insertComputer(db,"When the computer is not able to maintain operation and display,bright spots occur in the screen.This is called ?","Snowing","Flickering","Distortion","Blanking",1,-1);
        //70
        insertComputer(db,"All the following hidden surface algorithm employ image space approach except ?","Back face method","Depth buffer method","Scan line algorithm","Depth sort method",1,-1);
        //71
        insertComputer(db,"Oblique projection with an angle of 45 degree to the horizontal plane is called ?","Cavalier Projection","Isometric Projection","Cabinet Projection","None of them",1,-1);
        //72
        insertComputer(db, " The process of selecting and viewing the picture with different views is called__?", "Windowing", "Projecting", "Clipping", "Scissoring", 1, -1);
        //73
        insertComputer(db,"The process which divides each elementt of a picture into its visible and invisible portions allowing the latter to be discarded is.....","Clipping","Windowing","Scissoring","Multiple Answers",1,-1);
        //74
        insertComputer(db, "A scaling transformation changes the _____ of an object", "size", "location", "shape", "center", 1, -1);
        //75
        insertComputer(db, "The first viewing parameter we must consider is the....", "view reference point", "view reference plane", "shift vector", "viewing window", 1, -1);


        insertPottermore(db, "Who mimicked a dementor to frighten Harry during a Quiddich match in Prisoners of Azkaban", "All of these", "Draco Malfoy", "Crabbe", "Goyle", 1, -1);
        insertPottermore(db,"Which Harry Potter word is now in the Oxford English Dictionary?", "Muggle", "Hogwarts", "Voldemort", "Avada Kedavara",1,-1);
        insertPottermore(db,"Which of these Hogwarts professors teaches Transfiguration?","McGonagall","Sprout","Snape","Flitwick",1,-1);
        insertPottermore(db,"Who first shows Harry the diary of Tom Riddle?","Moaning Myrtle","Fawkes","Nearly Headless Nick","Ginny",1,-1);
        insertPottermore(db,"What's the only book in the Harry Potter series that doesn't feature Lord Voldemort?","The Prisoner of Azkaban","Half Blood Prince","Deathly Hallows","Order of Phoneix",1,-1);
        insertPottermore(db,"What Hogwarts student is killed in Little Hangleton graveyard at the end of 'The Goblet of Fire'?","Cedric Diggory","Neville Longbottom","Draco Malfoy","Fleur Delacour?",1,-1);
        insertPottermore(db,"Which champion was selected from Beauxbatons for the Triwizard Tournament?","Fleur","Victor Krum","Harry","Cedric",1,-1);
        insertPottermore(db,"Which champion was selected from Durmstrang for the Triwizard Tournament?","Krum","Fleur","Cedric","Harry",1,-1);
        insertPottermore(db,"Who was NOT a member of the Order of the Phoenix?","Harry Potter","Mad-Eye Moody","Sirius Black","Remus Lupin",1,-1);
        insertPottermore(db,"What is the Middlename of Hermione Granger?","Jean","Dean","Jennifer","James",1,-1);
        insertPottermore(db,"What is the full name of Ron?","Ronald Bilius Weasley","Ron Weasley","Ronald Weasley","Ronald Bill Weasley",1,-1);
        insertPottermore(db,"How many copies did 'Harry Potter and the Deathly Hallows' sell the first day of its release in the U.S. and the U.K.?","11 million","8 million","5 million","15 million",1,-1);
        insertPottermore(db,"What's the name of the fairy-tale book that Dumbledore bequeaths to Hermione in 'The Deathly Hallows'?","Tales of Beedle and the Bard","Fantastic Beasts","History of Hogwarts","The Darkest Spells",1,-1);
        insertPottermore(db,"What was the acronym that Hermione gave to her Elfish Welfare club?","S.P.E.W","S.P.E.M","S.P.E.R.M","S.P.A.T",1,-1);
        insertPottermore(db,"Who is teaching Herbology at the epilogue of Deathly Hallows?","Neville Longbottom","Luna Lovegood","Lavender Brown","Draco Malfoy",1,-1);
        insertPottermore(db,"What was the name of Neville Longbottom's grandmother?","Augusta Longbttom","Alice Longbottom","Alicia Longbottom","August Longbottom",1,-1);
        insertPottermore(db,"What was the name of Neville Longbottom's mother?","Alice Longbottom","Alicia Longbottom","Augusta Longbottom","Frank Longbottom",1,-1);
        insertPottermore(db,"In 'Harry Potter and the Sorcerer's Stone' (Book 1), a magical creature named Fluffy guards a trapdoor. What kind of creature is Fluffy?","Three Headed Dog","Acromantula","A Niffler","Unicorn",1,-1);
        insertPottermore(db,"Who's birthday party did Harry, Ron, and Hermione go to in The Chamber of Secrets?","Nearly Headless Nick","Draco Malfoy","Rubeus Hagrid","Harry Potter",1,-1);
        insertPottermore(db,"What patronus does Luna Lovegood have","Rabbit","Stag","Lion","Horse",1,-1);
        insertPottermore(db,"Who was the quidditch commentator in Harry's first years at Hogwarts?","Lee Jordan","Angelica Johnson","Dean Thomas","Terry Boot",1,-1);
        insertPottermore(db,"Who disguised himself as Mad Eye Moody in The Goblet of Fire?","Barty Crouch Jr.","Ernie McMillian","Vincent Crabbe","Severus Snape",1,-1);
        insertPottermore(db,"What potion did Harry take in order to get Slughorn's memories?","Felix Felicis","Polyjuice Potion","Alihosty Draught","Essence of Dittany",1,-1);
        insertPottermore(db,"Who did Hermione take to Slughorn's Christmas party","Cormac McLaggen","Neville Longbottom","Dean Thomas","Ron Weasley",1,-1);
        insertPottermore(db,"Who was the first to be stunned by the Basilisk?","Mrs. Norris","Hermione","Colin Creevey","Ginny Weasley",1,-1);
        insertPottermore(db,"Who ended up giving Harry permission to go to Hogsmeade?","Sirius Black","Albus Dumbledore","Minerva McGonagall","Vernon Dursley",1,-1);
        insertPottermore(db,"Who found Harry, Ron, and Hermione in the woods in The Deathly Hallows?","Fenrir Greyback","Snatchers","Remus Lupin","Albus Dumbledore",1,-1);
        insertPottermore(db,"How did Harry survive underwater in the Triwizard Tournament?","Gillyweed","Gills Charm","Transfiguration","Bubble-Head Charm",1,-1);
        insertPottermore(db,"Who did Ron turn into when Harry, Ron, and Hermione snuck into the Ministry of Magic in The Deathly Hallows?","Reginald Cattermole","Albert Runcorn","Dirk Cresswell","Mundungus Fletcher",1,-1);
        insertPottermore(db,"What spell is used to save Hermione from the troll in The Sorcerer's Stone?","Wingardium Leviosa","Petrificus Totalus","Confundus","Stupify",1,-1);
        insertPottermore(db,"What magazine does Luna's father publish?","The Quibbler","The Daily Prophet","The Practical Potioneer","Challenges in Charming",1,-1);
        insertPottermore(db,"How did Harry spend his first detention?","In Forbidden Forest","Writing an Essay","Cleaning Trophies","Signing autographs",1,-1);
        insertPottermore(db,"Who is Harry's godson?","Teddy Lupin","Hugo Weasley","Victorie Weasley","James Potter",1,-1);
        insertPottermore(db,"What crime was Hagrid committed of in his time at Hogwarts?","Spell on Professor","Opening Chamber of Secrets","Killing a girl","Entering Forbidden Forest",1,-1);
        insertPottermore(db,"What was the name of the female elf Dobby liked?","Winky","Minka","Oona","Orist",1,-1);
        insertPottermore(db,"What position does Harry play on the Quidditch team?","Seeker","Chaser","Keeper","Refree",1,-1);
        insertPottermore(db,"What dark wizard did Albus Dumbledore defeat in 1945?","Grindelwald","Nicolas Flamel","Aberforth Dumbledore","Lord Dumbledore",1,-1);
        insertPottermore(db,"What was the name of Albus Dumbledore's sister?","Ariana Dumbledore","Kendra Dumbledore","Arya Dumbledore","Katherine Dumbledore",1,-1);
        insertPottermore(db,"What was the name of Albus Dumbledore's mother?","Kendra Dumbledore","Ariana Dumbledore","Arya Dumbledore","Katherine Dumbledore",1,-1);
        insertPottermore(db,"What fruit must one tickle in order to gain access to the kitchens?","Pear","Orange","Grape","Banana",1,-1);
        insertPottermore(db,"Where did Fred Weasley die?","Outside Room of Requirement","In Great Hall","In Courtyard","Outside Hogwarts",1,-1);
        insertPottermore(db,"Who broke the Vanishing Cabinet?","Peeves","Tom Riddle","Montauge","Not told",1,-1);
        insertPottermore(db,"Who has never been a commentator in a Quidditch Game?","Fred Weasley","Luna Lovegood","Zacharias Smith","Lee Jordon",1,-1);
        insertPottermore(db,"What was used as headquarters for the Goblin Rebellion?","Hog's Head","Privet Drive","Shreiking Shack","Hogwarts",1,-1);
        insertPottermore(db,"What does Lavender give Ron for Christmas?","Sweetheart Necklace","Promise Ring","New Wand","Life sized photo",1,-1);
        insertPottermore(db,"What does Harry want to be after he graduates from Hogwarts?","Auror","Unspeakable","Professor","Magic Reversal Squad",1,-1);
        insertPottermore(db,"How many kids are in the Weasley family?","7","6","8","5",1,-1);
        insertPottermore(db,"What did Hagrid give Harry the first time they met?","A birthday cake","A flute","An owl","An ice cream",1,-1);
        insertPottermore(db,"What teams played in the Quidditch World Cup that Harry attended?","Bulgaria and Ireland","England and Ireland","Romania and Norway","France and Spain",1,-1);
        insertPottermore(db,"How did Hagrid get his pet dragon, Norbert?","Got him in Romania","Gift from Dumbledore","From Forbidden Forest","In a card game",1,-1);
        insertPottermore(db,"What was James Potter’s school nickname?","Prongs","Moony","Wormtail","Padfoot",1,-1);
        insertPottermore(db,"What is Tonks’s first name?","Nymphadora","Bellatrix","Narcissa","Padma",1,-1);
        insertPottermore(db,"Who helps Harry, Ron, and Hermione break into Hogwarts?","Aberforth Dumbledore","Neville Longbottom","Ginny Weasley","Fred Weasley",1,-1);
        insertPottermore(db,"Where did Harry’s parents live?","Godric's Hollow","Hogsmede","Spinner'sEnd","The Burrow",1,-1);
        insertPottermore(db,"When is Harry’s Birthday?","July 31st","July 4th","May 4th","June 4th",1,-1);
        insertPottermore(db,"What did Harry do with the money he won at the Triwizard Tournament?","Donated it to the twins","Bought a broomstick","Donated it to orphanage","Gave it to Cedric's family",1,-1);
        insertPottermore(db,"Who did Harry take to the Yule Ball?","Parvati Patil","Cho Chang","Susan Bones","Ginny Weasley",1,-1);
        insertPottermore(db,"Who had collected all three hallows and is the Master of Death?","Harry Potter","Lord Voldemort","Albus Dumbledore","Grindelwald",1,-1);
        insertPottermore(db,"Why was Bill and Fleur's wedding cut short?","Ambushed by Death Eaters","No cake","Molly started crying","Bill turned to werewolf",1,-1);
        insertPottermore(db,"Why did Dumbledore’s father go to Azkaban?","Attacking Muggles","Illegal charms","He was a Death Eater","Used Cruciatus Curse",1,-1);
        insertPottermore(db,"Where does Harry FIRST meet Malfoy?","on Hogwarts' Express","at Hogwarts","in Madam Malkin's","in a muggle shop",1,-1);
        insertPottermore(db,"Who was the old Care of Magical Creatures teacher?","Professor Kettleburn","Professor Hagrid","Professor Lupin","Professor Malkin",1,-1);
        insertPottermore(db,"Where was Sirius Black hiding after escaping from prison?","a cave","the Shreiking Shack","12 Grimmauld Place","Hogwarts",1,-1);
        insertPottermore(db,"What person from the Wizarding World does Harry discover living just down the road?","Mrs. Figg","Tonks","Filch","Susan Bones",1,-1);
        insertPottermore(db,"Who or what attacks Ron in the Ministry of Magic?","a brain","Dolohov","a Time-turner","Bellatrix",1,-1);
        insertPottermore(db,"What village do Harry and Dumbledore visit to find Slughorn?","Budleigh Babberton","Little Whinging","Godric's Hallow","St. Catchpole",1,-1);
        insertPottermore(db,"Who killed Bellatrix Lestrange?","Molly Weasley","Minerva McGonagall","Harry Potter","Horace Slughorn",1,-1);
        insertPottermore(db,"Who Killed Dobby The House Elf? He was a free elf","Bellatrix Lestrange","Lucius Malfoy","Dolohov","Draco Malfoy",1,-1);
        insertPottermore(db,"Who Killed Alastor Moody?","Neville Longbottom","Mundungus Fletcher","Voldemort","Death Eater",1,-1);
        insertPottermore(db,"Who Killed Peter Pettigrew?","His Silver Hand","Voldemort","Harry Potter","Pigwidgeon",1,-1);
        insertPottermore(db,"Which of these is the unlocking spell?","Alohamora","Sectumsempra","Expelliarmus","Wingardium Leviosa",1,-1);
        insertPottermore(db,"What does O.W.L. stand for?","Ordinary Wizarding Level","Obscure Wizarding Level","Outstanding Wizard Level","Owsm Wizarding Level",1,-1);
        insertPottermore(db,"What does N.E.W.T stand for? _______ ________ Wizarding Test","Nastily Exhausting","Never Ending","Non Ending","Never Lasting",1,-1);
        insertPottermore(db,"From which platform does the Hogwarts Express leave the King's Cross train station?","9 3/4","9 1/2","13","7",1,-1);
        insertPottermore(db,"ryffindor’s house colors are scarlet and gold. What are Slytherin’s house colors?","green and silver","green and blue","green and black","green and bronze",1,-1);
        insertPottermore(db,"What kind of Bertie Bott’s Every-Flavor Bean does Dumbledore take from Harry in Sorcerer’s Stone?","earwax","vomit","pepper","toffee",1,-1);
        insertPottermore(db,"Who is the youngest Weasley?","Ginny","Ron","Charlie","Percy",1,-1);
        insertPottermore(db,"Which of these is not the name of a broom used in playing Quidditch?","Dustmight 500","Nimbus 2000","Firebot","Cleansweep",1,-1);
        insertPottermore(db,"In Chamber of Secrets, Madam Pomfrey uses this to regrow Harry’s bones after Professor Gilderoy Lockhart muddles yet another spell and accidentally removes them:","Skele-Gro","Grow'n'Pains","Bone-again","Mandrake Juice",1,-1);
        insertPottermore(db,"In Sorcerer’s Stone, Harry and his friends earn some last minute points for Gryffindor to take the House Cup away from Slytherin. By how many points do they win?","10","5","50","20",1,-1);
        insertPottermore(db,"Who teaches Herbology at Hogwarts?","Professor Sprout","Professor Binns","Professor Mc Gonagall","Professor Filtwick",1,-1);
        insertPottermore(db,"In Quidditch, how much is the golden snitch worth?","150 points","100 points","50 points","25 points",1,-1);
        insertPottermore(db,"What is the name for a non-magical person who is born into a magical family?","Squib","Muggle","Mudblood","Half Blood",1,-1);
        insertPottermore(db,"What is the tree that attacks Harry, Ron and the Weasley family’s flying car in Chamber of Secrets?","The Whomping Willow","The Ogreish Oak","Evermean Evergreen","Whailing Wood",1,-1);
        insertPottermore(db,"What chess piece does Ron fall to in Sorcerer’s Stone to give Harry the checkmate advantage?","the white queen","the black queen","the black knight","the white knight",1,-1);
        insertPottermore(db,"Durmstrang’s Triwizard competitor, Viktor Krum, is the seeker on which International Quidditch team?","Bulgaria","Scandivania","Luxemburg","Ireland",1,-1);
        insertPottermore(db,"What spell is used to disarm an opponent?","Expelliarmus","Obliviate","Stupefy","Alohamora",1,-1);
        insertPottermore(db,"Where does the founding meeting of Dumbledore’s Army take place in Order of the Phoenix?","The Hog's Head","The Three Broomsticks Inn","The Room of Requirement","Library of Hogwarts",1,-1);
        insertPottermore(db,"What is Gilderoy Lockhart’s favorite color?","lilac","gold","charteuse","baby pink",1,-1);
        insertPottermore(db,"Frank and Alice Longbottom were the victims of which spell?","Crucio","Avada Kedavara","Alohamora","Imperio",1,-1);
        insertPottermore(db,"Which of these is not a type of dragon used in the challenge of Triwizard Tournament?","Norwegian Ridgeback","Hungarian Horntail","Chinese Fireball","Swedish Short-Snout",1,-1);
        insertPottermore(db,"Which of these businesses cannot be found in Diagon Alley?","Borgin and Burkes","Eeylop's Owl Emporium","Flourish and Blotts","Madam Malkin's",1,-1);
        insertPottermore(db,"What does Hermione’s Patronus take the form of?","An otter","Ron","A rabbit","A stag",1,-1);
        insertPottermore(db,"What is Fred Weasley’s code name on Potterwatch, the clandestine radio program that 'tells the news like it really is'?","Rapier","River","Royal","Rodent",1,-1);
        insertPottermore(db,"Who is captain of the Gryffindor Quidditch team in Order of the Phoenix?","Angelica Johnson","Alicia Spinnet","Oliver Wood","Harry Potter",1,-1);
        insertPottermore(db,"Who is not a member of his elite 'Slug Club'?","Colin Creevey","Blais Zabini","Melinda Bobbin","Cormac McLaggen",1,-1);
        insertPottermore(db,"How many Sickles are in a Galleon in the Wizarding World?","17","15","29","64",1,-1);
        insertPottermore(db,"When is Neville Longbottom’s birthday?","July 30","July 31","June 31","June 30",1,-1);
        insertPottermore(db,"The three D’s of Apparating are: Destination, Determination and ","Deliberation","Disposition","Direction","Divination",1,-1);
        insertPottermore(db,"Who betrays the D.A. and informs Dolores Umbridge of the secret meetings?","Marietta Edgecombe","Cho Chang","Luna Lovegood","Lavender Brown",1,-1);

        insertHollywood(db, "How many times has Leonardo been nominated for oscars as actor or producer?", "5", "2", "3", "4", 1, -1);
        insertHollywood(db,"For which movie did Kathryn Bigelow get the Academy Award, thus becoming the first woman to get the Oscar for Best Director?","The Hurt Locker","The King's Speech","Gravity","The Artist",1,-1);
        insertHollywood(db,"Name the 1959 historical drama set in ancient Rome that won 11 Oscars.","Ben-Hur","Spartacus","Centurion","The Fall of Roman Empire",1,-1);
        insertHollywood(db,"Who directed 'The Dark Knight'(2008)?","Christopher Nolan","Zack Snyder","Richard Donner","None of them",1,-1);
        insertHollywood(db,"Which Roland Emmerich movie portrays fictional cataclysmic events that were to take place in early 21st century?","2012","10,000 BC","Moon 44","The Noah's Ark Principle",1,-1);
        insertHollywood(db,"What is the name of the young lion whose story is told in the musical 'The Lion King'?","Simba","Leo","Sheru","Tangent",1,-1);
        insertHollywood(db,"Who gave the music for the Oscar winning movie 'The Slumdog Millionaire'?","A.R. Rahman","Tan Dun","Sonu Nigam","Mychael Danna",1,-1);
        insertHollywood(db,"Which country's freedom struggle is portrayed in the Mel Gibson movie 'Braveheart'?","Scotland","Spain","India","Vietname",1,-1);
        insertHollywood(db,"With which Hollywood great would you associate the screen character 'The Tramp'?","Charlie Chaplin","Gene Wilder","Hugo Weaving","Humphrey Bogart",1,-1);
        insertHollywood(db,"Who played the male lead opposite Sharon Stone in the hugely successful movie 'The Basic Instinct'?","Michael Douglas","Robert Redford","Harrison Ford","Patrick Swayze",1,-1);
        insertHollywood(db,"Who played the role of a middle aged spinster in several movies including 'The African Queen' and 'On Golden Pond'?", "Katharine Hepburn", "Jane Fonda", "Eva Marie Saint", "Maggie Smith", 1, -1);
        insertHollywood(db, "In Oscars 2016(88th), Who is the winner of best actor?","Leonardo DiCaprio", "Eddie Redmayne", "Matt Damon", "Michael Fassbender", 1, -1);
        insertHollywood(db,"Hairspray is a 2007 film version of a musical based on what 1988 John Waters movie?","Hairspray","Pink Flamingos","Cry-Baby","Polyester",1,-1);
        insertHollywood(db,"The film Troy directed by Wolfgang Peterson was released in which year?","2004","2009","1999","2014",1,-1);
        insertHollywood(db,"What is the name of ghost ship in the 2007 movie 'Pirates of the Carribean: At World's End'","The Flying Dutchman","The Queen Mary","The Mary Celeste","Qurang Medan",1,-1);
        insertHollywood(db,"The movie 'Hawk is Dying' is based on  book by what author?","James Patterson","Michael Crichton","Alex Haley","Harry Crews",1,-1);
        insertHollywood(db,"Which movie has this tagline: 'What's Eating You'?","Jeepers Creepers","The Insider","Pi","The American President",1,-1);
        insertHollywood(db,"In Pirates of Carribean, what leads Captain Jack to the thing he desires the most?","A compass","His brother","His rum","His hat",1,-1);
        insertHollywood(db,"In 2008 movie, 'The Incredible Hulk', what is the name of the character played by Liv Tyler?","Betty Ross","Betty Cooker","Betty Bop","Betty White",1,-1);
        insertHollywood(db,"What is the name of the 2000 comedy starring Mel Gibson in which Gibson can hear what women are really thinking?","What Women Want","In the Land of Women","The Other Women","The Women",1,-1);
        insertHollywood(db,"In which 2001 movie did John Goodman voice the character Sulley?","Mosters Inc.","Toy Story","An American Tale","Happy Feet",1,-1);
        insertHollywood(db,"Whic film set in ancient times won the 2000 Oscar for Best Costume Design?","Gladiator","Quills","Crouching Tiger","Memento",1,-1);
        insertHollywood(db,"The tagline, 'What would you do if you lost everything' comes from which 2002 movie?","Collateral Damage","Sea of Love","Junior","Gladiator",1,-1);
        insertHollywood(db,"The tagline 'Freeze the Future' comes from which 2002 movie?","Clockstoppers","Poltergeist III","Nobody's Fool","The Relic",1,-1);
        insertHollywood(db,"Which 2002 movie has this tagline: 'The Life of the Party...before she got a life'?","28 Days","My Best Friend's Wedding","Fearless","The Fan",1,-1);
        insertHollywood(db,"What is the name of cereal box that Vernita Green pulls her gun from in 'Kill Bill: Vol 1' ?","KaBoom!","Blammo!","Lucky Charms","Sugar Bullets",1,-1);
        insertHollywood(db,"Which 2002 film, starring Jack Nicholson, is about a father travelling to his estranged daughter's wedding?","About Schmidt","About Gutsav","About Carl","About Heinz",1,-1);
        insertHollywood(db,"What movie remake starred Mark Wahkberg in 2001?","The Longest Yard","Planet of the Apes","Public Enemy","The Natural",1,-1);
        insertHollywood(db,"What is the name of the 2002 film in which scientist's discover how to make people invisible, with grisly results?","Hollow Man","Pitch Black","Deja Vu","X2",1,-1);
        insertHollywood(db,"Which actor won the Best Actor Oscar for his role in the 2002 film 'The Pianist'?","Adrien Brody","Jack Nicholson","Michael Caine","Nicolas Cage",1,-1);
        insertHollywood(db,"What is the title of the 2002 horror movie where people die after logging onto a website?","TerrordotCom","DeathdotCom","MurderdotCom","FeardotCom",1,-1);
        insertHollywood(db,"Which 2002 movie has this tagline: 'Get ready for an unexpected hit'?","Death To Smoochy","Blast from the Past","Sexy Beast","Cocoon: The Return",1,-1);
        insertHollywood(db,"Who is the brother of Christopher Nolan who has a major role in writing scripts for him?","Jonathon Nolan","Jon Nolan","Henry Nolan","Kingsley Nolan",1,-1);
        insertHollywood(db,"'Why so Serious'-Famous dialogue of which Nolan movie?","The Dark Knight","The Dark Knight Rises","Batman Begins","The Prestige",1,-1);
        insertHollywood(db,"Which short documentry film directed by Christopher Nolan was realeased in 2015?","Quay","Quanta","Skew","The Grey",1,-1);
        insertHollywood(db,"What is the name of the upcoming film of Christopher Nolan to be realeased on 2017?","Dunkirk","Dungeon","Dunkin","Dunbar",1,-1);
        insertHollywood(db,"Name the tattoo parlor in the film Memento from where Leonard would get all his tattoos done.","Emma's","Chris'","Jodie's","John's",1,-1);
        insertHollywood(db,"What is the name of the girl who Forrest Gump loves?","Jenny","Crystal","Carla","Crystal",1,-1);
        insertHollywood(db,"In the 2002 comedy starring Jim Carrey, who or what 'stole Christmas'?","The Grinch","The Gremlin","The Goonies","The Ghoulie",1,-1);
        insertHollywood(db,"Clint Eastwood played Inspector in what film franchise?","Dirty Harry","Star Wars","The Godfather","Harry Potter",1,-1);
        insertHollywood(db,"In the 'Silence of the Lambs' who is the killer being hunted by the FBI?","Buffalo Bill","Clarice Starling","Charles Manson","Son of Sam",1,-1);
        insertHollywood(db,"William Shatner directed which 'Star Trek' sequel?","Star Trek V","Star Trek IV","Star Trek III","Star Trek II",1,-1);
        insertHollywood(db,"What film's tagline is 'Trust no one. Decieve everyone.'","Body of Lies","Marvin's Room","Critters 3","Total Eclipse",1,-1);
        insertHollywood(db,"In 'The Wolf Of Wall Street', Jordan says his bachelor party weekend cost him how much?","$2 Million","$25 Million","$50.00","$100.00",1,-1);
        insertHollywood(db,"In 'Catch me if you Can' Frank Jr. uses the name Barry Allen. which is the name of what comic hero?","The Flash","Speed Racer","Mr. Fantastic","Richie Rich",1,-1);
        insertHollywood(db,"In 'Wolf of Wall Street', what present does Donnie give Jordan Belfort to show his gratitude for the job opportunity?","Crack cocaine","Heroin","Marijuana","Vicodin",1,-1);
        insertHollywood(db,"In The Departed, who says: 'What if that was a legitimate threat? Thing about it, fucking hotshot.'","Billy Costigan","Frank Costello","Colin Sullivan","Seargent Dignam",1,-1);
        insertHollywood(db,"How does Juliet die in 'Romeo + Juliet', DiCaprio's movie?","Gunshot to the head","Hanging","Hit by car","Poison",1,-1);
        insertHollywood(db,"In Inception, Cobb washes up the beach carrrying a top and what other item?","A gun","A knife","A safe","A watch",1,-1);
        insertHollywood(db,"Who plays Bruce Wayne in the 2008 Movie 'The Dark Knight'?","Christian Bale","Christian Slater","Christian Olsen","Christian Borle",1,-1);
        insertHollywood(db,"Peter Parker was played by whic hactor in the 2002 'Spider Man'?","Tobey Maguire","James Marsden","Andrew Garfield","Johnny Depp",1,-1);
        insertHollywood(db,"In the Matrix, what is Keanu Reeves' alias?","Neo","Norman","Nuclear","Noah",1,-1);
        insertHollywood(db,"What is the name of the 1982 film starring Krissy Swanson as someone who hunts vampires?","Buffy the Vampire Slayer","A Vampire in Brooklyn","Army of Darkness","Interview With the Vampire",1,-1);
        insertHollywood(db,"Who plays the character of Jake, Jude Law's partner and fellow repo-man in 'Repo Man'?","Forest Whitaker","Samuel L. Jackson","Denzel Washington","Eric Bara",1,-1);
        insertHollywood(db,"In which 1987 movie is a team of commandos picked off by an alien hunter?","Predator","First Blood","Commando","Rocky II",1,-1);
        insertHollywood(db,"In 'Looper', who plays the older version of the character played by Joseph Gordan-Levitt?","Bruce Willis","Christian Bale","Ciaran Hinds","Jeff Daniels",1,-1);
        insertHollywood(db,"'The Terminator' returned from the future to kill which woman?","Sarah Connor","Ellen Ripley","Wendy Gordon","Lindsey Brigman",1,-1);
        insertHollywood(db,"Who plays Nick Fury, the director of 'S.H.I.E.L.D.S' in 'The Avengers'?","Samuel L. Jackson","Quentin Tarantino","Denzel Washington","Don Cheadle",1,-1);
        insertHollywood(db,"What 2009 fil about a detective starred Robert Downey Jr., Jude Law and Rachel McAdams?","Sherlock Holmes","Inception","Jumper","Dick Tracy",1,-1);
        insertHollywood(db,"In which film did a NYC cop get trapped in a L.A. high rise occupied by terrorists on Christmas?","Die Hard","The Matrix","Raiders of the Lost Arc","V for Vendetta",1,-1);
        insertHollywood(db,"In which of these super hero fims does Liv Tyler appear?","The Incredible Hulk","Superman","Iron Man","The Avengers",1,-1);
        insertHollywood(db,"Who played the title role in 2004s 'Van Helsing'?","Hugh Jackman","Paul Walker","Kevin Costner","Vin Diesel",1,-1);
        insertHollywood(db,"What is the first name of Vin Diesel's character in the 'Fast and Furious' series?","Dom","Jake","Doug","Joe",1,-1);
        insertHollywood(db,"Who lined up against Jon Travolta in 'Face/Off'?","Nicolas Cage","Keanu Reeves","Pierce Brosnan","Sean Connery",1,-1);
        insertHollywood(db,"Who play Max in the sci-fi action fim 'Elysium'?","Matt Damon","Jason Statham","Colin Farell","Ben Affleck",1,-1);
        insertHollywood(db,"What 1989 film starring Michael Keaton, Jack Nicholsonand Kim Basinger is set in Gotham City?","Batman","Ghostbusters II","The Punisher","The Abyss",1,-1);
        insertHollywood(db,"Whic classic graphic novel by Alan Moore and Dave Gibbons ws made into a film in 2009 by Zack Snyder?","Sin City","Watchmen","From Hell","The Dark Knight",1,-1);
        insertHollywood(db,"Which actor, particularly adept at motion capture performances , plays the chimp Caesar in 'Rise of the Planet of Apes'","Andy Serkis","Mark Ruffalo","Tom Hardy","James Franco",1,-1);
        insertHollywood(db,"Which law enforcer did Kevin Costner play in 'The Untouchables'?","Elliot Ness","Rocky Frander","Jim Broker","Loch Ness",1,-1);
        insertHollywood(db,"Who directed 'Broken Arrow'?","John Woo","Michael Sterling","Christopher Nolan","Andy Parker",1,-1);
        insertHollywood(db,"2011's 'Fast Five' was the fifth movie in which franchise?","The Fast and the Furious","Naked Gun","Harry Potter","Star Trek",1,-1);
        insertHollywood(db,"Which Marvel comics villian is the brother of Thor and the main antagonist in 'The Avengers'?","Loki","Zeus","The Hulk","Green Lantern",1,-1);
        insertHollywood(db,"Which actress is known for her portrayal of super-hero Storm?","Halle Berry","Rebeccca Romijn","Franke Janssen","Rhona Shekter",1,-1);
        insertHollywood(db,"The Mel Gibson film 'Braveheart' is set where?","13th century Scotland","14th century Ireland","12th Century Greece","15th Century Wales",1,-1);
        insertHollywood(db,"Who played the role of Hector in the 2004 film 'Troy'?","Eric Bana","Carl Weathers","Joaquin Phoenix","Dereck Jacobi",1,-1);
        insertHollywood(db,"What kind of car is used as the time machine in the three 'Back to the Future' movies?","DeLorean","Ford Mustang","Ferrari","Jaguar",1,-1);
        insertHollywood(db,"In which film does Bruce Willis play a futuristic taxi driver?","The Fifth Element","The Sixth Sense","Brazil","Bladerunner",1,-1);
        insertHollywood(db,"Which actor play Dominic Toretto on the 'Fast & Furious' franchise?","Vin Diesel","Lucas Black","Paul Walker","Paul Newman",1,-1);
        insertHollywood(db,"What 2004 action film about the Trojan war was loosely based on Homer's 'IIiad'","Troy","Kingdom of Heaven","Braveheart","Return of the king",1,-1);
        insertHollywood(db,"In 2012, Andrew Garfield became 'The Amazing' version of what?","Spider-Man","Avenger","Batman","Green Goblin",1,-1);
        insertHollywood(db,"Who produced all four Pirates of the Carribean films?","Jerry Bruckheimer","Ted Elliot","Gore Verbinski","Rob Marshall",1,-1);
        insertHollywood(db,"Despite being only ten sentences long, what kid's book streched out onto a 94 minute film in 2009?","Where Wild Things Are","Shrek","The Cat in the Hat","Alice in Wonderlan",1,-1);
        insertHollywood(db,"Which African country is central to the plot of the 2011 movie 'The Machine Gun Preacher'?","The Sudan","Angola","Morocco","South Africa",1,-1);
        insertHollywood(db,"What was the name of Oliver Reed's character in the film 'Gladiator'?","Proximo","Maximus","Allimus","Cornelius",1,-1);
        insertHollywood(db,"Which character is the central figure of 2013 film 'Man of Steel'?","Superman","Robin","Batman","The Incredible Hulk",1,-1);
        insertHollywood(db,"The actress Kiera Knightley starred as which character in the first three 'Pirates of Carribbean' movies?","Elizabeth Swann","Calypso","Angelica","Syrena",1,-1);
        insertHollywood(db,"Which 1984 film starred Kyle MacLachlan?","Dune","The Terminator","The Karate Kid","Missing in Action",1,-1);
        insertHollywood(db,"What is the name of the alter ego of Iron Man, played by Robert Downey Junior, in the Iron Man movies","Tony Stark","Tony Clark","Tony White","Tony Black",1,-1);
        insertHollywood(db,"What is the name of son of Zeus, played by Sam Worthington in the 2010 movie 'Clash of the Titans'?","Perseus","Achilles","Paris","Apollo",1,-1);
        insertHollywood(db,"In the 'Raiders of the Lost Ark' what was the nae of the snake-filled pit Indiana Jones was thrown into?","The Well of Souls","The Cave of Humanity","The Den of Mortality","",1,-1);
        insertHollywood(db,"Who does Ginger have an affair with in the movie 'Casino'?","Nicky","Frankie","Billy","Gaggi",1,-1);
        insertHollywood(db,"At the 1997 Oscars, who won 'Best Supporting Actress' for 'L.A. Confidential'?","Kim Basinger","Juliana Moore","Meg Ryan","Joan Cusack",1,-1);
        insertHollywood(db,"What is the occupation of Phil Connors in the 1993 film 'Groundhog Day'?","TV Weatherman","Fireman","Soldier","Pilot",1,-1);
        insertHollywood(db,"In th 1993 movie, 'Speed', what is the profession of Keanu Reeves' character?","Bomb disposal expert","Cop","Marine","Pizza Delivery",1,-1);
        insertHollywood(db,"Who starred as Mr. Blonde(Vic Vega) in the 1992 Quentin Tarantino film 'Reservoir Dogs'?","Michael Madsen","Harvey Keitel","Tim Roth","Steve Buscemi",1,-1);
        insertHollywood(db,"The tagline 'Finding your own voice can be magic.' comes from which 1988 movie?","Little Voice","The Amityville Horror","48 Hrs","Men of Honor",1,-1);
        insertHollywood(db,"Gerard Depardieu plays an illegal alien from which country in the 1990 film 'Green Card'?","Portugal","France","Spain","Itlay",1,-1);
        insertHollywood(db,"Who is the Oscar Winner for best Actor in 2015?","Eddie Redmayne","Leonardo DiCaprio","Matt Damon","Mathew McConaughey",1,-1);
        insertHollywood(db,"Who is the Oscar Winner for Best Actor in 2014?","Mathew McConaughey","Eddie Redmayne","Matt Damon","Leonardo DiCaprio",1,-1);
        insertHollywood(db, "Which actor/actress has recieved the most number of Academy Awards for best acting?", "Katharine Hepburn", "Daniel Day-Lewis", "Meryl Streep", "Jack Nicholson", 1, -1);

        insertSherlock(db, "John Watson was in which branch of the service?", "Army", "Air Force", "Navy", "Marines", 1, -1);
        insertSherlock(db,"In 'A scandal in Belgravia' Sherlock receives a phone from Irene Adler, with a password. What is Sherlock's first guess?", "221b", "HLMS", "SHER", "LOCK", 1, -1);
        insertSherlock(db, "The name of Sherlock's nemesis in the first and second series is called...","Jim Moriarty","Greg Lestrade","John Watson","Andrew Scott",1,-1);
        insertSherlock(db,"Finish this quote: 'Honey, you should see me in a . . .'","crown","tiara","towel","bathrobe",1,-1);
        insertSherlock(db,"What was Mrs. Hudson's previous occupation?","Exotic Dancer","Housewife","Flight Attendent","Drug Dealer",1,-1);
        insertSherlock(db,"Irene Adler is also known as. . .","The Woman","The Black Widow","The Beater","Molly",1,-1);
        insertSherlock(db,"Who was Janine's boyfriend?","Sherlock","Anderson","Magnussen","Watson",1,-1);
        insertSherlock(db,"Who said, 'Aren't ordinary people adorable?'","Moriarty","Sherlock","Magnussen","Mary Watson",1,-1);
        insertSherlock(db,"How are John Watson and Harry Watson related?","Father/Son","Brothers","Brother/Sister","Cousins",1,-1);
        insertSherlock(db,"What is John's sister's name?","Harriet","Elizabeth","Clara","Sarah",1,-1);
        insertSherlock(db,"What is John's sister's ex-girlfriend's name?","Clara","Sarah","Elizabeth","Harry",1,-1);
        insertSherlock(db,"How does Sherlock know John's sister is an alcoholic?","scratches on phone","he knew her","he researched her","saw her in a bar",1,-1);
        insertSherlock(db,"Where was the H.O.U.N.D group located?","Liberty, Indiana","London","Baker Street","Baskerville",1,-1);
        insertSherlock(db,"Who did Sherlock go to for help right before 'The Fall'?","Molly Hooper","Lestrade","Mrs. Hudson","John",1,-1);
        insertSherlock(db,"Where was the drug that caused John, Sherlock and Henry Knight to see the hound hidden?","fog","sugar","tea","food",1,-1);
        insertSherlock(db,"What is John's middle name?","Hamish","Harrison","Harold","Hunter",1,-1);
        insertSherlock(db,"What profession did Richard Brook claim he was?","storyteller","actor","musician","reporter",1,-1);
        insertSherlock(db,"What game will John NOT play with Sherlock?","Cluedo","Apples to Apples","Twister","Pictionary",1,-1);
        insertSherlock(db,"What does Sherlock prefer to do?","Text","Call","Write","Tweet",1,-1);
        insertSherlock(db,"What is Jim Moriarty's ringtone?","Staying Alive","Our Problem","Funky Town","Die Sherlock",1,-1);
        insertSherlock(db,"What is the code to Irene Adler's phone? ' I am ==== locked","sher","221b","1085","1895",1,-1);
        insertSherlock(db,"What was the name of Kristy Stapleton's rabbit?","Bluebell","Bugs","Fluffy","",1,-1);
        insertSherlock(db,"Who was Molly Hooper's date in 'the Great Game'?","Jim Moriarty","Sherlock","Andrew Scott","Lestrade",1,-1);
        insertSherlock(db,"Finish Quote: 'You...ripping my clothes off in a darkened swimming pool people might _____ ","talk","be mad","have questions","laugh",1,-1);
        insertSherlock(db,"What does John say Sherlock should stick to instead of 'funny'?","serious","insulting","heartless","ice",1,-1);
        insertSherlock(db,"Who did John go with to the Chinese circus with in 'the Blind Banker'?","Sarah","Clara","Molly","Irene",1,-1);
        insertSherlock(db,"Which country was John Watson fighting for?","Afganisthan","Iraq","England","Itlay",1,-1);
        insertSherlock(db,"What body part does Sherlock keep in the fridge in 'a Scandal in Belgravia'?","thumbs","a head","eyeball","a foot",1,-1);
        insertSherlock(db,"What's the name of Sherlock's blog?","the science of deduction","Carl Powers","Sherlock","Deduction Powers",1,-1);
        insertSherlock(db,"What 3 words did Sherlock say to Kitty Riley?","You repell me","You attract me","I hate you","I love you",1,-1);
        insertSherlock(db,"What instrument does Sherlock play?","violin","clarinet","flute","guitar",1,-1);
        insertSherlock(db,"What is Lestrade's first name?","Greg","Gary","George","Gavin",1,-1);
        insertSherlock(db,"Mrs. Hudson says she is not Sherlock and John's what?","Housekeeper","Maid","Babysitter","Landlady",1,-1);
        insertSherlock(db,"At the beginning of 'a Study in Pink', what did John's therapist write, that John reads upside down?","Still has trust issues","Limp is better","Doing well","Not doing well",1,-1);
        insertSherlock(db,"What is the name of John's friend who introduces him to Sherlock?","Mike Stamford","Mark Stamford","Mike Stafford","Mark Stafford",1,-1);
        insertSherlock(db,"How does Sherlock like his coffee?","Black, two sugars","Black, one sugar","White, two sugars","White, one sugar",1,-1);
        insertSherlock(db,"In 'a Study in Pink' John is ushered into an unknown limo and taken to a deserted warehouse. Who is waiting for him there?","Mycroft Holmes","Jim Moriarty","Sherlock Holmes","Irene Adler",1,-1);
        insertSherlock(db,"Sherlock gets himself in quite a bind while facing the criminal in 'a Study in Pink'. Who saves him?","John Watson","Molly Hooper","Mycroft Holmes","Lestrade",1,-1);
        insertSherlock(db,"Which of Sherlock's possessions does Mrs. Hudson continuously confiscate?","his cigarettes","his gun","thumbs in fridge","his skull",1,-1);
        insertSherlock(db,"How many deaths were there in 'A Study In Pink'?","4","3","5","2",1,-1);
        insertSherlock(db,"When Sherlock meets John for the first time in 'ASIP', what does he ask him?","Afganisthan or Iraq?","Brother or Sister?","Are you a soldier?","Are you handicapped?",1,-1);
        insertSherlock(db,"Who plays Sherlock Holmes in the series?","Benedict Cumberbatch","Andrew Scott","Rupert Graves","Martin Freeman",1,-1);
        insertSherlock(db,"Who plays John Watson?","Martin Freeman","Andrew Scott","Rupert Graves","Benedict Cumberbatch",1,-1);
        insertSherlock(db,"Why does Sherlock shoot the wall with a gun in 'the Great Game'?","He is bored","He is angry","He is happy","He is mad",1,-1);
        insertSherlock(db,"Who plays Jim Moriarty in the series?","Andrew Scott","Martin Freeman","Benedict Cumberbatch","Rupert Graves",1,-1);
        insertSherlock(db,"On which original Conan Doyle story was 'A Study In Pink' based?","A study in Scarlett","A study in Pink","A Woman in Pink","A study in red",1,-1);
        insertSherlock(db,"In 'the Blind Banker' which book does Sherlock uses to crack the coded messages?","London A-Z","The Gideon Bible","War & Peace","The Encyclopedia Brittanica",1,-1);
        insertSherlock(db,"What is Irene Adler's Twitter Account Username?","@theWhipHand","@BelleDeJour","@Dominatrix","@theWoman",1,-1);
        insertSherlock(db,"How many hits does Dr. Watson's blog have when it gets stuck?","1895","8951","5189","1805",1,-1);
        insertSherlock(db," Which of these is not one of the 3 places Jim Moriarty break into in 'the Reichenbach Fall'?","Brixton Prison","Pentoville Prison","Bank of England","Tower of London",1,-1);
        insertSherlock(db,"What is the name of the Gentlemen's Club that Mycroft Holmes frequents/attends?","Diogenes Club","The Hyperion Club","The Dionysus Club","The Victorian Club",1,-1);
        insertSherlock(db,"When Sherlock and John move into the flat together, the landlady Mrs. Hudson assumes they are what?","a couple","government agents","college students","brothers",1,-1);
        insertSherlock(db,"How many episodes of Sherlock has Jim Moriarty ‘appeared’ in... So far (dead, alive or imaginary)?","Seven","Six","Eight","Five",1,-1);
        insertSherlock(db,"What was the name of Charles Augustus Magnussen’s luxury house?","Appledore","Berryvault","Caserlyrock","Apple Mansion",1,-1);
        insertSherlock(db,"The nickname of main antagonist in season three’s The Sign of the Three is named after which insect?","Mayfly","Housefly","Horn Fly","Yellow Fly",1,-1);
        insertSherlock(db,"How much did Sherlock’s original Belstaff coat cost?","Euro 1350","Euro 955","Euro 1475","Euro 1245",1,-1);
        insertSherlock(db,"And who turns out to be that Giant Rat in The Empty Hearse?","Lord Moran","Charles Magnussen","Moriarty","Irene Adler",1,-1);
        insertSherlock(db,"What does the ‘D’ in H.O.U.N.D stand for?","Dyson","Dartmoor","Doctor","Doctorine",1,-1);
        insertSherlock(db,"What may or may not be the name of the mysterious woman who first takes John Watson to see Mycroft Holmes?","Anthea","Angela","Agatha","Anisha",1,-1);
        insertSherlock(db,"A meeting between co-creator Mark Gatiss and which veteran reporter is said to have inspired the show?","John Simpson","Kate Adie","Martin Bell","Martin Freeman",1,-1);
        insertSherlock(db,"Who did Steve Moffat's son play when he featured in the episode 'His last vow'?","Child Sherlock","Child Watson","Magnussen","Sherlock's side kick",1,-1);
        insertSherlock(db,"In the episode 'The Hound of the Baskervilles', what does Sherlock offer Watson in exchange for cigarettes?","Lottery numbers","Secret Information","Key to his car","Watson's mbile phone",1,-1);
        insertSherlock(db,"Who was not a part of H.O.U.N.D operation?","Oliver","Hansen","Nader","Dyson",1,-1);
        insertSherlock(db,"At the start of 'The Blind Banker' what does Watson get into trouble with?","Self Service Checkout","An ATM","Debit Card","Telephone booth",1,-1);
        insertSherlock(db,"In 'The Great Game' what is in the envelope addressed to Sherlock?","A pink phone","Lemon pips","A feather","Bloodied note",1,-1);
        insertSherlock(db,"What piece of basic information does Sherlock not know?","Solar System","Table of 2","Days in month","Name of Queen",1,-1);
        insertSherlock(db,"In 'The Blind Banker' what token is found with each of the victims?","Black paper lotus","Empty envelope","Kidney Bean","Human Tooth",1,-1);
        insertSherlock(db,"In 'A Study In Pink' Sherlock is offered anthing free in a resturant because Sherlock got his owner off on a what?","Murder charge","Rape charge","Arson charge","Drug charge",1,-1);
        insertSherlock(db,"At the end of 'The Blind Banker' Shan chats with someone on the computer who calls himself what?","M","S","J","K",1,-1);
        insertSherlock(db,"In the Reichenbach Fall, who tips off Watson that the police were going over to arrest Sherlock?","Lestrade","Mycroft","Anderson","Molly",1,-1);
        insertSherlock(db,"Sgt. Sally Donovan says Sherlock is what?","Psychopath","Maniac","Awesome","Intelligent",1,-1);
        insertSherlock(db,"In 'His Last Vow', who appears as Sherlock's girlfriend?","Janine","Lousie","Mary","Molly",1,-1);
        insertSherlock(db,"Sherlock texts who in the middle of giving his Best Man speech?","Leatrade","John Watson","Molly Hooper","Mycroft",1,-1);
        insertSherlock(db,"To whom does Sherlock say, 'Dont talk out loud. You lower the IQ of the whole street.'?","Anderson","Lestrade","Hudson","Molly",1,-1);
        insertSherlock(db,"In the 'Hounds of Baskerville', what is the name of the scientist who is a friend of Henry Knight's father?","Robert Frankland","Major Barrymore","Phil Knight","Lousie Mortimer",1,-1);
        insertSherlock(db,"Which children's book does Sherlock use as a clue to the missing children in 'The Reichenbach Fall'?","Grimms Fairy Tale","Harry Potter","Famous Five","Noddy",1,-1);
        insertSherlock(db,"Which of these does Sherlock use to help him think?","Nicotine patch","Water Bottle","Baseball cap","Marijuana",1,-1);
        insertSherlock(db,"Mrs. Hudson says what ages Watson?","His moustache","His hair","His wardrobe","His cane",1,-1);
        insertSherlock(db,"In the 'Great Game', Sherlock says to Molly Hooper she's put on how many pounds since she's been with her boyfriend?","3","12","9","6",1,-1);
        insertSherlock(db,"How may times soes it take Sherlock to correctly guess the password to Irene Adler's phone?","4","2","6","10",1,-1);
        insertSherlock(db,"In the Blind Banker, which banker is found dead in his flat?","Eddie Van Coon","Soo Lin Yao","Jeff Hope","John Dimmock",1,-1);
        insertSherlock(db,"Other than Mycroft, who mentions 'Red Beard' to Sherlock?","Magnussen","Moriarty","Adler","Lestrade",1,-1);
        insertSherlock(db,"In The Great Game, who appears at the pool wearing an explosive vest?","John Watson","Sarah Sawyer","Molly Hooper","Sherlock",1,-1);
        insertSherlock(db,"Who texts Lestrade for help in the beginning of 'The Sign of Three'?","Sherlock","Donovan","Mycroft","John",1,-1);
        insertSherlock(db,"Which of these is the name of one of the most deadly assassins?","Golem","Vermeer","Hobbit","Reaper",1,-1);
        insertSherlock(db,"At his wedding reception, whoe life does Watson have to save?","His former major","His wife","The photographer","Molly Hooper's date",1,-1);
        insertSherlock(db,"In 'His Last Vow', what letters were written on the pen drive that Mary gives John?","A.G.R.A","T.O.N.G.A","P.A.R.I.S","A.C.R.A",1,-1);
        insertSherlock(db,"In the Reichenbach Fall, when Sherlock is on the roof, whom does he call?","John Watson","Lestrade","Mycroft","Moriarty",1,-1);
        insertSherlock(db,"In the 'Blind Banker', when he is investigating an appartment, Sherlock has what happen to him?","He gets strangled","He is knocked out","He trips on water","He gets shot",1,-1);
        insertSherlock(db,"Roland Kerr College is the setting of the climax of which episode?","A Study in Pink","The Hounds of Baskerville","The Great Game","The Blind Banker",1,-1);
        insertSherlock(db,"In which country does the episode 'The Great Game' begins?","Belarus","Poland","Russia","Ukraine",1,-1);
        insertSherlock(db,"What is the name of the fictional airways in 'A Scandal in Belgravia'?","Flyaway Airways","Aeronaut Airways","Air UK","Adler Air",1,-1);
        insertSherlock(db,"Who is not a writer for Sherlock?","Louise Brealey","Mark Gatiss","Steven Moffat","Stephen Thompson",1,-1);
        insertSherlock(db,"Who plays Mycroft Holmes in Sherlock?","Mark Gatiss","Andrew Scott","Steven Moffat","Rupert Graves",1,-1);
        insertSherlock(db,"Who plays Lestrade in Sherlock?","Rupert Graves","Martin Freeman","Steven Moffat","Mark Gatiss",1,-1);
        insertSherlock(db,"Who plays Molly Hooper in Sherlock?","Louise Brealey","Una Stubbs","Amanda Abbington","Vinette Robinson",1,-1);
        insertSherlock(db,"Who plays Mrs Hudson in Sherlock?","Una Stubbs","Louise Brealey","Amanda Abbington","Vinette Robinson",1,-1);
        insertSherlock(db,"Who plays Mary Watson in Sherlock?","Amanda Abbington","Vinette Robinson","Louise Brealey","Una Stubbs",1,-1);
        insertSherlock(db,"When Sherlock is shot, he meet Moriarty in his mind palace. Whose name does he take which helps Sherlock to recover?","Watson","Mary","Molly","Hudson",1,-1);
        insertSherlock(db,"Whom among these does Moriarty not threaten to kill if Sherlock does not jump of the roof?","Molly","Lestrade","Hudson","Watson",1,-1);

        insertBreakingBad(db, "How did Walter knew that Krazzy 8 was faking his innocence?", "Broken plate pieces", "His face expressions", "He wasn't a good man", "Jesse told him", 1, -1);
        insertBreakingBad(db,"What was the exhibit that Jane took Jesse to go see?","Georgia O'Keeffe","Marsden Hartley","Jean Basquat","Roy Lichtenstein",1,-1);
        insertBreakingBad(db,"What is the name of the janitor who took the fall for Walt's theft at school?","Hugo","Max","Jose","Giancarlo",1,-1);
        insertBreakingBad(db,"How does Gus kill Victor?","With a box cutter","With a gun","With poison","He dosen't",1,-1);
        insertBreakingBad(db,"How doe Gus kill Hector Salamanca?","He dosen't","With a box cutter","With poison","With a gun",1,-1);
        insertBreakingBad(db,"How much did Walt sell his share of Grey Matter for?","$5,000","$25,000","$1,000","$10,000",1,-1);
        insertBreakingBad(db,"What is the name of Jesse's younger brother?","Jake","Josh","James","John",1,-1);
        insertBreakingBad(db,"What is on top of Saul's office?","Statue of liberty","God","Lady Justice","A model of Saul",1,-1);
        insertBreakingBad(db,"How many people died in the Wayfare 515 accident?","167","277","557","47",1,-1);
        insertBreakingBad(db,"What was the name of the meth that Jesse initially made and distributed?","CHILLI P","CYPRESS T","CRAZY 8","CHERRY 6",1,-1);
        insertBreakingBad(db,"What does Lydia say the average purity  of meth is in the Czech Republic?","60%","40%","70%","50%",1,-1);
        insertBreakingBad(db,"How much does Skyler offer to pay for the Car Wash?","$870,000","$979,000","$779,000","$679,000",1,-1);
        insertBreakingBad(db,"What is the name of the plant that Brock was poisoned with?","Lily of the Valley","Black Nightshade","European Holly","Moonseed",1,-1);
        insertBreakingBad(db,"What is Mike's granddaughter called?","Kaylee","Bailee","Maxine","Jenny",1,-1);
        insertBreakingBad(db,"What is the name of the acid that is used to corrosively dispose of Walter's victims?","Hydrofluoric acid","Hydrochloric acid","Sulphuric Acid","Hydrochloride",1,-1);
        insertBreakingBad(db,"What name did Walt Jr adopt during his teen rebellion phase?","Flynn","Scotty","Bane","Wendy",1,-1);
        insertBreakingBad(db,"What does Walter White use to kill Krazy-8 (Maximinio Arciniega)?","Bike lock","Plate pieces","Screwdriver","Bunsen Burner",1,-1);
        insertBreakingBad(db,"What is Walter White's middle name?","Hartwell","Archibald","Carlos","Hamish",1,-1);
        insertBreakingBad(db,"What was the website created by Walt Jr to raise donation money for his father's rising medical costs, which was later used by Saul Goodman to launder Walt's drug money?","savewalterwhite.com","savemydad.com","helpcuremydad.com","cancerfund.com",1,-1);
        insertBreakingBad(db,"What was the name of the video game that Jessie plays during 'Problem Dog'?","Rage","Shooter","Rambo","Hitman",1,-1);
        insertBreakingBad(db,"Breaking Bad creator Vince Gilligan is credited as a writer on which of the following Will Smith movies:","Hancock","Wild Wild West","Bad Boys","Pursuit of Happiness",1,-1);
        insertBreakingBad(db,"Before his partnership with Walt, what name did Jesse operate as a meth cook under?","Cap n' Cook","Mister Meth","Chilli Powder","Bomb",1,-1);
        insertBreakingBad(db,"What is the name of the boy Todd shoots in the desert?","Drew Sharp","Dwayne Painter","Peter Blunt","James Cook",1,-1);
        insertBreakingBad(db,"What flavour Venezia Pizza does Walt end up hurling on to the garage roof?","Ham and Pineapple","Pepperoni","Tuna and Olive","Cheese",1,-1);
        insertBreakingBad(db,"What stolen item first brings Marie’s kleptomania problem to a head?","A pair of shoes","A tiara","A collectibe spoon","A framed photo",1,-1);
        insertBreakingBad(db,"What is the last thing that Walter says?","goodbye, Lydia","Do it","No","I want this",1,-1);
        insertBreakingBad(db,"What kind of mineral does Hank show to Walt and Walter Jr.?","Rhodonite","Blue Corundum","White Gypsum","Magnetite",1,-1);
        insertBreakingBad(db,"In the first episode of season 3, what does Walter attempt to burn on his barbecue grill ?","Money","Cell Phone","Divorce Papers","Pink Teddy Bear",1,-1);
        insertBreakingBad(db,"Walt visits Gustavo Fring to tell him he's quitting the drug business, but Gus offers him 3 million dollars to continue for how many more months ?","3 months","2 months","1 month","4 months",1,-1);
        insertBreakingBad(db,"While Skyler was working at Beneke Fabricators, who did she have an affair with ?","Ted","Bill","Roger","Bob",1,-1);
        insertBreakingBad(db,"On leaving rehab, Jesse discovers that his parents are selling the home he was living in for $875,000, but how much did Jesse pay for the home ?","$400,000","$475,000","$600,000","$250,000",1,-1);
        insertBreakingBad(db,"Hank was offered a promotion which he didn't take because it would have required him to leave Albuquerque and go where ?","El Paso","Santa Fe","Roswell","Los Alamos",1,-1);
        insertBreakingBad(db,"Where was Gus' business concealed under?","Laundry","Car Wash","Steel Fabricators","Sewing Factory",1,-1);
        insertBreakingBad(db,"When Walt finally agrees to work in Gus' multi-million dollar lab, who is the assistant that Gus has assigned him ?","Gale","Bale","Dale","Phil",1,-1);
        insertBreakingBad(db,"Saul wants to set Jesse up with a business to launder his money, but what business does Saul describe as being 'The best money laundry a growing boy could ask for.' ?","Nail Salon","Car wash","Laser Tag","Fried Chicken Shack",1,-1);
        insertBreakingBad(db,"When Skyler offers to pay Hank's medical bills using Walt's money, she explains to Marie that Walt had won big while gambling at which casino game ?","Blackjack","Rhoulette","Slots","Craps",1,-1);
        insertBreakingBad(db,"Jesse arrived at the lab only to find Walt had increased the air pressure inside and was fixated on catching a contaminate inside. What was the contaminate ?","A fly","A bee","A spider","A mouse",1,-1);
        insertBreakingBad(db,"At the end of the season 3 finale, as Walt was about to be killed, what piece of information did he provide that saved his life ?","Gale's Address","Mike's Address","His drug formula","Gus' address",1,-1);
        insertBreakingBad(db,"What color protective clothing did Gus put on, before carrying out the killing of Victor?","Red","Yellow","White","Blue",1,-1);
        insertBreakingBad(db,"Skyler wants to buy the car wash from Bogdan Wolynetz, how much money did Bogdan initially request for the business ?","10 million","20 million","1 million","50 million",1,-1);
        insertBreakingBad(db,"At a bar, what was Mike's reaction when Walt asked him for help killing Gustavo Fring ?","He punched Walt","He agreed","He walked away","He phoned Gus",1,-1);
        insertBreakingBad(db,"After Skyler's success in buying the car wash, what celebratory item did Walt purchase which upset Skyler ?","Bottle of champagne","A new car","Diamond necklace","A cell phone",1,-1);
        insertBreakingBad(db,"As Hank is going through evidence taken from Gale's home, what item causes him to focus his attention on Los Pollos Hermanos and Gus","A napkin","Fingerprints","A bag","Photo of Gus",1,-1);
        insertBreakingBad(db,"When Walt goes to the car wash to get the keys etc. from Bogdan, what sentimental item does Walt refuse to let Bogdan take ?","A dollar bill","Office chair","Car wash sign","Old cash register",1,-1);
        insertBreakingBad(db,"Against the wishes of Skyler, what car does Walt purchase for Walt Jr. ?","Dodge Challenger","Porsche 911","Ford Mustang","Toyota Prius",1,-1);
        insertBreakingBad(db,"Skyler feels the need to leave Walt and so she takes Holly to the Four Corners Monument, where four states meet and she tosses a coin hoping it will help her make a decision, where does the coin land on two consecutive flips ?","Colorada","Arizona","Utah","New Mexico",1,-1);
        insertBreakingBad(db,"As Jesse attends an N.A. support group meeting, he indirectly bares his soul about killing Gale by using an animal instead, what animal did he use in his story ?","A dog","A deer","A rabit","A cat",1,-1);
        insertBreakingBad(db,"By episode 8, as Hank continues his investigation into Gus, what does he get Walt to do to Gus' car ?","Hide A GPS tracker","Follow it","Search it","Disable it",1,-1);
        insertBreakingBad(db,"When Gus took Jesse to Mexico to cook for the Cartel, what percentage purity did Jesse's first batch yield ?","96.2","99.1","94.3","87.9",1,-1);
        insertBreakingBad(db,"Gus poisons Don Eladio along with himself and several of Don Eladio's men, what item did Gus hide the poison in ?","Tequilla","Wine","Water","Whiskey",1,-1);
        insertBreakingBad(db,"It turns out that Los Pollos Hermanos was part of a large corporation named, Madrigal Electromotive which was based in which European country ?","Germany","Spain","United Kingdom","France",1,-1);
        insertBreakingBad(db,"How do they destroy the evidence on the laptop ?","Electromagnet","Sniper","Bulldoze the building","Bomb",1,-1);
        insertBreakingBad(db,"Where does Jesse eventually find the ricin cigarette which he feared lost, but was actually planted by Walt ?","His Roomba cleaner","His bed","His bedside locker","His car",1,-1);
        insertBreakingBad(db,"Walt takes his old Aztek car in for repairs but decides to sell it to the mechanic and leases two new cars for himself and Walt Jr., how much does he sell his old car for ?","$50","$100","$1","$250",1,-1);
        insertBreakingBad(db,"In episode 5, 'Dead Freight', the guys plan to rob a train without being noticed, by pumping out methylamine and pumping in water, how many gallons do they steal ?","1000","800","250","500",1,-1);
        insertBreakingBad(db,"Mike is killed in episode 7, but who shot him ?","Walt","Skyler","Hank","Saul",1,-1);
        insertBreakingBad(db,"In episode 8, Lydia comes up with a new business plan to sell Walt's product 'Blue Sky' into which country, by using the distribution network of Madrigal Electromotive ?","Czech Republic","Russia","India","Thailand",1,-1);
        insertBreakingBad(db,"What was the title of the book which Hank found in Walter's bathroom, and which led Hank to believe that Walter was in fact, Heisenberg ?","Leaves of Grass","Leaves of Gold","Leaves of Green","Leaves of Lies",1,-1);
        insertBreakingBad(db,"Where does Walt first confronts Hank when he learns that Hank knows the truth about his business?","Hank's Garage","Hank's Living Room","Car Wash","Hank's office",1,-1);
        insertBreakingBad(db,"When Jesse agrees to let Saul put him in contact with 'The Disappearer'', who will give him a new identity, where does he decide that he wants his new identity to take him ?","Alaska","Texas","Hawaii","Florida",1,-1);
        insertBreakingBad(db,"What was the name of Saul Goodman's rather large personal bodyguard ?","Huell","Kuby","Brock","Ted",1,-1);
        insertBreakingBad(db,"How much money did Walt claim to have buried in barrels in the desert ?","$80 million","$ 100 million","$50 million","$35 million",1,-1);
        insertBreakingBad(db,"Where does Walter get cut when Skyler slashes him with a knife in Season 5?","Hand","Stomach","Face","Leg",1,-1);
        insertBreakingBad(db,"After Ed 'the extractor', helps Walt escape from New Mexico, in which US state does Walt end up ?","New Hampshire","Alaska","Vermont","Texas",1,-1);
        insertBreakingBad(db,"Walt brings his last $9.72 million to Elliott and Gretchen Schwartz. Who does he make them promise to give them money to in 10 months time ?","Walter Jr.","Holly","Marie","Skyler",1,-1);
        insertBreakingBad(db,"What finally kills Walter White ?","Bullet","Bomb","Cancer","Poison",1,-1);
        insertBreakingBad(db,"Who is the first person in which Walt shares the secret that he has cancer ?","Krazy 8","Skyler","Jesse","Hank",1,-1);
        insertBreakingBad(db,"While Walt and Krazy-8 talk in the basement, it turns out that Walt knew Krazy-8's father because of a store he used to run. What type of store was it ?","Furniture","Hardware","Sports","Grocery",1,-1);
        insertBreakingBad(db,"Where does Walter hide his money in his home ?","Heating duct","Cereal Box","Clothes Hamper","Washing Machine",1,-1);
        insertBreakingBad(db,"In episode 5, who was Walt's old business partner who offered to pay the cost of Walt's treatment ?","Elliott Schwartz","Vince Gilligan","Betsy Brandt","Saul Goodman",1,-1);
        insertBreakingBad(db,"When Walt attended the birthday party for his former business partner, what gift did he give him ?","Ramen Noodles","Potato chips","Guitar","Resturant voucher",1,-1);
        insertBreakingBad(db,"After the demise of Krazy 8, who became the new 'distributor' in town ?","Tuco","Trance","Tracer","Tutti",1,-1);
        insertBreakingBad(db,"In episode 7, Walt and Jesse break into a warehouse to steal some chemicals, Walt burns through the lock on the warehouse door using ____ ","Thermite","Siliica","Gun Powder","Dynamite",1,-1);
        insertBreakingBad(db,"A rude steals a parking space from Walt, later Walt places a wet sponge on the guys car battery. What was the license plate on the guys car ?","Ken Wins","Scrw U","Dream On","No Money",1,-1);
        insertBreakingBad(db,"In the Pilot episode, after Walt crashes the RV in the desert believing the Police are chasing him, he leaves his wallet and what other item on the ground to be given to his family ?","A camcorder","A cell phone","A gun","No other item",1,-1);
        insertBreakingBad(db,"In the opening scene of the first episode of season 2, what item was floating on top of the water in the swimming pool ?","Eye","Head","Leg","Arm",1,-1);
        insertBreakingBad(db,"What poison did Walter create from beans, in order to kill Tuco ?","Ricin","Arsenic","Cyanide","Hydrofluoric acid",1,-1);
        insertBreakingBad(db,"Jesse's parents kick him out of his home, it turns out that Jesse did not own the home but his family had inherited it from whom, Jesse's ____ ?","Aunt","Uncle","Sister","Grandmother",1,-1);
        insertBreakingBad(db,"In episode 5, Jesse rents a new apartment from a young woman who lives in the apartment next door, what was her name ?","Jane","Jill","Sarah","April",1,-1);
        insertBreakingBad(db,"When Jesse rented the apartment, what name did he use ?","Jesse Jackson","Jesse James","Jesse Pinkman","Jesse Jack",1,-1);
        insertBreakingBad(db,"In episode 11, which of Jesse's boys, gets shot by a kid on a bike, while selling on the streets ?","Combo","Skinny Pete","Badger","Jane",1,-1);
        insertBreakingBad(db,"Saul puts Walt in contact with a businessman who could buy up all of Walt's stock. The businessman owns a chain of restaurants which specialize in what ?","Fried Chicken","Burgers","Fish","Sandwiches",1,-1);
        insertBreakingBad(db,"Throughout season 2, where does Walt hide his second cell phone ?","Ceiling of classroom","Bathroom","Janitors closet","Heating vents",1,-1);
        insertBreakingBad(db,"After the businessman offered Walt 1.2 million for his stock, he called to Jesse's apartment to get the drugs, but where had Jesse hidden them ?","Under Kitchen Sink","In his pillow","Behind toilet","Under the bed",1,-1);
        insertBreakingBad(db,"The pink teddy beat at the beginning of Season 2 came actually from where?","A plane crash","The RV","A neighbour","Box of Jesse's things",1,-1);
        insertBreakingBad(db,"When telling Walt and Walt Jr. about killing Tuco what animal does Hank compare criminals to?","Cockroaches","Snakes","Spiders","Rats",1,-1);
        insertBreakingBad(db,"What activity did Walter start doing in order to talk to Skyler when they met and fall in love?","The crossword puzzle","Word finds","Reading","Sudoku",1,-1);
        insertBreakingBad(db,"Who was Walt talking to when he commanded the words, 'say my name'?","Declan","Todd","Mike","Hank",1,-1);
        insertBreakingBad(db,"Who interrupts Jesse as he attempted to burn down the White residence?","Hank","Saul","Walt","Walt Jr.",1,-1);
        insertBreakingBad(db,"How long was Jesse given to vacate his Aunt's house when his parents called a lawyer?","72 hours","24 hours","48 hours","10 hours",1,-1);
        insertBreakingBad(db,"What location was Walt avoiding when he purposefully wrecked his car while chauffeuring an injured Hank?","Gus' laundry","DEA office","Jesse's office","Los Pollos",1,-1);
        insertBreakingBad(db,"What is Gus' legitimate business?","Los Pollos","Pollo Loco","KFC","Taco Bell",1,-1);
        insertBreakingBad(db,"In the Pilot episode, what demeaning second job has Walter taken to supplement his income as a teacher?","Car wash","Gardener","Telemarketing","Housekeeping",1,-1);
        insertBreakingBad(db,"In season 5, who put the tracker under a barrel of methylene in Lydia's warehouse?","Lydia","Mike","DEA","Walt",1,-1);
        insertBreakingBad(db,"Who said this to Jesse: 'Son, you need to stop focusing on the darkness behind you. The past is the past.'","Walt","Mike","Saul","Hank",1,-1);
        insertBreakingBad(db,"In the opening scene of 'Bloody Money', what did Walt retrieve from his home?","Ricin","Money","A key","A gun",1,-1);
        insertBreakingBad(db,"Who told Marie about Skyler's affair with Ted?","Walt","Hank","Flynn","Skyler",1,-1);
        insertBreakingBad(db,"After shooting Tuco who says 'Let him bleed'?","Walt","Jesse","Tio","Hank",1,-1);
        insertBreakingBad(db,"After Hank and Walt's confrontation in Hank's garage in season 5, who does Hank first call?","Skyler","Marie","Steve Gomez","Walt Jr.",1,-1);
        insertBreakingBad(db,"Where was Jesse hiding in 'Ozymandias'?","Under the car","Behind the rock","Abandoned house","In the car",1,-1);

        insertGameofThrones(db, "What was the name of Jon Snow's direwolf?", "Ghost", "Lady", "Nymeria", "Summer", 1, -1);
        insertGameofThrones(db,"Which indie band made a cameo appearance at the Purple Wedding?","McBusted","The National","Sigur Ros","Arcade Fire",1,-1);
        insertGameofThrones(db,"What's the name of the explosive that gave the Lannisters the edge in the Battle of Blackwater?","Wildfire","Dragonfire","Godsfire","Pantsonfire",1,-1);
        insertGameofThrones(db,"How is 'The Queen Of Thorns' more commonly known?","Cersei Lannister","Margarey Tyrell","Olenna Tyrell","E Jarvis Thribb",1,-1);
        insertGameofThrones(db,"What does Daenerys mean when she says 'Shekh ma shieraki anni' to Khal Drogo?","My sun and stars","Leave me alone","Moon of my life","Sound did silence me",1,-1);
        insertGameofThrones(db,"What is Pycelle's official title in the Red Keep?","Grand Maester","Games Maker","Master of Coin","Whisperer",1,-1);
        insertGameofThrones(db,"Which Lannister song signalled doom at the Red Wedding?","The Rains of Castamere","A Golden Crown","The Assassin's Dagger","Tales of Topography",1,-1);
        insertGameofThrones(db,"What piece of fencing advice did Jon Snow give to Arya Stark? 'Stick them with the…'","Pointy End","Needle","Sharp End","Prickly End",1,-1);
        insertGameofThrones(db,"Who said, 'Go drink until it feels like you did the right thing'?","Bronn","Tyrion Lannister","Lord Arryn","Kelis",1,-1);
        insertGameofThrones(db,"Who said, 'Hush, Hodor! No more Hodoring!'","Bran Stark","Lord Varys","Robb Stark","Lady Catelyn",1,-1);
        insertGameofThrones(db,"Who said, 'It's not easy being drunk all the time. Everyone would do it if it were easy'?","Tyrion Lannister","King Robert","Bronn","Cersei",1,-1);
        insertGameofThrones(db,"Whose skull was crushed like an egg by The Mountain's giant hands?","Oberyn Martell","Lady the direwolf","Beric Dondarrion","Auric Goldfinger",1,-1);
        insertGameofThrones(db,"Who was used as target practice in a randy Joffrey's boudoir?","Ros","Master Luwin","Talisa Luwin","Maelcum Soul",1,-1);
        insertGameofThrones(db,"Who was burned alive on Drogo's funeral pyre?","Mirri Maz Dur","Khal Drogo","Maris Piper","Septa Mordane",1,-1);
        insertGameofThrones(db,"Who had molten gold poured over their head like a deadly Noel's House Party gunge tank?","Viserys Targaryen","Khal Drogo","Robb Stark","Bronn",1,-1);
        insertGameofThrones(db,"Who was stabbed in the back by a magic smoke-baby-ghost thing?","Renly Baratheon","Stannis Baratheon","Jory Cassel","Tony Blackburn",1,-1);
        insertGameofThrones(db,"Only two characters appeared in every episode before they were killed off. They were…","Robert and Ned","Robb and Viserys","Tommen and Joffrey","Catelyn and Hound",1,-1);
        insertGameofThrones(db,"Grey Worm is the leader of which group?","The Unsullied","Wildlings","White Walkers","Watchers on Wall",1,-1);
        insertGameofThrones(db,"How is Ser Davos colloquially known as?","The Onion Knight","The Beetroot Lord","The Fighter","Leader of the Army",1,-1);
        insertGameofThrones(db,"What is Brienne’s real surname?","Tarth","Gibb","Tully","Utichi",1,-1);
        insertGameofThrones(db,"Which house’s motto is 'Fire and Blood'?","Targaryen","Martel","Lannister","Stark",1,-1);
        insertGameofThrones(db,"Who masterminded the plot to kill King Joffrey?","Littlefinger","Olenna Tyrell","Margarey Tyrell","Tyrion Lannister",1,-1);
        insertGameofThrones(db,"Which popular fantasy character has been played by two female actors on Game Of Thrones?","Sarah Conor","Lara Croft","Lady Gaga","Mother Terresa",1,-1);
        insertGameofThrones(db,"In the beginning of the book, 3 men of the Night's Watch were sent to track a band of wildling raiders. Who led the group?","Bengen Stark","John Snow","Lord Commander","Ser Waymar Royce",1,-1);
        insertGameofThrones(db,"The valyrian steel dagger used in the attempt to kill Bran was brought up several times in the novel. Who originally owned the dagger?","Tyrion","Cersei","Varys","Littlefinger",1,-1);
        insertGameofThrones(db,"Syrio Forel, Arya's water dance instructor, was the first sword to the Sealord of what area?","Braavos","Lys","Myr","Tarth",1,-1);
        insertGameofThrones(db,"What person betrays Ned in the king's court scene where Ned confronts Joffrey and Cersei about Joff having no claim to the throne?","Littlefinger","Pycelle","Varys","Cersei",1,-1);
        insertGameofThrones(db,"Lord Eddard was brought before the Great Sept of Baelor to pass judgement for his crimes against the Seven Kingdoms. Which person climbed Baelor the Blessed to witness this?","Arya","Sansa","Bran","Joffrey",1,-1);
        insertGameofThrones(db,"Who were Danerys' parents?","Aerys II & Rhaella","Duncan & Rhaenys","Aerys II & Rhaenys","Aegon & Rhaenys",1,-1);
        insertGameofThrones(db,"Which dragon was called 'The Black Dread'?","Drogon","Vhagar","Balerion","Meraxes",1,-1);
        insertGameofThrones(db,"Where does Petyr Baelish come from?","The Fingers","Riverun","Braavos","The Eyrie",1,-1);
        insertGameofThrones(db,"Who is Tysha?","Tyrion's ex-wife","Jamie's ex wife","Tywin's wife","Cersei's best friend",1,-1);
        insertGameofThrones(db,"What does 'Valar Dohaeris mean'?","All men must die","All men must serve","Everyone most die","I have three dragons",1,-1);
        insertGameofThrones(db,"Who is Elia Martell?","Multiple Answers","Oberyn's sister","Rhaegar's wife","Oberyn's wife",1,-1);
        insertGameofThrones(db,"Where does Melisandre come from?","Asshai","Tyrosh","Volantis","Braavos",1,-1);
        insertGameofThrones(db,"Why did Arya kill Meryn Trant?","He killed Syrio Forel","He killed Ned Stark","He abused Sansa","He was a pedophile",1,-1);
        insertGameofThrones(db,"Who pushed young Bran Stark out of the window in season one, resulting in his paralysis from the waist down?","Jamie Lannister","Cersei Lannister","Theon Grejoy","Tyrion Lannister",1,-1);
        insertGameofThrones(db,"What was the name of Daenerys' power-hungry brother, who arranged her marriage to Dothraki warlord Khal Drogo?","Viserys","Ramsay","Rhaeghar","Aerys",1,-1);
        insertGameofThrones(db,"Which of these is not a name of the adopted direwolves?","Wind","Lady","Summer","Nymeria",1,-1);
        insertGameofThrones(db,"What was the name of the sinister castle where Arya and Gendry were held prisoner in season two?","Harrenhal","Casterly Rock","Meereen","Moat Cailin",1,-1);
        insertGameofThrones(db,"What was the name of Stannis Baratheon's assault on King's Landing in the penultimate episode of season two?","Battle of Blackwater Bay","Battle of Baratheons","Battle of King's Landing","Battle of Bastards",1,-1);
        insertGameofThrones(db,"What does Harrenhal prisoner Jaqen H'ghar promise Arya after she saves his life?","Kill three people","A new sword","Chest of gold","Training for assassin",1,-1);
        insertGameofThrones(db,"Which Ironborn heir captures Winterfell while Robb Stark is fighting the Lannisters?","Theon Grejoy","Rick Stark","Yara Grejoy","Ramsay Bolton",1,-1);
        insertGameofThrones(db,"What is the name of the so-called King Beyond the Wall, the leader of the Wildings?","Mance Ryder","Jeop Mormont","Qhorin Halfhnad","Night King",1,-1);
        insertGameofThrones(db,"What unusual deity does Melisandre, the Red Priestess, follow?","Lord of Light","Lord of Fire","Old Gods","Lord of Planets",1,-1);
        insertGameofThrones(db,"Name the other Stark child: Robb, Brandon, Sansa, Arya. Jon Snow and…?","Rickon","Dickon","Ramsay","Eddard",1,-1);
        insertGameofThrones(db,"What's the name of Lysa Arryn's way-too-old-to-be-nursing son?","Robin","Hoster","Edmore","Nedwell",1,-1);
        insertGameofThrones(db,"What is the name of a person that can enter the minds of animals?","A warg","Three eyed raven","Conjurer","Hypnotizer",1,-1);
        insertGameofThrones(db,"What name was given to the wedding between Edmure Tully and Roslin Frey that resulted in the massacre of most of the Stark family?","The Red Wedding","The Purple Wedding","The Black Wedding","The Horror Wedding",1,-1);
        insertGameofThrones(db,"What name was given to the wedding where Joffrey was poisoned?","The Purple Wedding","The Red Wedding","The Black Wedding","The Horror Wedding",1,-1);
        insertGameofThrones(db,"What was the name of the Stark ancestral sword that was melted down by Tywin Lannister in the first episode of season four?","Ice","Fire","Wolf","North",1,-1);
        insertGameofThrones(db,"What was in the ceremonial pie at the Purple Wedding?","A dozen doves","A dozen pigeons","A dozen pheasants","A dozen rats",1,-1);
        insertGameofThrones(db,"Who did Sansa bring to aid John Snow at the Battle of the Bastards?","Knights of Vale","Knights of Eyrie","Knights of Valley","Knights of Mountain",1,-1);
        insertGameofThrones(db,"Who died while holding a door to allow Bran Stark to escape? ","Hodor","The Hound","Cold Hands","Wun Wun",1,-1);
        insertGameofThrones(db,"What is the name of Theon and Yara Greyjoy's uncle, King of the Iron Islands?","Euron Grejoy","Caldon Greyjoy","Walder Frey","Balor Greyjoy",1,-1);
        insertGameofThrones(db,"Who did Daenerys leave behind in Meereen to keep the peace? ","Daario Naharis","Jorah Mormont","Missandei","Daario Mormont",1,-1);
        insertGameofThrones(db,"Which of these people did not die in the Great Sept at Cersei's hand?","Tommen Baratheon","Margarey Tyrell","Loras Tyrell","Mace Tyrell",1,-1);
        insertGameofThrones(db,"The Khal who takes Daenerys to Vaes Dothrak is...","Moro","Maro","Doro","Daro",1,-1);
        insertGameofThrones(db,"Besides Jon Snow, who else turns up alive despite being left for dead in Season 5?","The Hound","Catelyn Stark","Arya","Oberyn Tyrell",1,-1);
        insertGameofThrones(db,"Who set Rhaegal and Viserion free? ","Tyrion Lannister","Missandei","Tywin Lannister","Grey Worm",1,-1);
        insertGameofThrones(db,"The last giant's name was...","Wun Wun","BFG","Gog","Magog",1,-1);
        insertGameofThrones(db,"Who was born in the Tower of Joy?","Jon Snow","Lyanna Stark","Eddard Stark","Ramsay Snow",1,-1);
        insertGameofThrones(db,"How many gods does the High Sparrow worship?","7","6","3","1",1,-1);
        insertGameofThrones(db,"What is Danerys to name her son, the Stallion who mounts the world?","Rhaego","Rhaegar","Rhaegol","Rhaegan",1,-1);
        insertGameofThrones(db,"The words 'Family, Duty, Honor' belong to which of the great houses?","House Tully","House Hightower","House Martell","House Arryn",1,-1);
        insertGameofThrones(db,"Before his death, who was Catelyn Tully of Riverrun originally betrothed to marry?","Brandon Stark","Benjan Stark","Edwyle Stark","Rickard Stark",1,-1);
        insertGameofThrones(db,"Viserys Targaryen dies when Khal Drogo pours a pot of motlten gold over his head- but what was metled down?","Golden Belt Medallions","Danerys's Golden Dowry","Golden Jewels","Golden Bracelets",1,-1);
        insertGameofThrones(db,"Complete this phrase that is said tho the Hand of King: When the King dreams, the Hand _____","Builds","Sows","Rules","Acts",1,-1);
        insertGameofThrones(db,"Which house has a moon and falcon on its banners?","House Arryn","House Tully","House Greyjoy","House Frey",1,-1);
        insertGameofThrones(db,"When Arya Stark flees King's Landing, she kills a character who threatens to hand over ot Cersei. Who does she 'stick with the pointy end'?","A Stable Boy","A Kitchen Boy","A Baker's Boy","A Washer Boy",1,-1);
        insertGameofThrones(db,"How many Dotharaki make up Khal Drogo's khalasar?","40,000","80,000","20,000","60,000",1,-1);
        insertGameofThrones(db,"Who said: 'Money buys a man’s silence for a time. A bolt in the heart buys it forever.'","Littlefinger","Jamie","Tywin","Tyrion",1,-1);
        insertGameofThrones(db,"Who was the Hand of the King immediately before Eddard Stark?","Jon Arryn","Jon Connington","Tywin Lannister","Lord Rossart",1,-1);
        insertGameofThrones(db,"Which of the Kingdoms was Aegon the Conquerer NOT able to conquer?","Dorne","The Vale","The North","The Storm Lands",1,-1);
        insertGameofThrones(db,"Who killed Robb Stark?","Roose Bolton","Walder Frey","Lothar","Musicians",1,-1);
        insertGameofThrones(db,"Who suggests that Sansa marry Loras Tyrell?","Margarey","Joffrey","Cersei","Tywin",1,-1);
        insertGameofThrones(db,"Who does Dany name her Dragons after?","Husband and two brothers","Previous dragons","Orginal names","Brother, Husband, Father",1,-1);
        insertGameofThrones(db,"How are Sandor and Gregor related?","Brothers","Step Brothers","Cousins","Father and son",1,-1);
        insertGameofThrones(db,"Who shot the fiery arrow that set Blackwater Bay on fire?","Bronn","Podrick","Sandor Cleagane","Lansel Lannister",1,-1);
        insertGameofThrones(db,"Jorah Mormont spoke the last words of the first season. What did he say?","Blood of my blood","Dragons","My love","Khaleesi",1,-1);
        insertGameofThrones(db,"Which dragon did Aegon the Conqueror ride into the War of Conquest?","Balerion","Aerys","Vhagar","Valeria",1,-1);
        insertGameofThrones(db,"In 'Walk of Punishment', Tywin names ______ the new Master of Coin.","Tyrion","Pycelle","Varys","Littlefinger",1,-1);
        insertGameofThrones(db,"What is the name of Wildling Robb and Theon bring back to Winterfell?","Osha","Ygritte","Yara","Asha",1,-1);
        insertGameofThrones(db,"In 'Kissed by Fire' who ends up in a giant tub with Jamie?","Brienne","Catelyn","Loras","Cersei",1,-1);
        insertGameofThrones(db,"Whose sword is named Oathkeeper?","Brienne","Jamie","Bronn","Eddard",1,-1);
        insertGameofThrones(db,"On whose orders was Barristan Selmy, Lord Commander of the Kingsguard, dismissed?","Joffrey","Cersei","Tywin","Tyrion",1,-1);
        insertGameofThrones(db,"How many horns equal the Whitewalkers warning?","3","2","1","4",1,-1);
        insertGameofThrones(db,"Talisa tells Rob a sad story about her brother nearly dying. How did he nearly die?","Drowning","Sword wound","Suffocated","Massive fall",1,-1);
        insertGameofThrones(db,"What is Jon particularly skilled with according to Ygritte?","His tongue","His hand","His sword","His eyes",1,-1);
        insertGameofThrones(db,"Who thinks that hunting is sexy and wants Joffrey to kill something with his crossbow?","Margarey","Olenna","Sansa","Arya",1,-1);
        insertGameofThrones(db,"What house is Catelyn Stark's sister married into?","House Arryn","House Tully","House Tully","House Lannister",1,-1);
        insertGameofThrones(db,"For how many years has the Knight's Watch guarded the kingdoms?","8000","1000","300","800",1,-1);
        insertGameofThrones(db,"Who replaced Janos Slint as comander of the City Watch of King's Landing?","Bronn","Podrick Payne","Brienne","Barristan Selmy",1,-1);
        insertGameofThrones(db,"In 'Dark Wings, Dark Words', the second episode of season 3, who got into a sword fight?","Brienne and Jamie","Joffrey and Tyrion","Robb and Theon","Brienne and Hound",1,-1);
        insertGameofThrones(db,"Who did Arya, Hot Pie and Gendry run into in the second episode of season 3?","Thoros of Myr","Brienne","Jon Snow","Bran",1,-1);
        insertGameofThrones(db,"What's on the sigil for House Lannister?","Lion","Dragon","Lord of Lght","Hunting Eagle",1,-1);
        insertGameofThrones(db,"In 'The Laws of Gods and Men'' who was the last witness called for Tyrion's trial?","Shae","Varys","Cersei","Oberyn",1,-1);
        insertGameofThrones(db,"When Tyrion suggests trading the 2 Stark children for Jamie in 'The North Remembers' why can't Cersei agree?","Arya is missing","Sibling rivalry","She can't bow down","Joffrey is the king",1,-1);
        insertGameofThrones(db,"How did Joffrey die?","poison","stabbed","choked","knife",1,-1);
        insertGameofThrones(db,"What does Dany say to her dragon to make it breath fire?","dracarys","vicarys","ricarys","drogo",1,-1);
        insertGameofThrones(db,"What are the words of House Stark?","Winter is Coming","Unbent, Unbowed, Unbroken","Hear me Roar","High as Honor",1,-1);
        insertGameofThrones(db,"Who chopped off Jamie's hand?","Locke","Brienne","Catelyn","Robb",1,-1);
        insertGameofThrones(db,"How many children did Cersei give birth to while being married to Robert?","4","3","2","1",1,-1);

        //1
        insertSuits(db, "Who is the director of Suits?", "All of these", "Gabriel Macht", "Kevin Bray", "Patrick J.Adams", 1, -1);
        //2
        insertSuits(db, "Who is the third person to learn of Mike's secret?", "Donna", "Harvey", "Jessica", "Rachel", 1, -1);
        //3
        insertSuits(db, "When the associates think they are getting a raise early, what does Harold plan to do with his?", "Get a tattoo", "A new suit", "A new apartment", "A new desk chair", 1, -1);
        //4
        insertSuits(db,"In season 2 episode 15, what was Jessica's purpose of providing the firm's financial statements?","A merger","stock market listing","Save the firm","Bring new clients",1,-1);
        //5
        insertSuits(db,"In season 2, whom did Louis gave his recorder to?","Rachel","Mike","Harvey","Donna",1,-1);
        //6
        insertSuits(db,"In her birthday, who did Rachel have a lunch out with in season 2 episode 13?","Robert","Donna","Mike","Louis",1,-1);
        //7
        insertSuits(db,"What is the name of the pizza place at Harvard that serves square pizzas?","Pinnochio's","Smart Slice","Hot Wings","No such place",1,-1);
        //8
        insertSuits(db,"what is the relation between Zoe Lawford and Harvey Specter in real life?","Husband and Wife","Brother and Sister","No relation","Boyfriend and Girlfriend",1,-1);
        //9
        insertSuits(db,"Patrick J. Adams portrays which role in Suits?","Mike","Harvey","Louis","Travis",1,-1);
        //9
        insertSuits(db,"Who portrays the role of Louis Litt in suits?","Rick Hoffman","Patrick J. Adams","Patrick Hoffman","Rick Adams",1,-1);
        //10
        insertSuits(db,"What was Harvey's father occupation?","Saxophone player","Piano player","Singer","Divorce Lawyer",1,-1);
        //11
        insertSuits(db,"Trevor and Mike go out and pick up 2 girls. How many bottles of Dom does Trevor promise them?","4","8","2","1",1,-1);
        //12
        insertSuits(db,"In season 2, how did Maria became suspicious about Mike not attending Harvard School?","She was a class secretary","From Donna","She eavesdropped","She researched on Mike",1,-1);
        //13
        insertSuits(db,"Wife of Patrick J. Adams(Mike) plays which role in Suits?", "Claire", "Donna", "Maria","Scottie",1,-1);
        //14
        insertSuits(db,"Who didn't knew about Mike's fraud until it was revealed to all?","Maria","Lola Jenson","Prof. Gerald","Claire",1,-1);
        //15
        insertSuits(db,"Who helped Mike in securing authenticate certificates and identity at Harvard?","Lola Jensen","Maria","Prof. Gerald","Sheila Sasz",1,-1);
        //16
        insertSuits(db,"When Louis and Mike go to the pro club, who is Louis talking to?","Tom Keller","Tim Keller","Tom Kelly","Travis Tanner",1,-1);
        //17
        insertSuits(db,"What does Louis Litt not like?", "Indiscipline from associates", "Mudding", "Ballet Dancing", "Bran Bars",1,-1);
        //18
        insertSuits(db,"Where does Mike hides the drug briefcase initially after getting hired?", "Pizza Box", "His new office", "He gave it to Trevor", "In Harvey's Home",1,-1);
        //19
        insertSuits(db,"When researching the insider trading case what bar does Mike go to in order to chat with the brokers?","The Closing Bell","Beekman Pub","Liquid Assets","None of these",1,-1);
        //20
        insertSuits(db,"Whom does Louis Litt meets when he goes to see ballet and later accompany him/her to solve a case?","Rachel","Donna","Mike","Harold",1,-1);
        //21
        insertSuits(db,"Which member of Mike's family dies in Season 2, Episode 10?","Grandmother","Grandfather","Mom","Girlfriend",1,-1);
        //22
        insertSuits(db,"What is Harvey's middle name?","Reginald","Riche","Royal","Roger",1,-1);
        //23
        insertSuits(db,"Among these, which prominent character suffered consequences for siding with Daniel Hardman?","Louis Litt","Harold","Travis Tanner","Scottie",1,-1);
        //24
        insertSuits(db,"When Katrina was first hired, why was Louis Litt mad at him?","She replaced his hired associate","She blackmailed him","She stole a case","She liked Harvey more",1,-1);
        //25
        insertSuits(db,"Which Shakespeare play did Jessica buy Louis?","King Lear","Romeo Juliet","Hamlet","The taming of the Shrew",1,-1);
        //26
        insertSuits(db,"In Suits Season 2, who contemplated on joining online dating sites?","Rachel","Donna","Jessica","Mike",1,-1);
        //27
        insertSuits(db,"What position does Daniel Hardman offer Louis Litt?", "Senior Partner", "Managing Partner", "General Manager", "Paralegal", 1, -1);
        //28
        insertSuits(db,"Which hospital did Mike and Harvey had to deal with in Suits season 2 episode 3?", "Prescott", "Sanders", "Presley", "Preston", 1, -1);
        //29
        insertSuits(db, "Jessica's ex-husband slept with Lisa before they officially separated.", "True", "False", "Not Revealed", "Jessica never married", 1, -1);
        //30
        insertSuits(db,"In episode 4 of Suits season 2, what is the name of the company that was sued for an advertising claim that drinking their water will increase IQ?","Liquid Water","Intelli-Water","Water Wise","Liquid Pure",1,-1);
        //31
        insertSuits(db,"How much is the buy in for senior partner?","$500,000","$850,000","$1,000,000","$950,000",1,-1);
        //32
        insertSuits(db,"Who did Harvey punch on Suits season 2 episode 7 Sucker Punch?","Travis","Daniel","Edward","Mike",1,-1);
        //33
        insertSuits(db,"Who says the line 'You dont make major life decisions if you are reeling from a loss?","Jessica","Harvey","Mike","Donna",1,-1);
        //34
        insertSuits(db,"In Suits season 2, who did Louis choose as the manging partner during voting?", "Daniel Hardman", "Harvey Specter","Himself","Jessica",1,-1);
        //35
        insertSuits(db,"In season 2, whose idea was the Louis Litt Rehabilation program?","Jessica","Daniel","Harvey","Donna",1,-1);
        //36
        insertSuits(db,"In season 2, how many times did Donna slap Daniel?","2","1","3","4",1,-1);
        //37
        insertSuits(db,"How did Mike got kicked out of college?","For cheating in tests","He never went","For drugs","Poor performance",1,-1);
        //38
        insertSuits(db,"In the season 2 finale, who blackmailed Mike into not using Scottie's information by threatening to have him arrested as a fraud?","Jessica","Harvey","Louis","Donna",1,-1);
        //39
        insertSuits(db,"In the season 2 finale, what would happen if Harvey wins the lawsuit against Edward?","Merger would be off","Jessica will be sacked","He will become owner","Mile will be arrested",1,-1);
        //40
        insertSuits(db,"What key evidence did Cameron Dennis bury in the Clifford Danner that led Harvey to reopen the case?","A letter","A book","A bill receipt","Signatures",1,-1);
        //41
        insertSuits(db,"In season 2, what was Mike's job five years ago","Bike messenger","Drug seller","Waitor","Jobless",1,-1);
        //42
        insertSuits(db,"Whom did Louis Litt tried to get as an ally in the start of Season 2","Daniel Hardman","Mike","Katrina","Rachel",1,-1);
        //43
        insertSuits(db,"When Alicia Hardman died in the season 2 premiere of Suits, who was expected to be back and work again at the agency?","Daniel Hardman","Jessica","Mike","Edward",1,-1);
        //44
        insertSuits(db,"In the season 2 finale, who did Harvey ask Edward to hire back?","Scottie","Rachel","Jessica","Trevor",1,-1);
        //45
        insertSuits(db,"In Suits season 2 episode 5, who was believed to have shredded the important documents which led to her termination from the firm?","Donna","Rachel","Jessica","Katrina",1,-1);
        //47
        insertSuits(db,"What is the name of the IT guy that helped Mike 'travel back in time'","Benjamin","Andrew","Paul","Jeremy",1,-1);
        //48
        insertSuits(db,"Who was Louis' primary partner in the Liquid Water case in Suits season 2 episode 4?","Mike","Rachel","Donna","Katrina",1,-1);
        //49
        insertSuits(db,"In Suits season 2 episode 8, who did Harvey see in a hotel room with Daniel Hardman 5 years ago?","Monica","His mom","His daughter","Donna",1,-1);
        //50
        insertSuits(db,"With whom did Louis Litt had an affair","Sheila Sazs","Jessica","Katrina","Ava Hessington",1,-1);
        //51
        insertSuits(db,"Who revealed to Jenny that Trevor was a drug dealer?","Mike","Harvey","Katrina","Louis",1,-1);
        //52
        insertSuits(db,"What is the name of drunk driver who killed Michael's parents?","Mr.Fenton","Mr Pemberly","Mr Denver","Mr Drake",1,-1);
        //53
        insertSuits(db,"During the season 2 episode 'Zane vs Zane' who said: Who the hell is Louis Litt?","Katrina","Maria","Zoe","Scottie",1,-1);
        //54
        insertSuits(db,"Who does Harvey buy a new handbag for in the episode Bad Faith Season 3?","Donna","Ava","Jessica","Zoe",1,-1);
        //55
        insertSuits(db,"Whose assistance does Harvey seek as a jury consultant in the season 2 episode? 'Sucker Punch'","Zoe Lawford","Ava Hessington","Jessica Pearson","Michael Ross",1,-1);
        //56
        insertSuits(db,"Who says associates are like grains of sand?","Louis","Mike","Harvey","Stephen",1,-1);
        //57
        insertSuits(db,"Who helped Rachel to get into Columbia School?","Louis","Gina","Jessica","Harvey",1,-1);
        //58
        insertSuits(db,"When Rachel is not selected for Harvard, whom does Louis blame?","Sheila Sasz","Mike","Rachel","Robert",1,-1);
        //59
        insertSuits(db,"In 'Intent' District Attorney Terrence Wolf decides to pursue a criminal charge against who?","Donna","Katrina","Jessica","Rachel",1,-1);
        //60
        insertSuits(db,"Who said: 'I want you to say you are a liar! And a hypocrite!' to Mike" ,"Louis","Harvey","Rachel","Norma",1,-1);
        //61
        insertSuits(db,"In season 4, Louis is shocked when who fails to recognize his golden key?","Mike","Harvey","Rachel","Donna",1,-1);
        //62
        insertSuits(db,"What was the name of Mike's Father?","James","Colin","Mark","Harry",1,-1);
        //63
        insertSuits(db,"At what age did Mike meet childhood sweetheart Tess?","7","12","16","18",1,-1);
        //64
        insertSuits(db,"Who is dating Jeff Malone at the start of Season 4?","Jessica","Rachel","Donna","Katrina",1,-1);
        //65
        insertSuits(db,"Whose secretary dies during the final season 4 episode?","Louis","Mike","Harvey","Jessica",1,-1);
        //66
        insertSuits(db,"What does Harvey bring for Zoe's niece during the season 2 episode?","Flowers","Teddy","Doll","Cake",1,-1);
        //67
        insertSuits(db,"What was the name of Zoe's niece?","Olivia","Katrina","Ostella","Mary",1,-1);
        //68
        insertSuits(db,"What is the concealed weapon Louis is arrested for being in possession of in the episode 'Zane vs Zane'?","Nail Clippers","Pen","Stapler","Gun",1,-1);
        //69
        insertSuits(db,"Who blackmails Mike into smoking pot with a potential client in the episode 'Errors and Omissions'?","Louis","Trevor","Jenny","Jessica",1,-1);
        //70
        insertSuits(db,"What is the name of the man Harvey helped convict murder but has no evidence to prove his innocence?","Cliffiord Danner","Colin Dixon","Ryan Grayson","Gerald Jarett",1,-1);
        //71
        insertSuits(db,"Who shows up at Sheila's office in Boston during Season 4?","Louis","Jessica","Harvey","Katrina",1,-1);
        //72
        insertSuits(db,"What is the name of secretary who dies during Season 4?","Norma","Donna","Emily","Katrina",1,-1);
        //73
        insertSuits(db,"Who was Mike's secretary in Sidwell Industries?","Amy","Emily","Claire","Monica",1,-1);
        //74
        insertSuits(db,"What is the name of Harvey Specter's brother?","Marcus","Ethan","Alexender","Jamie",1,-1);
        //75
        insertSuits(db,"Actor Chi McBridge plays the role of which character?","Terrence Wolf","Nathan Perkins","Joe Henderson","Michael Jaworski",1,-1);
        //76
        insertSuits(db,"Who rips up her bonus in the season 2 episode 'Astreik'?","Donna","Jessica","Ava","Rachel",1,-1);
        //77
        insertSuits(db,"What is the occupation of Rachel's father Robert?","Lawyer","Resturant critic","Doctor","Journalist",1,-1);
        //78
        insertSuits(db,"During the finale of season 4 who said: You are not just a pretty face, are you?","Harvey","Mike","Logan","Louis",1,-1);
        //79
        insertSuits(db,"What is the surname of Mike's friend Trevor?","Evans","Sanders","Doherty","Cole",1,-1);
        //80
        insertSuits(db,"In Season 5 finale which prison did Mike go to?","Danbury Prison","State Country Prison","Cook Country Prison","Harlem Prison",1,-1);
        //81
        insertSuits(db,"Which personality trait did Harvey and Mike valued the most?","Loyality","Punctuality","Honesty","Integrity",1,-1);
        //82
        insertSuits(db,"Which dictaphone did Daniel gifted Louis?","STX 5000","IN-765","VN-2000","HS-500",1,-1);
        //83
        insertSuits(db,"Who nominated Mike for Junior partnership?","Jack","Harvey","Jessica","Louis",1,-1);
        //84
        insertSuits(db,"In season 3, which character was taken in for questioning by the SEC?","Multiple Answers","Harold Gunderson","Mike Ross","Harvey Specter",1,-1);
        //85
        insertSuits(db,"Who says: Is it so hard to believe that my father is a black?","Rachel","Jeff","Wolf","Jessica",1,-1);
        //86
        insertSuits(db,"Who said? : I don't want you on my side, I want us to be on the same side.","Jessica","Rachel","Harvey","Mike",1,-1);
        //87
        insertSuits(db,"Which lawyer is seen as the only person who has defeated Harvey thrice?","Elliot Stemple","Stephen Huntley","Dana Scott","Travis Tanner",1,-1);
        //88
        insertSuits(db,"Who met Mike in his grandmother's funeral?","Tess","Amy","Alsion","Zoe",1,-1);
        //89
        insertSuits(db,"What is the name of the first client Mike brought in the firm?","Tom Keller","Trevor Evans","Joanna Webster","Gabby Stone",1,-1);
        //90
        insertSuits(db,"How did Mike save himself from a drug test when Mike stole Louis' client?","He had a drug test recently","He faked it","He blackmailed him","He offered to spy on Harvey",1,-1);
        //91
        insertSuits(db,"Among these who was promoted to junior partner first?","Louis","Harvey","Mike","Louis and Harvey",1,-1);
        //92
        insertSuits(db,"Who is the youngest junior partner in the firm's history?","Mike","Louis","Harvey","None of these",1,-1);
        //93
        insertSuits(db,"Who is the youngest senior partner in the firm's history?","Harvey","Mike","Louis","Jessica",1,-1);
        //94
        insertSuits(db,"Where does Jessica plans to go with her love interest in Season 4?","Paris","London","Switzerland","Macau",1,-1);
        //95
        insertSuits(db,"Who is the most recent name partner?","Hardman","Van Dyke","Schmidt","Gordon",1,-1);
        //96
        insertSuits(db,"Harvey and Mike took a case of a drug for sufferers of which ailment?","Lou Gehrig's disease","Parkinson disease","Hunnington's disease","Schizophrenia",1,-1);
        //97
        insertSuits(db,"What was the name of Jessica's ex husband?","Quentin Sainz","Richard Glassic","Quentin Glassic","Richard Sainz",1,-1);
        //98
        insertSuits(db,"In the mock trial who was Mike Ross up against?","Kyle Durant","Rachael Zane","Harold","Louis Litt",1,-1);
        //99
        insertSuits(db,"In a lawsuit, the case is centred around people getting cancer apparently from what source?","An oil well","Polluted air","Working under the sun","Unhygenic water",1,-1);
        //100
        insertSuits(db, "An associate of the firm- Stan Jacobson faked his job in what field for 5 long years?", "Accountancy", "Computer Programming", "Lawyer", "Engineer", 1, -1);


        insertHouse(db,"How did Dr. Kutner die?","Suicide","Accident","Homicide","Regicide",1,-1);
        insertHouse(db,"House sees cases as what?","Puzzles","TV shows","Tea parties","Easily solvable",1,-1);
        insertHouse(db,"Who is House with when he is seen at Cactus Mexican Food the second time?","His shooter","His team","Cuddy","Wilson",1,-1);
        insertHouse(db,"In season 7, Dr. House performs surgery on himself to remove tumors from where?","His leg","His neck","His chest","His arm",1,-1);
        insertHouse(db,"In which episode does Cameron return after her departure in 'Role Model'?","Love Hurts","Three Stories","Kids","Honeymoon",1,-1);
        insertHouse(db,"In 'No Reason' House and his team diagnose while getting food where?","Cactus Mexican Food","Burgers & Boobs","Panda Express","Desert Medxican Food",1,-1);
        insertHouse(db,"What does House receive as a gift from a patient in the episode 'DNR'?","Trumphet","Saxophone","Guitar","Sheet Music",1,-1);
        insertHouse(db,"Which character got married to Dr.Robert Chase?","Allison Cameron","Chi Park","Jessica Adams","Lisa Cuddy",1,-1);
        insertHouse(db,"Which character was not a part of the original three team members of House?","Multiple Answers","Thirteen","Cameron","Taub",1,-1);
        insertHouse(db,"Which hospital department is Dr. House in charge of?","Diagnostic Medicine","Oncology","Emergency Medicine","Radiology",1,-1);
        insertHouse(db,"Why did House hire Chase?","Chase's father asked","They met","Because of Cuddy","Chase's Skills",1,-1);
        insertHouse(db,"Lucas Douglas has a relationship with which other character?","Cuddy","House","Thirteen","Cameron",1,-1);
        insertHouse(db,"Which movie does House jokingly say is responsible for him becoming a doctor?","Patch Adams","Doctor Zhivago","Contagion","Outbreak",1,-1);
        insertHouse(db,"Who often uses metaphor in order to communicate his ideas to his team?","House","Cuddy","Foreman","Chase",1,-1);
        insertHouse(db,"What is Dr. House's first name?","Greg","Thomas","Out","Daniel",1,-1);
        insertHouse(db,"What is Dr. Cuddy's first name?","Lisa","Jane","Remy","Cameron",1,-1);
        insertHouse(db,"Lisa Edelstein plays which character?","Cuddy","Cameron","Thirteen","House",1,-1);
        insertHouse(db,"Hugh Laurie plays which character?","House","Chase","Foreman","Taub",1,-1);
        insertHouse(db,"Omar Epps plays which character?","Foreman","Chase","Taub","Kutner",1,-1);
        insertHouse(db,"Jesse Spencer plays which character?","Robert Chase","Foreman","Kutner","Taub",1,-1);
        insertHouse(db,"Olivia Wilde plays which character?","Thirteen","Cameron","Cuddy","Amber",1,-1);
        insertHouse(db,"Jennifer Morrison plays which character?","Cameron","Thirteen","Cuddy","Chi Park",1,-1);
        insertHouse(db,"Peter Jacobson plays which character?","Taub","Kutner","Thirteen","Wilson",1,-1);
        insertHouse(db,"Robert Sean Leonard plays which character?","Wilson","Kutner","Foreman","Chase",1,-1);
        insertHouse(db,"Kal Penn plays which character?","Kutner","Taub","Foreman","Chase",1,-1);
        insertHouse(db,"What is the name of House's Ukranian bride in Season 8?","Dominika","Katrina","Ivana","Susie",1,-1);
        insertHouse(db,"In the episode 'Mirror, Mirror' Cuddy replaces House's vicodin with what?","Laxatives","Chiklets","Aspirin","Tic Tacs",1,-1);
        insertHouse(db,"Who has a strong dislike for homeless patients as shown in the episode 'Histories'","Foreman","Chase","Cameron","House",1,-1);
        insertHouse(db,"Which memer of House's team is bisexual?","Thirteen","Taub","Cameron","Chase",1,-1);
        insertHouse(db,"What instrument does Dr. House play?","Piano","Trumpet","Violin","Clarinet",1,-1);
        insertHouse(db,"How many siblings does House have?","None","2","3","1",1,-1);
        insertHouse(db,"How long after House's surgery did Stacy begin smoking again?","2 weeks","1 hour","1 day","1 month",1,-1);
        insertHouse(db,"What is on the shirt that House is wearing as he leaves Mayfield?","A smiley face","Skull","Shakespeare","Raven",1,-1);
        insertHouse(db,"Which university was Dr.House kicked out for cheating?","John Hopkins","Stanford","Notre Dome","Northwestern",1,-1);
        insertHouse(db,"What is House's favorite kind of sandwich?","Reuben","PB&J","BLT","Grilled Cheese",1,-1);
        insertHouse(db,"What device does Dr. House use to help him walk?","A cane","A brace","A walker","Crutches",1,-1);
        insertHouse(db,"House often steals food from which other doctor?","Wilson","Turk","Cuddy","Cox",1,-1);
        insertHouse(db,"Alfredo is working for whom when he falls off of the doctor's roof 'Humpty Dumpty'?","Cuddy","Stacy","Perry","House",1,-1);
        insertHouse(db,"Where is House often found taking naps?","Clinic","Lab","Morgue","Coma Guy's Room",1,-1);
        insertHouse(db,"Which of these pairings never had romantic relationship?","Cuddy & Chase","Foreman & Thirteen","Chase & Cameron","House & Stacy",1,-1);
        insertHouse(db,"House is often seen playing with what in his office?","A ball","Rubik's Cube","A Bop It","A rope",1,-1);
        insertHouse(db,"Dr. House has the same house address as which fictional detective?","Sherlock Holmes","Nancy Drew","C. August Dupin","Jessica Fletcher",1,-1);
        insertHouse(db,"In the final season, Dr. House seems to die in what kind of disaster?","Fire","Flood","Nuclear Bombing","Torando",1,-1);
        insertHouse(db,"House finds a tick on an immuno-compromised girl whilst House, Foreman and the girl are where?","In an elevator","In an ambulance","In patient's house","In surgery",1,-1);
        insertHouse(db,"In 'Failure to Communicate', what does the aphasic patient mean by 'I couldn't tackle the bear; they took my stain.","He is bipolar","They took his beer","He was from north","He was a doctor",1,-1);
        insertHouse(db,"Who is seen sitting by House's bedside when he wakes up after being shot in 'No Reason'?","Cameron","Stacy","Cuddy","No One",1,-1);
        insertHouse(db,"In 'House vs God', the whiteboard suddenly starts keeping score between House and God. Who is actually keeping score?","Chase","Wilson","House","Foreman",1,-1);
        insertHouse(db,"From which university did Foreman get his medical degree?","John Hopkins","Northwestern","Stanford","Michigan",1,-1);
        insertHouse(db,"Which character takes a leave of absence through most of the season 7?","Thirteen","House","Wilson","Foreman",1,-1);
        insertHouse(db,"What song do House and Cuddy sing in Bombshells?","Get Happy","Midnight Train","In the Night","Good Man",1,-1);
        insertHouse(db,"What age did  Dr. Chase have on Season 2","30","37","27","34",1,-1);
        insertHouse(db,"Where is Dr. Chase from?","Australia","Brazil","New York","London",1,-1);
        insertHouse(db,"In which season does Dr. Chase kiss a cancer patient?","Season 2","Season 1","Season 4","Season 5",1,-1);
        insertHouse(db,"Where did Dr. Wilson and House meet?","Prison","Park","Hospital","Office",1,-1);
        insertHouse(db,"In what episode does Cuddy search for a sperm donor?","Who's you Daddy?","No Reason","House vs. God","Acceptance",1,-1);
        insertHouse(db,"Which doctor kidnaps Hose to take him to his father's funeral?","James Wilson","Amber Volakis","Eric Foreman","Robert Chase",1,-1);
        insertHouse(db,"What is Amber's full name?","Amber Volakis","Amber Heard","Amber Wilson","Amber Park",1,-1);
        insertHouse(db,"Who says - 'Once in a while, though, try to ruin my day. Ask me something I can say yes to.' ?","Cuddy","Foreman","Wilson","House",1,-1);
        insertHouse(db,"In the episode 'Role Model', how much money does the Senator say he has in his savings account?","$58","$0","$500","$85",1,-1);
        insertHouse(db,"What is the name of the person who created the show 'House M.D.'?","David Shore","Jesse Spencer","Bryan Singer","Omar Epps",1,-1);
        insertHouse(db,"In the episode 'Histories', when the patient starts to seize, what is Foreman's initial diagnosis?","Faking it","Drug overdose","Diabetic","Brain Tumor",1,-1);
        insertHouse(db,"Who said this line: 'Start praying for a 12 car pile up on the turnpike cause we're not exactly swimming in here' ?","Cuddy","Stacy","House","Wilson",1,-1);
        insertHouse(db,"In 'Mob Rules', House treated a patient who was involved in the Mafia. What was her name?","Joey Arnello","Edward Vogler","Bryan Singer","Bill Arnello",1,-1);
        insertHouse(db,"Whom does House fire at the end of Season 3 without any particular reason?","Chase","Cameron","Foreman","Taub",1,-1);
        insertHouse(db,"How much money does Edward Vogler bring to the hospital?","$100 million","$10000","$1000 million","$10 million",1,-1);
        insertHouse(db,"Whom did Vogler protect from being fired by House?","Chase","Cameron","Foreman","Taub",1,-1);
        insertHouse(db,"How old was the Diving Girl when she bacame pregnant?","11","12","14","16",1,-1);
        insertHouse(db,"Cameron agrees to come back and work for House in Season 1 if he......","takes her on date","leaves Vicodin","promotes her","fires Foreman",1,-1);
        insertHouse(db,"Who said this line: 'Billionaires buy movie studios to get laid. They buy hospitals to get respect.' ?","Dr Wilson","Dr House","Cuddy","Foreman",1,-1);
        insertHouse(db,"Which Actor / Actress produced and starred in the 2006 movie Flourish ?","Jennifer Morrison","Hugh Laurie","Robert Sean Leonard","Omar Epps",1,-1);
        insertHouse(db,"What was the final diagnosis for a boy from season 1 who thought he was 'Cursed' ?","Leprosy and Anthrax","TTP","Spleen Cancer","Cushings and Leprosy",1,-1);
        insertHouse(db,"Who said this line: 'You avoid work like the plague, unless it actually is the plague.' ?","Stacy Warner","Lisa Cuddy","Wilson","Cameron",1,-1);
        insertHouse(db,"How many people were killed by LL Cool J's character in the season 2 premiere ?","4","5","3","2",1,-1);
        insertHouse(db,"Which main actor / actress has been in a film with Robin Williams ?","Robert Sean Leonard","Omar Epps","Hugh Laurie","Jesse Spencer",1,-1);
        insertHouse(db,"What is the most recent handheld gaming system shown in the series ?","PSP","Nintendo S.E.","XBox","No gaming system",1,-1);
        insertHouse(db,"This doctor's specialty is Immunology.","Cameron","Foreman","Chase","Taub",1,-1);
        insertHouse(db,"This character has an office located right next to the walk-in clinic.","Lisa Cuddy","Wilson","Foreman","House",1,-1);
        insertHouse(db,"This character's significant other died of cancer.","Cameron","Chase","Thirteen","Cuddy",1,-1);
        insertHouse(db,"Who said this line: 'You're miserable for nothing... I don't know why you'd want to live.' ?","Jack Moriarty","House","Wilson","Cuddy",1,-1);
        insertHouse(db,"Which disorder is joked about as the 'Most commonly mentioned ailment' on the Season 2 DVD set ?","Lupus","Infraction","Sarcoidosis","Syphillis",1,-1);
        insertHouse(db,"How many episodes are there in Season 1?","22","25","28","24",1,-1);
        insertHouse(db,"Dr. House modified his motorcycle to more easily store what?","His cane","His pills","His jacket","His coffee",1,-1);
        insertHouse(db,"The hospital is full of patients from a swim meet potentially infected with what highly infectious disease in episode 'Kids' ?","Bacterial Meningitis","Common Cold","Lupus","Cancer",1,-1);
        insertHouse(db,"In Season 4, Dr. House tries to find out if there is an afterlife using which method?","Electrocution","Pshycotropic drugs","Meditation","Induced coma",1,-1);
        insertHouse(db,"Wilson gets House a Spanish-speaking massause to help with House's withdrawl pain in which episode?","Detox","Humpty Dumpty","Distractions","Skin Deep",1,-1);
        insertHouse(db,"What is House's mother name?","Blythe","Doreeen","Norma","Gwyneth",1,-1);
        insertHouse(db,"Which relatives of House surprise him at the hospital and have dinner with him during 'Daddy's Boy'?","Parents","Aunts","Uncles","Cousins",1,-1);
        insertHouse(db,"Who is the head of the Department of Oncology and House's friend?","James Wilson","Robert Chase","Lawrence Kutner","Chris Taub",1,-1);
        insertHouse(db,"Who often interrupts Wilson while he is working with patients?","House","Chase","Wilson","No one",1,-1);
        insertHouse(db,"What is the final diagnosis for the female model, Alex, in Season 2?","Testicular Cancer","Ovarian Cancer","Pancreatic Cancer","Breast Cancer",1,-1);
        insertHouse(db,"In 'Who's Your Daddy', House induces a hallucination in a patient who was a Katrina victim. What does she hallucinate?","Face melting off","House playing piano","Horses","Insects in room",1,-1);
        insertHouse(db,"In 'No Reason', what does House believe is happening to him due to the ketamine treatment?","Losing intellect","Gaining intellect","Severe leg pain","Emtionally disturbed",1,-1);
        insertHouse(db,"Which characters on House are married?","Chase & Cameron","House & Cuddy","Foreman & Thirteen","Wilson & Amber",1,-1);
        insertHouse(db,"What is Wilson's area of expertise?","Oncology","Neurology","Pre-Natal Care","Botany",1,-1);
        insertHouse(db,"In 'The Socratic Method', House cures a woman of Wilson's disease which was causing her to suffer from what mental disorder?","Schizophrenia","Kleptomania","Asperger syndrome","Huntington's Disease",1,-1);
        insertHouse(db,"In 'Daddy's Boy' House reveals he has been borrowing increasing amounts of money from whom to see where he would draw the line?","Wilson","Chase","Cuddy","Foreman",1,-1);
        insertHouse(db,"Who was Foreman's medical proxy when he was dying in the two 'Euphoria' episodes?","Cameron","His father","His mother","Cuddy",1,-1);
        insertHouse(db,"What is the name of dog that House temporarily takes care of?","Hector","Ollie","Bugsy","Champ",1,-1);
        insertHouse(db,"Which main character dies at end of Season 4 due to which Wilson was upset with House?","Amber","Chase","Cameron","Kutner",1,-1);
        insertHouse(db,"What is not one of House's habit?","Meeting patients","Taking vicodin","Playing with a ball","Using metaphors",1,-1);


        insertFootball(db, "Who has won the maximum no of Football World Cups?", "Brazil", "Germany", "Itlay", "Argentina", 1, -1);
        insertFootball(db,"Which of these teams played at the 2014 World Cup?","Brazil","Peru","Paraguay","Bolivia",1,-1);
        insertFootball(db,"Johannesburg, host for the World Cup final in 2010, is in which country?","South Africa","Japan","France","Germany",1,-1);
        insertFootball(db,"Which of these teams played at the 2014 World Cup?","None of these","Canada","Belize","Guatemala",1,-1);
        insertFootball(db,"Which of these countries has played in a World Cup finals tournament?","Costa Rica","Libya","Mali","Philippines",1,-1);
        insertFootball(db,"Which of these teams playes at the 2014 World Cup?","Iran","North Korea","Saudi Arabia","Israel",1,-1);
        insertFootball(db,"Which of these countries finished in the top 4 at the 1970 World Cup?","Itlay","France","England","Spain",1,-1);
        insertFootball(db,"Mexico City, host city for the World Cup Final in 1979, is in which country?","Mexico","England","Chile","Sweden",1,-1);
        insertFootball(db,"Which of these countries has won the World Cup?","Itlay","USA","Belgium","Australia",1,-1);
        insertFootball(db,"What is the name of the official mascot of the 2014 World Cup?","Fuleco","Juanito","World Cup Wille","Tip and Tap",1,-1);
        insertFootball(db,"Which of these countries have never played in a World Cup finals tournament?","Albania","Slovenia","Croatia","Greece",1,-1);
        insertFootball(db,"What was the name of the official mascot of the 1978 World Cup?","Gauchito","Pique","Naranjito","Ciao",1,-1);
        insertFootball(db,"What surname links Premier League footballers Rio, Anton and Les?","Ferdinand","Du Beke","Grande","Battersby",1,-1);
        insertFootball(db,"Who were Chelesea's main shirt sponsors for the 2012-13 Premier League season?","Samsung","Motorola","Apple","Nokia",1,-1);
        insertFootball(db,"Who became owner of Chelsea FC in 2003?","Roman Abramovich","Randy Lerner","Doug Ellis","Stan Kroenke",1,-1);
        insertFootball(db,"By what name was St. James' Park, the home of Newcastle United, known as during 2011-12 season?","Sports Direct Arena","Etihad Stadium","DW Stadium","Allianz Arena",1,-1);
        insertFootball(db,"Which club was bought by the Abu Dhabi United Group in 2008?","Manchester City","Liverpool","Arsenal","Portsmouth",1,-1);
        insertFootball(db,"Who announced he was resigning as manager of Southampton during the 2003-04 season?","Gordon Strachan","Paul Sturrock","George Burley","Graeme Souness",1,-1);
        insertFootball(db,"'You will Never Walk Alone' is the traditional club Anthem of which IPL Team?","Liverpool","Everton","Stoke City","Queens Park Rangers",1,-1);
        insertFootball(db,"For which Premiership side did players such as Martin Skrtel, Brad Jones, and Jamie Carragher play for in the 2012-13 season?","Liverpool","Wigan Athletic","Arsenal","Everton",1,-1);
        insertFootball(db,"Who became manager of Arsenal in 1996?","Arsene Wenger","George Graham","Alex Ferguson","Bruce Rioch",1,-1);
        insertFootball(db,"Which team has won the most Premier League titles?","Manchester United","Arsenal","Chelsea","Liverpool",1,-1);
        insertFootball(db,"Which title-winning side hold the record for the most wins in a victorious season?","Chelsea","Blackburn Rovers","Manchester United","Arsenal",1,-1);
        insertFootball(db,"Which strike holds the most hat-trick prize in the Premier League?","Alan Shearer","Robbie Fowler","Ruud van Nistelrooy","Ronaldo",1,-1);
        insertFootball(db,"Which side has recorded the most consecutive wins in the Premier League?","Arsenal","Manchester United","Liverpool","Chelsea",1,-1);
        insertFootball(db,"How about the club who totted up the longest ever winless run in the 2007/2008 campaign?","Derby County","Birmingham City","Reading","Southampton F.C.",1,-1);
        insertFootball(db,"Which defender holds the record for the fastest Premier League goal, timed at just 10 seconds?","Ledley King","Alan Stubbs","Ian Harte","Sergio Ramos",1,-1);
        insertFootball(db,"Name the goalkeeper who holds the record of the oldest ever Premier League player?","John Burridge","Peter Shilton","David Seaman","Tim Howard",1,-1);
        insertFootball(db,"Which teenager became the league’s youngest ever player aged 16 years and 65 days?","Matthew Briggs","Jack Robinson","Wayne Roonie","Max Meyer",1,-1);
        insertFootball(db,"Name the side with the unwanted gong for most goals conceded in a season?","Swindon Town","Sheffield United","Oldham Athletic","Southampton",1,-1);
        insertFootball(db,"Which club were originally known as Small Heath until 1905?","Birmingham City","Manchester United","Arsenal","Newcastle United",1,-1);
        insertFootball(db,"From which club did Wayne Roonie join Manchester United?","Everton","Wimbeldon","Reading","Norwich City",1,-1);
        insertFootball(db,"'Glory Glory _______ United' is the traditional clup anthem of which PL Team?","Manchester United","Chelsea","Leeds United","Newcastle United",1,-1);
        insertFootball(db,"Premier League players Samir Nasri and Gael Clichy are which nationality?","French","Irish","Polish","Russian",1,-1);
        insertFootball(db,"Roberto Mancini was fired as which team's manager in May 2013?","Manchester City","Manchester United","Liverpool","Chelsea",1,-1);
        insertFootball(db,"Gareth Barry left Manchester City to join which Premier League club in Summer 2014?","Everton","Burnley","Sunderland","Liverpool",1,-1);
        insertFootball(db,"Rio Ferdinand signed on a free transfer for which Premie League club in 2014?","QPR","Hull","Stoke","WBA",1,-1);
        insertFootball(db,"What is the the Premier League slogan?---The _________ Show On Earth","Greatest","Largest","Biggest","Popular",1,-1);
        insertFootball(db,"What is the name of the home ground of Tottenham Hotspur?","White Hart Lane","Green Lane","Blackhorse Road","Red Lion Way",1,-1);
        insertFootball(db,"Who was given a ten match ban by the FA after a biting incident in a game against Chelsea in 2012-13 season?","Luis Suarez","Kolo Toure","John Terry","Branislav Ivanovic",1,-1);
        insertFootball(db,"Which club bought Barry Ferguson from Rangers for big money in 2003?","Blackburn Rovers","Fulham","Southampton","Sheffield Wednesday",1,-1);
        insertFootball(db,"Which newly promoted side to the 2013-14 season plays its home games at Selhurst Park?","Crystal Palace","Stoke City","Swansea City","Hull City",1,-1);
        insertFootball(db,"Which of the following teams did current(as of 2013) Newcastle manager Alan Pardew NOT manage?","Stoke City","Southampton","West Hann","Charlton Athletic",1,-1);
        insertFootball(db,"In the summer transfer window, Manchester City signed which former Chelsea midfieder?","Kevin de Bruyne","Andre Schurrle","Victor Moss","Marko Marin",1,-1);
        insertFootball(db,"Aston Villa signed striker Rudy Gestede from which club?","Blackburn Rovers","Derby County","Marseille","Cardiff City",1,-1);
        insertFootball(db,"Who is the club captain of Swansea City for the 2015-2016 season?","Ashley Williams","Leon Britton","Angel Rangel","Neil Taylor",1,-1);
        insertFootball(db,"Swansea City's away shirt for the 2015/16 season is what color?","Green & dark blue","Yellow & red","Black & blue","Red & black",1,-1);
        insertFootball(db,"Costa Rica lost on penalties against whic hside in quarterfinals of 2014 World Cup?","Netherlands","Brazil","Germany","Argentina",1,-1);
        insertFootball(db,"Who scored 2 goals for Germany in the opening match against Costa Rica during 2006 World Cup?","Miroslav Klose","Lukas Podolski","Bastian Schweinsteiger","Torsten Frings",1,-1);
        insertFootball(db,"Which football club provided most number of Players during 2010 World Cup?","Barcelona","Arsenal","Bayern Munich","Chelsea",1,-1);
        insertFootball(db,"Who scored 2 goals for Germany against Sweden in 2006 world cup 2nd round match?","Lukas Podolski","Oliver Neuville","Miroslav Klose","Philipp Lahm",1,-1);
        insertFootball(db,"Who captained the world cup winning side in 1990?","Lothar Matthaus","Karl-Heinz Riedle","Andreas Breheme","Jurgen Klinsmann",1,-1);
        insertFootball(db,"Spain lost to which side in 1954 world cup qualifiers in an unusual method, as the winner of the match was drawn out from the lot?","Turkey","Yugoslavia","Hungary","Itlay",1,-1);
        insertFootball(db,"England beat which side during 2006 world cup 2nd round match?","Ecuador","Ghana","Mexico","Netherlands",1,-1);
        insertFootball(db,"What wa the name of 2010 World Cup mascot?","Zakumi","Fuleco","Footix","Pique",1,-1);
        insertFootball(db,"What was the scoreline of 2014 World Cup final after 90 minutes?","0-0","1-0","1-1","2-1",1,-1);
        insertFootball(db,"Who won the Golden Ball award of 2014 World Cup?","Lionel Messi","Thomas Muller","James Rodriguez","Neymar",1,-1);
        insertFootball(db,"Who is the youngest player to score a hat trick in world cup?","Preben Larsen","Pele","Geoff Hurst","Just Fontaine",1,-1);
        insertFootball(db,"How many goals did Iran score on their World Cup debut in 1978?","2","3","0","1",1,-1);
        insertFootball(db,"Which team made its debut in 2002 world cup?","China","Japan","South Africa","Jamaica",1,-1);
        insertFootball(db,"Cuba beat which country in 1938 world cup after a replay to qualify for Quarterfinals?","Romania","Norway","Netherlands","Dutch East Indies",1,-1);
        insertFootball(db,"Which tem scored most goals during 2002 World Cup?","Brazil","Germany","Itlay","South Korea",1,-1);
        insertFootball(db,"Who was sent off for France during 2006 world cup Final?","Zinedine Zidane","Thierry Henry","Lilian Thuram","Frank Ribery",1,-1);
        insertFootball(db,"Which World Cup was the first one to be held in Asia?","2002","2010","1994","1998",1,-1);
        insertFootball(db,"Which country refused to play against Romania in 1938 World Cup qualifiers because of Ramadin month and withdraw later?","Egypt","Saudi Arabia","Turkey","Iraq",1,-1);
        insertFootball(db,"Brazil beat which country in the semi-finals of 1970 world cup?","Uruguay","West Germany","Itlay","England",1,-1);
        insertFootball(db,"Which team made its debut in 1990 world cup?","UAE","South Korea","Cameroon","Egypt",1,-1);
        insertFootball(db,"With whom is Messi usually compared with?","Maradona","David Beckham","Zinedine Zidane","Gerd Muller",1,-1);
        insertFootball(db,"In which country was Messi born?","Argentina","USA","Barcelona","Spain",1,-1);
        insertFootball(db,"What is the full name of Messi?","Lionel Andres Messi","Messi d'Cruz","Pablo Andres Messi","Lionel Messi",1,-1);
        insertFootball(db,"After winning his second treble, how many major trophies has he won at FC Barcelona?","24","20","28","22",1,-1);
        insertFootball(db,"Messi scored a goal remarkably similar to Maradona's goal in the quarter finals of 1986 FIFA, known as the....","Goal of century","Goal of decade","Amazing goal","Hands of God",1,-1);

        insertCricket(db, "Who has won the maximum no of Cricket World Cups in one day format?", "Australia", "West Indies", "India", "Sri Lanka",1,-1);
        insertCricket(db,"'Dizzy' is the nickname of what Australian player?","Jason Gillespie","Adam Gilchrist","Glenn McGrath","Brett Lee",1,-1);
        insertCricket(db,"Which former Indian cricketer was nicknamed 'Tiger'?","Mansoor Pataudi","Vijay Hazare","Saurav Ganguly","Farooq Engineer",1,-1);
        insertCricket(db,"Who was named as the ICC Emerging player of Year 2004?","Irfan Pathan","Gautam Gambhir","Piyush Chawla","Suresh Raina",1,-1);
        insertCricket(db,"In 1987-88, which Indian spinner took 16 wickets on his Test debut?","Narendra Hirwani","Anil Kumble","Rajesh Chauhan","V. Raju",1,-1);
        insertCricket(db,"Which form of dismissal was added to the laws of cricket most recently?","Timed Out","Played On","Handled Ball","Stumped",1,-1);
        insertCricket(db,"Which of these is not a Pakistan fast bowler?","Syed Abid Ali","Asif Masood","Fazal Masood","Sikander Bakht",1,-1);
        insertCricket(db,"Where is the Queens Park Oval","Trinidad","Kenya","Jamaica","Canada",1,-1);
        insertCricket(db,"Who is New Zeadland's most successful spin bowler?","Daniel Vettori","Ewan Chatfield","Derek Underwood","Hugh Tayfield",1,-1);
        insertCricket(db,"Which Pakistani bowler took 24 wickets against England in 2012?","Ajmal","Annad","Kumble","Tiquan",1,-1);
        insertCricket(db,"What was Don Bradman's batting average over his entire test career?","99.94","101.94","79.94","109.94",1,-1);
        insertCricket(db,"Which country won its first World Cup when it beat England in Australia in 1992?","Pakistan","Sri Lanka","India","Australia",1,-1);
        insertCricket(db,"Which palyer is nicknamed Rawalpindi Express because of his fast bowling?","Shoaib Akhtar","Zaheer Khan","Waqar Younis","Imran Khan",1,-1);
        insertCricket(db,"Arjun Ranatunga was the captain of which World Cup winning nation?","Sri Lanka","India","Bangladesh","Pakistan",1,-1);
        insertCricket(db,"Newlands ground can be found in which South African city?","Cape Town","Durban","Port Elizabeth","Johannesburg",1,-1);
        insertCricket(db,"How many stumps are used in a game of cricket?","Six","Three","Two","Four",1,-1);
        insertCricket(db,"How many minimum bowlers have to bowl in a game of ODI cricket?","5","3","4","1",1,-1);
        insertCricket(db,"Shivnaraine Chanderpaul was an international cricketer for which nation?","West Indies","Australia","South Africa","England",1,-1);
        insertCricket(db,"Which country was the first to win 16 Test cricket matches in a row?","Australia","Pakistan","New Zeadland","West Indies",1,-1);
        insertCricket(db,"Who scored 291 at the Oval in 1976, missing on what would have been the only 300 in his career?","Viv Richards","Greg Chappell","Sachin Tendulkar","Sourav Ganguly",1,-1);
        insertCricket(db,"Who was the first batsman to reclaim the record for highest Test score?","Brian Lara","Don Bradman","Garry Sobers","Archie Sandham",1,-1);
        insertCricket(db,"Against which side Sachin Tendulkar made his highest List A score?","South Africa","Tamil Nadu","Railways","East Zone",1,-1);
        insertCricket(db,"In which year, India won its first T20 World Cup?","2007","2009","2008","2011",1,-1);
        insertCricket(db,"Who holds the world record for most ODI dismissals by a wicketkeeper, and the most Test dismissals by an Australian keeper?","Adam Gilchrist","Brad Haddin","Ian Healy","Rod Marsh",1,-1);
        insertCricket(db,"Wh is the youngest Indian to score a century in Test cricket?","Sachin Tendulkar","Abbas Ali Baig","Mansur Pataudi","Azharuddin",1,-1);
        insertCricket(db,"Who scored the most runs during the 2009 ICC World T20 as well as the 2011 ODI World Cup?","Dilshan","Gambhir","Tendulkar","Jayawardene",1,-1);
        insertCricket(db,"Who holds the record for beginning his Test career with the longest streak of Test wins(15)?","Adam Gilchrist","Don Bradman","Steve Waugh","Merv Hughes",1,-1);
        insertCricket(db,"As of November 2014, who holds the record for the most Test matches officiated by an Pakistani umpire?","Aleem Dar","Mahmood Shah","Khizer Hayat","Asad Rauf",1,-1);
        insertCricket(db,"Against which side did India record its largest win by runs?","Bermuda","Sri Lanka","Hong Kong","Pakistan",1,-1);
        insertCricket(db,"Which of these bowlers hasn't taken 200 wickets in ODI cricket?","Venkatesh Prasad","Chris Cairns","Abdur Razzak","Ajit Agarkar",1,-1);
        insertCricket(db,"Which cricketer is the only batsman to have scored centuries in 6 successive Test matches?","Bradman","Ponsford","Weekes","Walcott",1,-1);
        insertCricket(db,"Which batsman is the fastest Indain to get to 3,000 ODI runs(78 games)?","Virat Kohli","Navjot Sidhu","Sourav Ganguly","Sachin Tendulkar",1,-1);
        insertCricket(db,"Who is the onliy Indian wicketkeeper to take a wicket in ODIs while being the designated keeper?","MS Dhoni","Nayan Mongia","Rahul Dravid","Saba Karim",1,-1);
        insertCricket(db,"Which Bangladeshi scored a 100 on debut in 2001 becoming the youngest player to score a Test century?","Mohammad Ashraful","Aminul Islam","Rajin Saleh","Habibul Bashar",1,-1);
        insertCricket(db,"In 2012, which English captain led his team to their first Test series win in India in 28 years?","Alastair Cook","Michael Atherton","Andrew Strauss","Michael Vaughan",1,-1);
        insertCricket(db,"Which famous fielder was the first to take five catches in a one-day internationalin 1993-94?","Jonty Rhodes","Derek Randall","Clive Lloyd","Graeme Hick",1,-1);
        insertCricket(db,"Who recently became only the 2nd England player to record 3 150+ scores in Tests before the age of 24?","Joe Root","Sam Robson","Ben Stokes","Gary Ballance",1,-1);
        insertCricket(db,"Who was the only player to score a fifty and take five wickets in a match in 2011 World cup?","Yuvraj Singh","Jacques Kallis","Shane Watson","Shahid Afridi",1,-1);
        insertCricket(db,"Who was the official ambassador of the 2011 World Cup?","Sachin Tendulkar","Vivian Richards","Kapil Dev","Sunil Gavaskar",1,-1);
        insertCricket(db,"Which Indian great scores 774 runs against West Indies in his debut test series?","Sunil Gavaskar","Azharuddin","Sachin","Vijay Merchant",1,-1);
        insertCricket(db,"The Matador BBQs one-day Cup is competed for in which country?","Australia","New Zeadland","England","South Africa",1,-1);
        insertCricket(db,"How many legal balls would be bowled in a full innings of Twenty20 cricket?","120","150","160","200",1,-1);
        insertCricket(db,"What is the name of the IPL team based in Delhi?","Daredevils","Knights","Super Kings","Royals",1,-1);
        insertCricket(db,"Which of these is a way to get out on a wide ball?","Multiple Answers","Stump out","Hit Wicket","Run Out",1,-1);
        insertCricket(db,"Which English fast bowler is nicknamed 'Oggie'?","Matthew Hogard","Stuart Broad","Simon Jones","Steve Harrison",1,-1);
        insertCricket(db,"What is the name of the trophy for which England and Australia play test match series?","Ashes","Grace","Dregs","Cinders",1,-1);
        insertCricket(db,"For which international team has batsman Mahela Jayawardene played for?","Sri Lanka","India","Pakistan","Bangladesh",1,-1);
        insertCricket(db,"Geoffrey Boycott played for international cricket for which team?","England","New Zeadland","South Africa","Australia",1,-1);
        insertCricket(db,"Which of these is a term for a method by which a batsman gets out without any effort from the fielding team?","Hit Wicket","Bowled","Run Out","Catch",1,-1);
        insertCricket(db,"How many catches has Adam Gilchrist taken in World Cup history (till 2011)?","36","56","96","76",1,-1);
        insertCricket(db,"If an umpire lifts a finger up in the air what does it mean?","Out","One run","No ball","Four",1,-1);
        insertCricket(db,"Kumar Sangakarra played international cricket for which nation?","Sri Lanka","West Indies","India","Pakistan",1,-1);
        insertCricket(db,"Shane Warne played international cricket for which team?","Australia","England","South Africa","New Zeadland",1,-1);
        insertCricket(db,"What is it called when ateam has to start its second innings immediately after the first one because the opponent's score is huge?","Follow on","Declared","Come On","Carry On",1,-1);
        insertCricket(db,"At which Australian cricket ground would one find a large stand named the 'Great Southern Stand'?","The MCG","The WACA ground","The SCG","The Adelaide",1,-1);
        insertCricket(db,"Who was the losing captain in 2015 Ashes?","Michael Clarke","David Warner","Steve Smith","Alastair Cook",1,-1);
        insertCricket(db,"How many nations have women's teams who play cricket?","10","30","20","5",1,-1);
        insertCricket(db,"Who was Man of the Series and won 'The Golden Bat' at the 2013 Champions Trophy in England?","Shikhar Dhawan","Angelo Mathews","Eoin Morgan","Ravindra Jadeja",1,-1);
        insertCricket(db,"In which city are test matches played at Eden Gardens?","Kolkata","Hobart","Auckland","Bloemfontein",1,-1);
        insertCricket(db,"Who faced the first ever delivery usin ga pink ball ever in Test Cricket?","Martin Guptill","Kane Williamson","Tom Latham","Joe Burns",1,-1);
        insertCricket(db,"Which international team has been captained by Angelo Mathews?","Sri Lanka","Pakistan","West Indies","India",1,-1);
        insertCricket(db,"Brendon McCullum played international cricket for which team?","New Zeadland","South Africa","Australia","England",1,-1);
        insertCricket(db,"Which player at one stage held the record for most runs and best bowling figures for ODI in Sri Lanka","Sanath Jayasurya","Aravinda De Silva","Ruwan Madugalle","Asanka Gurusinha",1,-1);
        insertCricket(db,"Which is the largest stadium in India in terms of capacity of spectators?","Eden Gardens","Feroz Shah Kotla","Wankhede Stadium","Adelaide Oval",1,-1);
        insertCricket(db,"Who holds the record of having scored the highest runs in a Test match i.e. 400 runs?","Brian Lara","Sachin Tendulkar","VVS Laxman","Don Bradman",1,-1);
        insertCricket(db,"Among these, who does not holds the record for hitting six sixes in one over?","Derek Underwood","Hershelle Gibbs","Yuvraj Singh","Ravi Shastri",1,-1);
        insertCricket(db,"Who holds the record of having 5 wickets in one over, two of them being runouts?","Mohammad Amir","Shoaib Akhtar","Waqar Younis","Shoaib Malik",1,-1);
        insertCricket(db,"Who is the first player to hit six off the first ball he played in a Test match?","chris Gayle","Yusuf Pathan","AB De Villiers","",1,-1);
        insertCricket(db,"Who among these haven't scored more than 10000 runs in a Test Match?","MS Dhoni","Sachin Tendulkar","Sunil Gavaskar","Alastair Cook",1,-1);
        insertCricket(db,"Who holds the record for slapping most sixes in ODI cricket history?","Shahid Afridi","Sachin Tendulkar","Sanath Jayasurya","Chris Gayle",1,-1);

        insertTennis(db, "How many golds has Roger Federor earned in Olympics", "1", "2","0","5",1,-1);
        insertTennis(db,"What watch brand has a sponsorship with Roger Federer?","Rolex","Swatch","Tissot","Longines",1,-1);
        insertTennis(db,"What Grand Slam tournament has Roger Federer won the most?","Wimbledon","Australia Open","Roland Garros","US Open",1,-1);
        insertTennis(db,"Where is Roger Federer from?","Switzerland","France","Germany","United Kingdom",1,-1);
        insertTennis(db,"Where is Roger Federer's mother born?","South Africa","Switzerland","Germany","Mozambique",1,-1);
        insertTennis(db,"Which tennis player did Roger Federor face the most in his tennis career?","Novak Djokovic","Jarko Nieminen","Rafael Nadal","Andy Roddick",1,-1);
        insertTennis(db,"How many languages can Federer speak?","4","3","6","2",1,-1);
        insertTennis(db,"How many times did Roger Federer win 3 grand slams in a year?","3","4","7","1",1,-1);
        insertTennis(db,"What is the first grand slam Roger has won?","Wimbledon","Australia Open","US Open","Roland Garros",1,-1);
        insertTennis(db,"What court style is Federer best at?","Grass","Clay","Sand","Carpet",1,-1);
        insertTennis(db,"Which of these tennis players hasn't played ever with Federer?","Marsel ilhan","Damir Dzumhur","Andy Murray","Novak Djokovic",1,-1);
        insertTennis(db,"Who has been nicknamed as Nole?","Novak Djokovic","Rafael Nadal","Nick Kyrgios","Roger Federor",1,-1);
        insertTennis(db,"Which country does Novak Djokovic play for?","Serbia","Montenegro","Croatia","Yugoslavia",1,-1);
        insertTennis(db,"Who did Novak lose to in the Dubai 2015 final?","Roger Federer","Andy Murray","Borna Coric","Stan Wawrinka",1,-1);
        insertTennis(db,"In which year did Novak Djokovic reach his first Grand Slam final?","2007","2008","2009","2006",1,-1);
        insertTennis(db,"Who did Novak Djokovic defeat in the Aussie Open 2015 in 5 sets, winning the last 6-0?","Stan Wawrinka","Rafael Nadal","Roger Federer","Gael Monfils",1,-1);
        insertTennis(db,"Who stunned Novak Djokovic in 2015 Roland Garros final preventing his quest to the career Grand Slam?","Stan Wawrinka","Robin Soderling","Andy Murray","Roger Federer",1,-1);
        insertTennis(db,"Who is Novak Djokovic's coach?","Boris Becker","Stefan Edberg","Ivan Llendl","Roger Federer",1,-1);
        insertTennis(db,"Who was two sets up against Novak Djokovic in Wimbledon 2015 and lost?","Kevin Anderson","Stan Wawrinka","Roger Federer","Victor Troicki",1,-1);
        insertTennis(db,"Who did Novak Djokovic lose to in the Barclays World Tour Finals 2015?","Roger Federer","Stan Wawrinka","David Ferrer","Andy Murray",1,-1);
        insertTennis(db,"Which relative coaches Rafa?","Uncle","Grandfather","Niece","Brother",1,-1);
        insertTennis(db,"Where was Nadal born?","Spain","France","Itlay","Portugal",1,-1);
        insertTennis(db,"What was the first Grand Slam tournament Rafael Nadal won?","French Open","U.S. Open","Australia Open","Wimbledon",1,-1);
        insertTennis(db,"What is the asteroid that was named after Nadal?","128036 Rafaelnadal","Rafaelnadal","Rafa","Nadal",1,-1);
        insertTennis(db,"What year was Nadal named the Laureus World Sportsman of the Year?","2011","2010","2009","2008",1,-1);
        insertTennis(db,"What is Nadal's favourite surface?","Clay","Grass","Hard","All",1,-1);
        insertTennis(db,"Which Grand Slam Nadal has won the most?","French Open","Wimbledon","Australia Open","US Open",1,-1);
        insertTennis(db,"Where did Murray win Olympic Gold in 2012?","Wimbledon","Queen's Club","The O2","Braehead Arena",1,-1);
        insertTennis(db,"Who did Murray beat in the 2012 Olympic final?","Roger Federer","Novak Djokovic","Juan Martin","Stan Wawrinka",1,-1);
        insertTennis(db,"How many singles titles has he won?","35","27","53","48",1,-1);
        insertTennis(db,"How many times has Andy won the Queen's Club Championships?","4","1","5","3",1,-1);
        insertTennis(db,"Where is Maria Sharapova from?","","","","",1,-1);
        insertTennis(db,"How many Grand Slams has Maria Sharapova won?","Russia","France","Canada","America",1,-1);
        insertTennis(db,"How many grand slams has Maria Sharapova won?","5","6","3","2",1,-1);
        insertTennis(db,"How many majors (singles) Venus Williams won?","7","10","5","8",1,-1);
        insertTennis(db,"How many times Venus Williams has reached the finals of the Australia Open?","1","4","2","0",1,-1);
        insertTennis(db,"What country has Venus Williams not won a title in?","Russia","UAE","Germany","Switzerland",1,-1);
        insertTennis(db,"What is Venus Williams' highest world ranking?","1","4","5","2",1,-1);
        insertTennis(db,"How many times has Venus won the women's singles titles at Wimbledon?","5","4","6","3",1,-1);
        insertTennis(db,"What is shouted if the ball lands outside the permitted playing area?","Offside","Outside","Onside","Foul",1,-1);
        insertTennis(db,"What was the highest singles ranking of Pete Sampras?","1","4","3","6",1,-1);
        insertTennis(db,"Who broke Margaret Cuorts record for wins at the Australian Open in 2014?","Serena Williams","Dominika Cibulkova","Maria Sharapova","Petra Kvitova",1,-1);
        insertTennis(db,"What major title did Pete Sampras never win?","French Open","Wimbledon","Australia Open","US Open",1,-1);
        insertTennis(db,"In what year did Gustavo Kuerten first win the French Open men's singles?","1997","2002","1987","1992",1,-1);
        insertTennis(db,"Who announced her retirement from Tennis in 2014?","Li Na","Maria Sharapova","Petra Kvitova","Dominika Cibulkova",1,-1);
        insertTennis(db,"What nationality was tennis Grand Slam winner Lew Hoad?","Australian","Russian","Chinese","American",1,-1);
        insertTennis(db,"On what surface is the French Open singles played?","Clay","Sand","Hard Court","Grass",1,-1);
        insertTennis(db,"Playing on clay, what Spaniard won the 2007 Battle of the Surfaces against Roger Federer who was playing on grass?","Rafael Nadal","Gaston Gaudio","Mariana Puerta","Juan Carlo",1,-1);
        insertTennis(db,"Who did Maria Sharapova lose to in the French Open in 2006?","Dinara Safina","Mashona Washington","Martina Hingls","Alicia Molik",1,-1);
        insertTennis(db,"At what event do winning women get a sterling silver tray called the Rosewater Dish?","Wimbledon","LPGA Championship","Masters","US Open",1,-1);
        insertTennis(db,"Who won the Women's 2014 US Open?","Serena Williams","Maria Sharapova","Petra Kvitova","Dominikia Cibulkova",1,-1);
        insertTennis(db,"Who won all 4 Grand Slam and Olympic Gold singles titles in 1988?","Steffi Graf","Monica Seles","Helena Sukova","Martina Navratilova",1,-1);
        insertTennis(db,"How many Grand Slam singles titles were won by Andy Roddick?","1","11","5","8",1,-1);
        insertTennis(db,"What nationality was Tennis Grand Slam winner Fred Perry?","English","Italian","Ukranian","Brazilian",1,-1);
        insertTennis(db,"The Australian Open tournament 2015 took place in which ground?","Melbourne park","Queensland Centre","Eastcourts Club","Orange Indoor Centre",1,-1);
        insertTennis(db,"Who was the winner of men's singles in Australian Open tennis tournament 2015?","Novak Djokovic","Roger Federer","Rafael Nadal","Andy Murray",1,-1);
        insertTennis(db,"Which surface is the Wimbledon Championships played on?","Grass","Wood","Clay","Hard Court",1,-1);
        insertTennis(db,"What nationality is 2001 Mens Singles champion Goran Ivanisevic?","Croatian","French","Russian","Polish",1,-1);
        insertTennis(db,"In which country was Mc Enroe born?","West Germany","France","Great Britain","USA",1,-1);
        insertTennis(db,"What was the score in the final set of the epic John Isner - Nicolas Mahut match in 2010?","70-68","60-58","64-62","76-74",1,-1);
        insertTennis(db,"What nationality is Jan Kodes, who won the Mens Singles Championship in 1973?","Czech","Polish","Bulgarian","Russian",1,-1);
        insertTennis(db,"Who won the first Australian Open women's singles title?","Margaret Molesworth","Maud Watson","Suzanne Lenglen","Ellen Hansell",1,-1);
        insertTennis(db,"Which Tennis Player's nickname was 'Rocket'?","Rod Laver","Fred Perry","Pete Sampras","John Newcombe",1,-1);
        insertTennis(db,"How many Grand Slams are played in the northern hemisphere?","3","1","2","4",1,-1);
        insertTennis(db,"Sania Mirza's successful run at US open 2005 was ended by _____?","Maria Sharapova","Serena Williams","Venus Williams","Kim Clijsters",1,-1);
        insertTennis(db,"Residence of Sania Mirza is _________","Hyderabad","Mumbai","Lahore","Sialkot",1,-1);
        insertTennis(db,"Which was her maiden name and alone singles title?","Hyderabad Open","Bank of West Classics","Sunfeast Open","Accura Classics",1,-1);
        insertTennis(db,"Overall titles of Sania Mirza is ________","53","31","48","39",1,-1);
        insertTennis(db,"Sania Mirza's highest ranking is __________?","27","19","17","29",1,-1);
        insertTennis(db,"Which Taipei player partenered Sania Mirza in both WTA and ITF circuit?","Su-Wei Hsieh","Na Li","Yung-Jan Chan","Ai- Sugiyama",1,-1);



        insertAnagrams(db, "Rearrange the letters to form a meaningful word\ng a m a r a n m", "No meaningful word", "angram", "anagram", "gramana",1,-1);
        insertAnagrams(db,"This is what you do when you write on something....","Mark","Mathew","Joe","Jane",1,-1);
        insertAnagrams(db,"Sage,cumin,garlic and thyme are all one of the following names.","Herb","Linus","Brady","Winston",1,-1);
        insertAnagrams(db,"Arrange the letters of the following wordds....\nQIULID","Liquid","Inside","Sodium","Double",1,-1);
        insertAnagrams(db,"Arrange the letters of the following word.....\nOFEFR","Offer","Often","Force","Fewer",1,-1);
        insertAnagrams(db,"Arrange the letters of the following word.....\nPOTURSP","Support","Tourism","Suppose","Purpose",1,-1);
        insertAnagrams(db,"Arrange the letters of the following word.....\nFHNCRE","French","Change","Chance","Frozen",1,-1);
        insertAnagrams(db,"Arrange the letters of the following word.....\nHLRASO","No meaningful word","Scholar","Stalker","School",1,-1);
        insertAnagrams(db,"Arrange the letters of the following word.....\nNWGIRA","No meaningful word","Warning","Walking","Drawing",1,-1);
        insertAnagrams(db,"Arrange the letters of the following word.....\nAEXMPLE","Example","No meaningful word","Explain","Explore",1,-1);
        insertAnagrams(db,"Arrange the letters of the following word.....\nIEGLNRA","No meaningful word","Learning","Earnings","Internal",1,-1);
        insertAnagrams(db,"Which word means 'a group of persons hired to applaud an act or performers'","Claque","Clappers","Cheerleaders","Cheerers",1,-1);
        insertAnagrams(db,"Which word means 'a system of Japanese writing using Chinese-derived charactes'","Kanji","Perkin","Perigee","Thiller",1,-1);
        insertAnagrams(db,"Which word means 'to cloud over; becloud; obscure'?","Obnubilate","Palpate","Nim","Nidge",1,-1);
        insertAnagrams(db,"Which word means 'Abnormal or inappropriate appetite, especially a craving for items unsuitable as food'?","Parorexia","Zenana","Trishatha","Valonia",1,-1);
        insertAnagrams(db,"Which word means 'Anger; wrath; scorn'?","Grame","Cacolet","Herdwick","Greegree",1,-1);
        insertAnagrams(db,"Which word means 'the quality that makes a thing what it is; the essential nature of a thing'?","Quiddity","Procacity","Procerity","Quaintise",1,-1);
        insertAnagrams(db,"Which word means 'the reverting of property to the state when there is a failure of persons legally qualified to inherit.'","Escheat","Feuage","Febrifuge","Famulus",1,-1);
        insertAnagrams(db,"What is a sentence that is a question?","Interrogative","Imperaive","Exclamatory","Declarative",1,-1);
        insertAnagrams(db,"What is a spoken interaction involving more than one person?","Dialogue","Creole","Standard English","A phrase",1,-1);
        insertAnagrams(db,"What is a noun?","All of them","Idea","Place","Person",1,-1);
        insertAnagrams(db,"What occurs when words are combined to form a single shortened word? E.g. 'we've' from 'we have'.","Contraction","Preposition","Intertextuality","Euphemism",1,-1);
        insertAnagrams(db,"What is a sentence containing a main clause and one or more clauses of lesser importance?","Complex sentence","Compound sentence","Simple sentence","Imperative sentence",1,-1);
        insertAnagrams(db,"What is the technical language of a certain occupation?","Jargon","A semantic field","a lexical field","A modifier",1,-1);
        insertAnagrams(db,"What occurs when a words' meaning is extended; the word retains its old meaningbut takes on one or more added meanings as well?","Broadening","Modifying","Graphology","Contracting",1,-1);
        insertAnagrams(db,"What is a group of letters commonly found at the beginning of words? E.g. re- and un-","A prefix","A gerand","A suffix","An affix",1,-1);
        insertAnagrams(db,"What is the accepted vocabulary and grammatical constructions of educated 'correct' English?","Standard English","Dialect","Slang","Estuary English",1,-1);
        insertAnagrams(db,"What is a sentence that ends with an exclamation mark?","Exclamatory sentence","Imperative sentence","Interrogative sentence","Single sentence",1,-1);
        insertAnagrams(db,"What does this describe- 'How words are built using prefixes, suffixes and roots. How new words form and develop roots.'?","Morphology","Grammar","Semantics","Pragmatics",1,-1);
        insertAnagrams(db,"What occurs when a conversation returns to an earlier topic?","A topic loop","A repair","An overlap","A false start",1,-1);
        insertAnagrams(db,"What is a question attached to the end of a statement? E.g. 'it's cold, isn't it?'","Tag question","Rhetorical question","Sarcasm","Leading question",1,-1);
        insertAnagrams(db,"What is an adjective that makes a comparison, usually endig in -er? E.g. ' colder' and 'faster'.","Comparative","Comparlative","Spuerlative","Jargon",1,-1);
        insertAnagrams(db,"What is a verb?","A doing word","A word before noun","Person, place, thing","Word that joins clauses",1,-1);
        insertAnagrams(db,"Give an example of a first person singular subject pronoun?","I","You","Us","It",1,-1);
        insertAnagrams(db,"What is an adjective?","A describing word","Word that joins clauses","Person, place, thing","A doing word",1,-1);
        insertAnagrams(db,"What are gestures and accompanying facial expressions which contribute to the communication of meanings in speech?","Paralinguistic features","Pre-modifying features","Modifying features","Non-fluency features",1,-1);
        insertAnagrams(db,"What is the smallest unit of sound in a language?","Phoneme","Phrase","Word","Lexis",1,-1);
        insertAnagrams(db,"What are mental verbs?","Thought of sppech(emotions)","Actions and events","Ways of acting","States of being",1,-1);
        insertAnagrams(db,"What is it called when two words are joined together?","Compounding","Merging","Combining","Blending",1,-1);
        insertAnagrams(db,"Something that is foolish, unreasonable or ridiculous....","Ludicrous","Whisper","Cringe","Dupe",1,-1);
        insertAnagrams(db,"Deterrent most nearly means....","Discouragement","Compliance","Preeminence","Advocate",1,-1);
        insertAnagrams(db,"Caution most nearly means....","Circumspection","Idea","Quiz","Catch",1,-1);
        insertAnagrams(db,"Insouciance most nearly means.....","Indifference","Imperative","Intellect","Identical",1,-1);
        insertAnagrams(db,"Compensation means the same as.....","Repatriation","Conclude","Wave","Patriotism",1,-1);
        insertAnagrams(db,"Dogmatic most nearly means.....","Assertive","Pattern","Canine","Model",1,-1);
        insertAnagrams(db,"The best definition for Fruition is....","Completion","Operation","Wisdom","Maggot",1,-1);
        insertAnagrams(db,"Aforementioned most nearly means....","Forenamed","Exotic","Contentment","Elegance",1,-1);
        insertAnagrams(db,"Noble most nearly means.....","Aristocratic","Wimp","Loose","Comely",1,-1);
        insertAnagrams(db,"Foolish most nearly means.....","Asinine","Eager","Ravishing","Associated",1,-1);
        insertAnagrams(db,"Denigrate most nearly means....","All of these","Disparage","Belittle","Decry",1,-1);
        insertAnagrams(db,"What is the word describing: Relating to or requiring little moisture....","Xeric","Fuzzle","Thread","Volt",1,-1);
        insertAnagrams(db,"Choose the correct word: 'I really can't believe we're talking about the","Weather","Wether","Whither","Whether",1,-1);
        insertAnagrams(db,"Choose the correct word: There is a motion _______ on the alarm.","sensor","censure","sensure","scent",1,-1);
        insertAnagrams(db,"Name the punctuation mark: /","Slash","Backslash","Sideways smile","Diagonal",1,-1);
        insertAnagrams(db,"Which of the following is the correct contraction of the phrase, 'She would'?","She'd","She'ld","She'did","She will",1,-1);
        insertAnagrams(db,"________ happened to the Spice Girls, anyway?","Whatever","Whoever","Whenever","Whichever",1,-1);
        insertAnagrams(db,"Choose the correct word: She _______ her glasses down and lost them.","laid","lay","lie","lain",1,-1);
        insertAnagrams(db,"'I don't want to see the movie.' What is the correct reply?","Neither do I","I don't want to, either","So do I","Don't want to, too",1,-1);
        insertAnagrams(db,"Which of the folloeing is not a first-person pronoun?","They","Ours","Me","I",1,-1);
        insertAnagrams(db,"____ 200 soldiers on the hill, which is more _______ we expected.","There are; than","There's; than","There are; then","There's; then",1,-1);
        insertAnagrams(db,"What is the plural form of the word 'phenomenon'?","Phenomena","Phenomenas","Phenom","Phenomenons",1,-1);


        insertBasicmaths(db,"12 - 22 - 10 + 23","3","-1","0","4",1,-1);
        insertBasicmaths(db,"158=___ + 106.What number will come in the blank to make the number sentence true?","52","158","152","264",1,-1);
        insertBasicmaths(db,"An angle less than 90 degrees is called?","Acute angle","Obtuse angle","Hypotenuse","Right angle",1,-1);
        insertBasicmaths(db,"Faizal has 918 marbles. he wants to make packets of marbles, with 9 marbles in each packet. how many packets will he be able to make?","102","12","120","132",1,-1);
        insertBasicmaths(db,"Which of these  lies between 6.3 and 6.6? ","Multiple Answers","6.29999","6.301","6.5999",1,-1);
        insertBasicmaths(db,"After giving 3 toffees each to 15 students who had completed their assignments, she has 60 toffees left with her. how many toffees did she bring to the class?","105","78","45","15",1,-1);
        insertBasicmaths(db,"Which of these numbers has only two factors, 1 and the number itself?","None of these","38+1","37+37","37 * 37",1,-1);
        insertBasicmaths(db,"Meena divides a number by 2. she then divides the answer by 2. this is the same as dividing the orginal number by...","4","2","Cant be said","8",1,-1);
        insertBasicmaths(db,"John has stamps of different countries. 1/3rd of them are India stamps. if he has 36 Indian stamps, how many stamps does he have in total?","108","48","36","12",1,-1);
        insertBasicmaths(db,"1024+1025+___=1025+1025+1025. What number will come in the blank to make the number sentence true?","1026","1025","1024","1027",1,-1);
        insertBasicmaths(db,"Minu has bought 6 pens. The cost of each pen was between Rs.25 and Rs. 30. Which of these could be the total cost of the pens?","Rs 173","Rs 80","Rs 90","Rs 192",1,-1);
        insertBasicmaths(db,"Solve for x. 2x + 5 = 11","3","6","7/2","11/5",1,-1);
        insertBasicmaths(db,"Simplify the following: (12ab)/(4a)","3b","4a","ab","48a^2b",1,-1);
        insertBasicmaths(db,"Add each digit in the following 2-digit numbers. Which one equals 9?","None of above","23","53","44",1,-1);
        insertBasicmaths(db,"Find the 3-digit number in which the 3 digits add up to 8.","341","214","441","None of above",1,-1);
        insertBasicmaths(db,"80% can be expressed in fraction as....?","4/5","5/4","3/5","5/6",1,-1);
        insertBasicmaths(db,"The probability of getting a prime number, when a dice is rolled....","1/2","1/3","1/4","1/6",1,-1);
        insertBasicmaths(db,"3x-(4x+6) is equal to ","-x-24","x+6","7x+6","-7x-24",1,-1);
        insertBasicmaths(db,"12+12-(2+2)","20","24","22","18",1,-1);
        insertBasicmaths(db,"A scale model for a car is 8 cm long. if 2 cm represents 3 metres, what is the actual length of the car?","12 m","14 m","8 m","10 m",1,-1);
        insertBasicmaths(db,"Subtract 100003 from 5375468","5365465","5365464","5365455","5365466",1,-1);
        insertBasicmaths(db,"360/10+4","40","60","50","42",1,-1);
        insertBasicmaths(db,"1+2+3+4+5","15","12","14","20",1,-1);
        insertBasicmaths(db,"4,8,12,?","16","10","14","20",1,-1);
        insertBasicmaths(db,"the value of(2^6)/(2^3)","8","2","16","4",1,-1);
        insertBasicmaths(db,"The six digit number 4m61n2 is divible by both 11 & 4. The number of different combinations of m & n that satisfy the condition....","6","4","3","5",1,-1);
        insertBasicmaths(db,"If I rolled a coin, what are the chances of a head as outcome?","1/2","1/4","1/3","2/3",1,-1);
        insertBasicmaths(db,"The result of(-100)/((-164)-(-184)) is","5","-4","4","5",1,-1);
        insertBasicmaths(db,"x^2-16=0","-4 & 4","-4","4","8",1,-1);
        insertBasicmaths(db,"In 3^n, n is known as....","variable","base","consonant","case",1,-1);
        insertBasicmaths(db,"A man takes 30 minutes to reach his office, which is 2km from the starting point. Find his speed","4 km/h","8km/hr","6 km/hr","2 km/hr",1,-1);
        insertBasicmaths(db,"In how many ways can you arrange 4 different books in a shelf?","24","12","4","8",1,-1);
        insertBasicmaths(db,"For a fixed base 10, if the exponent decreases by 1, the number changes by what compared to its original value?","1/10 times","100 times","100 times","dosent change",1,-1);
        insertBasicmaths(db,"What is the value of log(2^20)/log(2^40)","1/2","1/3","3","2",1,-1);
        insertBasicmaths(db,"3,6,9,12,?","15","21","14","18",1,-1);
        insertBasicmaths(db,"What is the suitable soltion of this inequality 6x<30","x<5","x<7","x>5","x=5",1,-1);
        insertBasicmaths(db,"Two adjacent angles of a parallelogram are (2m + 25) degrees and (3m - 5) degrees. The value of m is...","32","36","42","28",1,-1);
        insertBasicmaths(db,"100-99+65","66","77","67","68",1,-1);
        insertBasicmaths(db,"A man's pay is $3/hour up to 40 hours. Overtime is twice the payment of regular time. If he was pais $168, find overtime hours....","8","6","16","4",1,-1);
        insertBasicmaths(db,"6,12,18,____?","24","20","36","30",1,-1);
        insertBasicmaths(db,"Look at this series: 58, 52, 46, 40, 34,... What number should come next?","28","32","30","26",1,-1);
        insertBasicmaths(db,"A is two years older than B who is twice as old as C. If the total of the ages of A, B and C be 27, then how old is B?","10","12","8","6",1,-1);
        insertBasicmaths(db,"Which of these gets you a positive?","-2 * -10","-3 * 8","18 * -1","67 * -4",1,-1);
        insertBasicmaths(db,"If a man bought a company for 7.2 million dollars and sold it for 8.6 million dollars, what would be his profit?","$1.4 million","$800,000","$1.2 million","$600,000",1,-1);
        insertBasicmaths(db,"What do you get by adding 240 to the square root of 144?","248","252","244","256",1,-1);
        insertBasicmaths(db,"If a stock started at $103 and went up 15%. What will be the new stock price?","$118.45","$112.45","$124.45","$130.45",1,-1);
        insertBasicmaths(db,"The second richest person at a town has $8.8 million. The richest person has $3.3 million more. How rich is the richest person?","$12.1 million","$11.6 million","$12.6 million","$11.8 million",1,-1);
        insertBasicmaths(db,"If in a game you get $5 per kill and an extra $2 for each kill you get above 3, how much money do you get after 5 kills?","$29","$25","$27","$21",1,-1);
        insertBasicmaths(db,"What is the cube of 5?","125","75","25","625",1,-1);
        insertBasicmaths(db,"What is a negative multiplied by a negative multiplied by a positive?","Positive, then Positive","Negative, then Negative","Positive, then Negative","Negative, then Negative",1,-1);
        insertBasicmaths(db,"If x=3, what is 2x+8-3x?","5","4","3","6",1,-1);
        insertBasicmaths(db,"If x=4 and y=2, what is 3x+3y-2x?","10","6","18","8",1,-1);
        insertBasicmaths(db,"If you get $35 an hour, how much money do you get in 4.5 hours?","$157.50","$172.25","$148.45","$136.05",1,-1);
        insertBasicmaths(db,"What is the square root of 196?","14","16","13","15",1,-1);
        insertBasicmaths(db,"If a=1, b=2 and c=3, what is 2a+2b+2c?","11","12","9","10",1,-1);
        insertBasicmaths(db,"When (1/3)*(1/2) is divided by (1/3), what is the result obtained?","1/2","1/4","1/6","1/3",1,-1);
        insertBasicmaths(db,"What is 70% of 180?","126","130","128","124",1,-1);
        insertBasicmaths(db,"One hectare is equivalent to?","10,000 sq metres","1,000 sq metres","100 sq metres","1,000 sq metres",1,-1);
        insertBasicmaths(db,"Which of the following is not a prime number?","Multiple Answers","369","21","41",1,-1);
        insertBasicmaths(db,"The number of whole numbers that lie between (4^2) and (4^3) is:","47","49","46","45",1,-1);
    }

    public void onUpgrade(SQLiteDatabase db,int oldversion,int newversion)
    {
    }

    public void insertQuiz_topics(SQLiteDatabase db,String topic, int completion,int total,int img_res)
    {
        ContentValues quizzer=new ContentValues();
        quizzer.put("TOPIC",topic);
        quizzer.put("COMPLETION",completion);
        quizzer.put("TOTAL",total);
        quizzer.put("IMG_RESOURCE",img_res);
        db.insert("'Quiz_topics'",null,quizzer);
    }

    public void insertPolitics(SQLiteDatabase db, String Question, String Correct, String option_1,String option_2,String option_3, int priority, int img_res)
    {
        ContentValues quizzer=new ContentValues();
        quizzer.put("QUESTION",Question);
        quizzer.put("CORRECT_ANSWER",Correct);
        quizzer.put("OPTION_1",option_1);
        quizzer.put("OPTION_2",option_2);
        quizzer.put("OPTION_3",option_3);
        quizzer.put("PRIORITY",priority);
        quizzer.put("IMG_RESOURCE",img_res);
        db.insert("'Politics'",null,quizzer);

    }
    public void insertLeaders(SQLiteDatabase db, String Question, String Correct, String option_1,String option_2,String option_3, int priority, int img_res)
    {
        ContentValues quizzer=new ContentValues();
        quizzer.put("QUESTION",Question);
        quizzer.put("CORRECT_ANSWER",Correct);
        quizzer.put("OPTION_1",option_1);
        quizzer.put("OPTION_2",option_2);
        quizzer.put("OPTION_3",option_3);
        quizzer.put("PRIORITY",priority);
        quizzer.put("IMG_RESOURCE",img_res);
        db.insert("'World leaders'",null,quizzer);
    }
    public void insertMap(SQLiteDatabase db, String Question, String Correct, String option_1,String option_2,String option_3, int priority, int img_res)
    {
        ContentValues quizzer=new ContentValues();
        quizzer.put("QUESTION",Question);
        quizzer.put("CORRECT_ANSWER",Correct);
        quizzer.put("OPTION_1",option_1);
        quizzer.put("OPTION_2",option_2);
        quizzer.put("OPTION_3",option_3);
        quizzer.put("PRIORITY",priority);
        quizzer.put("IMG_RESOURCE",img_res);
        db.insert("'Map Freaks'",null,quizzer);
    }
    public void insertIQ(SQLiteDatabase db, String Question, String Correct, String option_1,String option_2,String option_3, int priority, int img_res)
    {
        ContentValues quizzer=new ContentValues();
        quizzer.put("QUESTION",Question);
        quizzer.put("CORRECT_ANSWER",Correct);
        quizzer.put("OPTION_1",option_1);
        quizzer.put("OPTION_2",option_2);
        quizzer.put("OPTION_3",option_3);
        quizzer.put("PRIORITY",priority);
        quizzer.put("IMG_RESOURCE",img_res);
        db.insert("'IQ Test'",null,quizzer);
    }
    public void insertPhysics(SQLiteDatabase db, String Question, String Correct, String option_1,String option_2,String option_3, int priority, int img_res)
    {
        ContentValues quizzer=new ContentValues();
        quizzer.put("QUESTION",Question);
        quizzer.put("CORRECT_ANSWER",Correct);
        quizzer.put("OPTION_1",option_1);
        quizzer.put("OPTION_2",option_2);
        quizzer.put("OPTION_3",option_3);
        quizzer.put("PRIORITY",priority);
        quizzer.put("IMG_RESOURCE",img_res);
        db.insert("'Physics'",null,quizzer);
    }
    public void insertMaths(SQLiteDatabase db, String Question, String Correct, String option_1,String option_2,String option_3, int priority, int img_res)
    {
        ContentValues quizzer=new ContentValues();
        quizzer.put("QUESTION",Question);
        quizzer.put("CORRECT_ANSWER",Correct);
        quizzer.put("OPTION_1",option_1);
        quizzer.put("OPTION_2",option_2);
        quizzer.put("OPTION_3",option_3);
        quizzer.put("PRIORITY",priority);
        quizzer.put("IMG_RESOURCE",img_res);
        db.insert("'Maths'",null,quizzer);
    }
    public void insertAstronomy(SQLiteDatabase db, String Question, String Correct, String option_1,String option_2,String option_3, int priority, int img_res)
    {
        ContentValues quizzer=new ContentValues();
        quizzer.put("QUESTION",Question);
        quizzer.put("CORRECT_ANSWER",Correct);
        quizzer.put("OPTION_1",option_1);
        quizzer.put("OPTION_2",option_2);
        quizzer.put("OPTION_3",option_3);
        quizzer.put("PRIORITY",priority);
        quizzer.put("IMG_RESOURCE",img_res);
        db.insert("'Astronomy'",null,quizzer);
    }
    public void insertComputer(SQLiteDatabase db, String Question, String Correct, String option_1,String option_2,String option_3, int priority, int img_res)
    {
        ContentValues quizzer=new ContentValues();
        quizzer.put("QUESTION",Question);
        quizzer.put("CORRECT_ANSWER",Correct);
        quizzer.put("OPTION_1",option_1);
        quizzer.put("OPTION_2",option_2);
        quizzer.put("OPTION_3",option_3);
        quizzer.put("PRIORITY",priority);
        quizzer.put("IMG_RESOURCE",img_res);
        db.insert("'Computer'",null,quizzer);
    }
    public void insertPottermore(SQLiteDatabase db, String Question, String Correct, String option_1,String option_2,String option_3, int priority, int img_res)
    {
        ContentValues quizzer=new ContentValues();
        quizzer.put("QUESTION",Question);
        quizzer.put("CORRECT_ANSWER",Correct);
        quizzer.put("OPTION_1",option_1);
        quizzer.put("OPTION_2",option_2);
        quizzer.put("OPTION_3",option_3);
        quizzer.put("PRIORITY",priority);
        quizzer.put("IMG_RESOURCE",img_res);
        db.insert("'Pottermore'",null,quizzer);
    }
    public void insertHollywood(SQLiteDatabase db, String Question, String Correct, String option_1,String option_2,String option_3, int priority, int img_res)
    {
        ContentValues quizzer=new ContentValues();
        quizzer.put("QUESTION",Question);
        quizzer.put("CORRECT_ANSWER",Correct);
        quizzer.put("OPTION_1",option_1);
        quizzer.put("OPTION_2",option_2);
        quizzer.put("OPTION_3",option_3);
        quizzer.put("PRIORITY",priority);
        quizzer.put("IMG_RESOURCE",img_res);
        db.insert("'Hollywood'",null,quizzer);
    }

    public void insertSherlock(SQLiteDatabase db, String Question, String Correct, String option_1,String option_2,String option_3, int priority, int img_res)
    {
        ContentValues quizzer=new ContentValues();
        quizzer.put("QUESTION",Question);
        quizzer.put("CORRECT_ANSWER",Correct);
        quizzer.put("OPTION_1",option_1);
        quizzer.put("OPTION_2",option_2);
        quizzer.put("OPTION_3",option_3);
        quizzer.put("PRIORITY",priority);
        quizzer.put("IMG_RESOURCE",img_res);
        db.insert("'Sherlock'",null,quizzer);
    }

    public void insertBreakingBad(SQLiteDatabase db, String Question, String Correct, String option_1,String option_2,String option_3, int priority, int img_res)
    {
        ContentValues quizzer=new ContentValues();
        quizzer.put("QUESTION",Question);
        quizzer.put("CORRECT_ANSWER",Correct);
        quizzer.put("OPTION_1",option_1);
        quizzer.put("OPTION_2",option_2);
        quizzer.put("OPTION_3",option_3);
        quizzer.put("PRIORITY",priority);
        quizzer.put("IMG_RESOURCE",img_res);
        db.insert("'Breaking Bad'",null,quizzer);
    }
    public void insertGameofThrones(SQLiteDatabase db, String Question, String Correct, String option_1,String option_2,String option_3, int priority, int img_res)
    {
        ContentValues quizzer=new ContentValues();
        quizzer.put("QUESTION",Question);
        quizzer.put("CORRECT_ANSWER",Correct);
        quizzer.put("OPTION_1",option_1);
        quizzer.put("OPTION_2",option_2);
        quizzer.put("OPTION_3",option_3);
        quizzer.put("PRIORITY",priority);
        quizzer.put("IMG_RESOURCE",img_res);
        db.insert("'Game of Thrones'",null,quizzer);
    }
    public void insertSuits(SQLiteDatabase db, String Question, String Correct, String option_1,String option_2,String option_3, int priority, int img_res)
    {
        ContentValues quizzer=new ContentValues();
        quizzer.put("QUESTION",Question);
        quizzer.put("CORRECT_ANSWER",Correct);
        quizzer.put("OPTION_1",option_1);
        quizzer.put("OPTION_2",option_2);
        quizzer.put("OPTION_3",option_3);
        quizzer.put("PRIORITY",priority);
        quizzer.put("IMG_RESOURCE",img_res);
        db.insert("'Suits'",null,quizzer);
    }
    public void insertHouse(SQLiteDatabase db, String Question, String Correct, String option_1,String option_2,String option_3, int priority, int img_res)
    {
        ContentValues quizzer=new ContentValues();
        quizzer.put("QUESTION",Question);
        quizzer.put("CORRECT_ANSWER",Correct);
        quizzer.put("OPTION_1",option_1);
        quizzer.put("OPTION_2",option_2);
        quizzer.put("OPTION_3",option_3);
        quizzer.put("PRIORITY",priority);
        quizzer.put("IMG_RESOURCE",img_res);
        db.insert("'House'",null,quizzer);
    }
    public void insertFootball(SQLiteDatabase db, String Question, String Correct, String option_1,String option_2,String option_3, int priority, int img_res)
    {
        ContentValues quizzer=new ContentValues();
        quizzer.put("QUESTION",Question);
        quizzer.put("CORRECT_ANSWER",Correct);
        quizzer.put("OPTION_1",option_1);
        quizzer.put("OPTION_2",option_2);
        quizzer.put("OPTION_3",option_3);
        quizzer.put("PRIORITY",priority);
        quizzer.put("IMG_RESOURCE",img_res);
        db.insert("'Football'",null,quizzer);
    }
    public void insertCricket(SQLiteDatabase db, String Question, String Correct, String option_1,String option_2,String option_3, int priority, int img_res)
    {
        ContentValues quizzer=new ContentValues();
        quizzer.put("QUESTION",Question);
        quizzer.put("CORRECT_ANSWER",Correct);
        quizzer.put("OPTION_1",option_1);
        quizzer.put("OPTION_2",option_2);
        quizzer.put("OPTION_3",option_3);
        quizzer.put("PRIORITY",priority);
        quizzer.put("IMG_RESOURCE",img_res);
        db.insert("'Cricket'",null,quizzer);
    }
    public void insertTennis(SQLiteDatabase db, String Question, String Correct, String option_1,String option_2,String option_3, int priority, int img_res)
    {
        ContentValues quizzer=new ContentValues();
        quizzer.put("QUESTION",Question);
        quizzer.put("CORRECT_ANSWER",Correct);
        quizzer.put("OPTION_1",option_1);
        quizzer.put("OPTION_2",option_2);
        quizzer.put("OPTION_3",option_3);
        quizzer.put("PRIORITY",priority);
        quizzer.put("IMG_RESOURCE",img_res);
        db.insert("'Tennis'",null,quizzer);
    }
    public void insertAnagrams(SQLiteDatabase db, String Question, String Correct, String option_1,String option_2,String option_3, int priority, int img_res)
    {
        ContentValues quizzer=new ContentValues();
        quizzer.put("QUESTION",Question);
        quizzer.put("CORRECT_ANSWER",Correct);
        quizzer.put("OPTION_1",option_1);
        quizzer.put("OPTION_2",option_2);
        quizzer.put("OPTION_3",option_3);
        quizzer.put("PRIORITY",priority);
        quizzer.put("IMG_RESOURCE",img_res);
        db.insert("'Word Play'",null,quizzer);
    }
    public void insertBasicmaths(SQLiteDatabase db, String Question, String Correct, String option_1,String option_2,String option_3, int priority, int img_res)
    {
        ContentValues quizzer=new ContentValues();
        quizzer.put("QUESTION",Question);
        quizzer.put("CORRECT_ANSWER",Correct);
        quizzer.put("OPTION_1",option_1);
        quizzer.put("OPTION_2",option_2);
        quizzer.put("OPTION_3",option_3);
        quizzer.put("PRIORITY",priority);
        quizzer.put("IMG_RESOURCE",img_res);
        db.insert("'Basic Maths'",null,quizzer);
    }
}

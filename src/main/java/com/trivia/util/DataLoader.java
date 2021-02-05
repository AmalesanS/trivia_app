package com.trivia.util;

import com.trivia.model.Answer;
import com.trivia.model.Question;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import com.trivia.repository.AnswerRepository;
import com.trivia.repository.QuestionRepository;

@Component
public class DataLoader implements ApplicationRunner {

  private QuestionRepository questionRepository;

  private AnswerRepository answerRepository;

  public DataLoader(QuestionRepository questionRepository, AnswerRepository answerRepository) {
    this.questionRepository = questionRepository;
    this.answerRepository = answerRepository;
  }

  public void run(ApplicationArguments args) {
    saveQuestion1();
    saveQuestion2();
    saveQuestion3();
    saveQuestion4();
    saveQuestion5();
    saveQuestion6();
    saveQuestion7();
    saveQuestion8();
    saveQuestion9();
    saveQuestion10();
    saveQuestion11();
    saveQuestion12();
    saveQuestion13();
    saveQuestion14();
    saveQuestion15();
    saveQuestion16();
    saveQuestion17();
    saveQuestion18();
    saveQuestion19();
    saveQuestion20();
    saveQuestion21();
    saveQuestion22();
    saveQuestion23();
    saveQuestion24();
    saveQuestion25();
    saveQuestion26();
    saveQuestion27();
    saveQuestion28();
    saveQuestion29();
    saveQuestion30();
    saveQuestion31();
    saveQuestion32();
    saveQuestion33();
    saveQuestion34();
    saveQuestion35();
    saveQuestion36();
    saveQuestion37();
    saveQuestion38();
    saveQuestion39();
    saveQuestion40();
    saveQuestion41();
    saveQuestion42();
    saveQuestion43();
    saveQuestion44();
    saveQuestion45();
    saveQuestion46();
    saveQuestion47();
    saveQuestion48();
    saveQuestion49();
    saveQuestion50();
    saveQuestion51();
    saveQuestion52();
    saveQuestion53();
    saveQuestion54();
    saveQuestion55();
    saveQuestion56();
    saveQuestion57();
    saveQuestion58();
    saveQuestion59();
    saveQuestion60();
    saveQuestion61();
    saveQuestion62();
    saveQuestion63();
    saveQuestion64();
    saveQuestion65();
    saveQuestion66();
    saveQuestion67();
    saveQuestion68();
    saveQuestion69();
    saveQuestion70();
    saveQuestion71();
    saveQuestion72();
    saveQuestion73();
    saveQuestion74();
    saveQuestion75();
    saveQuestion76();
    saveQuestion77();
    saveQuestion78();
    saveQuestion79();
    saveQuestion80();
    saveQuestion81();
    saveQuestion82();
    saveQuestion83();
    saveQuestion84();
    saveQuestion85();
    saveQuestion86();
    saveQuestion87();
    saveQuestion88();
    saveQuestion89();
    saveQuestion90();
    saveQuestion91();
    saveQuestion92();
    saveQuestion93();
    saveQuestion94();
    saveQuestion95();
    saveQuestion96();
    saveQuestion97();
    saveQuestion98();
    saveQuestion99();
    saveQuestion100();
    saveQuestion101();
    saveQuestion102();
    saveQuestion103();
    saveQuestion104();
    saveQuestion105();
    saveQuestion106();
    saveQuestion107();
    saveQuestion108();
    saveQuestion109();
    saveQuestion110();
    saveQuestion111();
    saveQuestion112();
    saveQuestion113();
    saveQuestion114();
    saveQuestion115();
    saveQuestion116();
    saveQuestion117();
    saveQuestion118();
    saveQuestion119();
    saveQuestion120();
    saveQuestion121();
    saveQuestion122();
    saveQuestion123();
    saveQuestion124();
    saveQuestion125();
    saveQuestion126();
    saveQuestion127();
    saveQuestion128();
    saveQuestion129();
    saveQuestion130();
    saveQuestion131();
    saveQuestion132();
    saveQuestion133();
    saveQuestion134();
    saveQuestion135();
    saveQuestion136();
    saveQuestion137();
    saveQuestion138();
    saveQuestion139();
    saveQuestion140();
    saveQuestion141();
    saveQuestion142();
    saveQuestion143();
    saveQuestion144();
    saveQuestion145();
    saveQuestion146();
    saveQuestion147();
    saveQuestion148();
    saveQuestion149();
    saveQuestion150();
    saveQuestion151();
    saveQuestion152();
    saveQuestion153();
    saveQuestion154();
    saveQuestion155();
    saveQuestion156();
    saveQuestion157();
    saveQuestion158();
    saveQuestion159();
    saveQuestion160();
    saveQuestion161();
    saveQuestion162();
    saveQuestion163();
    saveQuestion164();
    saveQuestion165();
    saveQuestion166();
    saveQuestion167();
    saveQuestion168();
    saveQuestion169();
    saveQuestion170();
    saveQuestion171();
    saveQuestion172();
    saveQuestion173();
    saveQuestion174();
    saveQuestion175();
    saveQuestion176();
    saveQuestion177();
    saveQuestion178();
    saveQuestion179();
    saveQuestion180();
    saveQuestion181();
    saveQuestion182();
    saveQuestion183();
    saveQuestion184();
    saveQuestion185();
    saveQuestion186();
    saveQuestion187();
    saveQuestion188();
    saveQuestion189();
    saveQuestion190();
    saveQuestion191();
    saveQuestion192();
    saveQuestion193();
    saveQuestion194();
    saveQuestion195();
    saveQuestion196();
    saveQuestion197();
    saveQuestion198();
    saveQuestion199();
    saveQuestion200();
    saveQuestion201();
    saveQuestion202();
    saveQuestion203();
    saveQuestion204();
    saveQuestion205();
    saveQuestion206();
    saveQuestion207();
    saveQuestion208();
    saveQuestion209();
    saveQuestion210();
    saveQuestion211();
    saveQuestion212();
    saveQuestion213();
    saveQuestion214();
    saveQuestion215();
    saveQuestion216();
    saveQuestion217();
    saveQuestion218();
    saveQuestion219();
    saveQuestion220();
    saveQuestion221();
    saveQuestion222();
    saveQuestion223();
    saveQuestion224();
    saveQuestion225();
    saveQuestion226();
    saveQuestion227();
    saveQuestion228();
    saveQuestion229();
    saveQuestion230();
    saveQuestion231();
    saveQuestion232();
    saveQuestion233();
    saveQuestion234();
    saveQuestion235();
    saveQuestion236();
    saveQuestion237();
    saveQuestion238();
    saveQuestion239();
    saveQuestion240();
    saveQuestion241();
    saveQuestion242();
    saveQuestion243();
    saveQuestion244();
    saveQuestion245();
    saveQuestion246();
    saveQuestion247();
    saveQuestion248();
    saveQuestion249();
    saveQuestion250();
    saveQuestion251();
    saveQuestion252();
    saveQuestion253();
    saveQuestion254();
    saveQuestion255();
    saveQuestion256();
    saveQuestion257();
    saveQuestion258();
    saveQuestion259();
    saveQuestion260();
    saveQuestion261();
    saveQuestion262();
    saveQuestion263();
    saveQuestion264();
    saveQuestion265();
    saveQuestion266();
    saveQuestion267();
    saveQuestion268();
    saveQuestion269();
    saveQuestion270();
    saveQuestion271();
    saveQuestion272();
    saveQuestion273();
    saveQuestion274();
    saveQuestion275();
    saveQuestion276();
    saveQuestion277();
    saveQuestion278();
    saveQuestion279();
    saveQuestion280();
    saveQuestion281();
    saveQuestion282();
    saveQuestion283();
    saveQuestion284();
    saveQuestion285();
    saveQuestion286();
    saveQuestion287();
    saveQuestion288();
    saveQuestion289();
    saveQuestion290();
    saveQuestion291();
    saveQuestion292();
    saveQuestion293();
    saveQuestion294();
    saveQuestion295();
    saveQuestion296();
    saveQuestion297();
    saveQuestion298();
    saveQuestion299();
    saveQuestion300();
    saveQuestion301();
    saveQuestion302();
    saveQuestion303();
    saveQuestion304();
    saveQuestion305();
    saveQuestion306();
    saveQuestion307();
    saveQuestion308();
    saveQuestion309();
    saveQuestion310();
    saveQuestion311();
    saveQuestion312();
    saveQuestion313();
    saveQuestion314();
    saveQuestion315();
    saveQuestion316();
    saveQuestion317();
    saveQuestion318();
    saveQuestion319();
    saveQuestion320();
    saveQuestion321();
    saveQuestion322();
    saveQuestion323();
    saveQuestion324();
    saveQuestion325();
    saveQuestion326();
    saveQuestion327();
    saveQuestion328();
    saveQuestion329();
    saveQuestion330();
    saveQuestion331();
    saveQuestion332();
    saveQuestion333();
    saveQuestion334();
    saveQuestion335();
    saveQuestion336();
    saveQuestion337();
    saveQuestion338();
    saveQuestion339();
    saveQuestion340();
    saveQuestion341();
    saveQuestion342();
    saveQuestion343();
    saveQuestion344();
    saveQuestion345();
    saveQuestion346();
    saveQuestion347();
    saveQuestion348();
    saveQuestion349();
    saveQuestion350();
    saveQuestion351();
    saveQuestion352();
    saveQuestion353();
    saveQuestion354();
    saveQuestion355();
    saveQuestion356();
    saveQuestion357();
    saveQuestion358();
    saveQuestion359();
    saveQuestion360();
    saveQuestion361();
    saveQuestion362();
    saveQuestion363();
    saveQuestion364();
    saveQuestion365();
    saveQuestion366();
    saveQuestion367();
    saveQuestion368();
    saveQuestion369();
    saveQuestion370();
    saveQuestion371();
    saveQuestion372();
    saveQuestion373();
    saveQuestion374();
    saveQuestion375();
    saveQuestion376();
    saveQuestion377();
    saveQuestion378();
    saveQuestion379();
    saveQuestion380();
    saveQuestion381();
    saveQuestion382();
    saveQuestion383();
    saveQuestion384();
    saveQuestion385();
    saveQuestion386();
    saveQuestion387();
    saveQuestion388();
    saveQuestion389();
    saveQuestion390();
    saveQuestion391();
    saveQuestion392();
    saveQuestion393();
    saveQuestion394();
    saveQuestion395();
    saveQuestion396();
    saveQuestion397();
    saveQuestion398();
    saveQuestion399();
    saveQuestion400();
    saveQuestion401();
    saveQuestion402();
    saveQuestion403();
    saveQuestion404();
    saveQuestion405();
    saveQuestion406();
    saveQuestion407();
    saveQuestion408();
    saveQuestion409();
    saveQuestion410();
    saveQuestion411();
    saveQuestion412();
    saveQuestion413();
    saveQuestion414();
    saveQuestion415();
    saveQuestion416();
    saveQuestion417();
    saveQuestion418();
    saveQuestion419();
    saveQuestion420();
    saveQuestion421();
    saveQuestion422();
    saveQuestion423();
    saveQuestion424();
    saveQuestion425();
    saveQuestion426();
    saveQuestion427();
    saveQuestion428();
    saveQuestion429();
    saveQuestion430();
    saveQuestion431();
    saveQuestion432();
    saveQuestion433();
    saveQuestion434();
    saveQuestion435();
    saveQuestion436();
    saveQuestion437();
    saveQuestion438();
    saveQuestion439();
    saveQuestion440();
    saveQuestion441();
    saveQuestion442();
    saveQuestion443();
    saveQuestion444();
    saveQuestion445();
    saveQuestion446();
    saveQuestion447();
    saveQuestion448();
    saveQuestion449();
    saveQuestion450();
    saveQuestion451();
    saveQuestion452();
    saveQuestion453();
    saveQuestion454();
    saveQuestion455();
    saveQuestion456();
    saveQuestion457();
    saveQuestion458();
    saveQuestion459();
    saveQuestion460();
    saveQuestion461();
    saveQuestion462();
    saveQuestion463();
    saveQuestion464();
    saveQuestion465();
    saveQuestion466();
    saveQuestion467();
    saveQuestion468();
    saveQuestion469();
    saveQuestion470();
    saveQuestion471();
    saveQuestion472();
    saveQuestion473();
    saveQuestion474();
    saveQuestion475();
    saveQuestion476();
    saveQuestion477();
    saveQuestion478();
    saveQuestion479();
    saveQuestion480();
    saveQuestion481();
    saveQuestion482();
    saveQuestion483();
    saveQuestion484();
    saveQuestion485();
    saveQuestion486();
    saveQuestion487();
    saveQuestion488();
    saveQuestion489();
    saveQuestion490();
    saveQuestion491();
    saveQuestion492();
    saveQuestion493();
    saveQuestion494();
    saveQuestion495();
    saveQuestion496();
    saveQuestion497();
    saveQuestion498();
    saveQuestion499();
    saveQuestion500();
    saveQuestion501();
    saveQuestion502();
    saveQuestion503();
    saveQuestion504();
    saveQuestion505();
    saveQuestion506();
    saveQuestion507();
    saveQuestion508();
    saveQuestion509();
    saveQuestion510();
    saveQuestion511();
    saveQuestion512();
    saveQuestion513();
    saveQuestion514();
    saveQuestion515();
    saveQuestion516();
    saveQuestion517();
    saveQuestion518();
    saveQuestion519();
    saveQuestion520();
    saveQuestion521();
    saveQuestion522();
    saveQuestion523();
    saveQuestion524();
    saveQuestion525();
    saveQuestion526();
    saveQuestion527();
    saveQuestion528();
    saveQuestion529();
    saveQuestion530();
    saveQuestion531();
    saveQuestion532();
    saveQuestion533();
    saveQuestion534();
    saveQuestion535();
    saveQuestion536();
    saveQuestion537();
    saveQuestion538();
    saveQuestion539();
    saveQuestion540();
    saveQuestion541();
    saveQuestion542();
    saveQuestion543();
    saveQuestion544();
    saveQuestion545();
    saveQuestion546();
    saveQuestion547();
    saveQuestion548();
    saveQuestion549();
    saveQuestion550();
    saveQuestion551();
    saveQuestion552();
    saveQuestion553();
    saveQuestion554();
    saveQuestion555();
    saveQuestion556();
    saveQuestion557();
    saveQuestion558();
    saveQuestion559();
    saveQuestion560();
    saveQuestion561();
    saveQuestion562();
    saveQuestion563();
    saveQuestion564();
    saveQuestion565();
    saveQuestion566();
    saveQuestion567();
    saveQuestion568();
    saveQuestion569();
    saveQuestion570();
    saveQuestion571();
    saveQuestion572();
    saveQuestion573();
    saveQuestion574();
    saveQuestion575();
    saveQuestion576();
    saveQuestion577();
    saveQuestion578();
    saveQuestion579();
    saveQuestion580();
    saveQuestion581();
    saveQuestion582();
    saveQuestion583();
    saveQuestion584();
    saveQuestion585();
    saveQuestion586();
    saveQuestion587();
    saveQuestion588();
    saveQuestion589();
    saveQuestion590();
    saveQuestion591();
    saveQuestion592();
    saveQuestion593();
    saveQuestion594();
    saveQuestion595();
    saveQuestion596();
    saveQuestion597();
    saveQuestion598();
    saveQuestion599();
    saveQuestion600();
    saveQuestion601();
    saveQuestion602();
    saveQuestion603();
    saveQuestion604();
    saveQuestion605();
    saveQuestion606();
    saveQuestion607();
    saveQuestion608();
    saveQuestion609();
    saveQuestion610();
    saveQuestion611();
    saveQuestion612();
    saveQuestion613();
    saveQuestion614();
    saveQuestion615();
    saveQuestion616();
    saveQuestion617();
    saveQuestion618();
    saveQuestion619();
    saveQuestion620();
    saveQuestion621();
    saveQuestion622();
    saveQuestion623();
    saveQuestion624();
    saveQuestion625();
    saveQuestion626();
    saveQuestion627();
    saveQuestion628();
    saveQuestion629();
    saveQuestion630();
    saveQuestion631();
    saveQuestion632();
    saveQuestion633();
    saveQuestion634();
    saveQuestion635();
    saveQuestion636();
    saveQuestion637();
    saveQuestion638();
    saveQuestion639();
    saveQuestion640();
    saveQuestion641();
    saveQuestion642();
    saveQuestion643();
    saveQuestion644();
    saveQuestion645();
    saveQuestion646();
    saveQuestion647();
    saveQuestion648();
    saveQuestion649();
    saveQuestion650();
    saveQuestion651();
    saveQuestion652();
    saveQuestion653();
    saveQuestion654();
    saveQuestion655();
    saveQuestion656();
    saveQuestion657();
    saveQuestion658();
    saveQuestion659();
    saveQuestion660();
    saveQuestion661();
    saveQuestion662();
    saveQuestion663();
    saveQuestion664();
    saveQuestion665();
    saveQuestion666();
    saveQuestion667();
    saveQuestion668();
    saveQuestion669();
    saveQuestion670();
    saveQuestion671();
    saveQuestion672();
    saveQuestion673();
    saveQuestion674();
    saveQuestion675();
    saveQuestion676();
    saveQuestion677();
    saveQuestion678();
    saveQuestion679();
    saveQuestion680();
    saveQuestion681();
    saveQuestion682();
    saveQuestion683();
    saveQuestion684();
    saveQuestion685();
    saveQuestion686();
    saveQuestion687();
    saveQuestion688();
    saveQuestion689();
    saveQuestion690();
    saveQuestion691();
    saveQuestion692();
    saveQuestion693();
    saveQuestion694();
    saveQuestion695();
    saveQuestion696();
    saveQuestion697();
    saveQuestion698();
    saveQuestion699();
    saveQuestion700();
    saveQuestion701();
    saveQuestion702();
    saveQuestion703();
    saveQuestion704();
    saveQuestion705();
    saveQuestion706();
    saveQuestion707();
    saveQuestion708();
    saveQuestion709();
    saveQuestion710();
    saveQuestion711();
    saveQuestion712();
    saveQuestion713();
    saveQuestion714();
    saveQuestion715();
    saveQuestion716();
    saveQuestion717();
    saveQuestion718();
    saveQuestion719();
    saveQuestion720();
    saveQuestion721();
    saveQuestion722();
    saveQuestion723();
    saveQuestion724();
    saveQuestion725();
    saveQuestion726();
    saveQuestion727();
    saveQuestion728();
    saveQuestion729();
    saveQuestion730();
    saveQuestion731();
    saveQuestion732();
    saveQuestion733();
    saveQuestion734();
    saveQuestion735();
    saveQuestion736();
    saveQuestion737();
    saveQuestion738();
    saveQuestion739();
    saveQuestion740();
    saveQuestion741();
    saveQuestion742();
    saveQuestion743();
    saveQuestion744();
    saveQuestion745();
    saveQuestion746();
    saveQuestion747();
    saveQuestion748();
    saveQuestion749();
    saveQuestion750();
    saveQuestion751();
    saveQuestion752();
    saveQuestion753();
    saveQuestion754();
    saveQuestion755();
    saveQuestion756();
    saveQuestion757();
    saveQuestion758();
    saveQuestion759();
    saveQuestion760();
    saveQuestion761();
    saveQuestion762();
    saveQuestion763();
    saveQuestion764();
    saveQuestion765();
    saveQuestion766();
    saveQuestion767();
    saveQuestion768();
    saveQuestion769();
    saveQuestion770();
    saveQuestion771();
    saveQuestion772();
    saveQuestion773();
    saveQuestion774();
    saveQuestion775();
    saveQuestion776();
    saveQuestion777();
    saveQuestion778();
    saveQuestion779();
    saveQuestion780();
    saveQuestion781();
    saveQuestion782();
    saveQuestion783();
    saveQuestion784();
    saveQuestion785();
    saveQuestion786();
    saveQuestion787();
    saveQuestion788();
    saveQuestion789();
    saveQuestion790();
    saveQuestion791();
    saveQuestion792();
    saveQuestion793();
    saveQuestion794();
    saveQuestion795();
    saveQuestion796();
    saveQuestion797();
    saveQuestion798();
    saveQuestion799();
    saveQuestion800();
    saveQuestion801();
    saveQuestion802();
    saveQuestion803();
    saveQuestion804();
    saveQuestion805();
    saveQuestion806();
    saveQuestion807();
    saveQuestion808();
    saveQuestion809();
    saveQuestion810();
    saveQuestion811();
    saveQuestion812();
    saveQuestion813();
    saveQuestion814();
    saveQuestion815();
    saveQuestion816();
    saveQuestion817();
    saveQuestion818();
    saveQuestion819();
    saveQuestion820();
    saveQuestion821();
    saveQuestion822();
    saveQuestion823();
    saveQuestion824();
    saveQuestion825();
    saveQuestion826();
    saveQuestion827();
    saveQuestion828();
    saveQuestion829();
    saveQuestion830();
    saveQuestion831();
    saveQuestion832();
    saveQuestion833();
    saveQuestion834();
    saveQuestion835();
    saveQuestion836();
    saveQuestion837();
    saveQuestion838();
    saveQuestion839();
    saveQuestion840();
    saveQuestion841();
    saveQuestion842();
    saveQuestion843();
    saveQuestion844();
    saveQuestion845();
    saveQuestion846();
    saveQuestion847();
    saveQuestion848();
    saveQuestion849();
    saveQuestion850();
    saveQuestion851();
    saveQuestion852();
    saveQuestion853();
    saveQuestion854();
    saveQuestion855();
    saveQuestion856();
    saveQuestion857();
    saveQuestion858();
    saveQuestion859();
    saveQuestion860();
    saveQuestion861();
    saveQuestion862();
    saveQuestion863();
    saveQuestion864();
    saveQuestion865();
    saveQuestion866();
    saveQuestion867();
    saveQuestion868();
    saveQuestion869();
    saveQuestion870();
    saveQuestion871();
    saveQuestion872();
    saveQuestion873();
    saveQuestion874();
    saveQuestion875();
    saveQuestion876();
    saveQuestion877();
    saveQuestion878();
    saveQuestion879();
    saveQuestion880();
    saveQuestion881();
    saveQuestion882();
    saveQuestion883();
    saveQuestion884();
    saveQuestion885();
    saveQuestion886();
    saveQuestion887();
    saveQuestion888();
    saveQuestion889();
    saveQuestion890();
    saveQuestion891();
    saveQuestion892();
    saveQuestion893();
    saveQuestion894();
    saveQuestion895();
    saveQuestion896();
    saveQuestion897();
    saveQuestion898();
    saveQuestion899();
    saveQuestion900();
    saveQuestion901();
    saveQuestion902();
    saveQuestion903();
    saveQuestion904();
    saveQuestion905();
    saveQuestion906();
    saveQuestion907();
    saveQuestion908();
    saveQuestion909();
    saveQuestion910();
    saveQuestion911();
    saveQuestion912();
    saveQuestion913();
    saveQuestion914();
    saveQuestion915();
    saveQuestion916();
    saveQuestion917();
    saveQuestion918();
    saveQuestion919();
    saveQuestion920();
    saveQuestion921();
    saveQuestion922();
    saveQuestion923();
    saveQuestion924();
    saveQuestion925();
    saveQuestion926();
    saveQuestion927();
    saveQuestion928();
    saveQuestion929();
    saveQuestion930();
    saveQuestion931();
    saveQuestion932();
    saveQuestion933();
    saveQuestion934();
    saveQuestion935();
    saveQuestion936();
    saveQuestion937();
    saveQuestion938();
    saveQuestion939();
    saveQuestion940();
    saveQuestion941();
    saveQuestion942();
    saveQuestion943();
    saveQuestion944();
    saveQuestion945();
    saveQuestion946();
    saveQuestion947();
    saveQuestion948();
    saveQuestion949();
    saveQuestion950();
    saveQuestion951();
    saveQuestion952();
    saveQuestion953();
    saveQuestion954();
    saveQuestion955();
    saveQuestion956();
    saveQuestion957();
    saveQuestion958();
    saveQuestion959();
    saveQuestion960();
    saveQuestion961();
    saveQuestion962();
    saveQuestion963();
    saveQuestion964();
    saveQuestion965();
    saveQuestion966();
    saveQuestion967();
    saveQuestion968();
    saveQuestion969();
    saveQuestion970();
    saveQuestion971();
    saveQuestion972();
    saveQuestion973();
    saveQuestion974();
    saveQuestion975();
    saveQuestion976();
    saveQuestion977();
    saveQuestion978();
    saveQuestion979();
    saveQuestion980();
    saveQuestion981();
    saveQuestion982();
    saveQuestion983();
    saveQuestion984();
    saveQuestion985();
    saveQuestion986();
    saveQuestion987();
    saveQuestion988();
    saveQuestion989();
    saveQuestion990();
    saveQuestion991();
    saveQuestion992();
    saveQuestion993();
    saveQuestion994();
    saveQuestion995();
    saveQuestion996();
    saveQuestion997();
    saveQuestion998();
    saveQuestion999();
    saveQuestion1000();
    saveQuestion1001();
    saveQuestion1002();
    saveQuestion1003();
    saveQuestion1004();
    saveQuestion1005();
    saveQuestion1006();
    saveQuestion1007();
    saveQuestion1008();
    saveQuestion1009();
    saveQuestion1010();
    saveQuestion1011();
    saveQuestion1012();
    saveQuestion1013();
    saveQuestion1014();
    saveQuestion1015();
    saveQuestion1016();
    saveQuestion1017();
    saveQuestion1018();
    saveQuestion1019();
    saveQuestion1020();
    saveQuestion1021();
    saveQuestion1022();
    saveQuestion1023();
    saveQuestion1024();
    saveQuestion1025();
    saveQuestion1026();
    saveQuestion1027();
    saveQuestion1028();
    saveQuestion1029();
    saveQuestion1030();
    saveQuestion1031();
    saveQuestion1032();
    saveQuestion1033();
    saveQuestion1034();
    saveQuestion1035();
    saveQuestion1036();
    saveQuestion1037();
    saveQuestion1038();
    saveQuestion1039();
    saveQuestion1040();
    saveQuestion1041();
    saveQuestion1042();
    saveQuestion1043();
    saveQuestion1044();
    saveQuestion1045();
    saveQuestion1046();
    saveQuestion1047();
    saveQuestion1048();
    saveQuestion1049();
    saveQuestion1050();
    saveQuestion1051();
    saveQuestion1052();
    saveQuestion1053();
    saveQuestion1054();
    saveQuestion1055();
    saveQuestion1056();
    saveQuestion1057();
    saveQuestion1058();
    saveQuestion1059();
    saveQuestion1060();
    saveQuestion1061();
    saveQuestion1062();
    saveQuestion1063();
    saveQuestion1064();
    saveQuestion1065();
    saveQuestion1066();
    saveQuestion1067();
    saveQuestion1068();
    saveQuestion1069();
    saveQuestion1070();
    saveQuestion1071();
    saveQuestion1072();
    saveQuestion1073();
    saveQuestion1074();
    saveQuestion1075();
    saveQuestion1076();
    saveQuestion1077();
    saveQuestion1078();
    saveQuestion1079();
    saveQuestion1080();
    saveQuestion1081();
    saveQuestion1082();
    saveQuestion1083();
    saveQuestion1084();
    saveQuestion1085();
    saveQuestion1086();
    saveQuestion1087();
    saveQuestion1088();
    saveQuestion1089();
    saveQuestion1090();
    saveQuestion1091();
    saveQuestion1092();
    saveQuestion1093();
    saveQuestion1094();
    saveQuestion1095();
    saveQuestion1096();
    saveQuestion1097();
    saveQuestion1098();
    saveQuestion1099();
    saveQuestion1100();
    saveQuestion1101();
    saveQuestion1102();
    saveQuestion1103();
    saveQuestion1104();
    saveQuestion1105();
    saveQuestion1106();
    saveQuestion1107();
    saveQuestion1108();
    saveQuestion1109();
    saveQuestion1110();
    saveQuestion1111();
    saveQuestion1112();
    saveQuestion1113();
    saveQuestion1114();
    saveQuestion1115();
    saveQuestion1116();
    saveQuestion1117();
    saveQuestion1118();
    saveQuestion1119();
    saveQuestion1120();
    saveQuestion1121();
    saveQuestion1122();
    saveQuestion1123();
    saveQuestion1124();
    saveQuestion1125();
    saveQuestion1126();
    saveQuestion1127();
    saveQuestion1128();
    saveQuestion1129();
    saveQuestion1130();
    saveQuestion1131();
    saveQuestion1132();
    saveQuestion1133();
    saveQuestion1134();
    saveQuestion1135();
    saveQuestion1136();
    saveQuestion1137();
    saveQuestion1138();
    saveQuestion1139();
    saveQuestion1140();
    saveQuestion1141();
    saveQuestion1142();
    saveQuestion1143();
    saveQuestion1144();
    saveQuestion1145();
    saveQuestion1146();
    saveQuestion1147();
    saveQuestion1148();
    saveQuestion1149();
    saveQuestion1150();
    saveQuestion1151();
    saveQuestion1152();
    saveQuestion1153();
    saveQuestion1154();
    saveQuestion1155();
    saveQuestion1156();
    saveQuestion1157();
    saveQuestion1158();
    saveQuestion1159();
    saveQuestion1160();
    saveQuestion1161();
    saveQuestion1162();
    saveQuestion1163();
    saveQuestion1164();
    saveQuestion1165();
    saveQuestion1166();
    saveQuestion1167();
    saveQuestion1168();
    saveQuestion1169();
    saveQuestion1170();
    saveQuestion1171();
    saveQuestion1172();
    saveQuestion1173();
    saveQuestion1174();
    saveQuestion1175();
    saveQuestion1176();
    saveQuestion1177();
    saveQuestion1178();
    saveQuestion1179();
    saveQuestion1180();
    saveQuestion1181();
    saveQuestion1182();
    saveQuestion1183();
    saveQuestion1184();
    saveQuestion1185();
    saveQuestion1186();
    saveQuestion1187();
    saveQuestion1188();
    saveQuestion1189();
    saveQuestion1190();
    saveQuestion1191();
    saveQuestion1192();
    saveQuestion1193();
    saveQuestion1194();
    saveQuestion1195();
    saveQuestion1196();
    saveQuestion1197();
    saveQuestion1198();
    saveQuestion1199();
    saveQuestion1200();
    saveQuestion1201();
    saveQuestion1202();
    saveQuestion1203();
    saveQuestion1204();
    saveQuestion1205();
    saveQuestion1206();
    saveQuestion1207();
    saveQuestion1208();
    saveQuestion1209();
    saveQuestion1210();
    saveQuestion1211();
    saveQuestion1212();
    saveQuestion1213();
    saveQuestion1214();
    saveQuestion1215();
    saveQuestion1216();
    saveQuestion1217();
    saveQuestion1218();
    saveQuestion1219();
    saveQuestion1220();
    saveQuestion1221();
    saveQuestion1222();
    saveQuestion1223();
    saveQuestion1224();
    saveQuestion1225();
    saveQuestion1226();
    saveQuestion1227();
    saveQuestion1228();
    saveQuestion1229();
    saveQuestion1230();
    saveQuestion1231();
    saveQuestion1232();
    saveQuestion1233();
    saveQuestion1234();
    saveQuestion1235();
    saveQuestion1236();
    saveQuestion1237();
    saveQuestion1238();
    saveQuestion1239();
    saveQuestion1240();
    saveQuestion1241();
    saveQuestion1242();
    saveQuestion1243();
    saveQuestion1244();
    saveQuestion1245();
    saveQuestion1246();
    saveQuestion1247();
    saveQuestion1248();
    saveQuestion1249();
    saveQuestion1250();
    saveQuestion1251();
    saveQuestion1252();
    saveQuestion1253();
    saveQuestion1254();
    saveQuestion1255();
    saveQuestion1256();
    saveQuestion1257();
    saveQuestion1258();
    saveQuestion1259();
    saveQuestion1260();
    saveQuestion1261();
    saveQuestion1262();
    saveQuestion1263();
    saveQuestion1264();
    saveQuestion1265();
    saveQuestion1266();
    saveQuestion1267();
    saveQuestion1268();
    saveQuestion1269();
    saveQuestion1270();
    saveQuestion1271();
    saveQuestion1272();
    saveQuestion1273();
    saveQuestion1274();
    saveQuestion1275();
    saveQuestion1276();
    saveQuestion1277();
    saveQuestion1278();
    saveQuestion1279();
    saveQuestion1280();
    saveQuestion1281();
    saveQuestion1282();
    saveQuestion1283();
    saveQuestion1284();
    saveQuestion1285();
    saveQuestion1286();
    saveQuestion1287();
    saveQuestion1288();
    saveQuestion1289();
    saveQuestion1290();
    saveQuestion1291();
    saveQuestion1292();
    saveQuestion1293();
    saveQuestion1294();
    saveQuestion1295();
    saveQuestion1296();
    saveQuestion1297();
    saveQuestion1298();
    saveQuestion1299();
    saveQuestion1300();
    saveQuestion1301();
    saveQuestion1302();
    saveQuestion1303();
    saveQuestion1304();
    saveQuestion1305();
    saveQuestion1306();
    saveQuestion1307();
    saveQuestion1308();
    saveQuestion1309();
    saveQuestion1310();
    saveQuestion1311();
    saveQuestion1312();
    saveQuestion1313();
    saveQuestion1314();
    saveQuestion1315();
    saveQuestion1316();
    saveQuestion1317();
    saveQuestion1318();
    saveQuestion1319();
    saveQuestion1320();
    saveQuestion1321();
    saveQuestion1322();
    saveQuestion1323();
    saveQuestion1324();
    saveQuestion1325();
    saveQuestion1326();
    saveQuestion1327();
    saveQuestion1328();
    saveQuestion1329();
    saveQuestion1330();
    saveQuestion1331();
    saveQuestion1332();
    saveQuestion1333();
    saveQuestion1334();
    saveQuestion1335();
    saveQuestion1336();
    saveQuestion1337();
    saveQuestion1338();
    saveQuestion1339();
    saveQuestion1340();
    saveQuestion1341();
    saveQuestion1342();
    saveQuestion1343();
    saveQuestion1344();
    saveQuestion1345();
    saveQuestion1346();
    saveQuestion1347();
    saveQuestion1348();
    saveQuestion1349();
    saveQuestion1350();
    saveQuestion1351();
    saveQuestion1352();
    saveQuestion1353();
    saveQuestion1354();
    saveQuestion1355();
    saveQuestion1356();
    saveQuestion1357();
    saveQuestion1358();
    saveQuestion1359();
    saveQuestion1360();
    saveQuestion1361();
    saveQuestion1362();
    saveQuestion1363();
    saveQuestion1364();
    saveQuestion1365();
    saveQuestion1366();
    saveQuestion1367();
    saveQuestion1368();
    saveQuestion1369();
    saveQuestion1370();
    saveQuestion1371();
    saveQuestion1372();
    saveQuestion1373();
    saveQuestion1374();
    saveQuestion1375();
    saveQuestion1376();
    saveQuestion1377();
    saveQuestion1378();
    saveQuestion1379();
    saveQuestion1380();
    saveQuestion1381();
    saveQuestion1382();
    saveQuestion1383();
    saveQuestion1384();
    saveQuestion1385();
    saveQuestion1386();
    saveQuestion1387();
    saveQuestion1388();
    saveQuestion1389();
    saveQuestion1390();
    saveQuestion1391();
    saveQuestion1392();
    saveQuestion1393();
    saveQuestion1394();
    saveQuestion1395();
    saveQuestion1396();
    saveQuestion1397();
    saveQuestion1398();
    saveQuestion1399();
    saveQuestion1400();
    saveQuestion1401();
    saveQuestion1402();
    saveQuestion1403();
    saveQuestion1404();
    saveQuestion1405();
    saveQuestion1406();
    saveQuestion1407();
    saveQuestion1408();
    saveQuestion1409();
    saveQuestion1410();
    saveQuestion1411();
    saveQuestion1412();
    saveQuestion1413();
    saveQuestion1414();
    saveQuestion1415();
    saveQuestion1416();
    saveQuestion1417();
    saveQuestion1418();
    saveQuestion1419();
    saveQuestion1420();
    saveQuestion1421();
    saveQuestion1422();
    saveQuestion1423();
    saveQuestion1424();
    saveQuestion1425();
    saveQuestion1426();
    saveQuestion1427();
    saveQuestion1428();
    saveQuestion1429();
    saveQuestion1430();
    saveQuestion1431();
    saveQuestion1432();
    saveQuestion1433();
    saveQuestion1434();
    saveQuestion1435();
    saveQuestion1436();
    saveQuestion1437();
    saveQuestion1438();
    saveQuestion1439();
    saveQuestion1440();
    saveQuestion1441();
    saveQuestion1442();
    saveQuestion1443();
    saveQuestion1444();
    saveQuestion1445();
    saveQuestion1446();
    saveQuestion1447();
    saveQuestion1448();
    saveQuestion1449();
    saveQuestion1450();
    saveQuestion1451();
    saveQuestion1452();
    saveQuestion1453();
    saveQuestion1454();
    saveQuestion1455();
    saveQuestion1456();
    saveQuestion1457();
    saveQuestion1458();
    saveQuestion1459();
    saveQuestion1460();
    saveQuestion1461();
    saveQuestion1462();
    saveQuestion1463();
    saveQuestion1464();
    saveQuestion1465();
    saveQuestion1466();
    saveQuestion1467();
    saveQuestion1468();
    saveQuestion1469();
    saveQuestion1470();
    saveQuestion1471();
    saveQuestion1472();
    saveQuestion1473();
    saveQuestion1474();
    saveQuestion1475();
    saveQuestion1476();
    saveQuestion1477();
    saveQuestion1478();
    saveQuestion1479();
    saveQuestion1480();
    saveQuestion1481();
    saveQuestion1482();
    saveQuestion1483();
    saveQuestion1484();
    saveQuestion1485();
    saveQuestion1486();
    saveQuestion1487();
    saveQuestion1488();
    saveQuestion1489();
    saveQuestion1490();
    saveQuestion1491();
    saveQuestion1492();
    saveQuestion1493();
    saveQuestion1494();
    saveQuestion1495();
    saveQuestion1496();
    saveQuestion1497();
    saveQuestion1498();
    saveQuestion1499();
    saveQuestion1500();
    saveQuestion1501();
    saveQuestion1502();
    saveQuestion1503();
    saveQuestion1504();
    saveQuestion1505();
    saveQuestion1506();
    saveQuestion1507();
    saveQuestion1508();
    saveQuestion1509();
    saveQuestion1510();
    saveQuestion1511();
    saveQuestion1512();
    saveQuestion1513();
    saveQuestion1514();
    saveQuestion1515();
    saveQuestion1516();
    saveQuestion1517();
    saveQuestion1518();
    saveQuestion1519();
    saveQuestion1520();
    saveQuestion1521();
    saveQuestion1522();
    saveQuestion1523();
    saveQuestion1524();
    saveQuestion1525();
    saveQuestion1526();
    saveQuestion1527();
    saveQuestion1528();
    saveQuestion1529();
    saveQuestion1530();
    saveQuestion1531();
    saveQuestion1532();
    saveQuestion1533();
    saveQuestion1534();
    saveQuestion1535();
    saveQuestion1536();
    saveQuestion1537();
    saveQuestion1538();
    saveQuestion1539();
    saveQuestion1540();
    saveQuestion1541();
    saveQuestion1542();
    saveQuestion1543();
    saveQuestion1544();
    saveQuestion1545();
    saveQuestion1546();
    saveQuestion1547();
    saveQuestion1548();
    saveQuestion1549();
    saveQuestion1550();
    saveQuestion1551();
    saveQuestion1552();
    saveQuestion1553();
  }

  private void saveQuestion1() {
    Question question;

    question = questionRepository.save(new Question(1, "What did Yankee Doodle stick in his cap?", "2018-02-02 20:04:25"));

    answerRepository.save(new Answer(question, 'A', "Feather", true));
    answerRepository.save(new Answer(question, 'B', "Noodle soup", false));
    answerRepository.save(new Answer(question, 'C', "Duck", false));
  }

  private void saveQuestion2() {
    Question question;

    question = questionRepository.save(new Question(2, "What word completes the phrase: “Everything but the kitchen”?", "2018-02-02 20:05:13"));

    answerRepository.save(new Answer(question, 'A', "Sink", true));
    answerRepository.save(new Answer(question, 'B', "Kaleidoscope", false));
    answerRepository.save(new Answer(question, 'C', "Hogwash", false));
  }

  private void saveQuestion3() {
    Question question;

    question = questionRepository.save(new Question(3, "What was the first theatrical feature film to be completely computer-animated?", "2018-02-02 20:05:48"));

    answerRepository.save(new Answer(question, 'A', "Gone with the Wind", false));
    answerRepository.save(new Answer(question, 'B', "Toy Story 2", false));
    answerRepository.save(new Answer(question, 'C', "Toy Story", true));
  }

  private void saveQuestion4() {
    Question question;

    question = questionRepository.save(new Question(4, "Traditionally, an “amuse-bouche” arrives right before what part of the meal?", "2018-02-02 20:06:34"));

    answerRepository.save(new Answer(question, 'A', "Appetizers", true));
    answerRepository.save(new Answer(question, 'B', "Entrée", false));
    answerRepository.save(new Answer(question, 'C', "Dessert", false));
  }

  private void saveQuestion5() {
    Question question;

    question = questionRepository.save(new Question(5, "In the game of Candy Land, which player goes first?", "2018-02-02 20:07:52"));

    answerRepository.save(new Answer(question, 'A', "The youngest", true));
    answerRepository.save(new Answer(question, 'B', "Blue token holder", false));
    answerRepository.save(new Answer(question, 'C', "First to draw a red card", false));
  }

  private void saveQuestion6() {
    Question question;

    question = questionRepository.save(new Question(6, "In the popular comic strip, what color is Hagar the Horrible’s beard?", "2018-02-02 20:08:51"));

    answerRepository.save(new Answer(question, 'A', "White", false));
    answerRepository.save(new Answer(question, 'B', "Blond", false));
    answerRepository.save(new Answer(question, 'C', "Red", true));
  }

  private void saveQuestion7() {
    Question question;

    question = questionRepository.save(new Question(7, "What spice comes from the crocus flower?", "2018-02-02 20:10:05"));

    answerRepository.save(new Answer(question, 'A', "Cloves", false));
    answerRepository.save(new Answer(question, 'B', "Allspice", false));
    answerRepository.save(new Answer(question, 'C', "Saffron", true));
  }

  private void saveQuestion8() {
    Question question;

    question = questionRepository.save(new Question(8, "Albert Einstein won a Nobel Prize for his work on what scientific phenomenon?", "2018-02-02 20:10:18"));

    answerRepository.save(new Answer(question, 'A', "General relativity", false));
    answerRepository.save(new Answer(question, 'B', "Photoelectri… https://t.co/DJYgCLYAgV", false));
  }

  private void saveQuestion9() {
    Question question;

    question = questionRepository.save(new Question(9, "Buying a can of soda will incur a higher tax in which city?", "2018-02-02 20:11:20"));

    answerRepository.save(new Answer(question, 'A', "Santa Barbara, CA", false));
    answerRepository.save(new Answer(question, 'B', "Denver, CO", false));
    answerRepository.save(new Answer(question, 'C', "Seattle, WA", true));
  }

  private void saveQuestion10() {
    Question question;

    question = questionRepository.save(new Question(10, "Who is credited with coining the phrase: “For whom the bell tolls”?", "2018-02-02 20:12:04"));

    answerRepository.save(new Answer(question, 'A', "John Donne", true));
    answerRepository.save(new Answer(question, 'B', "William Shakespeare", false));
    answerRepository.save(new Answer(question, 'C', "Ernest Hemingway", false));
  }

  private void saveQuestion11() {
    Question question;

    question = questionRepository.save(new Question(11, "What was the first product to have its barcode scanned at purchase?", "2018-02-02 20:12:54"));

    answerRepository.save(new Answer(question, 'A', "Rubik’s Cube", false));
    answerRepository.save(new Answer(question, 'B', "Wrigley's chewing gum", true));
    answerRepository.save(new Answer(question, 'C', "Apple IIe", false));
  }

  private void saveQuestion12() {
    Question question;

    question = questionRepository.save(new Question(12, "Catherine de’ Medici was present at the performance of the first-ever formal what?", "2018-02-02 20:14:28"));

    answerRepository.save(new Answer(question, 'A', "Opera", false));
    answerRepository.save(new Answer(question, 'B', "Commedia dell’arte", false));
    answerRepository.save(new Answer(question, 'C', "Ballet", true));
  }

  private void saveQuestion13() {
    Question question;

    question = questionRepository.save(new Question(1, "Parmesan cheese is named for an Italian province called what?", "2018-02-03 02:06:18"));

    answerRepository.save(new Answer(question, 'A', "Romana", false));
    answerRepository.save(new Answer(question, 'B', "Yomamma", false));
    answerRepository.save(new Answer(question, 'C', "Parma", true));
  }

  private void saveQuestion14() {
    Question question;

    question = questionRepository.save(new Question(2, "Which of these famous fictional animals is a ruminant?", "2018-02-03 02:07:17"));

    answerRepository.save(new Answer(question, 'A', "Bambi", true));
    answerRepository.save(new Answer(question, 'B', "Mister Ed", false));
    answerRepository.save(new Answer(question, 'C', "Eeyore", false));
  }

  private void saveQuestion15() {
    Question question;

    question = questionRepository.save(new Question(3, "Which popular root beer brand typically contains caffeine?", "2018-02-03 02:08:20"));

    answerRepository.save(new Answer(question, 'A', "Barq’s", true));
    answerRepository.save(new Answer(question, 'B', "A&amp;W", false));
    answerRepository.save(new Answer(question, 'C', "Mug", false));
  }

  private void saveQuestion16() {
    Question question;

    question = questionRepository.save(new Question(4, "Which of these elements would earn you the highest score in Scrabble?", "2018-02-03 02:09:06"));

    answerRepository.save(new Answer(question, 'A', "Oxygen", true));
    answerRepository.save(new Answer(question, 'B', "Xenon", false));
    answerRepository.save(new Answer(question, 'C', "Zinc", false));
  }

  private void saveQuestion17() {
    Question question;

    question = questionRepository.save(new Question(5, "What is the correct spelling of the Pennsylvania town famous for its groundhog?", "2018-02-03 02:09:43"));

    answerRepository.save(new Answer(question, 'A', "Punksatawany", false));
    answerRepository.save(new Answer(question, 'B', "Puncksehtany", false));
    answerRepository.save(new Answer(question, 'C', "Punxsutawney", true));
  }

  private void saveQuestion18() {
    Question question;

    question = questionRepository.save(new Question(6, "In 1973, Arabella and Anita became the first members of what species to go into space?", "2018-02-03 02:11:33"));

    answerRepository.save(new Answer(question, 'A', "Spider", true));
    answerRepository.save(new Answer(question, 'B', "Fruit fly", false));
    answerRepository.save(new Answer(question, 'C', "Ladybug", false));
  }

  private void saveQuestion19() {
    Question question;

    question = questionRepository.save(new Question(7, "What was the least popular papal name of the 19th century?", "2018-02-03 02:12:05"));

    answerRepository.save(new Answer(question, 'A', "Leo", false));
    answerRepository.save(new Answer(question, 'B', "Pius", false));
    answerRepository.save(new Answer(question, 'C', "Gregory", true));
  }

  private void saveQuestion20() {
    Question question;

    question = questionRepository.save(new Question(8, "New Mexico exempts which group of people from paying state income taxes?", "2018-02-03 02:12:55"));

    answerRepository.save(new Answer(question, 'A', "Hybrid car owners", false));
    answerRepository.save(new Answer(question, 'B', "Centenarians", true));
    answerRepository.save(new Answer(question, 'C', "Registered lobbyists", false));
  }

  private void saveQuestion21() {
    Question question;

    question = questionRepository.save(new Question(9, "Which of these Summer Olympics events uses the longest playing surface?", "2018-02-03 02:14:18"));

    answerRepository.save(new Answer(question, 'A', "Fencing", true));
    answerRepository.save(new Answer(question, 'B', "Badminton", false));
    answerRepository.save(new Answer(question, 'C', "Taekwondo", false));
  }

  private void saveQuestion22() {
    Question question;

    question = questionRepository.save(new Question(1, "The college degree “B.A.” is short for what?", "2018-02-04 02:04:22"));

    answerRepository.save(new Answer(question, 'A', "Bachelor of Arts", true));
    answerRepository.save(new Answer(question, 'B', "Booyah Awesome", false));
    answerRepository.save(new Answer(question, 'C', "Beefy Arms", false));
  }

  private void saveQuestion23() {
    Question question;

    question = questionRepository.save(new Question(2, "Which country is part of North America?", "2018-02-04 02:05:12"));

    answerRepository.save(new Answer(question, 'A', "Norway", false));
    answerRepository.save(new Answer(question, 'B', "Brazil", false));
    answerRepository.save(new Answer(question, 'C', "Canada", true));
  }

  private void saveQuestion24() {
    Question question;

    question = questionRepository.save(new Question(3, "Which tool is typically used to clear a clogged pipe?", "2018-02-04 02:05:45"));

    answerRepository.save(new Answer(question, 'A', "Claw hammer", false));
    answerRepository.save(new Answer(question, 'B', "Snake", true));
    answerRepository.save(new Answer(question, 'C', "Shovel", false));
  }

  private void saveQuestion25() {
    Question question;

    question = questionRepository.save(new Question(4, "Which of the original Monopoly game pieces was retired last year?", "2018-02-04 02:07:27"));

    answerRepository.save(new Answer(question, 'A', "Thimble", true));
    answerRepository.save(new Answer(question, 'B', "Race car", false));
    answerRepository.save(new Answer(question, 'C', "Top hat", false));
  }

  private void saveQuestion26() {
    Question question;

    question = questionRepository.save(new Question(5, "Which film director holds a U.S. patent for a T-shirt?", "2018-02-04 02:08:08"));

    answerRepository.save(new Answer(question, 'A', "Quentin Tarantino", false));
    answerRepository.save(new Answer(question, 'B', "Francis Ford Coppola", true));
    answerRepository.save(new Answer(question, 'C', "James Cameron", false));
  }

  private void saveQuestion27() {
    Question question;

    question = questionRepository.save(new Question(6, "Which food is traditionally a main ingredient in mock turtle soup?", "2018-02-04 02:09:03"));

    answerRepository.save(new Answer(question, 'A', "Calf brains", true));
    answerRepository.save(new Answer(question, 'B', "Tortoise meat", false));
    answerRepository.save(new Answer(question, 'C', "Snails", false));
  }

  private void saveQuestion28() {
    Question question;

    question = questionRepository.save(new Question(7, "Aerosmith’s “Dude (Looks Like a Lady)” was written about what heavy metal vocalist?", "2018-02-04 02:09:55"));

    answerRepository.save(new Answer(question, 'A', "Axl Rose", false));
    answerRepository.save(new Answer(question, 'B', "Bret Michaels", false));
    answerRepository.save(new Answer(question, 'C', "Vince Neil", true));
  }

  private void saveQuestion29() {
    Question question;

    question = questionRepository.save(new Question(8, "Which of these is Venus visibly lacking in Botticelli's “Birth of Venus”?", "2018-02-04 02:10:36"));

    answerRepository.save(new Answer(question, 'A', "Belly button", false));
    answerRepository.save(new Answer(question, 'B', "Left arm", false));
    answerRepository.save(new Answer(question, 'C', "Body hair", true));
  }

  private void saveQuestion30() {
    Question question;

    question = questionRepository.save(new Question(9, "Boston and Buffalo have both been home to major pro sports teams named what?", "2018-02-04 02:11:35"));

    answerRepository.save(new Answer(question, 'A', "Giants", false));
    answerRepository.save(new Answer(question, 'B', "Angels", false));
    answerRepository.save(new Answer(question, 'C', "Braves", true));
  }

  private void saveQuestion31() {
    Question question;

    question = questionRepository.save(new Question(10, "Which type of animal has been kept as a White House pet by a U.S. president?", "2018-02-04 02:12:20"));

    answerRepository.save(new Answer(question, 'A', "Cow", true));
    answerRepository.save(new Answer(question, 'B', "Lemur", false));
    answerRepository.save(new Answer(question, 'C', "Sugar glider", false));
  }

  private void saveQuestion32() {
    Question question;

    question = questionRepository.save(new Question(11, "In the 1800s, a chemistry student making synthetic quinine accidentally created what dye?", "2018-02-04 02:13:39"));

    answerRepository.save(new Answer(question, 'A', "Mauve", true));
    answerRepository.save(new Answer(question, 'B', "Periwinkle", false));
    answerRepository.save(new Answer(question, 'C', "Turquoise", false));
  }

  private void saveQuestion33() {
    Question question;

    question = questionRepository.save(new Question(1, "Tic-tac-toe is typically played by writing what two symbols?", "2018-02-05 20:05:13"));

    answerRepository.save(new Answer(question, 'A', "Yin and yang", false));
    answerRepository.save(new Answer(question, 'B', "+ / -", false));
    answerRepository.save(new Answer(question, 'C', "X / O", true));
  }

  private void saveQuestion34() {
    Question question;

    question = questionRepository.save(new Question(2, "What’s the anatomical name for the center of a hurricane?", "2018-02-05 20:06:00"));

    answerRepository.save(new Answer(question, 'A', "Shinbone", false));
    answerRepository.save(new Answer(question, 'B', "Pancreas", false));
    answerRepository.save(new Answer(question, 'C', "Eye", true));
  }

  private void saveQuestion35() {
    Question question;

    question = questionRepository.save(new Question(3, "Which of these is an actual Winter Olympics event?", "2018-02-05 20:06:47"));

    answerRepository.save(new Answer(question, 'A', "Skeleton", true));
    answerRepository.save(new Answer(question, 'B', "Ghostathlon", false));
    answerRepository.save(new Answer(question, 'C', "Frankensteining", false));
  }

  private void saveQuestion36() {
    Question question;

    question = questionRepository.save(new Question(4, "A high-tech store with no cashiers recently opened in Seattle under what name?", "2018-02-05 20:07:27"));

    answerRepository.save(new Answer(question, 'A', "Amazon Go", true));
    answerRepository.save(new Answer(question, 'B', "Google Shop", false));
    answerRepository.save(new Answer(question, 'C', "Microsoft Zip", false));
  }

  private void saveQuestion37() {
    Question question;

    question = questionRepository.save(new Question(5, "By definition, which of these people is guilty of treason?", "2018-02-05 20:08:09"));

    answerRepository.save(new Answer(question, 'A', "Scullion", false));
    answerRepository.save(new Answer(question, 'B', "Poltroon", false));
    answerRepository.save(new Answer(question, 'C', "Quisling", true));
  }

  private void saveQuestion38() {
    Question question;

    question = questionRepository.save(new Question(6, "Which of these actors turned down the role of Frasier Crane?", "2018-02-05 20:09:32"));

    answerRepository.save(new Answer(question, 'A', "Bob Balaban", false));
    answerRepository.save(new Answer(question, 'B', "John Lithgow", true));
    answerRepository.save(new Answer(question, 'C', "Dan Aykroyd", false));
  }

  private void saveQuestion39() {
    Question question;

    question = questionRepository.save(new Question(7, "The Benihana company has a restaurant in which of these places?", "2018-02-05 20:10:17"));

    answerRepository.save(new Answer(question, 'A', "China", false));
    answerRepository.save(new Answer(question, 'B', "Aruba", true));
    answerRepository.save(new Answer(question, 'C', "Japan", false));
  }

  private void saveQuestion40() {
    Question question;

    question = questionRepository.save(new Question(8, "Which has been the last name of a U.S. president AND a British prime minister?", "2018-02-05 20:10:57"));

    answerRepository.save(new Answer(question, 'A', "Hayes", false));
    answerRepository.save(new Answer(question, 'B', "Arthur", false));
    answerRepository.save(new Answer(question, 'C', "Wilson", true));
  }

  private void saveQuestion41() {
    Question question;

    question = questionRepository.save(new Question(9, "What author has the most books in Modern Library’s 100 Best Novels of the 20th Century?", "2018-02-05 20:11:38"));

    answerRepository.save(new Answer(question, 'A', "James Joyce", false));
    answerRepository.save(new Answer(question, 'B', "Joseph Co… https://t.co/5TFyIWhu31", false));
  }

  private void saveQuestion42() {
    Question question;

    question = questionRepository.save(new Question(10, "In what medium was Superman’s Kryptonite weakness introduced?", "2018-02-05 20:12:55"));

    answerRepository.save(new Answer(question, 'A', "The radio series", true));
    answerRepository.save(new Answer(question, 'B', "The 1978 movie", false));
    answerRepository.save(new Answer(question, 'C', "Action Comics #64", false));
  }

  private void saveQuestion43() {
    Question question;

    question = questionRepository.save(new Question(11, "Which statement is NOT true about photosynthesis and chemosynthesis?", "2018-02-05 20:14:09"));

    answerRepository.save(new Answer(question, 'A', "Both powered by sunlight", true));
    answerRepository.save(new Answer(question, 'B', "Both involve… https://t.co/5FEXHxoJ1w", false));
  }

  private void saveQuestion44() {
    Question question;

    question = questionRepository.save(new Question(12, "What costume was worn by the original lead singer of the Village People?", "2018-02-05 20:15:08"));

    answerRepository.save(new Answer(question, 'A', "Cowboy", false));
    answerRepository.save(new Answer(question, 'B', "Policeman", true));
    answerRepository.save(new Answer(question, 'C', "Construction worker", false));
  }

  private void saveQuestion45() {
    Question question;

    question = questionRepository.save(new Question(1, "A spork is a utensil that combines what two things?", "2018-02-06 02:05:11"));

    answerRepository.save(new Answer(question, 'A', "Spam / pork", false));
    answerRepository.save(new Answer(question, 'B', "Sponge / cork", false));
    answerRepository.save(new Answer(question, 'C', "Spoon / fork", true));
  }

  private void saveQuestion46() {
    Question question;

    question = questionRepository.save(new Question(2, "On a compass, what does the letter N typically stand for?", "2018-02-06 02:06:00"));

    answerRepository.save(new Answer(question, 'A', "Norbit", false));
    answerRepository.save(new Answer(question, 'B', "North", true));
    answerRepository.save(new Answer(question, 'C', "Nordic", false));
  }

  private void saveQuestion47() {
    Question question;

    question = questionRepository.save(new Question(3, "In 2017, what did Twitter do to its 140-character limit on tweets?", "2018-02-06 02:06:39"));

    answerRepository.save(new Answer(question, 'A', "Double it", true));
    answerRepository.save(new Answer(question, 'B', "Halve it", false));
    answerRepository.save(new Answer(question, 'C', "Reduce it to 15", false));
  }

  private void saveQuestion48() {
    Question question;

    question = questionRepository.save(new Question(4, "What popular corn chip loosely translates to “little golden things” in Spanish?", "2018-02-06 02:08:41"));

    answerRepository.save(new Answer(question, 'A', "Tostitos", false));
    answerRepository.save(new Answer(question, 'B', "Fritos", false));
    answerRepository.save(new Answer(question, 'C', "Doritos", true));
  }

  private void saveQuestion49() {
    Question question;

    question = questionRepository.save(new Question(5, "U.S. air traffic controllers refer to the plane the Pope travels on by what official call sign?", "2018-02-06 02:12:04"));

    answerRepository.save(new Answer(question, 'A', "Shepherd One", true));
    answerRepository.save(new Answer(question, 'B', "Il Papa", false));
    answerRepository.save(new Answer(question, 'C', "Air Vatican", false));
  }

  private void saveQuestion50() {
    Question question;

    question = questionRepository.save(new Question(6, "What zodiac sign features a creature that defends itself with an aculeus?", "2018-02-06 02:12:48"));

    answerRepository.save(new Answer(question, 'A', "Cancer", false));
    answerRepository.save(new Answer(question, 'B', "Sagittarius", false));
    answerRepository.save(new Answer(question, 'C', "Scorpio", true));
  }

  private void saveQuestion51() {
    Question question;

    question = questionRepository.save(new Question(7, "Who was the first U.S. president to enjoy indoor plumbing at the White House?", "2018-02-06 02:13:39"));

    answerRepository.save(new Answer(question, 'A', "Millard Fillmore", false));
    answerRepository.save(new Answer(question, 'B', "Andrew Jackson", true));
    answerRepository.save(new Answer(question, 'C', "John Adams", false));
  }

  private void saveQuestion52() {
    Question question;

    question = questionRepository.save(new Question(8, "From 2000 to 2002, what MLB team's stadium was named for a company that no longer exists?", "2018-02-06 02:14:23"));

    answerRepository.save(new Answer(question, 'A', "Angels", false));
    answerRepository.save(new Answer(question, 'B', "Rays", false));
    answerRepository.save(new Answer(question, 'C', "Astros", true));
  }

  private void saveQuestion53() {
    Question question;

    question = questionRepository.save(new Question(9, "The lunar module for the Apollo 10 moon mission was nicknamed what?", "2018-02-06 02:15:10"));

    answerRepository.save(new Answer(question, 'A', "Eagle", false));
    answerRepository.save(new Answer(question, 'B', "Beagle", false));
    answerRepository.save(new Answer(question, 'C', "Snoopy", true));
  }

  private void saveQuestion54() {
    Question question;

    question = questionRepository.save(new Question(10, "Which public radio program is hosted by the cousin of a multiple Oscar-nominated composer?", "2018-02-06 02:16:12"));

    answerRepository.save(new Answer(question, 'A', "This American Life… https://t.co/TCq5MtCnKD", true));
  }

  private void saveQuestion55() {
    Question question;

    question = questionRepository.save(new Question(11, "After Prince Edward Island, what is Canada’s most densely populated province?", "2018-02-06 02:16:48"));

    answerRepository.save(new Answer(question, 'A', "New Brunswick", false));
    answerRepository.save(new Answer(question, 'B', "Ontario", false));
    answerRepository.save(new Answer(question, 'C', "Nova Scotia", true));
  }

  private void saveQuestion56() {
    Question question;

    question = questionRepository.save(new Question(12, "An extremely impolite guest at a Nixon family wedding went on to write under what nom de plume?", "2018-02-06 02:18:21"));

    answerRepository.save(new Answer(question, 'A', "Dorothy Dix", false));
    answerRepository.save(new Answer(question, 'B', "M… https://t.co/43fqcbjON7", false));
  }

  private void saveQuestion57() {
    Question question;

    question = questionRepository.save(new Question(1, "What is a common remedy for dehydration?", "2018-02-06 20:04:38"));

    answerRepository.save(new Answer(question, 'A', "Drinking water", true));
    answerRepository.save(new Answer(question, 'B', "Running a marathon", false));
    answerRepository.save(new Answer(question, 'C', "Slaying a hydra", false));
  }

  private void saveQuestion58() {
    Question question;

    question = questionRepository.save(new Question(2, "The band that recorded “September” is named “Earth, Wind &amp;” what?", "2018-02-06 20:07:19"));

    answerRepository.save(new Answer(question, 'A', "Frederick", false));
    answerRepository.save(new Answer(question, 'B', "Fire", true));
    answerRepository.save(new Answer(question, 'C', "Flagellum", false));
  }

  private void saveQuestion59() {
    Question question;

    question = questionRepository.save(new Question(1, "In the classic fairy tale, who is Little Red Riding Hood's enemy?", "2018-02-07 02:05:17"));

    answerRepository.save(new Answer(question, 'A', "Big Baller Brand", false));
    answerRepository.save(new Answer(question, 'B', "Big Lebowski", false));
    answerRepository.save(new Answer(question, 'C', "Big Bad Wolf", true));
  }

  private void saveQuestion60() {
    Question question;

    question = questionRepository.save(new Question(2, "Pantene Pro-V and Garnier Fructis are popular types of what?", "2018-02-07 02:05:59"));

    answerRepository.save(new Answer(question, 'A', "ShamWow", false));
    answerRepository.save(new Answer(question, 'B', "Shampoo", true));
    answerRepository.save(new Answer(question, 'C', "Champagne", false));
  }

  private void saveQuestion61() {
    Question question;

    question = questionRepository.save(new Question(3, "A bed that folds up into the wall is commonly known as what?", "2018-02-07 02:06:43"));

    answerRepository.save(new Answer(question, 'A', "Sully bed", false));
    answerRepository.save(new Answer(question, 'B', "Fitzy bed", false));
    answerRepository.save(new Answer(question, 'C', "Murphy bed", true));
  }

  private void saveQuestion62() {
    Question question;

    question = questionRepository.save(new Question(4, "Which of these colleges does NOT have a physical location?", "2018-02-07 02:07:31"));

    answerRepository.save(new Answer(question, 'A', "Electoral College", true));
    answerRepository.save(new Answer(question, 'B', "Deep Springs College", false));
    answerRepository.save(new Answer(question, 'C', "Hampshire College", false));
  }

  private void saveQuestion63() {
    Question question;

    question = questionRepository.save(new Question(5, "Which of these desserts is often made with ladyfingers?", "2018-02-07 02:08:10"));

    answerRepository.save(new Answer(question, 'A', "Tiramisu", true));
    answerRepository.save(new Answer(question, 'B', "Magdalena", false));
    answerRepository.save(new Answer(question, 'C', "Financier", false));
  }

  private void saveQuestion64() {
    Question question;

    question = questionRepository.save(new Question(6, "Which of these is a real illness that affects rabbits?", "2018-02-07 02:09:07"));

    answerRepository.save(new Answer(question, 'A', "Ruffles", false));
    answerRepository.save(new Answer(question, 'B', "Fluffles", false));
    answerRepository.save(new Answer(question, 'C', "Snuffles", true));
  }

  private void saveQuestion65() {
    Question question;

    question = questionRepository.save(new Question(7, "The Doors are named after a famous essay by the author of what iconic novel?", "2018-02-07 02:09:57"));

    answerRepository.save(new Answer(question, 'A', "Lolita", false));
    answerRepository.save(new Answer(question, 'B', "On the Road", false));
    answerRepository.save(new Answer(question, 'C', "Brave New World", true));
  }

  private void saveQuestion66() {
    Question question;

    question = questionRepository.save(new Question(8, "Which TV news host once wrote about his first date with Monica Lewinsky?", "2018-02-07 02:10:50"));

    answerRepository.save(new Answer(question, 'A', "Jake Tapper", true));
    answerRepository.save(new Answer(question, 'B', "Van Jones", false));
    answerRepository.save(new Answer(question, 'C', "Chris Hayes", false));
  }

  private void saveQuestion67() {
    Question question;

    question = questionRepository.save(new Question(9, "The famous German phrase “Sturm und Drang” comes from what?", "2018-02-07 02:11:37"));

    answerRepository.save(new Answer(question, 'A', "Poem", false));
    answerRepository.save(new Answer(question, 'B', "Novel", false));
    answerRepository.save(new Answer(question, 'C', "Play", true));
  }

  private void saveQuestion68() {
    Question question;

    question = questionRepository.save(new Question(10, "In which African country is English NOT the official language?", "2018-02-07 02:12:18"));

    answerRepository.save(new Answer(question, 'A', "Sierra Leone", false));
    answerRepository.save(new Answer(question, 'B', "Liberia", false));
    answerRepository.save(new Answer(question, 'C', "Chad", true));
  }

  private void saveQuestion69() {
    Question question;

    question = questionRepository.save(new Question(11, "Which ‘90s movie is an anagram of the original book title which the film is based on?", "2018-02-07 02:13:11"));

    answerRepository.save(new Answer(question, 'A', "Free Willy", false));
    answerRepository.save(new Answer(question, 'B', "October Sky", true));
    answerRepository.save(new Answer(question, 'C', "Jumanji", false));
  }

  private void saveQuestion70() {
    Question question;

    question = questionRepository.save(new Question(12, "Which legendary music producer is closely related to former President Jimmy Carter?", "2018-02-07 02:14:35"));

    answerRepository.save(new Answer(question, 'A', "Jeff Lynne", false));
    answerRepository.save(new Answer(question, 'B', "Brian Eno", false));
    answerRepository.save(new Answer(question, 'C', "Berry Gordy", true));
  }

  private void saveQuestion71() {
    Question question;

    question = questionRepository.save(new Question(1, "Which of these websites is an online database for movies, television and video games?", "2018-02-07 20:05:24"));

    answerRepository.save(new Answer(question, 'A', "Petfinder", false));
    answerRepository.save(new Answer(question, 'B', "IMDb", true));
    answerRepository.save(new Answer(question, 'C', "Yelp", false));
  }

  private void saveQuestion72() {
    Question question;

    question = questionRepository.save(new Question(2, "What does bicameral mean?", "2018-02-07 20:06:47"));

    answerRepository.save(new Answer(question, 'A', "Two camels", false));
    answerRepository.save(new Answer(question, 'B', "Two cameras", false));
    answerRepository.save(new Answer(question, 'C', "Two chambers", true));
  }

  private void saveQuestion73() {
    Question question;

    question = questionRepository.save(new Question(3, "A galleon is an old-fashioned type of what?", "2018-02-07 20:07:29"));

    answerRepository.save(new Answer(question, 'A', "Ship", true));
    answerRepository.save(new Answer(question, 'B', "Measurement", false));
    answerRepository.save(new Answer(question, 'C', "Dress", false));
  }

  private void saveQuestion74() {
    Question question;

    question = questionRepository.save(new Question(4, "What male singing voice type is higher than a bass, but lower than a tenor?", "2018-02-07 20:08:57"));

    answerRepository.save(new Answer(question, 'A', "Baritone", true));
    answerRepository.save(new Answer(question, 'B', "Countertenor", false));
    answerRepository.save(new Answer(question, 'C', "Sopranist", false));
  }

  private void saveQuestion75() {
    Question question;

    question = questionRepository.save(new Question(5, "Which of these is NOT a real berry?", "2018-02-07 20:09:18"));

    answerRepository.save(new Answer(question, 'A', "Buffaloberry", false));
    answerRepository.save(new Answer(question, 'B', "Iceberry", true));
    answerRepository.save(new Answer(question, 'C', "Cloudberry", false));
  }

  private void saveQuestion76() {
    Question question;

    question = questionRepository.save(new Question(6, "George Washington Carver is famous for his scientific work on what subject?", "2018-02-07 20:10:45"));

    answerRepository.save(new Answer(question, 'A', "Soil depletion", true));
    answerRepository.save(new Answer(question, 'B', "Irrigation technology", false));
    answerRepository.save(new Answer(question, 'C', "Food packaging", false));
  }

  private void saveQuestion77() {
    Question question;

    question = questionRepository.save(new Question(7, "Which of these is NOT believed to be a function of the uvula?", "2018-02-07 20:11:41"));

    answerRepository.save(new Answer(question, 'A', "Taste", true));
    answerRepository.save(new Answer(question, 'B', "Speech", false));
    answerRepository.save(new Answer(question, 'C', "Lubricant", false));
  }

  private void saveQuestion78() {
    Question question;

    question = questionRepository.save(new Question(8, "Which of these baseball legends was a first-ballot Hall of Famer?", "2018-02-07 20:12:32"));

    answerRepository.save(new Answer(question, 'A', "Joe DiMaggio", false));
    answerRepository.save(new Answer(question, 'B', "Cy Young", false));
    answerRepository.save(new Answer(question, 'C', "Mickey Mantle", true));
  }

  private void saveQuestion79() {
    Question question;

    question = questionRepository.save(new Question(9, "Which of these things can be mathematically described as an oblate spheroid?", "2018-02-07 20:15:04"));

    answerRepository.save(new Answer(question, 'A', "NFL football", false));
    answerRepository.save(new Answer(question, 'B', "Unshelled peanut", false));
    answerRepository.save(new Answer(question, 'C', "Planet Earth", true));
  }

  private void saveQuestion80() {
    Question question;

    question = questionRepository.save(new Question(1, "“Fro-yo” is short for what?", "2018-02-08 02:04:22"));

    answerRepository.save(new Answer(question, 'A', "Frolicking yokels", false));
    answerRepository.save(new Answer(question, 'B', "Frozen yogurt", true));
    answerRepository.save(new Answer(question, 'C', "Frog yoga", false));
  }

  private void saveQuestion81() {
    Question question;

    question = questionRepository.save(new Question(2, "In Shakespeare's play “Julius Caesar,” what phrase does the titular character say to Brutus?", "2018-02-08 02:05:14"));

    answerRepository.save(new Answer(question, 'A', "Et tu, Brute?", true));
    answerRepository.save(new Answer(question, 'B', "", false));
  }

  private void saveQuestion82() {
    Question question;

    question = questionRepository.save(new Question(3, "What is the name of a Japanese art form that features trees grown in containers?", "2018-02-08 02:06:34"));

    answerRepository.save(new Answer(question, 'A', "Kawaii", false));
    answerRepository.save(new Answer(question, 'B', "Bonsai", true));
    answerRepository.save(new Answer(question, 'C', "Manga", false));
  }

  private void saveQuestion83() {
    Question question;

    question = questionRepository.save(new Question(4, "What college football team’s chant is also likely to be heard on a farm?", "2018-02-08 02:06:56"));

    answerRepository.save(new Answer(question, 'A', "Arkansas Razorbacks", true));
    answerRepository.save(new Answer(question, 'B', "Ole Miss Rebels", false));
    answerRepository.save(new Answer(question, 'C', "Penn State Lions", false));
  }

  private void saveQuestion84() {
    Question question;

    question = questionRepository.save(new Question(5, "What legendary “Buffalo Bill’s Wild West” star had a negative-sounding nickname?", "2018-02-08 02:08:07"));

    answerRepository.save(new Answer(question, 'A', "Annie Oakley", false));
    answerRepository.save(new Answer(question, 'B', "May Lillie", false));
    answerRepository.save(new Answer(question, 'C', "Martha Jane Cannary", true));
  }

  private void saveQuestion85() {
    Question question;

    question = questionRepository.save(new Question(6, "Where did Bernese Mountain Dogs originate?", "2018-02-08 02:09:08"));

    answerRepository.save(new Answer(question, 'A', "Myanmar", false));
    answerRepository.save(new Answer(question, 'B', "Switzerland", true));
    answerRepository.save(new Answer(question, 'C', "Afghanistan", false));
  }

  private void saveQuestion86() {
    Question question;

    question = questionRepository.save(new Question(7, "Which fashion designer is grandmother to a literal princess?", "2018-02-08 02:10:55"));

    answerRepository.save(new Answer(question, 'A', "Diane von Fürstenberg", true));
    answerRepository.save(new Answer(question, 'B', "Rei Kawakubo", false));
    answerRepository.save(new Answer(question, 'C', "Vivienne Westwood", false));
  }

  private void saveQuestion87() {
    Question question;

    question = questionRepository.save(new Question(8, "Which film features the same kind of talking animal as the Old Testament book Numbers?", "2018-02-08 02:11:27"));

    answerRepository.save(new Answer(question, 'A', "The Lion King", false));
    answerRepository.save(new Answer(question, 'B', "Finding Nemo", false));
    answerRepository.save(new Answer(question, 'C', "Shrek", true));
  }

  private void saveQuestion88() {
    Question question;

    question = questionRepository.save(new Question(9, "Which of these posts was Constance Baker Motley NOT the first African-American woman to hold?", "2018-02-08 02:12:33"));

    answerRepository.save(new Answer(question, 'A', "NY state senator", false));
    answerRepository.save(new Answer(question, 'B', "", false));
  }

  private void saveQuestion89() {
    Question question;

    question = questionRepository.save(new Question(10, "In which country is GeoCities still up and running?", "2018-02-08 02:13:15"));

    answerRepository.save(new Answer(question, 'A', "Canada", false));
    answerRepository.save(new Answer(question, 'B', "Japan", true));
    answerRepository.save(new Answer(question, 'C', "Australia", false));
  }

  private void saveQuestion90() {
    Question question;

    question = questionRepository.save(new Question(11, "Before the lyrics are sung, how many finger snaps are heard in the “Addams Family” theme song?", "2018-02-08 02:14:31"));

    answerRepository.save(new Answer(question, 'A', "12 snaps", true));
    answerRepository.save(new Answer(question, 'B', "6 snaps", false));
    answerRepository.save(new Answer(question, 'C', "8 snaps", false));
  }

  private void saveQuestion91() {
    Question question;

    question = questionRepository.save(new Question(1, "Which of these is the name of a princess in Disney's “Frozen”?", "2018-02-08 20:03:54"));

    answerRepository.save(new Answer(question, 'A', "Frosier", false));
    answerRepository.save(new Answer(question, 'B', "Jack Frost", false));
    answerRepository.save(new Answer(question, 'C', "Elsa", true));
  }

  private void saveQuestion92() {
    Question question;

    question = questionRepository.save(new Question(2, "The Olympic logo features what combination of shapes?", "2018-02-08 20:04:34"));

    answerRepository.save(new Answer(question, 'A', "Two triangles", false));
    answerRepository.save(new Answer(question, 'B', "Five rings", true));
    answerRepository.save(new Answer(question, 'C', "Seven parabolas", false));
  }

  private void saveQuestion93() {
    Question question;

    question = questionRepository.save(new Question(3, "The Italian cooking term “al dente” means what?", "2018-02-08 20:05:26"));

    answerRepository.save(new Answer(question, 'A', "Firm", true));
    answerRepository.save(new Answer(question, 'B', "With butter", false));
    answerRepository.save(new Answer(question, 'C', "Salted", false));
  }

  private void saveQuestion94() {
    Question question;

    question = questionRepository.save(new Question(4, "Which of these companies offers a “freemium” service?", "2018-02-08 20:06:05"));

    answerRepository.save(new Answer(question, 'A', "Spotify", true));
    answerRepository.save(new Answer(question, 'B', "Netflix", false));
    answerRepository.save(new Answer(question, 'C', "Tidal", false));
  }

  private void saveQuestion95() {
    Question question;

    question = questionRepository.save(new Question(5, "What word does Nestlé use to describe their Toll House chocolate chips?", "2018-02-08 20:07:34"));

    answerRepository.save(new Answer(question, 'A', "Morsels", true));
    answerRepository.save(new Answer(question, 'B', "Nibbles", false));
    answerRepository.save(new Answer(question, 'C', "Samples", false));
  }

  private void saveQuestion96() {
    Question question;

    question = questionRepository.save(new Question(6, "Which of these countries legally guarantees its citizens “freedom to roam”?", "2018-02-08 20:07:46"));

    answerRepository.save(new Answer(question, 'A', "Brazil", false));
    answerRepository.save(new Answer(question, 'B', "Sweden", true));
    answerRepository.save(new Answer(question, 'C', "Mongolia", false));
  }

  private void saveQuestion97() {
    Question question;

    question = questionRepository.save(new Question(7, "Bill Cunningham was a key influence in what style of photography?", "2018-02-08 20:08:21"));

    answerRepository.save(new Answer(question, 'A', "Tilt-shift", false));
    answerRepository.save(new Answer(question, 'B', "Portrait", false));
    answerRepository.save(new Answer(question, 'C', "Street style", true));
  }

  private void saveQuestion98() {
    Question question;

    question = questionRepository.save(new Question(8, "“INTJ” is a personality type based on a hypothesis by which psychiatrist?", "2018-02-08 20:09:02"));

    answerRepository.save(new Answer(question, 'A', "B.F. Skinner", false));
    answerRepository.save(new Answer(question, 'B', "Carl Jung", true));
    answerRepository.save(new Answer(question, 'C', "Sigmund Freud", false));
  }

  private void saveQuestion99() {
    Question question;

    question = questionRepository.save(new Question(9, "Which of these activists is the subject of a song by John Lennon and Yoko Ono?", "2018-02-08 20:09:51"));

    answerRepository.save(new Answer(question, 'A', "Angela Davis", true));
    answerRepository.save(new Answer(question, 'B', "Martin Luther King, Jr.", false));
    answerRepository.save(new Answer(question, 'C', "Bobby Seale", false));
  }

  private void saveQuestion100() {
    Question question;

    question = questionRepository.save(new Question(10, "The U.S. flag bearer for the 2018 Olympics is a medalist in what event?", "2018-02-08 20:10:36"));

    answerRepository.save(new Answer(question, 'A', "Figure skating", false));
    answerRepository.save(new Answer(question, 'B', "Speed skating", false));
    answerRepository.save(new Answer(question, 'C', "Luge", true));
  }

  private void saveQuestion101() {
    Question question;

    question = questionRepository.save(new Question(11, "Which of these people was born with the same name as a famous ketchup?", "2018-02-08 20:12:32"));

    answerRepository.save(new Answer(question, 'A', "Henry Ford", false));
    answerRepository.save(new Answer(question, 'B', "Karl Marx", false));
    answerRepository.save(new Answer(question, 'C', "Henry Kissinger", true));
  }

  private void saveQuestion102() {
    Question question;

    question = questionRepository.save(new Question(1, "What form of energy do batteries provide?", "2018-02-09 02:06:11"));

    answerRepository.save(new Answer(question, 'A', "Synergy", false));
    answerRepository.save(new Answer(question, 'B', "Emotional", false));
    answerRepository.save(new Answer(question, 'C', "Electrical", true));
  }

  private void saveQuestion103() {
    Question question;

    question = questionRepository.save(new Question(2, "Which “Rose” was the lead singer of Guns N' Roses?", "2018-02-09 02:07:05"));

    answerRepository.save(new Answer(question, 'A', "Pete", false));
    answerRepository.save(new Answer(question, 'B', "Jalen", false));
    answerRepository.save(new Answer(question, 'C', "Axl", true));
  }

  private void saveQuestion104() {
    Question question;

    question = questionRepository.save(new Question(3, "In a best-selling Little Golden Book, who was “The Monster at The End of This Book”?", "2018-02-09 02:08:18"));

    answerRepository.save(new Answer(question, 'A', "Sesame Street's Grover", true));
    answerRepository.save(new Answer(question, 'B', "Dracula", false));
    answerRepository.save(new Answer(question, 'C', "The reader", false));
  }

  private void saveQuestion105() {
    Question question;

    question = questionRepository.save(new Question(4, "“Embarazada” is the Spanish word for what?", "2018-02-09 02:08:38"));

    answerRepository.save(new Answer(question, 'A', "Naked", false));
    answerRepository.save(new Answer(question, 'B', "Pregnant", true));
    answerRepository.save(new Answer(question, 'C', "Embarrassed", false));
  }

  private void saveQuestion106() {
    Question question;

    question = questionRepository.save(new Question(5, "Which American car manufacturer first introduced seat belts?", "2018-02-09 02:09:30"));

    answerRepository.save(new Answer(question, 'A', "Jeep", false));
    answerRepository.save(new Answer(question, 'B', "Ford", false));
    answerRepository.save(new Answer(question, 'C', "Nash", true));
  }

  private void saveQuestion107() {
    Question question;

    question = questionRepository.save(new Question(6, "Which of these authors has NOT written a comic book about Black Panther?", "2018-02-09 02:10:29"));

    answerRepository.save(new Answer(question, 'A', "Roxane Gay", false));
    answerRepository.save(new Answer(question, 'B', "Ta-Nehisi Coates", false));
    answerRepository.save(new Answer(question, 'C', "Cornel West", true));
  }

  private void saveQuestion108() {
    Question question;

    question = questionRepository.save(new Question(7, "Last year, Microsoft angered customers by announcing it would eliminate what Windows software?", "2018-02-09 02:12:06"));

    answerRepository.save(new Answer(question, 'A', "WordPad", false));
    answerRepository.save(new Answer(question, 'B', "Solitaire", false));
    answerRepository.save(new Answer(question, 'C', "Paint", true));
  }

  private void saveQuestion109() {
    Question question;

    question = questionRepository.save(new Question(8, "A 1984 Devo album has the same name as a massive 1984 single by what band?", "2018-02-09 02:12:30"));

    answerRepository.save(new Answer(question, 'A', "The Human League", false));
    answerRepository.save(new Answer(question, 'B', "Pet Shop Boys", false));
    answerRepository.save(new Answer(question, 'C', "Tears for Fears", true));
  }

  private void saveQuestion110() {
    Question question;

    question = questionRepository.save(new Question(9, "Police tell arrestees they have the right to remain silent thanks to a Supreme Court ruling against what U.S. state… https://t.co/LpeQPVHNUb", "2018-02-09 02:13:26"));

  }

  private void saveQuestion111() {
    Question question;

    question = questionRepository.save(new Question(10, "In da Vinci’s “Last Supper,” which disciple is depicted holding a weapon?", "2018-02-09 02:14:37"));

    answerRepository.save(new Answer(question, 'A', "Peter", true));
    answerRepository.save(new Answer(question, 'B', "Judas", false));
    answerRepository.save(new Answer(question, 'C', "John", false));
  }

  private void saveQuestion112() {
    Question question;

    question = questionRepository.save(new Question(1, "Which term is shorthand for a useful item when changing a flat tire?", "2018-02-09 20:05:58"));

    answerRepository.save(new Answer(question, 'A', "Surplus", false));
    answerRepository.save(new Answer(question, 'B', "Spare", true));
    answerRepository.save(new Answer(question, 'C', "Supplement", false));
  }

  private void saveQuestion113() {
    Question question;

    question = questionRepository.save(new Question(2, "Tonga's 2016 Olympic flag bearer became a global viral sensation for dressing how?", "2018-02-09 20:06:57"));

    answerRepository.save(new Answer(question, 'A', "Oiled up &amp; shirtless", true));
    answerRepository.save(new Answer(question, 'B', "Com… https://t.co/toEPMAKGXC", false));
  }

  private void saveQuestion114() {
    Question question;

    question = questionRepository.save(new Question(3, "What Olympic legend was the subject of a song in an Oscar-nominated 1999 film?", "2018-02-09 20:07:57"));

    answerRepository.save(new Answer(question, 'A', "Brian Boitano", true));
    answerRepository.save(new Answer(question, 'B', "Kristi Yamaguchi", false));
    answerRepository.save(new Answer(question, 'C', "Michelle Kwan", false));
  }

  private void saveQuestion115() {
    Question question;

    question = questionRepository.save(new Question(4, "Which of these items would be measured on the Scoville scale?", "2018-02-09 20:09:23"));

    answerRepository.save(new Answer(question, 'A', "Habanero", true));
    answerRepository.save(new Answer(question, 'B', "Typhoon", false));
    answerRepository.save(new Answer(question, 'C', "Emerald", false));
  }

  private void saveQuestion116() {
    Question question;

    question = questionRepository.save(new Question(5, "Which of these iconic African-American leaders was NOT born into slavery?", "2018-02-09 20:10:48"));

    answerRepository.save(new Answer(question, 'A', "W.E.B. Du Bois", true));
    answerRepository.save(new Answer(question, 'B', "Frederick Douglass", false));
    answerRepository.save(new Answer(question, 'C', "Booker T. Washington", false));
  }

  private void saveQuestion117() {
    Question question;

    question = questionRepository.save(new Question(6, "A cat with what fur pattern is almost always female?", "2018-02-09 20:10:59"));

    answerRepository.save(new Answer(question, 'A', "Calico", true));
    answerRepository.save(new Answer(question, 'B', "Tuxedo", false));
    answerRepository.save(new Answer(question, 'C', "Tabby", false));
  }

  private void saveQuestion118() {
    Question question;

    question = questionRepository.save(new Question(7, "Which nation does NOT have a two-word capital city?", "2018-02-09 20:11:43"));

    answerRepository.save(new Answer(question, 'A', "Brunei", true));
    answerRepository.save(new Answer(question, 'B', "Ethiopia", false));
    answerRepository.save(new Answer(question, 'C', "Malaysia", false));
  }

  private void saveQuestion119() {
    Question question;

    question = questionRepository.save(new Question(8, "In 2014, an excavation at a New Mexican landfill uncovered what?", "2018-02-09 20:12:26"));

    answerRepository.save(new Answer(question, 'A', "Flying car prototype", false));
    answerRepository.save(new Answer(question, 'B', "Lost Picasso sculpture… https://t.co/1m15Yq1n0W", false));
  }

  private void saveQuestion120() {
    Question question;

    question = questionRepository.save(new Question(9, "The athlete who has competed in the most Olympic games hails from which country?", "2018-02-09 20:13:11"));

    answerRepository.save(new Answer(question, 'A', "Canada", true));
    answerRepository.save(new Answer(question, 'B', "Finland", false));
    answerRepository.save(new Answer(question, 'C', "Japan", false));
  }

  private void saveQuestion121() {
    Question question;

    question = questionRepository.save(new Question(10, "Which of these fonts was NOT created by Microsoft?", "2018-02-09 20:13:59"));

    answerRepository.save(new Answer(question, 'A', "Comic Sans", false));
    answerRepository.save(new Answer(question, 'B', "Verdana", false));
    answerRepository.save(new Answer(question, 'C', "Papyrus", true));
  }

  private void saveQuestion122() {
    Question question;

    question = questionRepository.save(new Question(11, "In the first known use of “mammoth” as an adjective, what item was it describing?", "2018-02-09 20:14:44"));

    answerRepository.save(new Answer(question, 'A', "Hunk of cheese", true));
    answerRepository.save(new Answer(question, 'B', "Empire State Building", false));
    answerRepository.save(new Answer(question, 'C', "Dinosaur", false));
  }

  private void saveQuestion123() {
    Question question;

    question = questionRepository.save(new Question(12, "Which of these countries has a lower gross domestic product than any U.S. state?", "2018-02-09 20:16:13"));

    answerRepository.save(new Answer(question, 'A', "Ecuador", false));
    answerRepository.save(new Answer(question, 'B', "Uzbekistan", false));
    answerRepository.save(new Answer(question, 'C', "Iceland", true));
  }

  private void saveQuestion124() {
    Question question;

    question = questionRepository.save(new Question(1, "Which of these Olympians is most likely to perform a lutz, axel or toe loop jump?", "2018-02-10 02:07:35"));

    answerRepository.save(new Answer(question, 'A', "Michael Phelps", false));
    answerRepository.save(new Answer(question, 'B', "Usain Bolt", false));
    answerRepository.save(new Answer(question, 'C', "Kristi Yamaguchi", true));
  }

  private void saveQuestion125() {
    Question question;

    question = questionRepository.save(new Question(2, "From what country did the American colonies win their independence?", "2018-02-10 02:09:09"));

    answerRepository.save(new Answer(question, 'A', "Japan", false));
    answerRepository.save(new Answer(question, 'B', "Wakanda", false));
    answerRepository.save(new Answer(question, 'C', "Great Britain", true));
  }

  private void saveQuestion126() {
    Question question;

    question = questionRepository.save(new Question(3, "Which of these animals is NOT native to Australia?", "2018-02-10 02:09:53"));

    answerRepository.save(new Answer(question, 'A', "Capybara", true));
    answerRepository.save(new Answer(question, 'B', "Wallaby", false));
    answerRepository.save(new Answer(question, 'C', "Koala", false));
  }

  private void saveQuestion127() {
    Question question;

    question = questionRepository.save(new Question(4, "Which congressman participated in the Selma to Montgomery marches of 1965?", "2018-02-10 02:10:32"));

    answerRepository.save(new Answer(question, 'A', "Cedric Richmond", false));
    answerRepository.save(new Answer(question, 'B', "John Lewis", true));
    answerRepository.save(new Answer(question, 'C', "Jason Lewis", false));
  }

  private void saveQuestion128() {
    Question question;

    question = questionRepository.save(new Question(5, "The Ark of the Covenant supposedly contains what religious artifact?", "2018-02-10 02:11:26"));

    answerRepository.save(new Answer(question, 'A', "The Ten Commandments", true));
    answerRepository.save(new Answer(question, 'B', "The Holy Grail", false));
    answerRepository.save(new Answer(question, 'C', "Shroud of Turin", false));
  }

  private void saveQuestion129() {
    Question question;

    question = questionRepository.save(new Question(6, "Which of these actors is incapable of making a fist with his left hand?", "2018-02-10 02:13:14"));

    answerRepository.save(new Answer(question, 'A', "Al Pacino", false));
    answerRepository.save(new Answer(question, 'B', "Morgan Freeman", true));
    answerRepository.save(new Answer(question, 'C', "Anthony Hopkins", false));
  }

  private void saveQuestion130() {
    Question question;

    question = questionRepository.save(new Question(7, "Which of these is NOT a term used in Olympic curling?", "2018-02-10 02:13:16"));

    answerRepository.save(new Answer(question, 'A', "Hogged stone", false));
    answerRepository.save(new Answer(question, 'B', "Burned stone", false));
    answerRepository.save(new Answer(question, 'C', "Chunked stone", true));
  }

  private void saveQuestion131() {
    Question question;

    question = questionRepository.save(new Question(8, "The “Cha-Cha Slide” includes a dance move named after what cartoon character?", "2018-02-10 02:13:52"));

    answerRepository.save(new Answer(question, 'A', "Scooby-Doo", false));
    answerRepository.save(new Answer(question, 'B', "Daffy Duck", false));
    answerRepository.save(new Answer(question, 'C', "Charlie Brown", true));
  }

  private void saveQuestion132() {
    Question question;

    question = questionRepository.save(new Question(9, "Portuguese is an official language of which country?", "2018-02-10 02:14:33"));

    answerRepository.save(new Answer(question, 'A', "Equatorial Guinea", true));
    answerRepository.save(new Answer(question, 'B', "Papua New Guinea", false));
    answerRepository.save(new Answer(question, 'C', "Republic of Guinea", false));
  }

  private void saveQuestion133() {
    Question question;

    question = questionRepository.save(new Question(10, "Among U.S. astronauts, what distinction does Sally Ride have?", "2018-02-10 02:15:16"));

    answerRepository.save(new Answer(question, 'A', "Youngest to go to space", true));
    answerRepository.save(new Answer(question, 'B', "Most missions flown", false));
    answerRepository.save(new Answer(question, 'C', "", false));
  }

  private void saveQuestion134() {
    Question question;

    question = questionRepository.save(new Question(11, "Which chemical compound would you NOT use to create red and blue fireworks?", "2018-02-10 02:15:52"));

    answerRepository.save(new Answer(question, 'A', "Sodium nitrate", true));
    answerRepository.save(new Answer(question, 'B', "Strontium carbonate", false));
    answerRepository.save(new Answer(question, 'C', "Copper chloride", false));
  }

  private void saveQuestion135() {
    Question question;

    question = questionRepository.save(new Question(12, "King Louis XIV’s Palace of Versailles contained over 150 pieces of furniture made entirely of what?", "2018-02-10 02:17:27"));

    answerRepository.save(new Answer(question, 'A', "Silver", true));
    answerRepository.save(new Answer(question, 'B', "Ivory", false));
    answerRepository.save(new Answer(question, 'C', "Ebony", false));
  }

  private void saveQuestion136() {
    Question question;

    question = questionRepository.save(new Question(1, "Which of the following is NOT used to describe someone from that particular state?", "2018-02-11 02:07:21"));

    answerRepository.save(new Answer(question, 'A', "Wisconsinian", true));
    answerRepository.save(new Answer(question, 'B', "Utahn", false));
    answerRepository.save(new Answer(question, 'C', "Connecticuter", false));
  }

  private void saveQuestion137() {
    Question question;

    question = questionRepository.save(new Question(2, "Lonnie Johnson accidentally created the Supersoaker while trying to build what?", "2018-02-11 02:09:50"));

    answerRepository.save(new Answer(question, 'A', "Heat pump", true));
    answerRepository.save(new Answer(question, 'B', "Nerf Blaster rival", false));
    answerRepository.save(new Answer(question, 'C', "Efficient sprinklers", false));
  }

  private void saveQuestion138() {
    Question question;

    question = questionRepository.save(new Question(3, "In gardening, what word refers to overall health and usability of soil?", "2018-02-11 02:10:45"));

    answerRepository.save(new Answer(question, 'A', "Loam", false));
    answerRepository.save(new Answer(question, 'B', "Tilth", true));
    answerRepository.save(new Answer(question, 'C', "Humus", false));
  }

  private void saveQuestion139() {
    Question question;

    question = questionRepository.save(new Question(4, "Which type of musical composition is also an Olympic figure skating jump?", "2018-02-11 02:11:31"));

    answerRepository.save(new Answer(question, 'A', "Sarabande", false));
    answerRepository.save(new Answer(question, 'B', "Bagatelle", false));
    answerRepository.save(new Answer(question, 'C', "Mazurka", true));
  }

  private void saveQuestion140() {
    Question question;

    question = questionRepository.save(new Question(5, "Low-income college students may qualify for a federal grant program named for a senator from what state?", "2018-02-11 02:12:09"));

    answerRepository.save(new Answer(question, 'A', "Rhode I… https://t.co/hlxcvBVasc", false));
  }

  private void saveQuestion141() {
    Question question;

    question = questionRepository.save(new Question(6, "The westernmost region of Russia touches which of these countries?", "2018-02-11 02:13:33"));

    answerRepository.save(new Answer(question, 'A', "Poland", true));
    answerRepository.save(new Answer(question, 'B', "Norway", false));
    answerRepository.save(new Answer(question, 'C', "Ukraine", false));
  }

  private void saveQuestion142() {
    Question question;

    question = questionRepository.save(new Question(1, "Which animals race at the Kentucky Derby?", "2018-02-12 02:05:27"));

    answerRepository.save(new Answer(question, 'A', "Horses", true));
    answerRepository.save(new Answer(question, 'B', "Wiener dogs", false));
    answerRepository.save(new Answer(question, 'C', "Locusts", false));
  }

  private void saveQuestion143() {
    Question question;

    question = questionRepository.save(new Question(2, "What is the name for anger experienced while driving a car?", "2018-02-12 02:06:22"));

    answerRepository.save(new Answer(question, 'A', "Highway displeasure", false));
    answerRepository.save(new Answer(question, 'B', "Street sadness", false));
    answerRepository.save(new Answer(question, 'C', "Road rage", true));
  }

  private void saveQuestion144() {
    Question question;

    question = questionRepository.save(new Question(3, "Which of these products is a depilatory?", "2018-02-12 02:07:02"));

    answerRepository.save(new Answer(question, 'A', "Nair", true));
    answerRepository.save(new Answer(question, 'B', "Rogaine", false));
    answerRepository.save(new Answer(question, 'C', "Pomade", false));
  }

  private void saveQuestion145() {
    Question question;

    question = questionRepository.save(new Question(4, "Which of these songs was NOT recorded by the Beach Boys?", "2018-02-12 02:08:20"));

    answerRepository.save(new Answer(question, 'A', "Surf's Up", false));
    answerRepository.save(new Answer(question, 'B', "Surf City", true));
    answerRepository.save(new Answer(question, 'C', "Surfer Girl", false));
  }

  private void saveQuestion146() {
    Question question;

    question = questionRepository.save(new Question(5, "Auguste Rodin's statue The Thinker is meant to represent what real-life person?", "2018-02-12 02:08:50"));

    answerRepository.save(new Answer(question, 'A', "Dante Alighieri", true));
    answerRepository.save(new Answer(question, 'B', "Michelangelo", false));
    answerRepository.save(new Answer(question, 'C', "Auguste Rodin", false));
  }

  private void saveQuestion147() {
    Question question;

    question = questionRepository.save(new Question(6, "Which of these is an alveolar disorder?", "2018-02-12 02:09:47"));

    answerRepository.save(new Answer(question, 'A', "Pneumonia", true));
    answerRepository.save(new Answer(question, 'B', "Strep throat", false));
    answerRepository.save(new Answer(question, 'C', "Psoriasis", false));
  }

  private void saveQuestion148() {
    Question question;

    question = questionRepository.save(new Question(7, "Which of these two-letter combos is an acceptable word in Scrabble?", "2018-02-12 02:10:17"));

    answerRepository.save(new Answer(question, 'A', "Fi", false));
    answerRepository.save(new Answer(question, 'B', "Ro", false));
    answerRepository.save(new Answer(question, 'C', "Da", true));
  }

  private void saveQuestion149() {
    Question question;

    question = questionRepository.save(new Question(8, "Which of these Adam Sandler movies has a female director?", "2018-02-12 02:11:13"));

    answerRepository.save(new Answer(question, 'A', "Billy Madison", true));
    answerRepository.save(new Answer(question, 'B', "The Wedding Singer", false));
    answerRepository.save(new Answer(question, 'C', "Big Daddy", false));
  }

  private void saveQuestion150() {
    Question question;

    question = questionRepository.save(new Question(9, "Which position was first held in the last year of the previous century?", "2018-02-12 02:12:25"));

    answerRepository.save(new Answer(question, 'A', "Mayor of Singapore", false));
    answerRepository.save(new Answer(question, 'B', "Mayor of London", true));
    answerRepository.save(new Answer(question, 'C', "Mayor of Baghdad", false));
  }

  private void saveQuestion151() {
    Question question;

    question = questionRepository.save(new Question(10, "Which author's Pulitzer Prize-winning novel was adapted into a Broadway musical?", "2018-02-12 02:13:23"));

    answerRepository.save(new Answer(question, 'A', "Jane Smiley", false));
    answerRepository.save(new Answer(question, 'B', "Annie Proulx", false));
    answerRepository.save(new Answer(question, 'C', "Alice Walker", true));
  }

  private void saveQuestion152() {
    Question question;

    question = questionRepository.save(new Question(11, "The first edition of the CNN show Crossfire featured which host?", "2018-02-12 02:14:13"));

    answerRepository.save(new Answer(question, 'A', "John Sununu", false));
    answerRepository.save(new Answer(question, 'B', "Pat Buchanan", true));
    answerRepository.save(new Answer(question, 'C', "Tucker Carlson", false));
  }

  private void saveQuestion153() {
    Question question;

    question = questionRepository.save(new Question(12, "According to the Book of Leviticus, which of these animals is kosher to eat?", "2018-02-12 02:15:05"));

    answerRepository.save(new Answer(question, 'A', "Owl", false));
    answerRepository.save(new Answer(question, 'B', "Cricket", true));
    answerRepository.save(new Answer(question, 'C', "Rabbit", false));
  }

  private void saveQuestion154() {
    Question question;

    question = questionRepository.save(new Question(13, "Bart's age on “The Simpsons” is NOT the same as which of these characters?", "2018-02-12 02:15:51"));

    answerRepository.save(new Answer(question, 'A', "Ash from Pokémon", false));
    answerRepository.save(new Answer(question, 'B', "Encyclopedia Brown", false));
    answerRepository.save(new Answer(question, 'C', "Nancy Drew", true));
  }

  private void saveQuestion155() {
    Question question;

    question = questionRepository.save(new Question(14, "What beauty product entrepreneur became the first U.S. self-made female millionaire?", "2018-02-12 02:16:48"));

    answerRepository.save(new Answer(question, 'A', "Helena Rubinstein", false));
    answerRepository.save(new Answer(question, 'B', "Elizab… https://t.co/FNXJQiw1Vj", false));
  }

  private void saveQuestion156() {
    Question question;

    question = questionRepository.save(new Question(15, "The author who created Tarzan once worked for which of these publications?", "2018-02-12 02:18:06"));

    answerRepository.save(new Answer(question, 'A', "Sports Illustrated", false));
    answerRepository.save(new Answer(question, 'B', "Paris Review", false));
    answerRepository.save(new Answer(question, 'C', "Sears catalog", true));
  }

  private void saveQuestion157() {
    Question question;

    question = questionRepository.save(new Question(1, "What is the mid-day meal usually called?", "2018-02-12 20:04:52"));

    answerRepository.save(new Answer(question, 'A', "Jack Bauer Power Hour", false));
    answerRepository.save(new Answer(question, 'B', "Lunch", true));
    answerRepository.save(new Answer(question, 'C', "Sleepy time", false));
  }

  private void saveQuestion158() {
    Question question;

    question = questionRepository.save(new Question(2, "In what part of a newspaper would you post an item for sale?", "2018-02-12 20:05:29"));

    answerRepository.save(new Answer(question, 'A', "Sports section", false));
    answerRepository.save(new Answer(question, 'B', "Weather page", false));
    answerRepository.save(new Answer(question, 'C', "Classifieds", true));
  }

  private void saveQuestion159() {
    Question question;

    question = questionRepository.save(new Question(3, "The “skyhook” is a move in which of these sports?", "2018-02-12 20:06:12"));

    answerRepository.save(new Answer(question, 'A', "Polo", false));
    answerRepository.save(new Answer(question, 'B', "Acrobatics", false));
    answerRepository.save(new Answer(question, 'C', "Basketball", true));
  }

  private void saveQuestion160() {
    Question question;

    question = questionRepository.save(new Question(4, "What U.S. state borders only one other U.S. state?", "2018-02-12 20:07:01"));

    answerRepository.save(new Answer(question, 'A', "Alaska", false));
    answerRepository.save(new Answer(question, 'B', "Maine", true));
    answerRepository.save(new Answer(question, 'C', "Rhode Island", false));
  }

  private void saveQuestion161() {
    Question question;

    question = questionRepository.save(new Question(5, "The author of “The Picture of Dorian Gray” was born in what country?", "2018-02-12 20:07:43"));

    answerRepository.save(new Answer(question, 'A', "France", false));
    answerRepository.save(new Answer(question, 'B', "Ireland", true));
    answerRepository.save(new Answer(question, 'C', "United States", false));
  }

  private void saveQuestion162() {
    Question question;

    question = questionRepository.save(new Question(6, "What is the name of London's electronic public transit pass?", "2018-02-12 20:08:38"));

    answerRepository.save(new Answer(question, 'A', "Opal", false));
    answerRepository.save(new Answer(question, 'B', "Oyster", true));
    answerRepository.save(new Answer(question, 'C', "Presto", false));
  }

  private void saveQuestion163() {
    Question question;

    question = questionRepository.save(new Question(7, "According to Marie Kondo, you should only own material items with what quality?", "2018-02-12 20:09:32"));

    answerRepository.save(new Answer(question, 'A', "Eco-friendly", false));
    answerRepository.save(new Answer(question, 'B', "Useful in daily life", false));
    answerRepository.save(new Answer(question, 'C', "Spark joy", true));
  }

  private void saveQuestion164() {
    Question question;

    question = questionRepository.save(new Question(8, "Which of these North American deserts is the smallest?", "2018-02-12 20:10:28"));

    answerRepository.save(new Answer(question, 'A', "Sonoran Desert", false));
    answerRepository.save(new Answer(question, 'B', "Mojave Desert", true));
    answerRepository.save(new Answer(question, 'C', "Chihuahuan Desert", false));
  }

  private void saveQuestion165() {
    Question question;

    question = questionRepository.save(new Question(9, "Which Secretary-General of the United Nations once appeared on “Da Ali G Show”?", "2018-02-12 20:11:30"));

    answerRepository.save(new Answer(question, 'A', "Kofi Annan", false));
    answerRepository.save(new Answer(question, 'B', "Ban Ki-moon", false));
    answerRepository.save(new Answer(question, 'C', "Boutros Boutros-Ghali", true));
  }

  private void saveQuestion166() {
    Question question;

    question = questionRepository.save(new Question(10, "One thousand years ago, which of these regions was heavily populated with Moorish people?", "2018-02-12 20:12:30"));

    answerRepository.save(new Answer(question, 'A', "Albion", false));
    answerRepository.save(new Answer(question, 'B', "Novgorod", false));
    answerRepository.save(new Answer(question, 'C', "Iberia", true));
  }

  private void saveQuestion167() {
    Question question;

    question = questionRepository.save(new Question(11, "The first official African-American fraternity was founded at what university?", "2018-02-12 20:13:21"));

    answerRepository.save(new Answer(question, 'A', "Howard", false));
    answerRepository.save(new Answer(question, 'B', "Clemson", false));
    answerRepository.save(new Answer(question, 'C', "Cornell", true));
  }

  private void saveQuestion168() {
    Question question;

    question = questionRepository.save(new Question(12, "Which of these things did Skee-Lo NOT wish for in his hit '90s song?", "2018-02-12 20:14:43"));

    answerRepository.save(new Answer(question, 'A', "1964 Impala", false));
    answerRepository.save(new Answer(question, 'B', "White shirt collar", true));
    answerRepository.save(new Answer(question, 'C', "Child named Big Al", false));
  }

  private void saveQuestion169() {
    Question question;

    question = questionRepository.save(new Question(1, "Who famously painted the ceiling of the Sistine Chapel?", "2018-02-13 02:05:02"));

    answerRepository.save(new Answer(question, 'A', "Michelangelo", true));
    answerRepository.save(new Answer(question, 'B', "Bob Ross", false));
    answerRepository.save(new Answer(question, 'C', "Mr. Brainwash", false));
  }

  private void saveQuestion170() {
    Question question;

    question = questionRepository.save(new Question(2, "Which U.S. coin features a portrait of Abraham Lincoln?", "2018-02-13 02:05:47"));

    answerRepository.save(new Answer(question, 'A', "Kennedy half-dollar", false));
    answerRepository.save(new Answer(question, 'B', "Buffalo nickel", false));
    answerRepository.save(new Answer(question, 'C', "Penny", true));
  }

  private void saveQuestion171() {
    Question question;

    question = questionRepository.save(new Question(3, "Which of these is NOT a unit of temperature?", "2018-02-13 02:06:28"));

    answerRepository.save(new Answer(question, 'A', "Celsius", false));
    answerRepository.save(new Answer(question, 'B', "Fahrenheit", false));
    answerRepository.save(new Answer(question, 'C', "Hectare", true));
  }

  private void saveQuestion172() {
    Question question;

    question = questionRepository.save(new Question(4, "The R.E.M. song “Man on the Moon” was written about what comedian?", "2018-02-13 02:07:13"));

    answerRepository.save(new Answer(question, 'A', "Jim Carrey", false));
    answerRepository.save(new Answer(question, 'B', "Mitch Hedberg", false));
    answerRepository.save(new Answer(question, 'C', "Andy Kaufman", true));
  }

  private void saveQuestion173() {
    Question question;

    question = questionRepository.save(new Question(5, "What disease gets its name from the Italian term for “bad air”?", "2018-02-13 02:08:04"));

    answerRepository.save(new Answer(question, 'A', "Influenza", false));
    answerRepository.save(new Answer(question, 'B', "Malaria", true));
    answerRepository.save(new Answer(question, 'C', "Asthma", false));
  }

  private void saveQuestion174() {
    Question question;

    question = questionRepository.save(new Question(6, "Students of Auguste Escoffier would have known how to do what?", "2018-02-13 02:09:11"));

    answerRepository.save(new Answer(question, 'A', "Design a chateau", false));
    answerRepository.save(new Answer(question, 'B', "Perform a grand jeté", false));
    answerRepository.save(new Answer(question, 'C', "Prepare a velouté", true));
  }

  private void saveQuestion175() {
    Question question;

    question = questionRepository.save(new Question(7, "A 1976 book by Richard Dawkins introduced what now-common word?", "2018-02-13 02:10:03"));

    answerRepository.save(new Answer(question, 'A', "Android", false));
    answerRepository.save(new Answer(question, 'B', "Emoticon", false));
    answerRepository.save(new Answer(question, 'C', "Meme", true));
  }

  private void saveQuestion176() {
    Question question;

    question = questionRepository.save(new Question(8, "Which voice actor from “The Emperor’s New Groove” was once blacklisted in Hollywood?", "2018-02-13 02:11:10"));

    answerRepository.save(new Answer(question, 'A', "Eartha Kitt", true));
    answerRepository.save(new Answer(question, 'B', "Wendie Malick", false));
    answerRepository.save(new Answer(question, 'C', "Tom Jones", false));
  }

  private void saveQuestion177() {
    Question question;

    question = questionRepository.save(new Question(9, "Which of these is NOT a menu option for ordering hash browns at Waffle House?", "2018-02-13 02:12:02"));

    answerRepository.save(new Answer(question, 'A', "Capped", false));
    answerRepository.save(new Answer(question, 'B', "Slathered", true));
    answerRepository.save(new Answer(question, 'C', "Chunked", false));
  }

  private void saveQuestion178() {
    Question question;

    question = questionRepository.save(new Question(10, "What math concept is traditionally notated by a tall, S-shaped curve?", "2018-02-13 02:12:58"));

    answerRepository.save(new Answer(question, 'A', "Second derivative", false));
    answerRepository.save(new Answer(question, 'B', "Series", false));
    answerRepository.save(new Answer(question, 'C', "Integral", true));
  }

  private void saveQuestion179() {
    Question question;

    question = questionRepository.save(new Question(11, "Which of these supposedly hip cities does NOT have an Instagram filter named after it?", "2018-02-13 02:14:17"));

    answerRepository.save(new Answer(question, 'A', "Nashville", false));
    answerRepository.save(new Answer(question, 'B', "Austin", true));
    answerRepository.save(new Answer(question, 'C', "Brooklyn", false));
  }

  private void saveQuestion180() {
    Question question;

    question = questionRepository.save(new Question(12, "The inventor of the board game Risk also directed what award-winning film?", "2018-02-13 02:15:06"));

    answerRepository.save(new Answer(question, 'A', "The 400 Blows", false));
    answerRepository.save(new Answer(question, 'B', "The Red Balloon", true));
    answerRepository.save(new Answer(question, 'C', "Last Year at Marienbad", false));
  }

  private void saveQuestion181() {
    Question question;

    question = questionRepository.save(new Question(1, "According to legend, what vessel is most likely to contain a wish-granting genie?", "2018-02-13 20:04:23"));

    answerRepository.save(new Answer(question, 'A', "Magic limo", false));
    answerRepository.save(new Answer(question, 'B', "Magic lamp", true));
    answerRepository.save(new Answer(question, 'C', "Magic loofah", false));
  }

  private void saveQuestion182() {
    Question question;

    question = questionRepository.save(new Question(2, "Which of these destinations is legally allowed to bill itself as “The Happiest Place on Earth”?", "2018-02-13 20:05:10"));

    answerRepository.save(new Answer(question, 'A', "Maryland", false));
    answerRepository.save(new Answer(question, 'B', "Orlando", false));
    answerRepository.save(new Answer(question, 'C', "Disneyland", true));
  }

  private void saveQuestion183() {
    Question question;

    question = questionRepository.save(new Question(3, "At New Orleans Mardi Gras, what are float riders required to wear by law?", "2018-02-13 20:05:48"));

    answerRepository.save(new Answer(question, 'A', "Tuxedos", false));
    answerRepository.save(new Answer(question, 'B', "Masks", true));
    answerRepository.save(new Answer(question, 'C', "Sweater vests", false));
  }

  private void saveQuestion184() {
    Question question;

    question = questionRepository.save(new Question(4, "Which of these is NOT part of the three-word Olympic motto?", "2018-02-13 20:06:32"));

    answerRepository.save(new Answer(question, 'A', "Thicker", true));
    answerRepository.save(new Answer(question, 'B', "Higher", false));
    answerRepository.save(new Answer(question, 'C', "Faster", false));
  }

  private void saveQuestion185() {
    Question question;

    question = questionRepository.save(new Question(5, "Cirque du Soleil is a theater troupe first formed in which country?", "2018-02-13 20:07:12"));

    answerRepository.save(new Answer(question, 'A', "USA", false));
    answerRepository.save(new Answer(question, 'B', "Canada", true));
    answerRepository.save(new Answer(question, 'C', "France", false));
  }

  private void saveQuestion186() {
    Question question;

    question = questionRepository.save(new Question(6, "Which of these films does NOT prominently feature identical twins?", "2018-02-13 20:08:59"));

    answerRepository.save(new Answer(question, 'A', "Adaptation", false));
    answerRepository.save(new Answer(question, 'B', "The Parent Trap", false));
    answerRepository.save(new Answer(question, 'C', "Twins", true));
  }

  private void saveQuestion187() {
    Question question;

    question = questionRepository.save(new Question(7, "The painting “Washington Crosses the Delaware” has appeared on which state quarter?", "2018-02-13 20:09:18"));

    answerRepository.save(new Answer(question, 'A', "New Jersey", true));
    answerRepository.save(new Answer(question, 'B', "Delaware", false));
    answerRepository.save(new Answer(question, 'C', "Washington", false));
  }

  private void saveQuestion188() {
    Question question;

    question = questionRepository.save(new Question(8, "The 2008 Olympics were the first time the medals contained what material?", "2018-02-13 20:10:04"));

    answerRepository.save(new Answer(question, 'A', "Jade", true));
    answerRepository.save(new Answer(question, 'B', "Amber", false));
    answerRepository.save(new Answer(question, 'C', "Coral", false));
  }

  private void saveQuestion189() {
    Question question;

    question = questionRepository.save(new Question(9, "When written in all caps, which insult refers to a common type of computer user interface?", "2018-02-13 20:10:45"));

    answerRepository.save(new Answer(question, 'A', "Clod", false));
    answerRepository.save(new Answer(question, 'B', "Wimp", true));
    answerRepository.save(new Answer(question, 'C', "Dolt", false));
  }

  private void saveQuestion190() {
    Question question;

    question = questionRepository.save(new Question(10, "What writer was the first to receive a MacArthur “genius” grant for science fiction?", "2018-02-13 20:11:36"));

    answerRepository.save(new Answer(question, 'A', "Octavia E. Butler", true));
    answerRepository.save(new Answer(question, 'B', "Samu… https://t.co/sgGFKTGbaZ", false));
  }

  private void saveQuestion191() {
    Question question;

    question = questionRepository.save(new Question(11, "The “Father of Art Deco” designed over 200 covers for which magazine?", "2018-02-13 20:12:24"));

    answerRepository.save(new Answer(question, 'A', "New Yorker", false));
    answerRepository.save(new Answer(question, 'B', "Harper’s Bazaar", true));
    answerRepository.save(new Answer(question, 'C', "Vogue", false));
  }

  private void saveQuestion192() {
    Question question;

    question = questionRepository.save(new Question(1, "Who is Robert Downey, Jr.’s father?", "2018-02-14 02:04:57"));

    answerRepository.save(new Answer(question, 'A', "Robert Downey, Sr.", true));
    answerRepository.save(new Answer(question, 'B', "Chet Downey III", false));
    answerRepository.save(new Answer(question, 'C', "Morton Downey, Jr.", false));
  }

  private void saveQuestion193() {
    Question question;

    question = questionRepository.save(new Question(2, "In July of 2017, Joey Chestnut set a world record by consuming 72 what?", "2018-02-14 02:05:54"));

    answerRepository.save(new Answer(question, 'A', "Pickles", false));
    answerRepository.save(new Answer(question, 'B', "Hot dogs", true));
    answerRepository.save(new Answer(question, 'C', "Raw oysters", false));
  }

  private void saveQuestion194() {
    Question question;

    question = questionRepository.save(new Question(3, "Who just became the youngest woman to win gold in Olympics snowboarding?", "2018-02-14 02:07:35"));

    answerRepository.save(new Answer(question, 'A', "Khloé Kardashian", false));
    answerRepository.save(new Answer(question, 'B', "Chloë Grace Moretz", false));
    answerRepository.save(new Answer(question, 'C', "Chloe Kim", true));
  }

  private void saveQuestion195() {
    Question question;

    question = questionRepository.save(new Question(4, "In Ancient Greece, Olympic athletes typically competed wearing what?", "2018-02-14 02:08:06"));

    answerRepository.save(new Answer(question, 'A', "Togas", false));
    answerRepository.save(new Answer(question, 'B', "Laurel wreaths", false));
    answerRepository.save(new Answer(question, 'C', "Nothing at all", true));
  }

  private void saveQuestion196() {
    Question question;

    question = questionRepository.save(new Question(5, "What pop star first recorded under the same name as the so-called \"sailor's devil\"?", "2018-02-14 02:08:56"));

    answerRepository.save(new Answer(question, 'A', "Elton John", false));
    answerRepository.save(new Answer(question, 'B', "David Bowie", true));
    answerRepository.save(new Answer(question, 'C', "Freddie Mercury", false));
  }

  private void saveQuestion197() {
    Question question;

    question = questionRepository.save(new Question(6, "In the King James Bible, which of these measures “six cubits and a span”?", "2018-02-14 02:09:40"));

    answerRepository.save(new Answer(question, 'A', "Stone tablet", false));
    answerRepository.save(new Answer(question, 'B', "Noah's Ark", false));
    answerRepository.save(new Answer(question, 'C', "Goliath", true));
  }

  private void saveQuestion198() {
    Question question;

    question = questionRepository.save(new Question(7, "Which of these is NOT a palindrome?", "2018-02-14 02:10:38"));

    answerRepository.save(new Answer(question, 'A', "A Toyota's a Toyota", false));
    answerRepository.save(new Answer(question, 'B', "Was it a rat I saw?", false));
    answerRepository.save(new Answer(question, 'C', "Walk sir, I’ll risk law", true));
  }

  private void saveQuestion199() {
    Question question;

    question = questionRepository.save(new Question(8, "Aaron Sorkin &amp; Quentin Tarantino helped write the screenplay to which movie?", "2018-02-14 02:11:30"));

    answerRepository.save(new Answer(question, 'A', "The Rock", true));
    answerRepository.save(new Answer(question, 'B', "Con Air", false));
    answerRepository.save(new Answer(question, 'C', "Face/Off", false));
  }

  private void saveQuestion200() {
    Question question;

    question = questionRepository.save(new Question(9, "In 1997, Alabama’s state bar association put up a monument to whom?", "2018-02-14 02:12:28"));

    answerRepository.save(new Answer(question, 'A', "Atticus Finch", true));
    answerRepository.save(new Answer(question, 'B', "John Grisham", false));
    answerRepository.save(new Answer(question, 'C', "William Jennings Bryan", false));
  }

  private void saveQuestion201() {
    Question question;

    question = questionRepository.save(new Question(10, "What Canadian city aptly takes its name from a Cree term for “muddy water”?", "2018-02-14 02:13:17"));

    answerRepository.save(new Answer(question, 'A', "Winnipeg", true));
    answerRepository.save(new Answer(question, 'B', "Ottawa", false));
    answerRepository.save(new Answer(question, 'C', "Toronto", false));
  }

  private void saveQuestion202() {
    Question question;

    question = questionRepository.save(new Question(11, "Which of these performers was part of the first Lollapalooza festival lineup?", "2018-02-14 02:14:41"));

    answerRepository.save(new Answer(question, 'A', "Soundgarden", false));
    answerRepository.save(new Answer(question, 'B', "Depeche Mode", false));
    answerRepository.save(new Answer(question, 'C', "Ice-T", true));
  }

  private void saveQuestion203() {
    Question question;

    question = questionRepository.save(new Question(1, "Hamburgers are usually made with what?", "2018-02-14 20:04:32"));

    answerRepository.save(new Answer(question, 'A', "Yarn", false));
    answerRepository.save(new Answer(question, 'B', "Ground beef", true));
    answerRepository.save(new Answer(question, 'C', "Sweet dreams", false));
  }

  private void saveQuestion204() {
    Question question;

    question = questionRepository.save(new Question(2, "Who is the reigning monarch of Great Britain?", "2018-02-14 20:05:11"));

    answerRepository.save(new Answer(question, 'A', "Queen Elizabeth", true));
    answerRepository.save(new Answer(question, 'B', "Prince Paul", false));
    answerRepository.save(new Answer(question, 'C', "King Koopa", false));
  }

  private void saveQuestion205() {
    Question question;

    question = questionRepository.save(new Question(3, "Which of these is a tool used for glass blowing?", "2018-02-14 20:07:30"));

    answerRepository.save(new Answer(question, 'A', "Swage", false));
    answerRepository.save(new Answer(question, 'B', "Rotary cutter", false));
    answerRepository.save(new Answer(question, 'C', "Punty", true));
  }

  private void saveQuestion206() {
    Question question;

    question = questionRepository.save(new Question(4, "Which of these animals has a species named after Ferdinand Magellan?", "2018-02-14 20:08:15"));

    answerRepository.save(new Answer(question, 'A', "Penguin", true));
    answerRepository.save(new Answer(question, 'B', "Otter", false));
    answerRepository.save(new Answer(question, 'C', "Dolphin", false));
  }

  private void saveQuestion207() {
    Question question;

    question = questionRepository.save(new Question(5, "Ron Perlman, Kris Kristofferson and Lynda Carter have all recorded voices for what video game series?", "2018-02-14 20:09:04"));

    answerRepository.save(new Answer(question, 'A', "Fallout… https://t.co/eZnsaKH5om", true));
  }

  private void saveQuestion208() {
    Question question;

    question = questionRepository.save(new Question(6, "Ancient Egyptians shaved their eyebrows when what occurred?", "2018-02-14 20:09:42"));

    answerRepository.save(new Answer(question, 'A', "Pharaoh became ill", false));
    answerRepository.save(new Answer(question, 'B', "House cat passed away", true));
    answerRepository.save(new Answer(question, 'C', "Harvest was bountiful", false));
  }

  private void saveQuestion209() {
    Question question;

    question = questionRepository.save(new Question(7, "Which legendary writer used to live with Marlon Brando?", "2018-02-14 20:10:31"));

    answerRepository.save(new Answer(question, 'A', "Jack Kerouac", false));
    answerRepository.save(new Answer(question, 'B', "Allen Ginsberg", false));
    answerRepository.save(new Answer(question, 'C', "James Baldwin", true));
  }

  private void saveQuestion210() {
    Question question;

    question = questionRepository.save(new Question(8, "Which of these animals does NOT possess chromatophores?", "2018-02-14 20:11:12"));

    answerRepository.save(new Answer(question, 'A', "Cuttlefish", false));
    answerRepository.save(new Answer(question, 'B', "Zebrafish", false));
    answerRepository.save(new Answer(question, 'C', "Peacock", true));
  }

  private void saveQuestion211() {
    Question question;

    question = questionRepository.save(new Question(9, "The intro of TV’s “Wide World of Sports” pairs the phrase “agony of defeat” with what footage?", "2018-02-14 20:11:55"));

    answerRepository.save(new Answer(question, 'A', "Skier wiping out… https://t.co/JC7aAfhmH1", false));
  }

  private void saveQuestion212() {
    Question question;

    question = questionRepository.save(new Question(10, "How did Senator Strom Thurmond prepare for the longest-ever U.S. Congressional filibuster?", "2018-02-14 20:13:28"));

    answerRepository.save(new Answer(question, 'A', "Inserted a feeding tu… https://t.co/kJBsQrqpfi", false));
  }

  private void saveQuestion213() {
    Question question;

    question = questionRepository.save(new Question(1, "Which of these U.S. TV shows airs earliest in the day?", "2018-02-15 02:06:04"));

    answerRepository.save(new Answer(question, 'A', "Mad Money", false));
    answerRepository.save(new Answer(question, 'B', "Good Morning America", true));
    answerRepository.save(new Answer(question, 'C', "World News Tonight", false));
  }

  private void saveQuestion214() {
    Question question;

    question = questionRepository.save(new Question(2, "Neil Armstrong was the first person to do what?", "2018-02-15 02:06:51"));

    answerRepository.save(new Answer(question, 'A', "Run a 4-minute mile", false));
    answerRepository.save(new Answer(question, 'B', "Walk on the moon", true));
    answerRepository.save(new Answer(question, 'C', "Dunk a basketball", false));
  }

  private void saveQuestion215() {
    Question question;

    question = questionRepository.save(new Question(3, "Traditionally made with cheese, what Swiss dish means “melted” in French?", "2018-02-15 02:07:30"));

    answerRepository.save(new Answer(question, 'A', "Meringue", false));
    answerRepository.save(new Answer(question, 'B', "Fondue", true));
    answerRepository.save(new Answer(question, 'C', "Quiche", false));
  }

  private void saveQuestion216() {
    Question question;

    question = questionRepository.save(new Question(4, "Which novel is set in a land named after the Latin word for “bread”?", "2018-02-15 02:08:19"));

    answerRepository.save(new Answer(question, 'A', "The Silver Chair", false));
    answerRepository.save(new Answer(question, 'B', "The Hunger Games", true));
    answerRepository.save(new Answer(question, 'C', "Fahrenheit 451", false));
  }

  private void saveQuestion217() {
    Question question;

    question = questionRepository.save(new Question(5, "During which holiday are the most greeting cards in the U.S. sold?", "2018-02-15 02:08:59"));

    answerRepository.save(new Answer(question, 'A', "Christmas", true));
    answerRepository.save(new Answer(question, 'B', "Valentine's Day", false));
    answerRepository.save(new Answer(question, 'C', "Mother's Day", false));
  }

  private void saveQuestion218() {
    Question question;

    question = questionRepository.save(new Question(6, "In “Pulp Fiction,” Samuel L. Jackson claims his iconic monologue comes from what book of the Bible?", "2018-02-15 02:10:10"));

    answerRepository.save(new Answer(question, 'A', "Ezekiel", true));
    answerRepository.save(new Answer(question, 'B', "Leviticus", false));
    answerRepository.save(new Answer(question, 'C', "Exodus", false));
  }

  private void saveQuestion219() {
    Question question;

    question = questionRepository.save(new Question(7, "Before the Industrial Revolution, American workers would typically stop around 11 a.m. to do what?", "2018-02-15 02:10:44"));

    answerRepository.save(new Answer(question, 'A', "Take a nap", false));
    answerRepository.save(new Answer(question, 'B', "", false));
  }

  private void saveQuestion220() {
    Question question;

    question = questionRepository.save(new Question(8, "A key financial backer of the 1961 Freedom Rides was famous for recording which song?", "2018-02-15 02:11:29"));

    answerRepository.save(new Answer(question, 'A', "Jump in the Line", true));
    answerRepository.save(new Answer(question, 'B', "A Ch… https://t.co/8kgwP55MoS", false));
  }

  private void saveQuestion221() {
    Question question;

    question = questionRepository.save(new Question(9, "Which inventor boarded a steamer ship in 1913 and was never seen alive again?", "2018-02-15 02:12:15"));

    answerRepository.save(new Answer(question, 'A', "Nikola Tesla", false));
    answerRepository.save(new Answer(question, 'B', "Rudolf Diesel", true));
    answerRepository.save(new Answer(question, 'C', "George Eastman", false));
  }

  private void saveQuestion222() {
    Question question;

    question = questionRepository.save(new Question(10, "Which of these famous buildings contains vomitoria?", "2018-02-15 02:12:52"));

    answerRepository.save(new Answer(question, 'A', "The Parthenon", false));
    answerRepository.save(new Answer(question, 'B', "Madison Square Garden", true));
    answerRepository.save(new Answer(question, 'C', "Sistine Chapel", false));
  }

  private void saveQuestion223() {
    Question question;

    question = questionRepository.save(new Question(11, "What TV acting award has Julia Louis-Dreyfus won the fewest number of times?", "2018-02-15 02:14:02"));

    answerRepository.save(new Answer(question, 'A', "Golden Globe", true));
    answerRepository.save(new Answer(question, 'B', "Primetime Emmy", false));
    answerRepository.save(new Answer(question, 'C', "SAG Award", false));
  }

  private void saveQuestion224() {
    Question question;

    question = questionRepository.save(new Question(12, "Which of these U.S. federal government positions comes with the highest annual salary?", "2018-02-15 02:15:23"));

    answerRepository.save(new Answer(question, 'A', "Postmaster General", true));
    answerRepository.save(new Answer(question, 'B', "S… https://t.co/zM6MxGfwHx", false));
  }

  private void saveQuestion225() {
    Question question;

    question = questionRepository.save(new Question(1, "Which of these is a common type of salad?", "2018-02-15 20:04:43"));

    answerRepository.save(new Answer(question, 'A', "Caesar salad", true));
    answerRepository.save(new Answer(question, 'B', "Cedar salad", false));
    answerRepository.save(new Answer(question, 'C', "Scenic salad", false));
  }

  private void saveQuestion226() {
    Question question;

    question = questionRepository.save(new Question(2, "Elephants are known for their sense of what?", "2018-02-15 20:05:24"));

    answerRepository.save(new Answer(question, 'A', "Humor", false));
    answerRepository.save(new Answer(question, 'B', "Smell", true));
    answerRepository.save(new Answer(question, 'C', "Style", false));
  }

  private void saveQuestion227() {
    Question question;

    question = questionRepository.save(new Question(3, "Which of these sports is played with a paddle?", "2018-02-15 20:06:15"));

    answerRepository.save(new Answer(question, 'A', "Lacrosse", false));
    answerRepository.save(new Answer(question, 'B', "Pickleball", true));
    answerRepository.save(new Answer(question, 'C', "Handball", false));
  }

  private void saveQuestion228() {
    Question question;

    question = questionRepository.save(new Question(4, "Which of these is NOT one of the first Starburst flavors?", "2018-02-15 20:06:53"));

    answerRepository.save(new Answer(question, 'A', "Lime", false));
    answerRepository.save(new Answer(question, 'B', "Lemon", false));
    answerRepository.save(new Answer(question, 'C', "Cherry", true));
  }

  private void saveQuestion229() {
    Question question;

    question = questionRepository.save(new Question(5, "How is the first name of the lead actor of “The English Patient” pronounced?", "2018-02-15 20:07:59"));

    answerRepository.save(new Answer(question, 'A', "“Rolf”", false));
    answerRepository.save(new Answer(question, 'B', "“Rafe”", true));
    answerRepository.save(new Answer(question, 'C', "“Ralf”", false));
  }

  private void saveQuestion230() {
    Question question;

    question = questionRepository.save(new Question(6, "When it comes to clothing, what is peplum?", "2018-02-15 20:08:34"));

    answerRepository.save(new Answer(question, 'A', "Shoulder pad", false));
    answerRepository.save(new Answer(question, 'B', "Neck seam", false));
    answerRepository.save(new Answer(question, 'C', "Ruffle", true));
  }

  private void saveQuestion231() {
    Question question;

    question = questionRepository.save(new Question(7, "The wife of which of these writers inspired the title of a popular video game?", "2018-02-15 20:09:31"));

    answerRepository.save(new Answer(question, 'A', "Ernest Hemingway", false));
    answerRepository.save(new Answer(question, 'B', "Arthur Miller", false));
    answerRepository.save(new Answer(question, 'C', "F. Scott Fitzgerald", true));
  }

  private void saveQuestion232() {
    Question question;

    question = questionRepository.save(new Question(8, "Which of these is NOT a defunct Yahoo product?", "2018-02-15 20:10:27"));

    answerRepository.save(new Answer(question, 'A', "Leap", true));
    answerRepository.save(new Answer(question, 'B', "Buzz", false));
    answerRepository.save(new Answer(question, 'C', "Mash", false));
  }

  private void saveQuestion233() {
    Question question;

    question = questionRepository.save(new Question(9, "In the original children's book “Flat Stanley,” what falling item flattens Stanley?", "2018-02-15 20:11:07"));

    answerRepository.save(new Answer(question, 'A', "Refrigerator", false));
    answerRepository.save(new Answer(question, 'B', "Baby grand piano", false));
    answerRepository.save(new Answer(question, 'C', "Bulletin board", true));
  }

  private void saveQuestion234() {
    Question question;

    question = questionRepository.save(new Question(10, "In a viral photo of Dwayne “The Rock\" Johnson in a turtleneck, what is his arm leaning on?", "2018-02-15 20:12:01"));

    answerRepository.save(new Answer(question, 'A', "Ladder", false));
    answerRepository.save(new Answer(question, 'B', "Pillow", false));
    answerRepository.save(new Answer(question, 'C', "Tissues", true));
  }

  private void saveQuestion235() {
    Question question;

    question = questionRepository.save(new Question(11, "Which U.S. island’s municipal bonds are NOT triple tax-exempt?", "2018-02-15 20:13:12"));

    answerRepository.save(new Answer(question, 'A', "Culebra", false));
    answerRepository.save(new Answer(question, 'B', "Molokai", true));
    answerRepository.save(new Answer(question, 'C', "Cabras Island", false));
  }

  private void saveQuestion236() {
    Question question;

    question = questionRepository.save(new Question(12, "The Hermès Birkin handbag was born thanks to a random meeting where?", "2018-02-15 20:14:19"));

    answerRepository.save(new Answer(question, 'A', "On an airplane", true));
    answerRepository.save(new Answer(question, 'B', "At a museum", false));
    answerRepository.save(new Answer(question, 'C', "In a restaurant", false));
  }

  private void saveQuestion237() {
    Question question;

    question = questionRepository.save(new Question(1, "In the Mother Goose nursery rhyme, what did Little Miss Muffet sit on?", "2018-02-16 20:03:57"));

    answerRepository.save(new Answer(question, 'A', "Whoopee cushion", false));
    answerRepository.save(new Answer(question, 'B', "Tuffet", true));
    answerRepository.save(new Answer(question, 'C', "Blueberry muffin", false));
  }

  private void saveQuestion238() {
    Question question;

    question = questionRepository.save(new Question(2, "According to the Chinese zodiac, 2018 is now officially the Year of the what?", "2018-02-16 20:04:37"));

    answerRepository.save(new Answer(question, 'A', "Dog", true));
    answerRepository.save(new Answer(question, 'B', "Surly Neighbor", false));
    answerRepository.save(new Answer(question, 'C', "Careless Whisper", false));
  }

  private void saveQuestion239() {
    Question question;

    question = questionRepository.save(new Question(3, "What foliage did Adam and Eve use to cover up?", "2018-02-16 20:05:40"));

    answerRepository.save(new Answer(question, 'A', "Maple leaf", false));
    answerRepository.save(new Answer(question, 'B', "Black locust leaf", false));
    answerRepository.save(new Answer(question, 'C', "Fig leaf", true));
  }

  private void saveQuestion240() {
    Question question;

    question = questionRepository.save(new Question(4, "Which household device was created by iRobot?", "2018-02-16 20:06:12"));

    answerRepository.save(new Answer(question, 'A', "Nest", false));
    answerRepository.save(new Answer(question, 'B', "Robomow", false));
    answerRepository.save(new Answer(question, 'C', "Roomba", true));
  }

  private void saveQuestion241() {
    Question question;

    question = questionRepository.save(new Question(5, "The mosaic pavement streets of Rio de Janeiro contain numerous examples of what?", "2018-02-16 20:06:50"));

    answerRepository.save(new Answer(question, 'A', "QR codes", true));
    answerRepository.save(new Answer(question, 'B', "Google Doodles", false));
    answerRepository.save(new Answer(question, 'C', "Emoji", false));
  }

  private void saveQuestion242() {
    Question question;

    question = questionRepository.save(new Question(6, "Which of these drinks is often classified into culinary and ceremonial grades?", "2018-02-16 20:07:40"));

    answerRepository.save(new Answer(question, 'A', "Yerba mate", false));
    answerRepository.save(new Answer(question, 'B', "Kombucha", false));
    answerRepository.save(new Answer(question, 'C', "Matcha", true));
  }

  private void saveQuestion243() {
    Question question;

    question = questionRepository.save(new Question(7, "Microblading eyebrows essentially consists of doing what?", "2018-02-16 20:08:21"));

    answerRepository.save(new Answer(question, 'A', "Drawing them in", true));
    answerRepository.save(new Answer(question, 'B', "Trimming them", false));
    answerRepository.save(new Answer(question, 'C', "Plucking them", false));
  }

  private void saveQuestion244() {
    Question question;

    question = questionRepository.save(new Question(8, "What rating does Dudley Moore give Bo Derek’s character in the film “10”?", "2018-02-16 20:09:05"));

    answerRepository.save(new Answer(question, 'A', "Higher than ten", true));
    answerRepository.save(new Answer(question, 'B', "Lower than ten", false));
    answerRepository.save(new Answer(question, 'C', "Ten", false));
  }

  private void saveQuestion245() {
    Question question;

    question = questionRepository.save(new Question(9, "Which of these toys has NOT been to space?", "2018-02-16 20:09:50"));

    answerRepository.save(new Answer(question, 'A', "Etch A Sketch", true));
    answerRepository.save(new Answer(question, 'B', "Slinky", false));
    answerRepository.save(new Answer(question, 'C', "Lego", false));
  }

  private void saveQuestion246() {
    Question question;

    question = questionRepository.save(new Question(10, "Which of these soprano singing ranges has the lowest tessitura?", "2018-02-16 20:10:31"));

    answerRepository.save(new Answer(question, 'A', "Soubrette", false));
    answerRepository.save(new Answer(question, 'B', "Coloratura", false));
    answerRepository.save(new Answer(question, 'C', "Dramatic", true));
  }

  private void saveQuestion247() {
    Question question;

    question = questionRepository.save(new Question(11, "Before creating Hotmail, the two founders worked together at what company?", "2018-02-16 20:11:12"));

    answerRepository.save(new Answer(question, 'A', "Hewlett-Packard", false));
    answerRepository.save(new Answer(question, 'B', "Microsoft", false));
    answerRepository.save(new Answer(question, 'C', "Apple", true));
  }

  private void saveQuestion248() {
    Question question;

    question = questionRepository.save(new Question(12, "Which animal is NOT depicted in Rembrandt’s “The Night Watch”?", "2018-02-16 20:12:36"));

    answerRepository.save(new Answer(question, 'A', "Mouse", true));
    answerRepository.save(new Answer(question, 'B', "Chicken", false));
    answerRepository.save(new Answer(question, 'C', "Dog", false));
  }

  private void saveQuestion249() {
    Question question;

    question = questionRepository.save(new Question(1, "What is traditional to wear on St. Patrick’s Day?", "2018-02-17 02:06:00"));

    answerRepository.save(new Answer(question, 'A', "Fancy gown", false));
    answerRepository.save(new Answer(question, 'B', "The color green", true));
    answerRepository.save(new Answer(question, 'C', "Minions onesie", false));
  }

  private void saveQuestion250() {
    Question question;

    question = questionRepository.save(new Question(2, "Which of these is a national hamburger chain?", "2018-02-17 02:06:14"));

    answerRepository.save(new Answer(question, 'A', "Puddchuckers", false));
    answerRepository.save(new Answer(question, 'B', "Huddsuckers", false));
    answerRepository.save(new Answer(question, 'C', "Fuddruckers", true));
  }

  private void saveQuestion251() {
    Question question;

    question = questionRepository.save(new Question(3, "Which of these is NOT a pseudonym?", "2018-02-17 02:07:28"));

    answerRepository.save(new Answer(question, 'A', "George Eliot", false));
    answerRepository.save(new Answer(question, 'B', "George Orwell", false));
    answerRepository.save(new Answer(question, 'C', "George Saunders", true));
  }

  private void saveQuestion252() {
    Question question;

    question = questionRepository.save(new Question(4, "In baseball, “Mendoza line” is a nickname for what?", "2018-02-17 02:08:14"));

    answerRepository.save(new Answer(question, 'A', ".200 batting average", true));
    answerRepository.save(new Answer(question, 'B', "Rubber on pitching mound", false));
    answerRepository.save(new Answer(question, 'C', "Hard-hit ball", false));
  }

  private void saveQuestion253() {
    Question question;

    question = questionRepository.save(new Question(5, "The director of “Lady Bird” starred in which indie movie?", "2018-02-17 02:08:58"));

    answerRepository.save(new Answer(question, 'A', "Room", false));
    answerRepository.save(new Answer(question, 'B', "Frances Ha", true));
    answerRepository.save(new Answer(question, 'C', "Brooklyn", false));
  }

  private void saveQuestion254() {
    Question question;

    question = questionRepository.save(new Question(6, "What sport is often played with an item resembling a Buckminsterfullerene molecule?", "2018-02-17 02:09:54"));

    answerRepository.save(new Answer(question, 'A', "Badminton", false));
    answerRepository.save(new Answer(question, 'B', "American football", false));
    answerRepository.save(new Answer(question, 'C', "Soccer", true));
  }

  private void saveQuestion255() {
    Question question;

    question = questionRepository.save(new Question(7, "Nearly every episode of which TV show is named after a song title?", "2018-02-17 02:10:35"));

    answerRepository.save(new Answer(question, 'A', "Glee", false));
    answerRepository.save(new Answer(question, 'B', "Gossip Girl", false));
    answerRepository.save(new Answer(question, 'C', "Grey’s Anatomy", true));
  }

  private void saveQuestion256() {
    Question question;

    question = questionRepository.save(new Question(8, "Which is NOT a correct pairing of tablet and tablet maker?", "2018-02-17 02:11:17"));

    answerRepository.save(new Answer(question, 'A', "Streak / Toshiba", true));
    answerRepository.save(new Answer(question, 'B', "ATIV / Samsung", false));
    answerRepository.save(new Answer(question, 'C', "Xoom / Motorola", false));
  }

  private void saveQuestion257() {
    Question question;

    question = questionRepository.save(new Question(9, "Which philosopher directly inspired many of the lyrics on Radiohead’s “OK Computer”?", "2018-02-17 02:12:01"));

    answerRepository.save(new Answer(question, 'A', "Friedrich Nietzsche", false));
    answerRepository.save(new Answer(question, 'B', "Adam Smith", false));
    answerRepository.save(new Answer(question, 'C', "Noam Chomsky", true));
  }

  private void saveQuestion258() {
    Question question;

    question = questionRepository.save(new Question(10, "Which fitness brand was established first?", "2018-02-17 02:12:45"));

    answerRepository.save(new Answer(question, 'A', "NordicTrack", true));
    answerRepository.save(new Answer(question, 'B', "Bowflex", false));
    answerRepository.save(new Answer(question, 'C', "Thighmaster", false));
  }

  private void saveQuestion259() {
    Question question;

    question = questionRepository.save(new Question(11, "Which of these titles is currently held by nobody?", "2018-02-17 02:14:05"));

    answerRepository.save(new Answer(question, 'A', "Duke of Windsor", true));
    answerRepository.save(new Answer(question, 'B', "Duke of Kent", false));
    answerRepository.save(new Answer(question, 'C', "Duke of Gloucester", false));
  }

  private void saveQuestion260() {
    Question question;

    question = questionRepository.save(new Question(1, "In kickball, what are players meant to use to propel the ball onto the field?", "2018-02-18 02:03:49"));

    answerRepository.save(new Answer(question, 'A', "Oven mitt", false));
    answerRepository.save(new Answer(question, 'B', "Foot", true));
    answerRepository.save(new Answer(question, 'C', "Stuffed jackalope", false));
  }

  private void saveQuestion261() {
    Question question;

    question = questionRepository.save(new Question(2, "According to the title of a classic horror movie, “The Hills Have” what?", "2018-02-18 02:04:24"));

    answerRepository.save(new Answer(question, 'A', "Ugly Christmas sweaters", false));
    answerRepository.save(new Answer(question, 'B', "Eyes", true));
    answerRepository.save(new Answer(question, 'C', "So Many Questions", false));
  }

  private void saveQuestion262() {
    Question question;

    question = questionRepository.save(new Question(3, "The popular abbreviation TFW usually stands for what?", "2018-02-18 02:05:26"));

    answerRepository.save(new Answer(question, 'A', "That Feeling When", true));
    answerRepository.save(new Answer(question, 'B', "Too Funky, World", false));
    answerRepository.save(new Answer(question, 'C', "The Funniest Week", false));
  }

  private void saveQuestion263() {
    Question question;

    question = questionRepository.save(new Question(4, "A tarantula hawk is a type of what?", "2018-02-18 02:07:07"));

    answerRepository.save(new Answer(question, 'A', "Bird", false));
    answerRepository.save(new Answer(question, 'B', "Snake", false));
    answerRepository.save(new Answer(question, 'C', "Wasp", true));
  }

  private void saveQuestion264() {
    Question question;

    question = questionRepository.save(new Question(5, "A stylized depiction of the Matterhorn is featured in what corporate logo?", "2018-02-18 02:07:37"));

    answerRepository.save(new Answer(question, 'A', "Toblerone", true));
    answerRepository.save(new Answer(question, 'B', "Paramount Pictures", false));
    answerRepository.save(new Answer(question, 'C', "The North Face", false));
  }

  private void saveQuestion265() {
    Question question;

    question = questionRepository.save(new Question(6, "Which statement is true of the R&amp;B group “Tony! Toni! Toné!”?", "2018-02-18 02:08:21"));

    answerRepository.save(new Answer(question, 'A', "Disbanded after 1 album", false));
    answerRepository.save(new Answer(question, 'B', "No member named Tony… https://t.co/4BEtfthP9o", true));
  }

  private void saveQuestion266() {
    Question question;

    question = questionRepository.save(new Question(7, "Daku is the pseudonym of a street artist known for his work in what city?", "2018-02-18 02:08:57"));

    answerRepository.save(new Answer(question, 'A', "New Delhi", true));
    answerRepository.save(new Answer(question, 'B', "Tokyo", false));
    answerRepository.save(new Answer(question, 'C', "London", false));
  }

  private void saveQuestion267() {
    Question question;

    question = questionRepository.save(new Question(8, "A controversial ‘90s episode of “Oprah” caused the price of which product to drop?", "2018-02-18 02:09:37"));

    answerRepository.save(new Answer(question, 'A', "Diamonds", false));
    answerRepository.save(new Answer(question, 'B', "Soda", false));
    answerRepository.save(new Answer(question, 'C', "Beef", true));
  }

  private void saveQuestion268() {
    Question question;

    question = questionRepository.save(new Question(9, "Which of these terms does NOT refer to a sea slug?", "2018-02-18 02:10:58"));

    answerRepository.save(new Answer(question, 'A', "Sea pig", true));
    answerRepository.save(new Answer(question, 'B', "Sea hare", false));
    answerRepository.save(new Answer(question, 'C', "Nudibranch", false));
  }

  private void saveQuestion269() {
    Question question;

    question = questionRepository.save(new Question(10, "The longest-serving senator currently in office has been re-elected how many times?", "2018-02-18 02:11:39"));

    answerRepository.save(new Answer(question, 'A', "Seven times", true));
    answerRepository.save(new Answer(question, 'B', "Four times", false));
    answerRepository.save(new Answer(question, 'C', "Nine times", false));
    answerRepository.save(new Answer(question, 'D', "", false));
  }

  private void saveQuestion270() {
    Question question;

    question = questionRepository.save(new Question(11, "Matt Damon &amp; Ben Affleck appear uncredited in which baseball movie?", "2018-02-18 02:12:48"));

    answerRepository.save(new Answer(question, 'A', "Field of Dreams", true));
    answerRepository.save(new Answer(question, 'B', "Moneyball", false));
    answerRepository.save(new Answer(question, 'C', "Fever Pitch", false));
  }

  private void saveQuestion271() {
    Question question;

    question = questionRepository.save(new Question(1, "In the nursery rhyme, Mary had a little what?", "2018-02-19 02:05:14"));

    answerRepository.save(new Answer(question, 'A', "Laryngitis", false));
    answerRepository.save(new Answer(question, 'B', "Lamb", true));
    answerRepository.save(new Answer(question, 'C', "Log", false));
  }

  private void saveQuestion272() {
    Question question;

    question = questionRepository.save(new Question(2, "Which of these is a common machine used in construction?", "2018-02-19 02:05:55"));

    answerRepository.save(new Answer(question, 'A', "Spoonlift", false));
    answerRepository.save(new Answer(question, 'B', "Sporklift", false));
    answerRepository.save(new Answer(question, 'C', "Forklift", true));
  }

  private void saveQuestion273() {
    Question question;

    question = questionRepository.save(new Question(3, "Who is considered the father of scientific classification?", "2018-02-19 02:06:39"));

    answerRepository.save(new Answer(question, 'A', "Jose Reyes", false));
    answerRepository.save(new Answer(question, 'B', "Carl Linnaeus", true));
    answerRepository.save(new Answer(question, 'C', "Doctor Zaius", false));
  }

  private void saveQuestion274() {
    Question question;

    question = questionRepository.save(new Question(4, "Siri made its debut on which iPhone?", "2018-02-19 02:07:19"));

    answerRepository.save(new Answer(question, 'A', "iPhone 4", false));
    answerRepository.save(new Answer(question, 'B', "iPhone 5", false));
    answerRepository.save(new Answer(question, 'C', "iPhone 4S", true));
  }

  private void saveQuestion275() {
    Question question;

    question = questionRepository.save(new Question(5, "Which of these is a poetry term for a stanza with four lines?", "2018-02-19 02:08:20"));

    answerRepository.save(new Answer(question, 'A', "Limerick", false));
    answerRepository.save(new Answer(question, 'B', "Haiku", false));
    answerRepository.save(new Answer(question, 'C', "Quatrain", true));
  }

  private void saveQuestion276() {
    Question question;

    question = questionRepository.save(new Question(6, "Which band featured a regular didgeridoo player?", "2018-02-19 02:09:05"));

    answerRepository.save(new Answer(question, 'A', "Dexys Midnight Runners", false));
    answerRepository.save(new Answer(question, 'B', "Jamiroquai", true));
    answerRepository.save(new Answer(question, 'C', "O.A.R.", false));
  }

  private void saveQuestion277() {
    Question question;

    question = questionRepository.save(new Question(7, "Which action star is the creator of an eponymous martial art?", "2018-02-19 02:10:51"));

    answerRepository.save(new Answer(question, 'A', "Jackie Chan", false));
    answerRepository.save(new Answer(question, 'B', "Steven Seagal", false));
    answerRepository.save(new Answer(question, 'C', "Chuck Norris", true));
  }

  private void saveQuestion278() {
    Question question;

    question = questionRepository.save(new Question(8, "Which of these games is typically played using a deck with the fewest cards?", "2018-02-19 02:11:14"));

    answerRepository.save(new Answer(question, 'A', "Euchre", true));
    answerRepository.save(new Answer(question, 'B', "Cribbage", false));
    answerRepository.save(new Answer(question, 'C', "Pinochle", false));
  }

  private void saveQuestion279() {
    Question question;

    question = questionRepository.save(new Question(9, "The cooking technique now known as tempura originated in which of these places?", "2018-02-19 02:12:04"));

    answerRepository.save(new Answer(question, 'A', "Hawaii", false));
    answerRepository.save(new Answer(question, 'B', "South Korea", false));
    answerRepository.save(new Answer(question, 'C', "Portugal", true));
  }

  private void saveQuestion280() {
    Question question;

    question = questionRepository.save(new Question(10, "In 2008, the creators of what startup raised funds by selling novelty breakfast cereals?", "2018-02-19 02:13:04"));

    answerRepository.save(new Answer(question, 'A', "Kickstarter", false));
    answerRepository.save(new Answer(question, 'B', "Airbnb… https://t.co/VAdxMTvHbg", true));
  }

  private void saveQuestion281() {
    Question question;

    question = questionRepository.save(new Question(11, "The top prize in architecture is named for the creator of what hotel chain?", "2018-02-19 02:13:59"));

    answerRepository.save(new Answer(question, 'A', "Hyatt", true));
    answerRepository.save(new Answer(question, 'B', "Sheraton", false));
    answerRepository.save(new Answer(question, 'C', "Four Seasons", false));
  }

  private void saveQuestion282() {
    Question question;

    question = questionRepository.save(new Question(12, "Which company was named after its founder’s unusual hairstyle?", "2018-02-19 02:16:59"));

    answerRepository.save(new Answer(question, 'A', "Kinko's", true));
    answerRepository.save(new Answer(question, 'B', "Red Robin", false));
    answerRepository.save(new Answer(question, 'C', "Miracle-Gro", false));
  }

  private void saveQuestion283() {
    Question question;

    question = questionRepository.save(new Question(1, "In a BLT sandwich, the “T” stands for what?", "2018-02-19 20:03:59"));

    answerRepository.save(new Answer(question, 'A', "Tap water", false));
    answerRepository.save(new Answer(question, 'B', "Tunatini", false));
    answerRepository.save(new Answer(question, 'C', "Tomato", true));
  }

  private void saveQuestion284() {
    Question question;

    question = questionRepository.save(new Question(2, "Habitat for Humanity is a charity known for building what?", "2018-02-19 20:04:27"));

    answerRepository.save(new Answer(question, 'A', "Luxury yachts", false));
    answerRepository.save(new Answer(question, 'B', "Monster truck courses", false));
    answerRepository.save(new Answer(question, 'C', "Houses", true));
  }

  private void saveQuestion285() {
    Question question;

    question = questionRepository.save(new Question(3, "Which of these is a part of the heart?", "2018-02-19 20:05:03"));

    answerRepository.save(new Answer(question, 'A', "Aorta", true));
    answerRepository.save(new Answer(question, 'B', "Albedo", false));
    answerRepository.save(new Answer(question, 'C', "Avuncular", false));
  }

  private void saveQuestion286() {
    Question question;

    question = questionRepository.save(new Question(4, "“Go Blue!” is the rallying cry of what university’s sports team?", "2018-02-19 20:05:41"));

    answerRepository.save(new Answer(question, 'A', "U of Michigan", true));
    answerRepository.save(new Answer(question, 'B', "Michigan State", false));
    answerRepository.save(new Answer(question, 'C', "Ohio State", false));
  }

  private void saveQuestion287() {
    Question question;

    question = questionRepository.save(new Question(5, "A famous fossil found in an English cave has what cheesy name?", "2018-02-19 20:07:34"));

    answerRepository.save(new Answer(question, 'A', "Stilton Man", false));
    answerRepository.save(new Answer(question, 'B', "Roquefort Man", false));
    answerRepository.save(new Answer(question, 'C', "Cheddar Man", true));
  }

  private void saveQuestion288() {
    Question question;

    question = questionRepository.save(new Question(6, "Which ingredient is typically listed first on jars of classic Nutella?", "2018-02-19 20:08:07"));

    answerRepository.save(new Answer(question, 'A', "Hazelnuts", false));
    answerRepository.save(new Answer(question, 'B', "Cocoa", false));
    answerRepository.save(new Answer(question, 'C', "Sugar", true));
  }

  private void saveQuestion289() {
    Question question;

    question = questionRepository.save(new Question(7, "Which performer did NOT get booed while debuting at the Apollo Theater Amateur Night?", "2018-02-19 20:09:06"));

    answerRepository.save(new Answer(question, 'A', "Lauryn Hill", false));
    answerRepository.save(new Answer(question, 'B', "T-Pain", true));
    answerRepository.save(new Answer(question, 'C', "Dave Chappelle", false));
  }

  private void saveQuestion290() {
    Question question;

    question = questionRepository.save(new Question(8, "Which of these poets' best-known works is a villanelle?", "2018-02-19 20:09:53"));

    answerRepository.save(new Answer(question, 'A', "Robert Frost", false));
    answerRepository.save(new Answer(question, 'B', "Dylan Thomas", true));
    answerRepository.save(new Answer(question, 'C', "T.S. Eliot", false));
  }

  private void saveQuestion291() {
    Question question;

    question = questionRepository.save(new Question(9, "Which of these states does NOT have an official governor’s mansion?", "2018-02-19 20:10:46"));

    answerRepository.save(new Answer(question, 'A', "Alaska", false));
    answerRepository.save(new Answer(question, 'B', "Idaho", true));
    answerRepository.save(new Answer(question, 'C', "South Dakota", false));
  }

  private void saveQuestion292() {
    Question question;

    question = questionRepository.save(new Question(10, "Which First Lady’s official portrait features her resting her hand on a large dog?", "2018-02-19 20:11:35"));

    answerRepository.save(new Answer(question, 'A', "Grace Coolidge", true));
    answerRepository.save(new Answer(question, 'B', "Eleanor R… https://t.co/S2NCw6QMAv", false));
  }

  private void saveQuestion293() {
    Question question;

    question = questionRepository.save(new Question(11, "Jimi Hendrix, Frank Sinatra &amp; Bobby Darin all released songs with what name in the title?", "2018-02-19 20:12:42"));

    answerRepository.save(new Answer(question, 'A', "Mary", false));
    answerRepository.save(new Answer(question, 'B', "Joe", false));
    answerRepository.save(new Answer(question, 'C', "Dolly", true));
  }

  private void saveQuestion294() {
    Question question;

    question = questionRepository.save(new Question(1, "In theater, what phrase means “good luck”?", "2018-02-20 02:05:44"));

    answerRepository.save(new Answer(question, 'A', "Break a leg", true));
    answerRepository.save(new Answer(question, 'B', "Kick the bucket", false));
    answerRepository.save(new Answer(question, 'C', "Cut a rug", false));
  }

  private void saveQuestion295() {
    Question question;

    question = questionRepository.save(new Question(2, "Medicine you can buy without a prescription is said to be available over-the-what?", "2018-02-20 02:06:26"));

    answerRepository.save(new Answer(question, 'A', "Counter", true));
    answerRepository.save(new Answer(question, 'B', "Transom", false));
    answerRepository.save(new Answer(question, 'C', "Rainbow", false));
  }

  private void saveQuestion296() {
    Question question;

    question = questionRepository.save(new Question(3, "What university’s mascot is a cartoonish clergy member?", "2018-02-20 02:07:06"));

    answerRepository.save(new Answer(question, 'A', "UC San Diego", false));
    answerRepository.save(new Answer(question, 'B', "Wake Forest", true));
    answerRepository.save(new Answer(question, 'C', "Notre Dame", false));
  }

  private void saveQuestion297() {
    Question question;

    question = questionRepository.save(new Question(4, "The title of the play “A Raisin in the Sun” comes from a poem by which author?", "2018-02-20 02:08:07"));

    answerRepository.save(new Answer(question, 'A', "Maya Angelou", false));
    answerRepository.save(new Answer(question, 'B', "Langston Hughes", true));
    answerRepository.save(new Answer(question, 'C', "Toni Morrison", false));
  }

  private void saveQuestion298() {
    Question question;

    question = questionRepository.save(new Question(5, "Which of these is an accurate statement about typhoons?", "2018-02-20 02:08:47"));

    answerRepository.save(new Answer(question, 'A', "Type of cyclone", true));
    answerRepository.save(new Answer(question, 'B', "Originate as monsoons", false));
    answerRepository.save(new Answer(question, 'C', "Form south of equator", false));
  }

  private void saveQuestion299() {
    Question question;

    question = questionRepository.save(new Question(6, "Which president raised wartime funds by keeping sheep on the White House lawn?", "2018-02-20 02:09:26"));

    answerRepository.save(new Answer(question, 'A', "Dwight D. Eisenhower", false));
    answerRepository.save(new Answer(question, 'B', "Harry S.… https://t.co/6RUrrPXO9V", false));
  }

  private void saveQuestion300() {
    Question question;

    question = questionRepository.save(new Question(7, "Cinnamon is the primary flavoring of which liqueur?", "2018-02-20 02:10:10"));

    answerRepository.save(new Answer(question, 'A', "Goldschläger", true));
    answerRepository.save(new Answer(question, 'B', "Frangelico", false));
    answerRepository.save(new Answer(question, 'C', "Drambuie", false));
  }

  private void saveQuestion301() {
    Question question;

    question = questionRepository.save(new Question(8, "Which state’s capital is likely named for a Native American word meaning “good place to dig potatoes”?", "2018-02-20 02:10:48"));

    answerRepository.save(new Answer(question, 'A', "Missouri", false));
    answerRepository.save(new Answer(question, 'B', "Kansas", true));
    answerRepository.save(new Answer(question, 'C', "Arkansas", false));
  }

  private void saveQuestion302() {
    Question question;

    question = questionRepository.save(new Question(9, "By definition, a person with bad handwriting can be said to have what?", "2018-02-20 02:11:50"));

    answerRepository.save(new Answer(question, 'A', "Paresthesia", false));
    answerRepository.save(new Answer(question, 'B', "Onychocryptosis", false));
    answerRepository.save(new Answer(question, 'C', "Griffonage", true));
  }

  private void saveQuestion303() {
    Question question;

    question = questionRepository.save(new Question(10, "Which of these biblical names was most popular for American babies in 2016?", "2018-02-20 02:12:29"));

    answerRepository.save(new Answer(question, 'A', "Benjamin", true));
    answerRepository.save(new Answer(question, 'B', "Jacob", false));
    answerRepository.save(new Answer(question, 'C', "Elijah", false));
  }

  private void saveQuestion304() {
    Question question;

    question = questionRepository.save(new Question(11, "The Universalis Cosmographia is the first known map to feature what?", "2018-02-20 02:13:28"));

    answerRepository.save(new Answer(question, 'A', "The term 'America'", true));
    answerRepository.save(new Answer(question, 'B', "Compass rose", false));
    answerRepository.save(new Answer(question, 'C', "Circumnavigable Earth", false));
  }

  private void saveQuestion305() {
    Question question;

    question = questionRepository.save(new Question(12, "Earlier this decade, the billionaire creator behind what ’90s craze got busted for tax evasion?", "2018-02-20 02:14:50"));

    answerRepository.save(new Answer(question, 'A', "Beanie Babies… https://t.co/xqRfXKV3y9", true));
  }

  private void saveQuestion306() {
    Question question;

    question = questionRepository.save(new Question(1, "From what do baby chicks hatch?", "2018-02-20 20:05:27"));

    answerRepository.save(new Answer(question, 'A', "Aluminum cans", false));
    answerRepository.save(new Answer(question, 'B', "Compact cars", false));
    answerRepository.save(new Answer(question, 'C', "Eggs", true));
  }

  private void saveQuestion307() {
    Question question;

    question = questionRepository.save(new Question(2, "The opening ceremonies of the Olympics have NOT won which major award?", "2018-02-20 20:05:56"));

    answerRepository.save(new Answer(question, 'A', "Tony", true));
    answerRepository.save(new Answer(question, 'B', "Emmy", false));
    answerRepository.save(new Answer(question, 'C', "Grammy", false));
  }

  private void saveQuestion308() {
    Question question;

    question = questionRepository.save(new Question(3, "Which ballroom dance is typically performed in 3/4 time?", "2018-02-20 20:06:39"));

    answerRepository.save(new Answer(question, 'A', "Rumba", false));
    answerRepository.save(new Answer(question, 'B', "Waltz", true));
    answerRepository.save(new Answer(question, 'C', "Tango", false));
  }

  private void saveQuestion309() {
    Question question;

    question = questionRepository.save(new Question(4, "What animal is traditionally the source of fried calamari?", "2018-02-20 20:07:22"));

    answerRepository.save(new Answer(question, 'A', "Squid", true));
    answerRepository.save(new Answer(question, 'B', "Eel", false));
    answerRepository.save(new Answer(question, 'C', "Octopus", false));
  }

  private void saveQuestion310() {
    Question question;

    question = questionRepository.save(new Question(5, "What medical device must legally be available at U.S. public gathering places?", "2018-02-20 20:08:22"));

    answerRepository.save(new Answer(question, 'A', "Oxygen tank", false));
    answerRepository.save(new Answer(question, 'B', "Defibrillator", true));
    answerRepository.save(new Answer(question, 'C', "EpiPen", false));
  }

  private void saveQuestion311() {
    Question question;

    question = questionRepository.save(new Question(6, "A person writing clearly and correctly is often said to be following “Strunk and” whom?", "2018-02-20 20:09:08"));

    answerRepository.save(new Answer(question, 'A', "White", true));
    answerRepository.save(new Answer(question, 'B', "Follett", false));
    answerRepository.save(new Answer(question, 'C', "Robert", false));
  }

  private void saveQuestion312() {
    Question question;

    question = questionRepository.save(new Question(7, "Who did NOT win back-to-back Best Actor Oscars?", "2018-02-20 20:09:54"));

    answerRepository.save(new Answer(question, 'A', "James Stewart", true));
    answerRepository.save(new Answer(question, 'B', "Spencer Tracy", false));
    answerRepository.save(new Answer(question, 'C', "Tom Hanks", false));
  }

  private void saveQuestion313() {
    Question question;

    question = questionRepository.save(new Question(8, "In the classic edition of Monopoly, which word appears in the name of two different spaces?", "2018-02-20 20:10:49"));

    answerRepository.save(new Answer(question, 'A', "Pennsylvania", true));
    answerRepository.save(new Answer(question, 'B', "Pacific", false));
    answerRepository.save(new Answer(question, 'C', "North", false));
  }

  private void saveQuestion314() {
    Question question;

    question = questionRepository.save(new Question(9, "Which of these past Olympic mascots was an animal?", "2018-02-20 20:11:41"));

    answerRepository.save(new Answer(question, 'A', "Izzy", false));
    answerRepository.save(new Answer(question, 'B', "Wenlock", false));
    answerRepository.save(new Answer(question, 'C', "Hodori", true));
  }

  private void saveQuestion315() {
    Question question;

    question = questionRepository.save(new Question(10, "What Caribbean island was the birthplace of Alexander Hamilton?", "2018-02-20 20:12:31"));

    answerRepository.save(new Answer(question, 'A', "St. Kitts", false));
    answerRepository.save(new Answer(question, 'B', "Nevis", true));
    answerRepository.save(new Answer(question, 'C', "Anguilla", false));
  }

  private void saveQuestion316() {
    Question question;

    question = questionRepository.save(new Question(11, "Which CEO runs the NASDAQ-listed company with the highest market cap?", "2018-02-20 20:13:39"));

    answerRepository.save(new Answer(question, 'A', "Tim Cook", true));
    answerRepository.save(new Answer(question, 'B', "Jeff Bezos", false));
    answerRepository.save(new Answer(question, 'C', "Satya Nadella", false));
  }

  private void saveQuestion317() {
    Question question;

    question = questionRepository.save(new Question(1, "According to the title of her hit 2015 song, how long is Rihanna from wildin'?", "2018-02-21 02:07:56"));

    answerRepository.save(new Answer(question, 'A', "FourFiveSeconds", true));
    answerRepository.save(new Answer(question, 'B', "A few hours… https://t.co/Nxtk7XgAWF", false));
  }

  private void saveQuestion318() {
    Question question;

    question = questionRepository.save(new Question(2, "Which baseball player is NOT mentioned in Billy Joel’s “We Didn’t Start the Fire”?", "2018-02-21 02:13:48"));

    answerRepository.save(new Answer(question, 'A', "Jackie Robinson", true));
    answerRepository.save(new Answer(question, 'B', "Mickey Mantle", false));
    answerRepository.save(new Answer(question, 'C', "Roy Campanella", false));
  }

  private void saveQuestion319() {
    Question question;

    question = questionRepository.save(new Question(1, "In billiards, what color is a standard eight-ball?", "2018-02-21 20:03:42"));

    answerRepository.save(new Answer(question, 'A', "Burnt sienna", false));
    answerRepository.save(new Answer(question, 'B', "Millennial pink", false));
    answerRepository.save(new Answer(question, 'C', "Black", true));
  }

  private void saveQuestion320() {
    Question question;

    question = questionRepository.save(new Question(2, "Which of these liquids comes from an udder?", "2018-02-21 20:04:16"));

    answerRepository.save(new Answer(question, 'A', "Milk", true));
    answerRepository.save(new Answer(question, 'B', "Apple juice", false));
    answerRepository.save(new Answer(question, 'C', "Coffee", false));
  }

  private void saveQuestion321() {
    Question question;

    question = questionRepository.save(new Question(3, "What is the adjectival form of the word “governor”?", "2018-02-21 20:04:59"));

    answerRepository.save(new Answer(question, 'A', "Gavernoric", false));
    answerRepository.save(new Answer(question, 'B', "Gubernatorial", true));
    answerRepository.save(new Answer(question, 'C', "Governorian", false));
  }

  private void saveQuestion322() {
    Question question;

    question = questionRepository.save(new Question(4, "What area of London is synonymous with the city's world-class theater scene?", "2018-02-21 20:05:42"));

    answerRepository.save(new Answer(question, 'A', "Chelsea", false));
    answerRepository.save(new Answer(question, 'B', "Knightsbridge", false));
    answerRepository.save(new Answer(question, 'C', "West End", true));
  }

  private void saveQuestion323() {
    Question question;

    question = questionRepository.save(new Question(5, "How do you find the reciprocal of a number?", "2018-02-21 20:06:24"));

    answerRepository.save(new Answer(question, 'A', "Divide 1 by the number", true));
    answerRepository.save(new Answer(question, 'B', "Square the number", false));
    answerRepository.save(new Answer(question, 'C', "Subtract it from zero", false));
  }

  private void saveQuestion324() {
    Question question;

    question = questionRepository.save(new Question(6, "Which website did the New York Times call “the people’s National Endowment for the Arts”?", "2018-02-21 20:07:20"));

    answerRepository.save(new Answer(question, 'A', "Pinterest", false));
    answerRepository.save(new Answer(question, 'B', "Etsy", false));
    answerRepository.save(new Answer(question, 'C', "Kickstarter", true));
  }

  private void saveQuestion325() {
    Question question;

    question = questionRepository.save(new Question(7, "Which band had a member with the same stage name as a Revolutionary War admiral?", "2018-02-21 20:08:07"));

    answerRepository.save(new Answer(question, 'A', "Led Zeppelin", true));
    answerRepository.save(new Answer(question, 'B', "Pink Floyd", false));
    answerRepository.save(new Answer(question, 'C', "The Kinks", false));
  }

  private void saveQuestion326() {
    Question question;

    question = questionRepository.save(new Question(8, "Which writer has NOT held the position now known as U.S. Poet Laureate?", "2018-02-21 20:08:55"));

    answerRepository.save(new Answer(question, 'A', "Elizabeth Bishop", false));
    answerRepository.save(new Answer(question, 'B', "Robert Frost", false));
    answerRepository.save(new Answer(question, 'C', "Maya Angelou", true));
  }

  private void saveQuestion327() {
    Question question;

    question = questionRepository.save(new Question(9, "What was the first video game to call Mario by the name Mario?", "2018-02-21 20:11:22"));

    answerRepository.save(new Answer(question, 'A', "Donkey Kong", false));
    answerRepository.save(new Answer(question, 'B', "Wrecking Crew", false));
    answerRepository.save(new Answer(question, 'C', "Donkey Kong, Jr.", true));
  }

  private void saveQuestion328() {
    Question question;

    question = questionRepository.save(new Question(10, "What town is home to the most works by the architect of Taliesin West and Graycliff?", "2018-02-21 20:12:44"));

    answerRepository.save(new Answer(question, 'A', "Oak Park, Illinois", true));
    answerRepository.save(new Answer(question, 'B', "Col… https://t.co/GXtZV6ujoO", false));
  }

  private void saveQuestion329() {
    Question question;

    question = questionRepository.save(new Question(1, "What term is used for both a formal set of clothes and a set of playing cards?", "2018-02-22 15:03:47"));

    answerRepository.save(new Answer(question, 'A', "Suit", true));
    answerRepository.save(new Answer(question, 'B', "Waistcoat", false));
    answerRepository.save(new Answer(question, 'C', "Tuxedo T-shirt", false));
  }

  private void saveQuestion330() {
    Question question;

    question = questionRepository.save(new Question(2, "Which object is usually in a conductor's hand during a performance?", "2018-02-22 15:04:27"));

    answerRepository.save(new Answer(question, 'A', "Sleeping ferret", false));
    answerRepository.save(new Answer(question, 'B', "Baton", true));
    answerRepository.save(new Answer(question, 'C', "Box of tissues", false));
  }

  private void saveQuestion331() {
    Question question;

    question = questionRepository.save(new Question(3, "“Chestnut” and “button” are types of which ingredient?", "2018-02-22 15:05:09"));

    answerRepository.save(new Answer(question, 'A', "Grape", false));
    answerRepository.save(new Answer(question, 'B', "Carrot", false));
    answerRepository.save(new Answer(question, 'C', "Mushroom", true));
  }

  private void saveQuestion332() {
    Question question;

    question = questionRepository.save(new Question(4, "What part of the body is damaged if you break your tibia?", "2018-02-22 15:05:47"));

    answerRepository.save(new Answer(question, 'A', "Leg", true));
    answerRepository.save(new Answer(question, 'B', "Arm", false));
    answerRepository.save(new Answer(question, 'C', "Scalp", false));
  }

  private void saveQuestion333() {
    Question question;

    question = questionRepository.save(new Question(5, "Which character does Jude Law play in the movie “King Arthur: Legend of the Sword”?", "2018-02-22 15:06:44"));

    answerRepository.save(new Answer(question, 'A', "Vortigern", true));
    answerRepository.save(new Answer(question, 'B', "Uther Pendragon", false));
    answerRepository.save(new Answer(question, 'C', "King Arthur", false));
  }

  private void saveQuestion334() {
    Question question;

    question = questionRepository.save(new Question(6, "Which monarch laid the foundation stone at Balmoral Castle?", "2018-02-22 15:07:49"));

    answerRepository.save(new Answer(question, 'A', "Edward VII", false));
    answerRepository.save(new Answer(question, 'B', "Victoria", true));
    answerRepository.save(new Answer(question, 'C', "William IV", false));
  }

  private void saveQuestion335() {
    Question question;

    question = questionRepository.save(new Question(7, "As of 2017, which of these industries had the highest percentage of the UK's GDP?", "2018-02-22 15:08:32"));

    answerRepository.save(new Answer(question, 'A', "Service", true));
    answerRepository.save(new Answer(question, 'B', "Travel", false));
    answerRepository.save(new Answer(question, 'C', "Construction", false));
  }

  private void saveQuestion336() {
    Question question;

    question = questionRepository.save(new Question(8, "In an episode of “Friends”, what name was Ross supposed to say at his wedding ceremony instead of “Rachel”?", "2018-02-22 15:10:19"));

    answerRepository.save(new Answer(question, 'A', "Julie", false));
    answerRepository.save(new Answer(question, 'B', "Elizabeth", false));
    answerRepository.save(new Answer(question, 'C', "Emily", true));
  }

  private void saveQuestion337() {
    Question question;

    question = questionRepository.save(new Question(9, "Which of these animals is NOT a marsupial?", "2018-02-22 15:10:42"));

    answerRepository.save(new Answer(question, 'A', "Bandicoot", false));
    answerRepository.save(new Answer(question, 'B', "Groundhog", true));
    answerRepository.save(new Answer(question, 'C', "Opossum", false));
  }

  private void saveQuestion338() {
    Question question;

    question = questionRepository.save(new Question(10, "As well as medals, what were winners given at the Rio Olympics' medal ceremonies?", "2018-02-22 15:11:32"));

    answerRepository.save(new Answer(question, 'A', "Laurel wreaths", false));
    answerRepository.save(new Answer(question, 'B', "Miniature st… https://t.co/p1csOOKT1Z", false));
  }

  private void saveQuestion339() {
    Question question;

    question = questionRepository.save(new Question(11, "Which of these authors was over 50 when his first novel was published?", "2018-02-22 15:12:30"));

    answerRepository.save(new Answer(question, 'A', "Richard Adams", true));
    answerRepository.save(new Answer(question, 'B', "J.R.R. Tolkien", false));
    answerRepository.save(new Answer(question, 'C', "Robert Ludlum", false));
  }

  private void saveQuestion340() {
    Question question;

    question = questionRepository.save(new Question(1, "Armenia and Estonia are former members of which group of countries?", "2018-02-22 21:03:56"));

    answerRepository.save(new Answer(question, 'A', "Soviet Union", true));
    answerRepository.save(new Answer(question, 'B', "United States", false));
    answerRepository.save(new Answer(question, 'C', "United Kingdom", false));
  }

  private void saveQuestion341() {
    Question question;

    question = questionRepository.save(new Question(2, "How is Jack Dawkins better known in a classic 19th century novel?", "2018-02-22 21:04:39"));

    answerRepository.save(new Answer(question, 'A', "BoJack Horseman", false));
    answerRepository.save(new Answer(question, 'B', "Julius Caesar", false));
    answerRepository.save(new Answer(question, 'C', "Artful Dodger", true));
  }

  private void saveQuestion342() {
    Question question;

    question = questionRepository.save(new Question(3, "What is the maximum score a player can get in a turn of three darts?", "2018-02-22 21:05:21"));

    answerRepository.save(new Answer(question, 'A', "100", false));
    answerRepository.save(new Answer(question, 'B', "250", false));
    answerRepository.save(new Answer(question, 'C', "180", true));
  }

  private void saveQuestion343() {
    Question question;

    question = questionRepository.save(new Question(4, "With whom did William Hewlett co-found a multi-national IT company?", "2018-02-22 21:06:06"));

    answerRepository.save(new Answer(question, 'A', "Bill Gates", false));
    answerRepository.save(new Answer(question, 'B', "David Packard", true));
    answerRepository.save(new Answer(question, 'C', "Steve Jobs", false));
  }

  private void saveQuestion344() {
    Question question;

    question = questionRepository.save(new Question(5, "Which Justin Timberlake hit contains the line \"she's flawless like some uncut ice\"?", "2018-02-22 21:06:52"));

    answerRepository.save(new Answer(question, 'A', "Lovestoned", true));
    answerRepository.save(new Answer(question, 'B', "Senorita", false));
    answerRepository.save(new Answer(question, 'C', "Like I Love you", false));
  }

  private void saveQuestion345() {
    Question question;

    question = questionRepository.save(new Question(6, "In Rome, which of these ingredients is used to flavour ciabatta bread?", "2018-02-22 21:08:01"));

    answerRepository.save(new Answer(question, 'A', "Oyster Sauce", false));
    answerRepository.save(new Answer(question, 'B', "Marjoram", true));
    answerRepository.save(new Answer(question, 'C', "Fermented Black Beans", false));
  }

  private void saveQuestion346() {
    Question question;

    question = questionRepository.save(new Question(7, "For which of these movies did Meryl Streep NOT win an Oscar?", "2018-02-22 21:08:42"));

    answerRepository.save(new Answer(question, 'A', "Out of Africa", true));
    answerRepository.save(new Answer(question, 'B', "Sophie's Choice", false));
    answerRepository.save(new Answer(question, 'C', "The Iron Lady", false));
  }

  private void saveQuestion347() {
    Question question;

    question = questionRepository.save(new Question(8, "Which of these countries does NOT have the same name as its capital city?", "2018-02-22 21:09:36"));

    answerRepository.save(new Answer(question, 'A', "Luxembourg", false));
    answerRepository.save(new Answer(question, 'B', "Djibouti", false));
    answerRepository.save(new Answer(question, 'C', "El Salvador", true));
  }

  private void saveQuestion348() {
    Question question;

    question = questionRepository.save(new Question(9, "Since 2004, the World Chess Federation has had its headquarters in which city?", "2018-02-22 21:10:17"));

    answerRepository.save(new Answer(question, 'A', "Oslo", false));
    answerRepository.save(new Answer(question, 'B', "Geneva", false));
    answerRepository.save(new Answer(question, 'C', "Athens", true));
  }

  private void saveQuestion349() {
    Question question;

    question = questionRepository.save(new Question(10, "Where did the budget retailer Poundland open its first store in 1990?", "2018-02-22 21:11:14"));

    answerRepository.save(new Answer(question, 'A', "Basildon", false));
    answerRepository.save(new Answer(question, 'B', "Blackpool", false));
    answerRepository.save(new Answer(question, 'C', "Burton-upon-Trent", true));
  }

  private void saveQuestion350() {
    Question question;

    question = questionRepository.save(new Question(11, "In 2005, what did BBC chairman Michael Grade declare as his aim for the future of the network?", "2018-02-22 21:12:29"));

    answerRepository.save(new Answer(question, 'A', "Monthly subscript… https://t.co/Wb4qCe5Sbi", false));
  }

  private void saveQuestion351() {
    Question question;

    question = questionRepository.save(new Question(12, "Which football club has a stand displaying an extract from the nineteenth book of the Old Testament?", "2018-02-22 21:12:56"));

    answerRepository.save(new Answer(question, 'A', "Heart of Mi… https://t.co/8dagBorIdL", false));
  }

  private void saveQuestion352() {
    Question question;

    question = questionRepository.save(new Question(1, "Which of these offers protection during a battle?", "2018-02-23 15:03:56"));

    answerRepository.save(new Answer(question, 'A', "Scrunchie", false));
    answerRepository.save(new Answer(question, 'B', "Armour", true));
    answerRepository.save(new Answer(question, 'C', "Snapchat glasses", false));
  }

  private void saveQuestion353() {
    Question question;

    question = questionRepository.save(new Question(2, "Which of these is the name of an English Test cricket ground?", "2018-02-23 15:04:34"));

    answerRepository.save(new Answer(question, 'A', "The Oval", true));
    answerRepository.save(new Answer(question, 'B', "The Rectangle", false));
    answerRepository.save(new Answer(question, 'C', "The Trapezium", false));
  }

  private void saveQuestion354() {
    Question question;

    question = questionRepository.save(new Question(3, "What is the first name of Holly Willoughby’s regular co-host on “This Morning”?", "2018-02-23 15:05:34"));

    answerRepository.save(new Answer(question, 'A', "Pete", false));
    answerRepository.save(new Answer(question, 'B', "Phillip", true));
    answerRepository.save(new Answer(question, 'C', "Paul", false));
  }

  private void saveQuestion355() {
    Question question;

    question = questionRepository.save(new Question(4, "Which of these figures is known as “The History Guy” on social media?", "2018-02-23 15:06:17"));

    answerRepository.save(new Answer(question, 'A', "David Starkey", false));
    answerRepository.save(new Answer(question, 'B', "Dan Snow", true));
    answerRepository.save(new Answer(question, 'C', "Simon Schama", false));
  }

  private void saveQuestion356() {
    Question question;

    question = questionRepository.save(new Question(5, "Which of these Stephen King novels was written under a pseudonym?", "2018-02-23 15:07:05"));

    answerRepository.save(new Answer(question, 'A', "The Shining", false));
    answerRepository.save(new Answer(question, 'B', "Salem's Lot", false));
    answerRepository.save(new Answer(question, 'C', "The Running Man", true));
  }

  private void saveQuestion357() {
    Question question;

    question = questionRepository.save(new Question(6, "Which of these web services was developed in the Noughties by a Russian schoolboy?", "2018-02-23 15:08:06"));

    answerRepository.save(new Answer(question, 'A', "ChatRoulette", true));
    answerRepository.save(new Answer(question, 'B', "Bebo", false));
    answerRepository.save(new Answer(question, 'C', "MySpace", false));
  }

  private void saveQuestion358() {
    Question question;

    question = questionRepository.save(new Question(7, "For which movie did Tom Hanks receive his most recent acting Oscar nomination?", "2018-02-23 15:08:55"));

    answerRepository.save(new Answer(question, 'A', "Cast Away", true));
    answerRepository.save(new Answer(question, 'B', "Captain Phillips", false));
    answerRepository.save(new Answer(question, 'C', "Bridge of Spies", false));
  }

  private void saveQuestion359() {
    Question question;

    question = questionRepository.save(new Question(8, "Which TV food competition winner opened the Wahaca chain of restaurants?", "2018-02-23 15:09:49"));

    answerRepository.save(new Answer(question, 'A', "Nadiya Hussain", false));
    answerRepository.save(new Answer(question, 'B', "Candice Brown", false));
    answerRepository.save(new Answer(question, 'C', "Thomasina Miers", true));
  }

  private void saveQuestion360() {
    Question question;

    question = questionRepository.save(new Question(9, "Which of these countries has the fewest land borders with other countries?", "2018-02-23 15:10:30"));

    answerRepository.save(new Answer(question, 'A', "France", false));
    answerRepository.save(new Answer(question, 'B', "Poland", true));
    answerRepository.save(new Answer(question, 'C', "Austria", false));
  }

  private void saveQuestion361() {
    Question question;

    question = questionRepository.save(new Question(10, "Which of these brands is NOT named after a person?", "2018-02-23 15:11:14"));

    answerRepository.save(new Answer(question, 'A', "Boots", false));
    answerRepository.save(new Answer(question, 'B', "Bisto", true));
    answerRepository.save(new Answer(question, 'C', "Burberry", false));
  }

  private void saveQuestion362() {
    Question question;

    question = questionRepository.save(new Question(11, "In total, Britain has just over 9,800 miles of which of the following?", "2018-02-23 15:11:59"));

    answerRepository.save(new Answer(question, 'A', "Railways", true));
    answerRepository.save(new Answer(question, 'B', "Motorways", false));
    answerRepository.save(new Answer(question, 'C', "Canals", false));
  }

  private void saveQuestion363() {
    Question question;

    question = questionRepository.save(new Question(12, "Which of the Queen's children has the most grandchildren?", "2018-02-23 15:13:03"));

    answerRepository.save(new Answer(question, 'A', "Andrew", false));
    answerRepository.save(new Answer(question, 'B', "Charles", false));
    answerRepository.save(new Answer(question, 'C', "Anne", true));
  }

  private void saveQuestion364() {
    Question question;

    question = questionRepository.save(new Question(1, "Which piece of clothing is meant to protect your head from the cold?", "2018-03-05 20:05:27"));

    answerRepository.save(new Answer(question, 'A', "Earmuffs", true));
    answerRepository.save(new Answer(question, 'B', "Giant clock necklace", false));
    answerRepository.save(new Answer(question, 'C', "Toe socks", false));
  }

  private void saveQuestion365() {
    Question question;

    question = questionRepository.save(new Question(2, "What are candles commonly made out of?", "2018-03-05 20:06:04"));

    answerRepository.save(new Answer(question, 'A', "Old Legos", false));
    answerRepository.save(new Answer(question, 'B', "Greek yogurt", false));
    answerRepository.save(new Answer(question, 'C', "Paraffin wax", true));
  }

  private void saveQuestion366() {
    Question question;

    question = questionRepository.save(new Question(3, "What form of singing was historically used to communicate between mountaintops?", "2018-03-05 20:06:43"));

    answerRepository.save(new Answer(question, 'A', "Yodeling", true));
    answerRepository.save(new Answer(question, 'B', "Opera arias", false));
    answerRepository.save(new Answer(question, 'C', "Gregorian chanting", false));
  }

  private void saveQuestion367() {
    Question question;

    question = questionRepository.save(new Question(4, "Rumspringa is a rite of passage among which of these groups?", "2018-03-05 20:07:21"));

    answerRepository.save(new Answer(question, 'A', "Mormons", false));
    answerRepository.save(new Answer(question, 'B', "Jehovah's Witnesses", false));
    answerRepository.save(new Answer(question, 'C', "Amish", true));
  }

  private void saveQuestion368() {
    Question question;

    question = questionRepository.save(new Question(5, "Which of these is a synonym for the opposite of a financial bull market?", "2018-03-05 20:08:02"));

    answerRepository.save(new Answer(question, 'A', "Ursine market", true));
    answerRepository.save(new Answer(question, 'B', "Taurine market", false));
    answerRepository.save(new Answer(question, 'C', "Porcine market", false));
  }

  private void saveQuestion369() {
    Question question;

    question = questionRepository.save(new Question(6, "Which of these animals is technically a fish?", "2018-03-05 20:09:07"));

    answerRepository.save(new Answer(question, 'A', "Porpoise", false));
    answerRepository.save(new Answer(question, 'B', "Orca", false));
    answerRepository.save(new Answer(question, 'C', "Whale shark", true));
  }

  private void saveQuestion370() {
    Question question;

    question = questionRepository.save(new Question(7, "Basketball was invented in the U.S. state that is also home to which of these islands?", "2018-03-05 20:09:39"));

    answerRepository.save(new Answer(question, 'A', "Hilton Head", false));
    answerRepository.save(new Answer(question, 'B', "Hatteras I… https://t.co/3ozgjnZq6p", false));
  }

  private void saveQuestion371() {
    Question question;

    question = questionRepository.save(new Question(8, "A famously counterintuitive logic puzzle is named for what game show host?", "2018-03-05 20:10:23"));

    answerRepository.save(new Answer(question, 'A', "Bob Barker", false));
    answerRepository.save(new Answer(question, 'B', "Richard Dawson", false));
    answerRepository.save(new Answer(question, 'C', "Monty Hall", true));
  }

  private void saveQuestion372() {
    Question question;

    question = questionRepository.save(new Question(9, "Which company provided audio equipment that helped Disney produce “Fantasia”?", "2018-03-05 20:11:09"));

    answerRepository.save(new Answer(question, 'A', "Bang &amp; Olufsen", false));
    answerRepository.save(new Answer(question, 'B', "Hewlett-Packard", true));
    answerRepository.save(new Answer(question, 'C', "Dolby Laboratories", false));
  }

  private void saveQuestion373() {
    Question question;

    question = questionRepository.save(new Question(10, "Which nation does NOT have land on the island of Borneo?", "2018-03-05 20:12:09"));

    answerRepository.save(new Answer(question, 'A', "Malaysia", false));
    answerRepository.save(new Answer(question, 'B', "Indonesia", false));
    answerRepository.save(new Answer(question, 'C', "Myanmar", true));
  }

  private void saveQuestion374() {
    Question question;

    question = questionRepository.save(new Question(11, "Which Billy Joel album opens with a sound effect that’s appropriate to its title?", "2018-03-05 20:12:57"));

    answerRepository.save(new Answer(question, 'A', "Storm Front", false));
    answerRepository.save(new Answer(question, 'B', "Turnstiles", false));
    answerRepository.save(new Answer(question, 'C', "Glass Houses", true));
  }

  private void saveQuestion375() {
    Question question;

    question = questionRepository.save(new Question(12, "Which of these words can NOT be typed exclusively using one row of a QWERTY keyboard?", "2018-03-05 20:14:07"));

    answerRepository.save(new Answer(question, 'A', "Powertripper", false));
    answerRepository.save(new Answer(question, 'B', "Typewriter", false));
    answerRepository.save(new Answer(question, 'C', "Pirouetted", true));
  }

  private void saveQuestion376() {
    Question question;

    question = questionRepository.save(new Question(1, "Which of these is a popular form of live comedy?", "2018-03-06 02:05:59"));

    answerRepository.save(new Answer(question, 'A', "Stand-up", true));
    answerRepository.save(new Answer(question, 'B', "Run-around", false));
    answerRepository.save(new Answer(question, 'C', "Lie-down", false));
  }

  private void saveQuestion377() {
    Question question;

    question = questionRepository.save(new Question(2, "Where is carpeting most commonly installed?", "2018-03-06 02:06:45"));

    answerRepository.save(new Answer(question, 'A', "Floors", true));
    answerRepository.save(new Answer(question, 'B', "Walls", false));
    answerRepository.save(new Answer(question, 'C', "Roofs", false));
  }

  private void saveQuestion378() {
    Question question;

    question = questionRepository.save(new Question(3, "Which planet is famous for its massive and picturesque rings?", "2018-03-06 02:07:23"));

    answerRepository.save(new Answer(question, 'A', "Venus", false));
    answerRepository.save(new Answer(question, 'B', "Saturn", true));
    answerRepository.save(new Answer(question, 'C', "Mercury", false));
  }

  private void saveQuestion379() {
    Question question;

    question = questionRepository.save(new Question(4, "Which pair of countries can be found on the Horn of Africa?", "2018-03-06 02:08:09"));

    answerRepository.save(new Answer(question, 'A', "Egypt / Ethiopia", false));
    answerRepository.save(new Answer(question, 'B', "Ethiopia / Eritrea", true));
    answerRepository.save(new Answer(question, 'C', "Eritrea / Egypt", false));
  }

  private void saveQuestion380() {
    Question question;

    question = questionRepository.save(new Question(5, "Which of these words likely came into English through Yiddish?", "2018-03-06 02:09:15"));

    answerRepository.save(new Answer(question, 'A', "Glitch", true));
    answerRepository.save(new Answer(question, 'B', "Ritzy", false));
    answerRepository.save(new Answer(question, 'C', "Kerfuffle", false));
  }

  private void saveQuestion381() {
    Question question;

    question = questionRepository.save(new Question(6, "Where on the body would you find the manipura chakra?", "2018-03-06 02:09:58"));

    answerRepository.save(new Answer(question, 'A', "Over the belly button", true));
    answerRepository.save(new Answer(question, 'B', "Within the heart", false));
    answerRepository.save(new Answer(question, 'C', "Between the eyes", false));
  }

  private void saveQuestion382() {
    Question question;

    question = questionRepository.save(new Question(7, "Nerf balls were initially marketed as the world’s first what?", "2018-03-06 02:10:52"));

    answerRepository.save(new Answer(question, 'A', "Safety ball", false));
    answerRepository.save(new Answer(question, 'B', "Indoor ball", true));
    answerRepository.save(new Answer(question, 'C', "Baby ball", false));
  }

  private void saveQuestion383() {
    Question question;

    question = questionRepository.save(new Question(8, "San Francisco's Waldo Tunnel was renamed in 2016 after a noted what?", "2018-03-06 02:11:29"));

    answerRepository.save(new Answer(question, 'A', "Actor", true));
    answerRepository.save(new Answer(question, 'B', "Politician", false));
    answerRepository.save(new Answer(question, 'C', "Athlete", false));
  }

  private void saveQuestion384() {
    Question question;

    question = questionRepository.save(new Question(9, "Which Baby-Sitters Club member was NOT included in the film version?", "2018-03-06 02:12:18"));

    answerRepository.save(new Answer(question, 'A', "Jessi", false));
    answerRepository.save(new Answer(question, 'B', "Logan", false));
    answerRepository.save(new Answer(question, 'C', "Abby", true));
  }

  private void saveQuestion385() {
    Question question;

    question = questionRepository.save(new Question(10, "The part of a book disclosing its publication info is known as what?", "2018-03-06 02:14:05"));

    answerRepository.save(new Answer(question, 'A', "Propindex", false));
    answerRepository.save(new Answer(question, 'B', "Colophon", true));
    answerRepository.save(new Answer(question, 'C', "Rectograf", false));
  }

  private void saveQuestion386() {
    Question question;

    question = questionRepository.save(new Question(11, "In western media, what are astronauts from China called?", "2018-03-06 02:14:09"));

    answerRepository.save(new Answer(question, 'A', "Taikonauts", true));
    answerRepository.save(new Answer(question, 'B', "Sinonauts", false));
    answerRepository.save(new Answer(question, 'C', "Spationauts", false));
  }

  private void saveQuestion387() {
    Question question;

    question = questionRepository.save(new Question(12, "Which of these is NOT an official Tetris sequel?", "2018-03-06 02:15:28"));

    answerRepository.save(new Answer(question, 'A', "Wordtris", false));
    answerRepository.save(new Answer(question, 'B', "Maptris", true));
    answerRepository.save(new Answer(question, 'C', "Welltris", false));
  }

  private void saveQuestion388() {
    Question question;

    question = questionRepository.save(new Question(1, "Which of these are typically used to help motorists see the road better?", "2018-03-06 20:06:09"));

    answerRepository.save(new Answer(question, 'A', "NBA highlights", false));
    answerRepository.save(new Answer(question, 'B', "Turkish delights", false));
    answerRepository.save(new Answer(question, 'C', "Headlights", true));
  }

  private void saveQuestion389() {
    Question question;

    question = questionRepository.save(new Question(2, "By definition, an ambulatory person is what?", "2018-03-06 20:06:17"));

    answerRepository.save(new Answer(question, 'A', "Walking", true));
    answerRepository.save(new Answer(question, 'B', "Making sounds", false));
    answerRepository.save(new Answer(question, 'C', "Hospital-bound", false));
  }

  private void saveQuestion390() {
    Question question;

    question = questionRepository.save(new Question(3, "What name does Marlon Brando famously yell in a 1951 film?", "2018-03-06 20:07:17"));

    answerRepository.save(new Answer(question, 'A', "Laura", false));
    answerRepository.save(new Answer(question, 'B', "Stella", true));
    answerRepository.save(new Answer(question, 'C', "Marge", false));
  }

  private void saveQuestion391() {
    Question question;

    question = questionRepository.save(new Question(4, "Which of these island chains is in the Atlantic Ocean?", "2018-03-06 20:08:00"));

    answerRepository.save(new Answer(question, 'A', "Marshall Islands", false));
    answerRepository.save(new Answer(question, 'B', "Falkland Islands", true));
    answerRepository.save(new Answer(question, 'C', "Svalbard", false));
  }

  private void saveQuestion392() {
    Question question;

    question = questionRepository.save(new Question(5, "When it comes to math, which Greek letter is typically used to represent an angle?", "2018-03-06 20:08:48"));

    answerRepository.save(new Answer(question, 'A', "Kappa", false));
    answerRepository.save(new Answer(question, 'B', "Lambda", false));
    answerRepository.save(new Answer(question, 'C', "Theta", true));
  }

  private void saveQuestion393() {
    Question question;

    question = questionRepository.save(new Question(6, "Madonna was inducted into the Rock &amp; Roll Hall of Fame by the singer of which song?", "2018-03-06 20:09:34"));

    answerRepository.save(new Answer(question, 'A', "Crazy in Love", false));
    answerRepository.save(new Answer(question, 'B', "Toxic", false));
    answerRepository.save(new Answer(question, 'C', "Cry Me a River", true));
  }

  private void saveQuestion394() {
    Question question;

    question = questionRepository.save(new Question(7, "When microwave ovens were first sold, they were named for what technology?", "2018-03-06 20:10:16"));

    answerRepository.save(new Answer(question, 'A', "Laser", false));
    answerRepository.save(new Answer(question, 'B', "Radar", true));
    answerRepository.save(new Answer(question, 'C', "X-ray", false));
  }

  private void saveQuestion395() {
    Question question;

    question = questionRepository.save(new Question(8, "Which of these Emmas has a tattoo of a drawing by Paul McCartney?", "2018-03-06 20:11:08"));

    answerRepository.save(new Answer(question, 'A', "Emma Watson", false));
    answerRepository.save(new Answer(question, 'B', "Emma Thompson", false));
    answerRepository.save(new Answer(question, 'C', "Emma Stone", true));
  }

  private void saveQuestion396() {
    Question question;

    question = questionRepository.save(new Question(9, "New Jersey native John Taylor is credited with creating what processed meat product?", "2018-03-06 20:12:01"));

    answerRepository.save(new Answer(question, 'A', "Slim Jim", false));
    answerRepository.save(new Answer(question, 'B', "Frank 'n Stuff", false));
    answerRepository.save(new Answer(question, 'C', "Pork Roll", true));
  }

  private void saveQuestion397() {
    Question question;

    question = questionRepository.save(new Question(10, "Which of these contributed to John McEnroe's infamous Australian Open ejection?", "2018-03-06 20:12:51"));

    answerRepository.save(new Answer(question, 'A', "Loose racket tape", false));
    answerRepository.save(new Answer(question, 'B', "Crying baby", true));
    answerRepository.save(new Answer(question, 'C', "Bird on the court", false));
  }

  private void saveQuestion398() {
    Question question;

    question = questionRepository.save(new Question(11, "Which of these items could FDR have used before he was president?", "2018-03-06 20:14:17"));

    answerRepository.save(new Answer(question, 'A', "Beer can", false));
    answerRepository.save(new Answer(question, 'B', "Scotch tape", true));
    answerRepository.save(new Answer(question, 'C', "Ballpoint pen", false));
  }

  private void saveQuestion399() {
    Question question;

    question = questionRepository.save(new Question(1, "Which of these is a common term for a very tall building?", "2018-03-07 02:05:12"));

    answerRepository.save(new Answer(question, 'A', "Air tickler", false));
    answerRepository.save(new Answer(question, 'B', "Skyscraper", true));
    answerRepository.save(new Answer(question, 'C', "Cloud sniffer", false));
  }

  private void saveQuestion400() {
    Question question;

    question = questionRepository.save(new Question(2, "Spider-Man is known for flinging what from his wrists?", "2018-03-07 02:07:02"));

    answerRepository.save(new Answer(question, 'A', "Air freshener", false));
    answerRepository.save(new Answer(question, 'B', "Webs", true));
    answerRepository.save(new Answer(question, 'C', "Liquid cheese", false));
  }

  private void saveQuestion401() {
    Question question;

    question = questionRepository.save(new Question(3, "The skincare brand Aesop shares its name with a legendary what?", "2018-03-07 02:07:14"));

    answerRepository.save(new Answer(question, 'A', "Fabulist", true));
    answerRepository.save(new Answer(question, 'B', "King", false));
    answerRepository.save(new Answer(question, 'C', "Farmer", false));
  }

  private void saveQuestion402() {
    Question question;

    question = questionRepository.save(new Question(4, "Which of these U.S. presidents was NEVER a vice president?", "2018-03-07 02:08:05"));

    answerRepository.save(new Answer(question, 'A', "Herbert Hoover", true));
    answerRepository.save(new Answer(question, 'B', "Richard Nixon", false));
    answerRepository.save(new Answer(question, 'C', "Gerald Ford", false));
  }

  private void saveQuestion403() {
    Question question;

    question = questionRepository.save(new Question(5, "What was the nickname of the first manned airplane to break the sound barrier?", "2018-03-07 02:08:58"));

    answerRepository.save(new Answer(question, 'A', "Glamorous Glennis", true));
    answerRepository.save(new Answer(question, 'B', "Spirit of… https://t.co/r0R26t29VG", false));
  }

  private void saveQuestion404() {
    Question question;

    question = questionRepository.save(new Question(6, "During part of the Cold War, what city's MLB team added the word “legs” to its name?", "2018-03-07 02:09:51"));

    answerRepository.save(new Answer(question, 'A', "Cincinnati", true));
    answerRepository.save(new Answer(question, 'B', "Pittsburgh", false));
    answerRepository.save(new Answer(question, 'C', "Boston", false));
  }

  private void saveQuestion405() {
    Question question;

    question = questionRepository.save(new Question(7, "Which company’s 2012 smartphones included Beats Audio technology?", "2018-03-07 02:10:36"));

    answerRepository.save(new Answer(question, 'A', "Samsung", false));
    answerRepository.save(new Answer(question, 'B', "Apple", false));
    answerRepository.save(new Answer(question, 'C', "HTC", true));
  }

  private void saveQuestion406() {
    Question question;

    question = questionRepository.save(new Question(8, "Which of these people has won the most Emmys for Outstanding Host of a Reality TV Show?", "2018-03-07 02:12:19"));

    answerRepository.save(new Answer(question, 'A', "Howie Mandel", false));
    answerRepository.save(new Answer(question, 'B', "Tom Berg… https://t.co/PyiGJTyOd0", false));
  }

  private void saveQuestion407() {
    Question question;

    question = questionRepository.save(new Question(9, "Sprinter Justin Gatlin once ran a record-breaking 100 meter sprint thanks to what advantage?", "2018-03-07 02:13:01"));

    answerRepository.save(new Answer(question, 'A', "Industrial fan", true));
    answerRepository.save(new Answer(question, 'B', "", false));
  }

  private void saveQuestion408() {
    Question question;

    question = questionRepository.save(new Question(10, "The author of which classic work was widely known for his hatred of the Eiffel Tower?", "2018-03-07 02:14:19"));

    answerRepository.save(new Answer(question, 'A', "Les Misérables", false));
    answerRepository.save(new Answer(question, 'B', "The Neck… https://t.co/8TkwJlUn0z", false));
  }

  private void saveQuestion409() {
    Question question;

    question = questionRepository.save(new Question(1, "Which of these refers to asking someone to an end-of-school-year dance?", "2018-03-07 20:05:20"));

    answerRepository.save(new Answer(question, 'A', "Planking", false));
    answerRepository.save(new Answer(question, 'B', "Promposal", true));
    answerRepository.save(new Answer(question, 'C', "Sip n’ See", false));
  }

  private void saveQuestion410() {
    Question question;

    question = questionRepository.save(new Question(2, "How would you say “hello” in Mandarin Chinese?", "2018-03-07 20:07:27"));

    answerRepository.save(new Answer(question, 'A', "Sup dawg", false));
    answerRepository.save(new Answer(question, 'B', "Ni hao", true));
    answerRepository.save(new Answer(question, 'C', "Quemero Numero Uno", false));
  }

  private void saveQuestion411() {
    Question question;

    question = questionRepository.save(new Question(3, "Which of these newspapers was founded most recently?", "2018-03-07 20:07:50"));

    answerRepository.save(new Answer(question, 'A', "Wall Street Journal", false));
    answerRepository.save(new Answer(question, 'B', "Washington Post", false));
    answerRepository.save(new Answer(question, 'C', "USA Today", true));
  }

  private void saveQuestion412() {
    Question question;

    question = questionRepository.save(new Question(4, "In diamond rings, what shape best describes a “princess” cut?", "2018-03-07 20:08:33"));

    answerRepository.save(new Answer(question, 'A', "Oval", false));
    answerRepository.save(new Answer(question, 'B', "Marquise", false));
    answerRepository.save(new Answer(question, 'C', "Square", true));
  }

  private void saveQuestion413() {
    Question question;

    question = questionRepository.save(new Question(5, "Which of these rivers forms at least part of the boundary of four U.S. states?", "2018-03-07 20:09:15"));

    answerRepository.save(new Answer(question, 'A', "Rio Grande", false));
    answerRepository.save(new Answer(question, 'B', "Delaware", true));
    answerRepository.save(new Answer(question, 'C', "St. Lawrence", false));
  }

  private void saveQuestion414() {
    Question question;

    question = questionRepository.save(new Question(6, "Which brand of sparkling water was commercially introduced first?", "2018-03-07 20:09:56"));

    answerRepository.save(new Answer(question, 'A', "Schweppes", true));
    answerRepository.save(new Answer(question, 'B', "Perrier", false));
    answerRepository.save(new Answer(question, 'C', "S.Pellegrino", false));
  }

  private void saveQuestion415() {
    Question question;

    question = questionRepository.save(new Question(7, "What author is credited with coining the opening line, “It was a dark and stormy night”?", "2018-03-07 20:11:44"));

    answerRepository.save(new Answer(question, 'A', "Edward Bulwer-Lytton… https://t.co/V4iS6X3l53", true));
  }

  private void saveQuestion416() {
    Question question;

    question = questionRepository.save(new Question(8, "What type of tutu was designed for Balanchine’s New York City Ballet?", "2018-03-07 20:12:14"));

    answerRepository.save(new Answer(question, 'A', "Romantic", false));
    answerRepository.save(new Answer(question, 'B', "Pancake", false));
    answerRepository.save(new Answer(question, 'C', "Powder Puff", true));
  }

  private void saveQuestion417() {
    Question question;

    question = questionRepository.save(new Question(9, "Which Supreme Court Chief Justice's portrait has NOT appeared on official U.S paper currency?", "2018-03-07 20:13:09"));

    answerRepository.save(new Answer(question, 'A', "John Marshall", false));
    answerRepository.save(new Answer(question, 'B', "S… https://t.co/8sJPoLoT93", false));
  }

  private void saveQuestion418() {
    Question question;

    question = questionRepository.save(new Question(10, "Lady Godiva allegedly disrobed and rode a horse through the streets to oppose what?", "2018-03-07 20:14:36"));

    answerRepository.save(new Answer(question, 'A', "Taxation", true));
    answerRepository.save(new Answer(question, 'B', "French influence", false));
    answerRepository.save(new Answer(question, 'C', "Religious decree", false));
  }

  private void saveQuestion419() {
    Question question;

    question = questionRepository.save(new Question(1, "The person who helps a weightlifter is typically known as what?", "2018-03-08 02:05:17"));

    answerRepository.save(new Answer(question, 'A', "Waiter", false));
    answerRepository.save(new Answer(question, 'B', "CEO", false));
    answerRepository.save(new Answer(question, 'C', "Spotter", true));
  }

  private void saveQuestion420() {
    Question question;

    question = questionRepository.save(new Question(2, "“Alice’s Adventures in Wonderland” features which of these characters?", "2018-03-08 02:06:08"));

    answerRepository.save(new Answer(question, 'A', "Paul Blart", false));
    answerRepository.save(new Answer(question, 'B', "King of Queens", false));
    answerRepository.save(new Answer(question, 'C', "Queen of Hearts", true));
  }

  private void saveQuestion421() {
    Question question;

    question = questionRepository.save(new Question(3, "Which of these places calls itself “The City of Brotherly Love”?", "2018-03-08 02:06:55"));

    answerRepository.save(new Answer(question, 'A', "Chicago", false));
    answerRepository.save(new Answer(question, 'B', "Philadelphia", true));
    answerRepository.save(new Answer(question, 'C', "Boston", false));
  }

  private void saveQuestion422() {
    Question question;

    question = questionRepository.save(new Question(4, "Botanically speaking, what type of fruit is an avocado?", "2018-03-08 02:07:37"));

    answerRepository.save(new Answer(question, 'A', "Berry", true));
    answerRepository.save(new Answer(question, 'B', "Gourd", false));
    answerRepository.save(new Answer(question, 'C', "Citrus", false));
  }

  private void saveQuestion423() {
    Question question;

    question = questionRepository.save(new Question(5, "Which of these NBA teams has a female owner?", "2018-03-08 02:08:40"));

    answerRepository.save(new Answer(question, 'A', "Lakers", true));
    answerRepository.save(new Answer(question, 'B', "Timberwolves", false));
    answerRepository.save(new Answer(question, 'C', "Pacers", false));
  }

  private void saveQuestion424() {
    Question question;

    question = questionRepository.save(new Question(6, "In the film that bears his name, what is John Wick’s “casus belli”?", "2018-03-08 02:09:37"));

    answerRepository.save(new Answer(question, 'A', "Hostages", false));
    answerRepository.save(new Answer(question, 'B', "Money", false));
    answerRepository.save(new Answer(question, 'C', "Puppy", true));
  }

  private void saveQuestion425() {
    Question question;

    question = questionRepository.save(new Question(7, "In pregnancy, the ECV method uses what to change the baby’s position?", "2018-03-08 02:10:17"));

    answerRepository.save(new Answer(question, 'A', "Sutures", false));
    answerRepository.save(new Answer(question, 'B', "Pressing hands", true));
    answerRepository.save(new Answer(question, 'C', "Cardiovascular exercise", false));
  }

  private void saveQuestion426() {
    Question question;

    question = questionRepository.save(new Question(8, "The only rock song to exit our solar system in hard-copy form is by what artist?", "2018-03-08 02:11:13"));

    answerRepository.save(new Answer(question, 'A', "The Beatles", false));
    answerRepository.save(new Answer(question, 'B', "Chuck Berry", true));
    answerRepository.save(new Answer(question, 'C', "Little Richard", false));
  }

  private void saveQuestion427() {
    Question question;

    question = questionRepository.save(new Question(9, "Which of these was the name of one of Gap's original fragrances?", "2018-03-08 02:11:58"));

    answerRepository.save(new Answer(question, 'A', "Eternity", false));
    answerRepository.save(new Answer(question, 'B', "Grass", true));
    answerRepository.save(new Answer(question, 'C', "Paradise", false));
  }

  private void saveQuestion428() {
    Question question;

    question = questionRepository.save(new Question(10, "In 1958, a physicist used an oscilloscope to create what is considered the first what?", "2018-03-08 02:12:55"));

    answerRepository.save(new Answer(question, 'A', "Graphing calculator", false));
    answerRepository.save(new Answer(question, 'B', "Vi… https://t.co/xCavEhqDLg", false));
  }

  private void saveQuestion429() {
    Question question;

    question = questionRepository.save(new Question(11, "According to Icelandic tradition, where would you most likely find an Icelandic elf?", "2018-03-08 02:13:38"));

    answerRepository.save(new Answer(question, 'A', "Arboreal canopies", false));
    answerRepository.save(new Answer(question, 'B', "Subbas… https://t.co/yW3XdhBhKO", false));
  }

  private void saveQuestion430() {
    Question question;

    question = questionRepository.save(new Question(12, "Why did the Chicago Daily Tribune rush to print the wrong winner of the 1948 presidential election?", "2018-03-08 02:14:57"));

    answerRepository.save(new Answer(question, 'A', "Workers' dis… https://t.co/UNHJD3RQOy", false));
  }

  private void saveQuestion431() {
    Question question;

    question = questionRepository.save(new Question(1, "What are omelets made out of?", "2018-03-08 20:04:56"));

    answerRepository.save(new Answer(question, 'A', "Apps", false));
    answerRepository.save(new Answer(question, 'B', "Eggs", true));
    answerRepository.save(new Answer(question, 'C', "Imps", false));
  }

  private void saveQuestion432() {
    Question question;

    question = questionRepository.save(new Question(2, "Which of these is a form of precipitation?", "2018-03-08 20:05:38"));

    answerRepository.save(new Answer(question, 'A', "Mail", false));
    answerRepository.save(new Answer(question, 'B', "Fail", false));
    answerRepository.save(new Answer(question, 'C', "Hail", true));
  }

  private void saveQuestion433() {
    Question question;

    question = questionRepository.save(new Question(3, "Which of these numbers is the smallest?", "2018-03-08 20:06:18"));

    answerRepository.save(new Answer(question, 'A', "Inches in a yard", false));
    answerRepository.save(new Answer(question, 'B', "Tablespoons in a pint", true));
    answerRepository.save(new Answer(question, 'C', "Seconds in a minute", false));
  }

  private void saveQuestion434() {
    Question question;

    question = questionRepository.save(new Question(4, "Where did the famous “gentleman’s agreement” to end the U.S. Civil War take place?", "2018-03-08 20:06:49"));

    answerRepository.save(new Answer(question, 'A', "Virginia", true));
    answerRepository.save(new Answer(question, 'B', "North Carolina", false));
    answerRepository.save(new Answer(question, 'C', "Georgia", false));
  }

  private void saveQuestion435() {
    Question question;

    question = questionRepository.save(new Question(5, "Which name does NOT typically appear on the label of a bottle of Tabasco sauce?", "2018-03-08 20:07:38"));

    answerRepository.save(new Answer(question, 'A', "Charpentier", true));
    answerRepository.save(new Answer(question, 'B', "McIlhenny", false));
    answerRepository.save(new Answer(question, 'C', "Avery", false));
  }

  private void saveQuestion436() {
    Question question;

    question = questionRepository.save(new Question(6, "By definition, a vexillologist is most likely to be interested in which of these things?", "2018-03-08 20:08:25"));

    answerRepository.save(new Answer(question, 'A', "The Odyssey", false));
    answerRepository.save(new Answer(question, 'B', "Union Ja… https://t.co/TJStCSKlyL", false));
  }

  private void saveQuestion437() {
    Question question;

    question = questionRepository.save(new Question(7, "The early computer program “OXO” played what game?", "2018-03-08 20:09:19"));

    answerRepository.save(new Answer(question, 'A', "Tic-tac-toe", true));
    answerRepository.save(new Answer(question, 'B', "Minesweeper", false));
    answerRepository.save(new Answer(question, 'C', "Checkers", false));
  }

  private void saveQuestion438() {
    Question question;

    question = questionRepository.save(new Question(8, "Which of these nations does NOT lie on the Gulf of Bothnia?", "2018-03-08 20:09:57"));

    answerRepository.save(new Answer(question, 'A', "Sweden", false));
    answerRepository.save(new Answer(question, 'B', "Finland", false));
    answerRepository.save(new Answer(question, 'C', "Estonia", true));
  }

  private void saveQuestion439() {
    Question question;

    question = questionRepository.save(new Question(9, "In the mid-’70s, who became Saturday Night Live’s first-ever musical guest?", "2018-03-08 20:10:37"));

    answerRepository.save(new Answer(question, 'A', "Paul Simon", false));
    answerRepository.save(new Answer(question, 'B', "Billy Preston", true));
    answerRepository.save(new Answer(question, 'C', "NItty Gritty Dirt Band", false));
  }

  private void saveQuestion440() {
    Question question;

    question = questionRepository.save(new Question(10, "Thomas Edison once set up a company to build affordable housing made out of what?", "2018-03-08 20:11:29"));

    answerRepository.save(new Answer(question, 'A', "Concrete", true));
    answerRepository.save(new Answer(question, 'B', "Rubber", false));
    answerRepository.save(new Answer(question, 'C', "Plastic foam", false));
  }

  private void saveQuestion441() {
    Question question;

    question = questionRepository.save(new Question(11, "The most common English word that ends in “-mt” is closely tied to which activity?", "2018-03-08 20:12:09"));

    answerRepository.save(new Answer(question, 'A', "Eating", false));
    answerRepository.save(new Answer(question, 'B', "Bathing", false));
    answerRepository.save(new Answer(question, 'C', "Sleeping", true));
  }

  private void saveQuestion442() {
    Question question;

    question = questionRepository.save(new Question(12, "When the world’s oldest subway system opened, which was one of the stations?", "2018-03-08 20:13:21"));

    answerRepository.save(new Answer(question, 'A', "Farringdon Street", true));
    answerRepository.save(new Answer(question, 'B', "Union Square", false));
    answerRepository.save(new Answer(question, 'C', "Porte de Vincennes", false));
  }

  private void saveQuestion443() {
    Question question;

    question = questionRepository.save(new Question(1, "In the old saying, when life gives you lemons you should do what?", "2018-03-09 02:05:10"));

    answerRepository.save(new Answer(question, 'A', "Return those lemons", false));
    answerRepository.save(new Answer(question, 'B', "Make lemonade", true));
    answerRepository.save(new Answer(question, 'C', "Build a lemon house", false));
  }

  private void saveQuestion444() {
    Question question;

    question = questionRepository.save(new Question(2, "What implement would you use to sweep dust from a floor?", "2018-03-09 02:05:41"));

    answerRepository.save(new Answer(question, 'A', "Broom", true));
    answerRepository.save(new Answer(question, 'B', "Saucepan", false));
    answerRepository.save(new Answer(question, 'C', "Pliers", false));
  }

  private void saveQuestion445() {
    Question question;

    question = questionRepository.save(new Question(3, "Which of these sports does NOT typically use any kind of net?", "2018-03-09 02:06:14"));

    answerRepository.save(new Answer(question, 'A', "Badminton", false));
    answerRepository.save(new Answer(question, 'B', "American handball", true));
    answerRepository.save(new Answer(question, 'C', "Ice hockey", false));
  }

  private void saveQuestion446() {
    Question question;

    question = questionRepository.save(new Question(4, "Which company makes the TI-83 calculator?", "2018-03-09 02:06:48"));

    answerRepository.save(new Answer(question, 'A', "Acer", false));
    answerRepository.save(new Answer(question, 'B', "Sharp", false));
    answerRepository.save(new Answer(question, 'C', "Texas Instruments", true));
  }

  private void saveQuestion447() {
    Question question;

    question = questionRepository.save(new Question(5, "According to the U.S. government, which of these is correct?", "2018-03-09 02:07:28"));

    answerRepository.save(new Answer(question, 'A', "Daylight Saving Time", true));
    answerRepository.save(new Answer(question, 'B', "Daylight Savings Time", false));
    answerRepository.save(new Answer(question, 'C', "Daylight Saving's Time", false));
  }

  private void saveQuestion448() {
    Question question;

    question = questionRepository.save(new Question(6, "Which of these is an official regulation for U.S. bourbon production?", "2018-03-09 02:08:25"));

    answerRepository.save(new Answer(question, 'A', "Less than 50% corn", false));
    answerRepository.save(new Answer(question, 'B', "Made in Kentucky", false));
    answerRepository.save(new Answer(question, 'C', "Aged in oak container", true));
  }

  private void saveQuestion449() {
    Question question;

    question = questionRepository.save(new Question(7, "Thanks to how the French language works, what is NATO called in France?", "2018-03-09 02:09:09"));

    answerRepository.save(new Answer(question, 'A', "NAOT", false));
    answerRepository.save(new Answer(question, 'B', "NOTA", false));
    answerRepository.save(new Answer(question, 'C', "OTAN", true));
  }

  private void saveQuestion450() {
    Question question;

    question = questionRepository.save(new Question(8, "What was the name of Calvin’s schoolteacher in the comic “Calvin and Hobbes”?", "2018-03-09 02:09:50"));

    answerRepository.save(new Answer(question, 'A', "Miss Wormwood", true));
    answerRepository.save(new Answer(question, 'B', "Ms. Braithwaite", false));
    answerRepository.save(new Answer(question, 'C', "Mrs. Crassbender", false));
  }

  private void saveQuestion451() {
    Question question;

    question = questionRepository.save(new Question(9, "Which of these words was used for a long time to refer to the letter “Z”?", "2018-03-09 02:10:25"));

    answerRepository.save(new Answer(question, 'A', "Izzard", true));
    answerRepository.save(new Answer(question, 'B', "Zephyr", false));
    answerRepository.save(new Answer(question, 'C', "Zelda", false));
  }

  private void saveQuestion452() {
    Question question;

    question = questionRepository.save(new Question(10, "The lead singer of Oingo Boingo provided music for which of these films?", "2018-03-09 02:11:25"));

    answerRepository.save(new Answer(question, 'A', "Life of Pi", false));
    answerRepository.save(new Answer(question, 'B', "Her", false));
    answerRepository.save(new Answer(question, 'C', "Fifty Shades of Grey", true));
  }

  private void saveQuestion453() {
    Question question;

    question = questionRepository.save(new Question(11, "Which of these people has NOT given a Harvard Commencement speech?", "2018-03-09 02:12:22"));

    answerRepository.save(new Answer(question, 'A', "Madeleine Albright", false));
    answerRepository.save(new Answer(question, 'B', "Oprah Winfrey", false));
    answerRepository.save(new Answer(question, 'C', "Sonia Sotomayor", true));
  }

  private void saveQuestion454() {
    Question question;

    question = questionRepository.save(new Question(12, "In Europe, the two largest Channel Islands lend their names to breeds of what animal?", "2018-03-09 02:14:39"));

    answerRepository.save(new Answer(question, 'A', "Sheep", false));
    answerRepository.save(new Answer(question, 'B', "Cows", true));
    answerRepository.save(new Answer(question, 'C', "Dogs", false));
  }

  private void saveQuestion455() {
    Question question;

    question = questionRepository.save(new Question(1, "Which of these is a popular movie theater snack?", "2018-03-09 20:05:46"));

    answerRepository.save(new Answer(question, 'A', "Popcorn", true));
    answerRepository.save(new Answer(question, 'B', "Clam chowder", false));
    answerRepository.save(new Answer(question, 'C', "Boiled hog knuckles", false));
  }

  private void saveQuestion456() {
    Question question;

    question = questionRepository.save(new Question(2, "Which of these is a major landmark in China?", "2018-03-09 20:06:27"));

    answerRepository.save(new Answer(question, 'A', "The Great Waffle", false));
    answerRepository.save(new Answer(question, 'B', "The Great Waterslide", false));
    answerRepository.save(new Answer(question, 'C', "The Great Wall", true));
  }

  private void saveQuestion457() {
    Question question;

    question = questionRepository.save(new Question(3, "Which of these singers is famous for playing the trumpet?", "2018-03-09 20:07:43"));

    answerRepository.save(new Answer(question, 'A', "Mary J. Blige", false));
    answerRepository.save(new Answer(question, 'B', "Frank Sinatra", false));
    answerRepository.save(new Answer(question, 'C', "Louis Armstrong", true));
  }

  private void saveQuestion458() {
    Question question;

    question = questionRepository.save(new Question(4, "Which dessert shares its name with a Korean food made with intestines?", "2018-03-09 20:08:20"));

    answerRepository.save(new Answer(question, 'A', "Rice pudding", false));
    answerRepository.save(new Answer(question, 'B', "Panna Cotta", false));
    answerRepository.save(new Answer(question, 'C', "Sundae", true));
  }

  private void saveQuestion459() {
    Question question;

    question = questionRepository.save(new Question(5, "Which of these Hugh Grant movies is rated R?", "2018-03-09 20:09:12"));

    answerRepository.save(new Answer(question, 'A', "Love Actually", true));
    answerRepository.save(new Answer(question, 'B', "About a Boy", false));
    answerRepository.save(new Answer(question, 'C', "Notting Hill", false));
  }

  private void saveQuestion460() {
    Question question;

    question = questionRepository.save(new Question(6, "Which of these influential authors wrote the fewest published books?", "2018-03-09 20:09:58"));

    answerRepository.save(new Answer(question, 'A', "Fran Lebowitz", false));
    answerRepository.save(new Answer(question, 'B', "John Kennedy Toole", true));
    answerRepository.save(new Answer(question, 'C', "J.D. Salinger", false));
  }

  private void saveQuestion461() {
    Question question;

    question = questionRepository.save(new Question(7, "The Notorious B.I.G. shares his real last name with the lead character in which film?", "2018-03-09 20:10:45"));

    answerRepository.save(new Answer(question, 'A', "Braveheart", true));
    answerRepository.save(new Answer(question, 'B', "Amadeus", false));
    answerRepository.save(new Answer(question, 'C', "Malcolm X", false));
  }

  private void saveQuestion462() {
    Question question;

    question = questionRepository.save(new Question(8, "What was the first Disney Channel series to run for 100 episodes?", "2018-03-09 20:11:32"));

    answerRepository.save(new Answer(question, 'A', "Even Stevens", false));
    answerRepository.save(new Answer(question, 'B', "Kim Possible", false));
    answerRepository.save(new Answer(question, 'C', "That's So Raven", true));
  }

  private void saveQuestion463() {
    Question question;

    question = questionRepository.save(new Question(9, "Which of these iconic U.S. buildings did NOT have the same architect as the other two?", "2018-03-09 20:12:20"));

    answerRepository.save(new Answer(question, 'A', "Transamerica Pyramid", true));
    answerRepository.save(new Answer(question, 'B', "", false));
  }

  private void saveQuestion464() {
    Question question;

    question = questionRepository.save(new Question(10, "A men's size 10 shoe in the U.S. is what size in Japan?", "2018-03-09 20:13:03"));

    answerRepository.save(new Answer(question, 'A', "Size 10", false));
    answerRepository.save(new Answer(question, 'B', "Size 7.5", false));
    answerRepository.save(new Answer(question, 'C', "Size 28", true));
  }

  private void saveQuestion465() {
    Question question;

    question = questionRepository.save(new Question(11, "Chat app Airtime was launched by the founder of what startup?", "2018-03-09 20:13:45"));

    answerRepository.save(new Answer(question, 'A', "Napster", true));
    answerRepository.save(new Answer(question, 'B', "Myspace", false));
    answerRepository.save(new Answer(question, 'C', "Blogger", false));
  }

  private void saveQuestion466() {
    Question question;

    question = questionRepository.save(new Question(12, "In 1943, Major League Baseball stopped using what material in game balls?", "2018-03-09 20:14:53"));

    answerRepository.save(new Answer(question, 'A', "Rubber", true));
    answerRepository.save(new Answer(question, 'B', "Yarn", false));
    answerRepository.save(new Answer(question, 'C', "Cork", false));
  }

  private void saveQuestion467() {
    Question question;

    question = questionRepository.save(new Question(1, "Pickles are typically made with what ingredient?", "2018-03-10 02:09:29"));

    answerRepository.save(new Answer(question, 'A', "Picks", false));
    answerRepository.save(new Answer(question, 'B', "Ells", false));
    answerRepository.save(new Answer(question, 'C', "Cucumbers", true));
  }

  private void saveQuestion468() {
    Question question;

    question = questionRepository.save(new Question(2, "Where was Abraham Lincoln’s most famous address delivered?", "2018-03-10 02:10:48"));

    answerRepository.save(new Answer(question, 'A', "Zendegi", false));
    answerRepository.save(new Answer(question, 'B', "Gettysburg", true));
    answerRepository.save(new Answer(question, 'C', "Tajikistan", false));
  }

  private void saveQuestion469() {
    Question question;

    question = questionRepository.save(new Question(3, "What does the “I” in “FBI” stand for?", "2018-03-10 02:12:10"));

    answerRepository.save(new Answer(question, 'A', "Information", false));
    answerRepository.save(new Answer(question, 'B', "Incorporated", false));
    answerRepository.save(new Answer(question, 'C', "Investigation", true));
  }

  private void saveQuestion470() {
    Question question;

    question = questionRepository.save(new Question(4, "In 1992, which band released a single named for an alkali metal?", "2018-03-10 02:12:54"));

    answerRepository.save(new Answer(question, 'A', "Green Day", false));
    answerRepository.save(new Answer(question, 'B', "Nirvana", true));
    answerRepository.save(new Answer(question, 'C', "Pearl Jam", false));
  }

  private void saveQuestion471() {
    Question question;

    question = questionRepository.save(new Question(5, "In the U.S. Daylight Saving Time system, which season falls under Standard Time?", "2018-03-10 02:13:32"));

    answerRepository.save(new Answer(question, 'A', "None", false));
    answerRepository.save(new Answer(question, 'B', "Summer", false));
    answerRepository.save(new Answer(question, 'C', "Winter", true));
  }

  private void saveQuestion472() {
    Question question;

    question = questionRepository.save(new Question(6, "Which of these degrees qualifies you for the NASA Astronaut Candidate program?", "2018-03-10 02:14:23"));

    answerRepository.save(new Answer(question, 'A', "Clinical Psychology", true));
    answerRepository.save(new Answer(question, 'B', "Aviation… https://t.co/666SJ9ijvb", false));
  }

  private void saveQuestion473() {
    Question question;

    question = questionRepository.save(new Question(7, "Which historically black college is named for a member of the Rockefeller family?", "2018-03-10 02:17:03"));

    answerRepository.save(new Answer(question, 'A', "Morehouse", false));
    answerRepository.save(new Answer(question, 'B', "Spelman", true));
    answerRepository.save(new Answer(question, 'C', "Howard", false));
  }

  private void saveQuestion474() {
    Question question;

    question = questionRepository.save(new Question(8, "What nation’s currency shares its name with an iconic Sylvester Stallone character?", "2018-03-10 02:17:47"));

    answerRepository.save(new Answer(question, 'A', "Panama", true));
    answerRepository.save(new Answer(question, 'B', "Romania", false));
    answerRepository.save(new Answer(question, 'C', "Turkmenistan", false));
  }

  private void saveQuestion475() {
    Question question;

    question = questionRepository.save(new Question(9, "In a pool hall, “firewood” is often used as slang for what?", "2018-03-10 02:19:02"));

    answerRepository.save(new Answer(question, 'A', "Cheap pool cue", true));
    answerRepository.save(new Answer(question, 'B', "Uneven pool table", false));
    answerRepository.save(new Answer(question, 'C', "Trick shot", false));
  }

  private void saveQuestion476() {
    Question question;

    question = questionRepository.save(new Question(1, "Korean pop music is often called what?", "2018-03-11 02:08:04"));

    answerRepository.save(new Answer(question, 'A', "Hot jazz", false));
    answerRepository.save(new Answer(question, 'B', "Fiddlestick funk", false));
    answerRepository.save(new Answer(question, 'C', "K-pop", true));
  }

  private void saveQuestion477() {
    Question question;

    question = questionRepository.save(new Question(2, "A classic 1936 book about the Civil War is called “Gone with the” what?", "2018-03-11 02:08:44"));

    answerRepository.save(new Answer(question, 'A', "WiFi", false));
    answerRepository.save(new Answer(question, 'B', "Waffle House", false));
    answerRepository.save(new Answer(question, 'C', "Wind", true));
  }

  private void saveQuestion478() {
    Question question;

    question = questionRepository.save(new Question(3, "Antoni Gaudí's famous Sagrada Família cathedral can be found in what country?", "2018-03-11 02:09:56"));

    answerRepository.save(new Answer(question, 'A', "France", false));
    answerRepository.save(new Answer(question, 'B', "Spain", true));
    answerRepository.save(new Answer(question, 'C', "Germany", false));
  }

  private void saveQuestion479() {
    Question question;

    question = questionRepository.save(new Question(4, "The classic version of the board game Operation asks players to remove a wrench from where?", "2018-03-11 02:10:33"));

    answerRepository.save(new Answer(question, 'A', "Stomach", false));
    answerRepository.save(new Answer(question, 'B', "Head", false));
    answerRepository.save(new Answer(question, 'C', "Ankle", true));
  }

  private void saveQuestion480() {
    Question question;

    question = questionRepository.save(new Question(5, "In U.S. credit, what did FICO originally stand for?", "2018-03-11 02:11:24"));

    answerRepository.save(new Answer(question, 'A', "Fair, Isaac, and Company", true));
    answerRepository.save(new Answer(question, 'B', "Fresh Investment Credit", false));
    answerRepository.save(new Answer(question, 'C', "Factual Income Operation", false));
  }

  private void saveQuestion481() {
    Question question;

    question = questionRepository.save(new Question(6, "Which of these Amazon services was launched most recently?", "2018-03-11 02:13:18"));

    answerRepository.save(new Answer(question, 'A', "Amazon Music", true));
    answerRepository.save(new Answer(question, 'B', "Amazon Mechanical Turk", false));
    answerRepository.save(new Answer(question, 'C', "Amazon Prime", false));
  }

  private void saveQuestion482() {
    Question question;

    question = questionRepository.save(new Question(7, "Which of these countries did NOT change its name in the 20th century?", "2018-03-11 02:13:43"));

    answerRepository.save(new Answer(question, 'A', "Iran", false));
    answerRepository.save(new Answer(question, 'B', "Cambodia", false));
    answerRepository.save(new Answer(question, 'C', "Ecuador", true));
  }

  private void saveQuestion483() {
    Question question;

    question = questionRepository.save(new Question(8, "Thanks to its looks, a common European frog shares a name with what herb?", "2018-03-11 02:14:17"));

    answerRepository.save(new Answer(question, 'A', "Chive", false));
    answerRepository.save(new Answer(question, 'B', "Parsley", true));
    answerRepository.save(new Answer(question, 'C', "Rosemary", false));
  }

  private void saveQuestion484() {
    Question question;

    question = questionRepository.save(new Question(9, "Which of these schools had a future U.S. president officially serve as its president?", "2018-03-11 02:15:03"));

    answerRepository.save(new Answer(question, 'A', "Princeton University", true));
    answerRepository.save(new Answer(question, 'B', "", false));
  }

  private void saveQuestion485() {
    Question question;

    question = questionRepository.save(new Question(10, "Which animal does NOT appear on the St. Louis Cardinals' 2011 World Series rings?", "2018-03-11 02:15:54"));

    answerRepository.save(new Answer(question, 'A', "Bird", false));
    answerRepository.save(new Answer(question, 'B', "Squirrel", false));
    answerRepository.save(new Answer(question, 'C', "Snake", true));
  }

  private void saveQuestion486() {
    Question question;

    question = questionRepository.save(new Question(1, "Which of these gadgets is designed to help you wake up?", "2018-03-12 01:06:45"));

    answerRepository.save(new Answer(question, 'A', "Nose trimmer", false));
    answerRepository.save(new Answer(question, 'B', "Shake Weight", false));
    answerRepository.save(new Answer(question, 'C', "Alarm clock", true));
  }

  private void saveQuestion487() {
    Question question;

    question = questionRepository.save(new Question(2, "In a 1952 musical, Gene Kelly was “Singin’ in the” what?", "2018-03-12 01:07:15"));

    answerRepository.save(new Answer(question, 'A', "Drive-thru", false));
    answerRepository.save(new Answer(question, 'B', "Rain", true));
    answerRepository.save(new Answer(question, 'C', "Rocky Mountains", false));
  }

  private void saveQuestion488() {
    Question question;

    question = questionRepository.save(new Question(3, "In which of these games do you yell the game's name when you win?", "2018-03-12 01:07:52"));

    answerRepository.save(new Answer(question, 'A', "Bingo", true));
    answerRepository.save(new Answer(question, 'B', "Checkers", false));
    answerRepository.save(new Answer(question, 'C', "Chess", false));
  }

  private void saveQuestion489() {
    Question question;

    question = questionRepository.save(new Question(4, "What is the name of the artistic logo renderings that appear on Google’s homepage?", "2018-03-12 01:08:33"));

    answerRepository.save(new Answer(question, 'A', "Google Dudez", false));
    answerRepository.save(new Answer(question, 'B', "Google Doodles", true));
    answerRepository.save(new Answer(question, 'C', "Google Doodads", false));
  }

  private void saveQuestion490() {
    Question question;

    question = questionRepository.save(new Question(5, "In which of these places do brides traditionally get temporary tattoos of grooms' initials?", "2018-03-12 01:09:14"));

    answerRepository.save(new Answer(question, 'A', "India", true));
    answerRepository.save(new Answer(question, 'B', "Mongolia", false));
    answerRepository.save(new Answer(question, 'C', "New Zealand", false));
  }

  private void saveQuestion491() {
    Question question;

    question = questionRepository.save(new Question(6, "In a standard deck of playing cards, which king is holding an axe and facing sideways?", "2018-03-12 01:09:58"));

    answerRepository.save(new Answer(question, 'A', "King of Diamonds", true));
    answerRepository.save(new Answer(question, 'B', "Kin… https://t.co/JOSww34JFu", false));
  }

  private void saveQuestion492() {
    Question question;

    question = questionRepository.save(new Question(7, "When used in cookbooks, maceration typically means doing what to food?", "2018-03-12 01:11:31"));

    answerRepository.save(new Answer(question, 'A', "Slicing it", false));
    answerRepository.save(new Answer(question, 'B', "Searing it", false));
    answerRepository.save(new Answer(question, 'C', "Softening it", true));
  }

  private void saveQuestion493() {
    Question question;

    question = questionRepository.save(new Question(8, "Which women’s college basketball team saw its record 111-game win streak snapped in 2017?", "2018-03-12 01:11:36"));

    answerRepository.save(new Answer(question, 'A', "Tennessee University", false));
    answerRepository.save(new Answer(question, 'B', "LSU", false));
    answerRepository.save(new Answer(question, 'C', "UConn", true));
  }

  private void saveQuestion494() {
    Question question;

    question = questionRepository.save(new Question(9, "In which of these movies does the bootstrap paradox play a key role?", "2018-03-12 01:12:23"));

    answerRepository.save(new Answer(question, 'A', "12 Monkeys", true));
    answerRepository.save(new Answer(question, 'B', "Alien", false));
    answerRepository.save(new Answer(question, 'C', "Gravity", false));
  }

  private void saveQuestion495() {
    Question question;

    question = questionRepository.save(new Question(10, "Which of these Robin Williams characters is a real person?", "2018-03-12 01:13:02"));

    answerRepository.save(new Answer(question, 'A', "Daniel Hillard", false));
    answerRepository.save(new Answer(question, 'B', "Patch Adams", true));
    answerRepository.save(new Answer(question, 'C', "T. S. Garp", false));
  }

  private void saveQuestion496() {
    Question question;

    question = questionRepository.save(new Question(11, "Which of these clothing companies went public first?", "2018-03-12 01:13:40"));

    answerRepository.save(new Answer(question, 'A', "Hermès", false));
    answerRepository.save(new Answer(question, 'B', "Hugo Boss", true));
    answerRepository.save(new Answer(question, 'C', "Ralph Lauren", false));
  }

  private void saveQuestion497() {
    Question question;

    question = questionRepository.save(new Question(12, "The host of the first season of “Top Chef” was once married to whom?", "2018-03-12 01:14:35"));

    answerRepository.save(new Answer(question, 'A', "Bobby Flay", false));
    answerRepository.save(new Answer(question, 'B', "Billy Joel", true));
    answerRepository.save(new Answer(question, 'C', "Salman Rushdie", false));
  }

  private void saveQuestion498() {
    Question question;

    question = questionRepository.save(new Question(13, "Which of these is a real Ivy League secret society?", "2018-03-12 01:15:26"));

    answerRepository.save(new Answer(question, 'A', "Pacifica House", true));
    answerRepository.save(new Answer(question, 'B', "Serpent Club", false));
    answerRepository.save(new Answer(question, 'C', "Cross and Bones", false));
  }

  private void saveQuestion499() {
    Question question;

    question = questionRepository.save(new Question(14, "Which of these condiments was created by a monarch's personal chef?", "2018-03-12 01:16:25"));

    answerRepository.save(new Answer(question, 'A', "Sriracha", false));
    answerRepository.save(new Answer(question, 'B', "Grey Poupon", false));
    answerRepository.save(new Answer(question, 'C', "A.1.", true));
  }

  private void saveQuestion500() {
    Question question;

    question = questionRepository.save(new Question(15, "The first player featured on the cover of “Madden NFL” primarily played what position?", "2018-03-12 01:17:33"));

    answerRepository.save(new Answer(question, 'A', "Wide receiver", false));
    answerRepository.save(new Answer(question, 'B', "Quarterback", false));
    answerRepository.save(new Answer(question, 'C', "Running back", true));
  }

  private void saveQuestion501() {
    Question question;

    question = questionRepository.save(new Question(16, "In the King James Bible, Job worries about the taste of what food?", "2018-03-12 01:18:26"));

    answerRepository.save(new Answer(question, 'A', "Manna", false));
    answerRepository.save(new Answer(question, 'B', "Fish", false));
    answerRepository.save(new Answer(question, 'C', "Egg whites", true));
  }

  private void saveQuestion502() {
    Question question;

    question = questionRepository.save(new Question(17, "In the Styx song “Mr. Roboto,” the narrator's brain is made by what tech company?", "2018-03-12 01:19:24"));

    answerRepository.save(new Answer(question, 'A', "Xerox", false));
    answerRepository.save(new Answer(question, 'B', "IBM", true));
    answerRepository.save(new Answer(question, 'C', "Yamaha", false));
  }

  private void saveQuestion503() {
    Question question;

    question = questionRepository.save(new Question(18, "Ross Perot once provided a $3 million credit line to help establish which chain?", "2018-03-12 01:21:04"));

    answerRepository.save(new Answer(question, 'A', "GameStop", true));
    answerRepository.save(new Answer(question, 'B', "Mills Fleet Farm", false));
    answerRepository.save(new Answer(question, 'C', "LongHorn Steakhouse", false));
  }

  private void saveQuestion504() {
    Question question;

    question = questionRepository.save(new Question(1, "Which piece of camping gear do people typically sleep in?", "2018-03-12 19:03:52"));

    answerRepository.save(new Answer(question, 'A', "Swiss Army knife", false));
    answerRepository.save(new Answer(question, 'B', "Propane stove", false));
    answerRepository.save(new Answer(question, 'C', "Sleeping bag", true));
  }

  private void saveQuestion505() {
    Question question;

    question = questionRepository.save(new Question(2, "Which of these is widely used as a cleaning product?", "2018-03-12 19:04:29"));

    answerRepository.save(new Answer(question, 'A', "Ranch dressing", false));
    answerRepository.save(new Answer(question, 'B', "Barbecue sauce", false));
    answerRepository.save(new Answer(question, 'C', "Vinegar", true));
  }

  private void saveQuestion506() {
    Question question;

    question = questionRepository.save(new Question(3, "What’s the correct spelling of the word for a high school’s chief administrator?", "2018-03-12 19:05:14"));

    answerRepository.save(new Answer(question, 'A', "Principal", true));
    answerRepository.save(new Answer(question, 'B', "Princepil", false));
    answerRepository.save(new Answer(question, 'C', "Principle", false));
  }

  private void saveQuestion507() {
    Question question;

    question = questionRepository.save(new Question(4, "According to the National Weather Service, what differentiates a blizzard from a snowstorm?", "2018-03-12 19:06:09"));

    answerRepository.save(new Answer(question, 'A', "Strength of wind", true));
    answerRepository.save(new Answer(question, 'B', "", false));
  }

  private void saveQuestion508() {
    Question question;

    question = questionRepository.save(new Question(5, "Thanks to its colorful buildings, which of these places is known as the “Pink City”?", "2018-03-12 19:06:50"));

    answerRepository.save(new Answer(question, 'A', "Rosario, Argentina", false));
    answerRepository.save(new Answer(question, 'B', "Budap… https://t.co/396fmRGWYl", false));
  }

  private void saveQuestion509() {
    Question question;

    question = questionRepository.save(new Question(6, "Where would a doctor typically place a sphygmomanometer?", "2018-03-12 19:07:38"));

    answerRepository.save(new Answer(question, 'A', "On your arm", true));
    answerRepository.save(new Answer(question, 'B', "Over your eye", false));
    answerRepository.save(new Answer(question, 'C', "On your tongue", false));
  }

  private void saveQuestion510() {
    Question question;

    question = questionRepository.save(new Question(7, "Which of these was the name of an American political splinter group?", "2018-03-12 19:08:16"));

    answerRepository.save(new Answer(question, 'A', "Mugwumps", true));
    answerRepository.save(new Answer(question, 'B', "Gubbins", false));
    answerRepository.save(new Answer(question, 'C', "Ratoons", false));
  }

  private void saveQuestion511() {
    Question question;

    question = questionRepository.save(new Question(8, "What does the PVC in PVC pipe stand for?", "2018-03-12 19:08:59"));

    answerRepository.save(new Answer(question, 'A', "Plexar Valve &amp; Conduit", false));
    answerRepository.save(new Answer(question, 'B', "Peter Vescey Corp.", false));
    answerRepository.save(new Answer(question, 'C', "Polyvinyl Chloride", true));
  }

  private void saveQuestion512() {
    Question question;

    question = questionRepository.save(new Question(9, "A successful jeans designer shares her name with which of these buildings?", "2018-03-12 19:09:41"));

    answerRepository.save(new Answer(question, 'A', "Hearst Tower", false));
    answerRepository.save(new Answer(question, 'B', "30 Rockefeller Plaza", false));
    answerRepository.save(new Answer(question, 'C', "One Vanderbilt", true));
  }

  private void saveQuestion513() {
    Question question;

    question = questionRepository.save(new Question(10, "How does the IRS tax the digital currency known as Bitcoin?", "2018-03-12 19:10:21"));

    answerRepository.save(new Answer(question, 'A', "Gambling income", false));
    answerRepository.save(new Answer(question, 'B', "Physical currency", false));
    answerRepository.save(new Answer(question, 'C', "Property", true));
  }

  private void saveQuestion514() {
    Question question;

    question = questionRepository.save(new Question(11, "Before creating his own successful fast food operation, Dave Thomas worked for what chain?", "2018-03-12 19:11:02"));

    answerRepository.save(new Answer(question, 'A', "McDonald's", false));
    answerRepository.save(new Answer(question, 'B', "Burger King", false));
    answerRepository.save(new Answer(question, 'C', "KFC", true));
  }

  private void saveQuestion515() {
    Question question;

    question = questionRepository.save(new Question(12, "Which pair of countries have capital cities that start with the same letter?", "2018-03-12 19:12:17"));

    answerRepository.save(new Answer(question, 'A', "Nigeria / Netherlands", true));
    answerRepository.save(new Answer(question, 'B', "Angola /… https://t.co/ajhaNxPKB3", false));
  }

  private void saveQuestion516() {
    Question question;

    question = questionRepository.save(new Question(1, "What genre of book typically contains a person's life story?", "2018-03-13 01:04:56"));

    answerRepository.save(new Answer(question, 'A', "Telephone book", false));
    answerRepository.save(new Answer(question, 'B', "Biography", true));
    answerRepository.save(new Answer(question, 'C', "IKEA assembly manual", false));
  }

  private void saveQuestion517() {
    Question question;

    question = questionRepository.save(new Question(2, "Actor John Wayne is most famous for playing what kind of character?", "2018-03-13 01:05:43"));

    answerRepository.save(new Answer(question, 'A', "Cowboy", true));
    answerRepository.save(new Answer(question, 'B', "Big city lawyer", false));
    answerRepository.save(new Answer(question, 'C', "Boss baby", false));
  }

  private void saveQuestion518() {
    Question question;

    question = questionRepository.save(new Question(3, "Edgar Allan Poe’s raven famously repeats what word?", "2018-03-13 01:06:28"));

    answerRepository.save(new Answer(question, 'A', "Nevermore", true));
    answerRepository.save(new Answer(question, 'B', "Nevermind", false));
    answerRepository.save(new Answer(question, 'C', "Nevertheless", false));
  }

  private void saveQuestion519() {
    Question question;

    question = questionRepository.save(new Question(4, "The Cascade Range runs through which of these states?", "2018-03-13 01:07:07"));

    answerRepository.save(new Answer(question, 'A', "Colorado", false));
    answerRepository.save(new Answer(question, 'B', "Oregon", true));
    answerRepository.save(new Answer(question, 'C', "Montana", false));
  }

  private void saveQuestion520() {
    Question question;

    question = questionRepository.save(new Question(5, "“Long pimples” is slang for equipment in which sport?", "2018-03-13 01:07:48"));

    answerRepository.save(new Answer(question, 'A', "Cricket", false));
    answerRepository.save(new Answer(question, 'B', "Golf", false));
    answerRepository.save(new Answer(question, 'C', "Table tennis", true));
  }

  private void saveQuestion521() {
    Question question;

    question = questionRepository.save(new Question(6, "On Disneyland’s first day in 1955, which attraction was NOT present?", "2018-03-13 01:08:44"));

    answerRepository.save(new Answer(question, 'A', "It's a Small World", true));
    answerRepository.save(new Answer(question, 'B', "Mad Tea Party", false));
    answerRepository.save(new Answer(question, 'C', "Mr. Toad's Wild Ride", false));
  }

  private void saveQuestion522() {
    Question question;

    question = questionRepository.save(new Question(7, "Loyola University’s “Madagascar Madness” is an annual race of what animal?", "2018-03-13 01:09:28"));

    answerRepository.save(new Answer(question, 'A', "Cockroach", true));
    answerRepository.save(new Answer(question, 'B', "Civet", false));
    answerRepository.save(new Answer(question, 'C', "Aardvark", false));
  }

  private void saveQuestion523() {
    Question question;

    question = questionRepository.save(new Question(8, "Which artist reportedly got his signature look after leaving his regular glasses on a plane?", "2018-03-13 01:10:20"));

    answerRepository.save(new Answer(question, 'A', "John Lennon", false));
    answerRepository.save(new Answer(question, 'B', "Buddy Holly", false));
    answerRepository.save(new Answer(question, 'C', "Roy Orbison", true));
  }

  private void saveQuestion524() {
    Question question;

    question = questionRepository.save(new Question(9, "Around since 1996, which of these is one of the first-generation Pokémon?", "2018-03-13 01:11:19"));

    answerRepository.save(new Answer(question, 'A', "Pupitar", false));
    answerRepository.save(new Answer(question, 'B', "Jumpluff", false));
    answerRepository.save(new Answer(question, 'C', "Seaking", true));
  }

  private void saveQuestion525() {
    Question question;

    question = questionRepository.save(new Question(10, "If a pair of brothers marries a pair of sisters, what would a genealogist call their kids?", "2018-03-13 01:12:05"));

    answerRepository.save(new Answer(question, 'A', "Double cousins", true));
    answerRepository.save(new Answer(question, 'B', "S… https://t.co/IvFHNy34ll", false));
  }

  private void saveQuestion526() {
    Question question;

    question = questionRepository.save(new Question(11, "Which movie starring the rapper DMX is adapted from a novel?", "2018-03-13 01:13:03"));

    answerRepository.save(new Answer(question, 'A', "Never Die Alone", true));
    answerRepository.save(new Answer(question, 'B', "Romeo Must Die", false));
    answerRepository.save(new Answer(question, 'C', "Belly", false));
  }

  private void saveQuestion527() {
    Question question;

    question = questionRepository.save(new Question(12, "Which of the following is NOT one of the eight primary ingredients in V8?", "2018-03-13 01:14:16"));

    answerRepository.save(new Answer(question, 'A', "Lettuce", false));
    answerRepository.save(new Answer(question, 'B', "Leeks", true));
    answerRepository.save(new Answer(question, 'C', "Watercress", false));
  }

  private void saveQuestion528() {
    Question question;

    question = questionRepository.save(new Question(1, "What is the line dividing Earth into northern and southern hemispheres called?", "2018-03-13 19:04:51"));

    answerRepository.save(new Answer(question, 'A', "Free throw line", false));
    answerRepository.save(new Answer(question, 'B', "Earth's waistline", false));
    answerRepository.save(new Answer(question, 'C', "Equator", true));
  }

  private void saveQuestion529() {
    Question question;

    question = questionRepository.save(new Question(2, "The Zambezi River can be found on which of these continents?", "2018-03-13 19:06:43"));

    answerRepository.save(new Answer(question, 'A', "South America", false));
    answerRepository.save(new Answer(question, 'B', "Asia", false));
    answerRepository.save(new Answer(question, 'C', "Africa", true));
  }

  private void saveQuestion530() {
    Question question;

    question = questionRepository.save(new Question(3, "Which of these refers to a blend of spices?", "2018-03-13 19:07:12"));

    answerRepository.save(new Answer(question, 'A', "Fenugreek", false));
    answerRepository.save(new Answer(question, 'B', "Vadouvan", true));
    answerRepository.save(new Answer(question, 'C', "Marjoram", false));
  }

  private void saveQuestion531() {
    Question question;

    question = questionRepository.save(new Question(4, "The giant panda’s scientific name is generally translated to “black and white” what?", "2018-03-13 19:08:03"));

    answerRepository.save(new Answer(question, 'A', "Bamboo eater", false));
    answerRepository.save(new Answer(question, 'B', "Cat-foot", true));
    answerRepository.save(new Answer(question, 'C', "Sleep roller", false));
  }

  private void saveQuestion532() {
    Question question;

    question = questionRepository.save(new Question(5, "Which of these body parts contains the islets of Langerhans?", "2018-03-13 19:10:17"));

    answerRepository.save(new Answer(question, 'A', "Brain", false));
    answerRepository.save(new Answer(question, 'B', "Gallbladder", false));
    answerRepository.save(new Answer(question, 'C', "Pancreas", true));
  }

  private void saveQuestion533() {
    Question question;

    question = questionRepository.save(new Question(6, "Which of these innovators has appeared on the Italian 1000-lire note?", "2018-03-13 19:10:56"));

    answerRepository.save(new Answer(question, 'A', "Maria Montessori", true));
    answerRepository.save(new Answer(question, 'B', "Giovanni Maria Farina", false));
    answerRepository.save(new Answer(question, 'C', "Candido Jacuzzi", false));
  }

  private void saveQuestion534() {
    Question question;

    question = questionRepository.save(new Question(7, "Whitney Houston’s debut album contains two duets with whom?", "2018-03-13 19:11:49"));

    answerRepository.save(new Answer(question, 'A', "Luther Vandross", false));
    answerRepository.save(new Answer(question, 'B', "Jermaine Jackson", true));
    answerRepository.save(new Answer(question, 'C', "Bobby Brown", false));
  }

  private void saveQuestion535() {
    Question question;

    question = questionRepository.save(new Question(8, "Posted by the co-founder, the first-ever photo on Instagram featured what filter?", "2018-03-13 19:13:09"));

    answerRepository.save(new Answer(question, 'A', "Nashville", false));
    answerRepository.save(new Answer(question, 'B', "X-Pro II", true));
    answerRepository.save(new Answer(question, 'C', "Hefe", false));
  }

  private void saveQuestion536() {
    Question question;

    question = questionRepository.save(new Question(1, "The place where your umbilical cord used to be is called what?", "2018-03-14 01:05:27"));

    answerRepository.save(new Answer(question, 'A', "Lil’ puddle", false));
    answerRepository.save(new Answer(question, 'B', "Wishing well", false));
    answerRepository.save(new Answer(question, 'C', "Belly button", true));
  }

  private void saveQuestion537() {
    Question question;

    question = questionRepository.save(new Question(2, "In chess, which piece is typically the least powerful?", "2018-03-14 01:06:05"));

    answerRepository.save(new Answer(question, 'A', "Queen B", false));
    answerRepository.save(new Answer(question, 'B', "Pawn", true));
    answerRepository.save(new Answer(question, 'C', "@KingJames", false));
  }

  private void saveQuestion538() {
    Question question;

    question = questionRepository.save(new Question(3, "What is an infant koala called?", "2018-03-14 01:06:32"));

    answerRepository.save(new Answer(question, 'A', "Joey", true));
    answerRepository.save(new Answer(question, 'B', "Chandler", false));
    answerRepository.save(new Answer(question, 'C', "Ross", false));
  }

  private void saveQuestion539() {
    Question question;

    question = questionRepository.save(new Question(4, "What dance traditionally incorporates a technique called palmas?", "2018-03-14 01:07:15"));

    answerRepository.save(new Answer(question, 'A', "Charleston", false));
    answerRepository.save(new Answer(question, 'B', "Cha-cha", false));
    answerRepository.save(new Answer(question, 'C', "Flamenco", true));
  }

  private void saveQuestion540() {
    Question question;

    question = questionRepository.save(new Question(5, "What did the “S” in Ulysses S. Grant’s name stand for?", "2018-03-14 01:08:23"));

    answerRepository.save(new Answer(question, 'A', "Samuel", false));
    answerRepository.save(new Answer(question, 'B', "Nothing", true));
    answerRepository.save(new Answer(question, 'C', "Stewart", false));
  }

  private void saveQuestion541() {
    Question question;

    question = questionRepository.save(new Question(6, "A nebulizer helps administer medical treatment in what form?", "2018-03-14 01:09:08"));

    answerRepository.save(new Answer(question, 'A', "Mist", true));
    answerRepository.save(new Answer(question, 'B', "Pills", false));
    answerRepository.save(new Answer(question, 'C', "Electrical current", false));
  }

  private void saveQuestion542() {
    Question question;

    question = questionRepository.save(new Question(7, "Which of these brand mascots is usually seen in footwear?", "2018-03-14 01:09:19"));

    answerRepository.save(new Answer(question, 'A', "Pillsbury Doughboy", false));
    answerRepository.save(new Answer(question, 'B', "Energizer Bunny", true));
    answerRepository.save(new Answer(question, 'C', "Tony the Tiger", false));
  }

  private void saveQuestion543() {
    Question question;

    question = questionRepository.save(new Question(8, "Which of these shows has NOT won a Golden Globe?", "2018-03-14 01:10:04"));

    answerRepository.save(new Answer(question, 'A', "Jane the Virgin", false));
    answerRepository.save(new Answer(question, 'B', "Shameless", true));
    answerRepository.save(new Answer(question, 'C', "Crazy Ex-Girlfriend", false));
  }

  private void saveQuestion544() {
    Question question;

    question = questionRepository.save(new Question(9, "Which of these skincare products is in the Smithsonian?", "2018-03-14 01:11:00"));

    answerRepository.save(new Answer(question, 'A', "Nivea Creme", false));
    answerRepository.save(new Answer(question, 'B', "Carmex lip balm", false));
    answerRepository.save(new Answer(question, 'C', "Stridex pads", true));
  }

  private void saveQuestion545() {
    Question question;

    question = questionRepository.save(new Question(10, "What company's bankruptcy led Congress to create the Pension Benefit Guaranty Corporation?", "2018-03-14 01:11:42"));

    answerRepository.save(new Answer(question, 'A', "Enron", false));
    answerRepository.save(new Answer(question, 'B', "Studebaker", true));
    answerRepository.save(new Answer(question, 'C', "Pan Am", false));
  }

  private void saveQuestion546() {
    Question question;

    question = questionRepository.save(new Question(11, "Which of these films was NOT made by Japan's legendary Studio Ghibli?", "2018-03-14 01:12:31"));

    answerRepository.save(new Answer(question, 'A', "Spirited Away", false));
    answerRepository.save(new Answer(question, 'B', "Kiki’s Delivery Service", false));
    answerRepository.save(new Answer(question, 'C', "", false));
  }

  private void saveQuestion547() {
    Question question;

    question = questionRepository.save(new Question(12, "Which writer is credited with first penning the phrase, “Elementary, my dear Watson”?", "2018-03-14 01:13:43"));

    answerRepository.save(new Answer(question, 'A', "P.G. Wodehouse", true));
    answerRepository.save(new Answer(question, 'B', "Mark Twain", false));
    answerRepository.save(new Answer(question, 'C', "Graham Greene", false));
  }

  private void saveQuestion548() {
    Question question;

    question = questionRepository.save(new Question(1, "Which is a typical room in a suburban family home?", "2018-03-14 19:06:02"));

    answerRepository.save(new Answer(question, 'A', "Bedroom", true));
    answerRepository.save(new Answer(question, 'B', "Foundry", false));
    answerRepository.save(new Answer(question, 'C', "Corral", false));
  }

  private void saveQuestion549() {
    Question question;

    question = questionRepository.save(new Question(2, "Which haircut are male recruits most likely to get after joining the Army?", "2018-03-14 19:06:38"));

    answerRepository.save(new Answer(question, 'A', "Beehive", false));
    answerRepository.save(new Answer(question, 'B', "Buzzcut", true));
    answerRepository.save(new Answer(question, 'C', "Bouffant", false));
  }

  private void saveQuestion550() {
    Question question;

    question = questionRepository.save(new Question(3, "To calculate the mathematical constant pi, divide the circumference of a circle by its what?", "2018-03-14 19:07:28"));

    answerRepository.save(new Answer(question, 'A', "Diameter", true));
    answerRepository.save(new Answer(question, 'B', "Crust", false));
    answerRepository.save(new Answer(question, 'C', "Area", false));
  }

  private void saveQuestion551() {
    Question question;

    question = questionRepository.save(new Question(4, "Which vessels draw blood away from the heart?", "2018-03-14 19:08:02"));

    answerRepository.save(new Answer(question, 'A', "Capillaries", false));
    answerRepository.save(new Answer(question, 'B', "Arteries", true));
    answerRepository.save(new Answer(question, 'C', "Veins", false));
  }

  private void saveQuestion552() {
    Question question;

    question = questionRepository.save(new Question(5, "Which of these is most likely to be worn in a traditional Bavarian outfit?", "2018-03-14 19:08:59"));

    answerRepository.save(new Answer(question, 'A', "Dirndl", true));
    answerRepository.save(new Answer(question, 'B', "Dashiki", false));
    answerRepository.save(new Answer(question, 'C', "Dhoti", false));
  }

  private void saveQuestion553() {
    Question question;

    question = questionRepository.save(new Question(6, "Which of these groups was initially created to stop currency counterfeiting?", "2018-03-14 19:09:41"));

    answerRepository.save(new Answer(question, 'A', "Dept. of Defense", false));
    answerRepository.save(new Answer(question, 'B', "Homeland Security", false));
    answerRepository.save(new Answer(question, 'C', "Secret Service", true));
  }

  private void saveQuestion554() {
    Question question;

    question = questionRepository.save(new Question(7, "In a 2000 film, Ed Harris played a painter most closely associated with what art movement?", "2018-03-14 19:10:27"));

    answerRepository.save(new Answer(question, 'A', "Cubism", false));
    answerRepository.save(new Answer(question, 'B', "Impressioni… https://t.co/Nxl5GurN9M", false));
  }

  private void saveQuestion555() {
    Question question;

    question = questionRepository.save(new Question(8, "“The cake is a lie” is a catchphrase originating in what hit video game?", "2018-03-14 19:11:07"));

    answerRepository.save(new Answer(question, 'A', "Portal", true));
    answerRepository.save(new Answer(question, 'B', "BioShock", false));
    answerRepository.save(new Answer(question, 'C', "Minecraft", false));
  }

  private void saveQuestion556() {
    Question question;

    question = questionRepository.save(new Question(9, "Which is generally NOT a business expense you can claim on U.S. federal taxes?", "2018-03-14 19:11:48"));

    answerRepository.save(new Answer(question, 'A', "Commuting to work", true));
    answerRepository.save(new Answer(question, 'B', "Advertising", false));
    answerRepository.save(new Answer(question, 'C', "Ballpoint pens", false));
  }

  private void saveQuestion557() {
    Question question;

    question = questionRepository.save(new Question(10, "What African country has a capital named for a U.S. president?", "2018-03-14 19:12:28"));

    answerRepository.save(new Answer(question, 'A', "Liberia", true));
    answerRepository.save(new Answer(question, 'B', "Ghana", false));
    answerRepository.save(new Answer(question, 'C', "Togo", false));
  }

  private void saveQuestion558() {
    Question question;

    question = questionRepository.save(new Question(11, "Which of these sports has the most players per team?", "2018-03-14 19:13:08"));

    answerRepository.save(new Answer(question, 'A', "Women's lacrosse", false));
    answerRepository.save(new Answer(question, 'B', "Australian football", true));
    answerRepository.save(new Answer(question, 'C', "Rugby union", false));
  }

  private void saveQuestion559() {
    Question question;

    question = questionRepository.save(new Question(12, "What phrase does NOT appear in the lyrics of the rock classic “American Pie?”", "2018-03-14 19:14:22"));

    answerRepository.save(new Answer(question, 'A', "Dirges in the dark", false));
    answerRepository.save(new Answer(question, 'B', "Barefoot servants", true));
    answerRepository.save(new Answer(question, 'C', "Fists of rage", false));
  }

  private void saveQuestion560() {
    Question question;

    question = questionRepository.save(new Question(1, "Which of these do you usually need a ticket to enter?", "2018-03-15 01:04:49"));

    answerRepository.save(new Answer(question, 'A', "Pennsylvania", false));
    answerRepository.save(new Answer(question, 'B', "Public library", false));
    answerRepository.save(new Answer(question, 'C', "Movie theater", true));
  }

  private void saveQuestion561() {
    Question question;

    question = questionRepository.save(new Question(2, "In the U.S., what do students typically complete right before going to college?", "2018-03-15 01:05:27"));

    answerRepository.save(new Answer(question, 'A', "High school", true));
    answerRepository.save(new Answer(question, 'B', "Graduate school", false));
    answerRepository.save(new Answer(question, 'C', "Grade school", false));
  }

  private void saveQuestion562() {
    Question question;

    question = questionRepository.save(new Question(3, "Which of these pies is typically made with a graham cracker crust?", "2018-03-15 01:06:12"));

    answerRepository.save(new Answer(question, 'A', "Shepherd's Pie", false));
    answerRepository.save(new Answer(question, 'B', "Félix Pie", false));
    answerRepository.save(new Answer(question, 'C', "Key Lime Pie", true));
  }

  private void saveQuestion563() {
    Question question;

    question = questionRepository.save(new Question(4, "Which term is commonly used to refer to completely non-functional computer hardware?", "2018-03-15 01:06:51"));

    answerRepository.save(new Answer(question, 'A', "Shoe", false));
    answerRepository.save(new Answer(question, 'B', "Turnip", false));
    answerRepository.save(new Answer(question, 'C', "Brick", true));
  }

  private void saveQuestion564() {
    Question question;

    question = questionRepository.save(new Question(5, "Which species is NOT one of humanity’s two closest living relatives?", "2018-03-15 01:07:32"));

    answerRepository.save(new Answer(question, 'A', "Orangutans", true));
    answerRepository.save(new Answer(question, 'B', "Chimpanzees", false));
    answerRepository.save(new Answer(question, 'C', "Bonobos", false));
  }

  private void saveQuestion565() {
    Question question;

    question = questionRepository.save(new Question(6, "Which of these is the name of a Beatle AND a New Testament Gospel?", "2018-03-15 01:08:46"));

    answerRepository.save(new Answer(question, 'A', "Paul", false));
    answerRepository.save(new Answer(question, 'B', "John", true));
    answerRepository.save(new Answer(question, 'C', "Luke", false));
  }

  private void saveQuestion566() {
    Question question;

    question = questionRepository.save(new Question(7, "Which of these grocery store chains is owned by a German family?", "2018-03-15 01:09:31"));

    answerRepository.save(new Answer(question, 'A', "Wegmans", false));
    answerRepository.save(new Answer(question, 'B', "Trader Joe's", true));
    answerRepository.save(new Answer(question, 'C', "Kroger", false));
  }

  private void saveQuestion567() {
    Question question;

    question = questionRepository.save(new Question(8, "Which of these self-proclaimed seers also wrote a well-known cookbook?", "2018-03-15 01:10:11"));

    answerRepository.save(new Answer(question, 'A', "Long Island Medium", false));
    answerRepository.save(new Answer(question, 'B', "Nostradamus", true));
    answerRepository.save(new Answer(question, 'C', "The Amazing Kreskin", false));
  }

  private void saveQuestion568() {
    Question question;

    question = questionRepository.save(new Question(9, "A Londoner born within earshot of the St. Mary-le-Bow bells is said to be what?", "2018-03-15 01:10:57"));

    answerRepository.save(new Answer(question, 'A', "Lion-hearted", false));
    answerRepository.save(new Answer(question, 'B', "Blessed", false));
    answerRepository.save(new Answer(question, 'C', "Cockney", true));
  }

  private void saveQuestion569() {
    Question question;

    question = questionRepository.save(new Question(10, "Which of these must you enter to sail from the Black Sea to the Mediterranean?", "2018-03-15 01:11:45"));

    answerRepository.save(new Answer(question, 'A', "Tyrrhenian Sea", false));
    answerRepository.save(new Answer(question, 'B', "Ionian Sea", false));
    answerRepository.save(new Answer(question, 'C', "Aegean Sea", true));
  }

  private void saveQuestion570() {
    Question question;

    question = questionRepository.save(new Question(11, "What is the best-selling single-platform video game of all time?", "2018-03-15 01:12:35"));

    answerRepository.save(new Answer(question, 'A', "Pokémon Red and Blue", false));
    answerRepository.save(new Answer(question, 'B', "GoldenEye 007", false));
    answerRepository.save(new Answer(question, 'C', "Wii Sports", true));
  }

  private void saveQuestion571() {
    Question question;

    question = questionRepository.save(new Question(12, "Which of these characters has appeared in the most episodes of television?", "2018-03-15 01:13:59"));

    answerRepository.save(new Answer(question, 'A', "Olivia Benson", true));
    answerRepository.save(new Answer(question, 'B', "J.R. Ewing", false));
    answerRepository.save(new Answer(question, 'C', "Frasier Crane", false));
  }

  private void saveQuestion572() {
    Question question;

    question = questionRepository.save(new Question(1, "Which of these is a planet in our solar system?", "2018-03-15 19:04:20"));

    answerRepository.save(new Answer(question, 'A', "Krypton", false));
    answerRepository.save(new Answer(question, 'B', "Tilted Towers", false));
    answerRepository.save(new Answer(question, 'C', "Mars", true));
  }

  private void saveQuestion573() {
    Question question;

    question = questionRepository.save(new Question(2, "A common metaphor for an unpleasant subject is having what animal “in the room”?", "2018-03-15 19:04:56"));

    answerRepository.save(new Answer(question, 'A', "Scorpion", false));
    answerRepository.save(new Answer(question, 'B', "Rattlesnake", false));
    answerRepository.save(new Answer(question, 'C', "Elephant", true));
  }

  private void saveQuestion574() {
    Question question;

    question = questionRepository.save(new Question(3, "Which letter of the alphabet often acts as either a consonant or a vowel?", "2018-03-15 19:05:35"));

    answerRepository.save(new Answer(question, 'A', "X", false));
    answerRepository.save(new Answer(question, 'B', "Y", true));
    answerRepository.save(new Answer(question, 'C', "Z", false));
  }

  private void saveQuestion575() {
    Question question;

    question = questionRepository.save(new Question(4, "Among U.S. state capitals, what is unique about Vermont’s?", "2018-03-15 19:06:28"));

    answerRepository.save(new Answer(question, 'A', "Only French name", false));
    answerRepository.save(new Answer(question, 'B', "Farthest north", false));
    answerRepository.save(new Answer(question, 'C', "Least populated", true));
  }

  private void saveQuestion576() {
    Question question;

    question = questionRepository.save(new Question(5, "Which of theses video games is an example of an augmented-reality game?", "2018-03-15 19:08:22"));

    answerRepository.save(new Answer(question, 'A', "Pokémon Dash", false));
    answerRepository.save(new Answer(question, 'B', "Super Mario Run", false));
    answerRepository.save(new Answer(question, 'C', "Ingress", true));
  }

  private void saveQuestion577() {
    Question question;

    question = questionRepository.save(new Question(6, "“Posse cut” is common terminology in what profession?", "2018-03-15 19:09:15"));

    answerRepository.save(new Answer(question, 'A', "Beautician", false));
    answerRepository.save(new Answer(question, 'B', "Animation director", false));
    answerRepository.save(new Answer(question, 'C', "Record producer", true));
  }

  private void saveQuestion578() {
    Question question;

    question = questionRepository.save(new Question(7, "Which of these places is geographically classified as an enclave?", "2018-03-15 19:10:03"));

    answerRepository.save(new Answer(question, 'A', "Luxembourg", false));
    answerRepository.save(new Answer(question, 'B', "San Marino", true));
    answerRepository.save(new Answer(question, 'C', "Liechtenstein", false));
  }

  private void saveQuestion579() {
    Question question;

    question = questionRepository.save(new Question(8, "Which of these people is NOT credited as one of the discoverers of calculus?", "2018-03-15 19:10:50"));

    answerRepository.save(new Answer(question, 'A', "Isaac Newton", false));
    answerRepository.save(new Answer(question, 'B', "Gottfried Leibniz", false));
    answerRepository.save(new Answer(question, 'C', "Carl Friedrich Gauss", true));
  }

  private void saveQuestion580() {
    Question question;

    question = questionRepository.save(new Question(9, "What nation’s unit of currency shares its spelling with a past-tense English verb?", "2018-03-15 19:11:34"));

    answerRepository.save(new Answer(question, 'A', "North Korea", true));
    answerRepository.save(new Answer(question, 'B', "Qatar", false));
    answerRepository.save(new Answer(question, 'C', "Afghanistan", false));
  }

  private void saveQuestion581() {
    Question question;

    question = questionRepository.save(new Question(10, "What legendary singer has a son who has directed a Will Ferrell movie?", "2018-03-15 19:12:52"));

    answerRepository.save(new Answer(question, 'A', "James Taylor", false));
    answerRepository.save(new Answer(question, 'B', "Bob Dylan", true));
    answerRepository.save(new Answer(question, 'C', "David Bowie", false));
  }

  private void saveQuestion582() {
    Question question;

    question = questionRepository.save(new Question(1, "What is a photo you take of yourself commonly known as?", "2018-03-16 01:04:52"));

    answerRepository.save(new Answer(question, 'A', "Selfie", true));
    answerRepository.save(new Answer(question, 'B', "Renaissance masterpiece", false));
    answerRepository.save(new Answer(question, 'C', "Narcissisto", false));
  }

  private void saveQuestion583() {
    Question question;

    question = questionRepository.save(new Question(2, "As the old saying goes, when all you've got is a hammer, everything looks like a what?", "2018-03-16 01:05:24"));

    answerRepository.save(new Answer(question, 'A', "Birthday cake", false));
    answerRepository.save(new Answer(question, 'B', "Thor", false));
    answerRepository.save(new Answer(question, 'C', "Nail", true));
  }

  private void saveQuestion584() {
    Question question;

    question = questionRepository.save(new Question(3, "Which of these is NOT a nickname for the NCAA Division I basketball tournament?", "2018-03-16 01:06:09"));

    answerRepository.save(new Answer(question, 'A', "March Madness", false));
    answerRepository.save(new Answer(question, 'B', "Big Dance", false));
    answerRepository.save(new Answer(question, 'C', "Summer Slam", true));
  }

  private void saveQuestion585() {
    Question question;

    question = questionRepository.save(new Question(4, "Tricking someone in order to achieve a goal is an act of what?", "2018-03-16 01:06:44"));

    answerRepository.save(new Answer(question, 'A', "Centrifuge", false));
    answerRepository.save(new Answer(question, 'B', "Calcifuge", false));
    answerRepository.save(new Answer(question, 'C', "Subterfuge", true));
  }

  private void saveQuestion586() {
    Question question;

    question = questionRepository.save(new Question(5, "What are the two cities in Charles Dickens’ “A Tale of Two Cities”?", "2018-03-16 01:07:17"));

    answerRepository.save(new Answer(question, 'A', "Manchester / Liverpool", false));
    answerRepository.save(new Answer(question, 'B', "Rome / Madrid", false));
    answerRepository.save(new Answer(question, 'C', "London / Paris", true));
  }

  private void saveQuestion587() {
    Question question;

    question = questionRepository.save(new Question(6, "Which of these birds can fly?", "2018-03-16 01:08:07"));

    answerRepository.save(new Answer(question, 'A', "Whooper swan", true));
    answerRepository.save(new Answer(question, 'B', "Cassowary", false));
    answerRepository.save(new Answer(question, 'C', "Emu", false));
  }

  private void saveQuestion588() {
    Question question;

    question = questionRepository.save(new Question(7, "According to legend, what documents were once nailed to the door of the Wittenberg Church?", "2018-03-16 01:08:48"));

    answerRepository.save(new Answer(question, 'A', "Joan of Arc's diary", false));
    answerRepository.save(new Answer(question, 'B', "", false));
  }

  private void saveQuestion589() {
    Question question;

    question = questionRepository.save(new Question(8, "Which of these is NOT a common English meaning of the Spanish word “mañana”?", "2018-03-16 01:09:32"));

    answerRepository.save(new Answer(question, 'A', "Morning", false));
    answerRepository.save(new Answer(question, 'B', "Tomorrow", false));
    answerRepository.save(new Answer(question, 'C', "Last night", true));
  }

  private void saveQuestion590() {
    Question question;

    question = questionRepository.save(new Question(9, "According to Emily Post, what is the ONLY fork placed on the right side of the plate?", "2018-03-16 01:10:07"));

    answerRepository.save(new Answer(question, 'A', "Oyster fork", true));
    answerRepository.save(new Answer(question, 'B', "Salad fork", false));
    answerRepository.save(new Answer(question, 'C', "Dessert fork", false));
  }

  private void saveQuestion591() {
    Question question;

    question = questionRepository.save(new Question(10, "The word “wisdom” is often used as a term to refer to a group of what animal?", "2018-03-16 01:10:51"));

    answerRepository.save(new Answer(question, 'A', "Walrus", false));
    answerRepository.save(new Answer(question, 'B', "Wolverine", false));
    answerRepository.save(new Answer(question, 'C', "Wombat", true));
  }

  private void saveQuestion592() {
    Question question;

    question = questionRepository.save(new Question(11, "Which of these island groups is noteworthy for belonging to two different countries?", "2018-03-16 01:11:48"));

    answerRepository.save(new Answer(question, 'A', "St. Pierre and Miquelon", false));
    answerRepository.save(new Answer(question, 'B', "", false));
  }

  private void saveQuestion593() {
    Question question;

    question = questionRepository.save(new Question(12, "Which of these was a real video game title featured in arcades in the 1980s?", "2018-03-16 01:13:01"));

    answerRepository.save(new Answer(question, 'A', "Pac-Man 3", false));
    answerRepository.save(new Answer(question, 'B', "Dig Dug 3", false));
    answerRepository.save(new Answer(question, 'C', "Donkey Kong 3", true));
  }

  private void saveQuestion594() {
    Question question;

    question = questionRepository.save(new Question(1, "According to legend, what did St. Patrick drive out of Ireland?", "2018-03-16 19:04:23"));

    answerRepository.save(new Answer(question, 'A', "All of the snakes", true));
    answerRepository.save(new Answer(question, 'B', "Tesla roadster", false));
    answerRepository.save(new Answer(question, 'C', "Miss Daisy", false));
  }

  private void saveQuestion595() {
    Question question;

    question = questionRepository.save(new Question(2, "A lifeguard is most likely to keep watch over what?", "2018-03-16 19:04:55"));

    answerRepository.save(new Answer(question, 'A', "Swimming pool", true));
    answerRepository.save(new Answer(question, 'B', "Movie drive-in", false));
    answerRepository.save(new Answer(question, 'C', "Chess match", false));
  }

  private void saveQuestion596() {
    Question question;

    question = questionRepository.save(new Question(3, "Which physical activity is performed in a space known as a “box”?", "2018-03-16 19:05:34"));

    answerRepository.save(new Answer(question, 'A', "Tubing", false));
    answerRepository.save(new Answer(question, 'B', "Crossfit", true));
    answerRepository.save(new Answer(question, 'C', "Hiking", false));
  }

  private void saveQuestion597() {
    Question question;

    question = questionRepository.save(new Question(4, "Which of these is a real-life world-champion female fighter in the UFC?", "2018-03-16 19:06:32"));

    answerRepository.save(new Answer(question, 'A', "Cris Cyborg", true));
    answerRepository.save(new Answer(question, 'B', "Ronda Robot", false));
    answerRepository.save(new Answer(question, 'C', "Allie Android", false));
  }

  private void saveQuestion598() {
    Question question;

    question = questionRepository.save(new Question(5, "Which swimsuit style was named after a coral reef?", "2018-03-16 19:07:14"));

    answerRepository.save(new Answer(question, 'A', "Bandeau", false));
    answerRepository.save(new Answer(question, 'B', "Sarong", false));
    answerRepository.save(new Answer(question, 'C', "Bikini", true));
  }

  private void saveQuestion599() {
    Question question;

    question = questionRepository.save(new Question(6, "Which of these universities has produced the most Heisman Trophy winners?", "2018-03-16 19:08:03"));

    answerRepository.save(new Answer(question, 'A', "Notre Dame", true));
    answerRepository.save(new Answer(question, 'B', "Florida State", false));
    answerRepository.save(new Answer(question, 'C', "Auburn", false));
  }

  private void saveQuestion600() {
    Question question;

    question = questionRepository.save(new Question(7, "Which Spanish word is NOT a rhyme in the hit 2017 song “Despacito”?", "2018-03-16 19:08:42"));

    answerRepository.save(new Answer(question, 'A', "Amorito", true));
    answerRepository.save(new Answer(question, 'B', "Manuscrito", false));
    answerRepository.save(new Answer(question, 'C', "Laberinto", false));
  }

  private void saveQuestion601() {
    Question question;

    question = questionRepository.save(new Question(8, "Oslo, Norway is home to a museum featuring thousands of what mini items?", "2018-03-16 19:09:30"));

    answerRepository.save(new Answer(question, 'A', "PEZ dispensers", false));
    answerRepository.save(new Answer(question, 'B', "Bottles", true));
    answerRepository.save(new Answer(question, 'C', "Troll dolls", false));
  }

  private void saveQuestion602() {
    Question question;

    question = questionRepository.save(new Question(9, "The famed opera “Fidelio” has the same composer as what work?", "2018-03-16 19:10:17"));

    answerRepository.save(new Answer(question, 'A', "Für Elise", true));
    answerRepository.save(new Answer(question, 'B', "The Magic Flute", false));
    answerRepository.save(new Answer(question, 'C', "La Traviata", false));
  }

  private void saveQuestion603() {
    Question question;

    question = questionRepository.save(new Question(10, "The CEO of Domino’s came to the company after working with what kind of food?", "2018-03-16 19:10:53"));

    answerRepository.save(new Answer(question, 'A', "Italian food", false));
    answerRepository.save(new Answer(question, 'B', "Mexican food", false));
    answerRepository.save(new Answer(question, 'C', "Baby food", true));
  }

  private void saveQuestion604() {
    Question question;

    question = questionRepository.save(new Question(11, "Which of these is NOT the name of a trick in competitive yo-yoing?", "2018-03-16 19:11:40"));

    answerRepository.save(new Answer(question, 'A', "Slack trapeze", false));
    answerRepository.save(new Answer(question, 'B', "Sword and shield", false));
    answerRepository.save(new Answer(question, 'C', "Spiral drop", true));
  }

  private void saveQuestion605() {
    Question question;

    question = questionRepository.save(new Question(12, "Which memorable word from “The Simpsons” also appears in Shakespeare’s “Richard II”?", "2018-03-16 19:12:51"));

    answerRepository.save(new Answer(question, 'A', "Cromulent", false));
    answerRepository.save(new Answer(question, 'B', "Embiggens", false));
    answerRepository.save(new Answer(question, 'C', "Unpossible", true));
  }

  private void saveQuestion606() {
    Question question;

    question = questionRepository.save(new Question(1, "The liquid often used to disinfect hands is known as what?", "2018-03-17 01:07:15"));

    answerRepository.save(new Answer(question, 'A', "Red #3 food dye", false));
    answerRepository.save(new Answer(question, 'B', "Soy sauce", false));
    answerRepository.save(new Answer(question, 'C', "Sanitizer", true));
  }

  private void saveQuestion607() {
    Question question;

    question = questionRepository.save(new Question(2, "Which of these is most likely to emit lava?", "2018-03-17 01:07:53"));

    answerRepository.save(new Answer(question, 'A', "Garden hose", false));
    answerRepository.save(new Answer(question, 'B', "Person's nose", false));
    answerRepository.save(new Answer(question, 'C', "Volcanoes", true));
  }

  private void saveQuestion608() {
    Question question;

    question = questionRepository.save(new Question(3, "In the U.S., which of these beverages typically contains espresso?", "2018-03-17 01:08:59"));

    answerRepository.save(new Answer(question, 'A', "Matcha latte", false));
    answerRepository.save(new Answer(question, 'B', "Café au lait", false));
    answerRepository.save(new Answer(question, 'C', "Americano", true));
  }

  private void saveQuestion609() {
    Question question;

    question = questionRepository.save(new Question(4, "Queen Elizabeth II has famously kept what kind of dog as a pet for decades?", "2018-03-17 01:09:34"));

    answerRepository.save(new Answer(question, 'A', "Chihuahua", false));
    answerRepository.save(new Answer(question, 'B', "Pomeranian", false));
    answerRepository.save(new Answer(question, 'C', "Corgi", true));
  }

  private void saveQuestion610() {
    Question question;

    question = questionRepository.save(new Question(5, "Big Major Cay, located on the eastern side of the Bahamas, is famous for what?", "2018-03-17 01:10:20"));

    answerRepository.save(new Answer(question, 'A', "Migrating butterflies", false));
    answerRepository.save(new Answer(question, 'B', "Feral pi… https://t.co/vAMWj6OqqX", false));
  }

  private void saveQuestion611() {
    Question question;

    question = questionRepository.save(new Question(6, "According to his own writings, how did St. Patrick first arrive in Ireland?", "2018-03-17 01:10:58"));

    answerRepository.save(new Answer(question, 'A', "Brought by pirates", true));
    answerRepository.save(new Answer(question, 'B', "Servant to a… https://t.co/c2GHNhBx54", false));
  }

  private void saveQuestion612() {
    Question question;

    question = questionRepository.save(new Question(7, "What was the inspiration behind the iconic Cartier “Love Bracelet”?", "2018-03-17 01:11:41"));

    answerRepository.save(new Answer(question, 'A', "Eiffel Tower", false));
    answerRepository.save(new Answer(question, 'B', "Audrey Hepburn's profile", false));
    answerRepository.save(new Answer(question, 'C', "Chastity belts", true));
  }

  private void saveQuestion613() {
    Question question;

    question = questionRepository.save(new Question(8, "Which of these emperors' names translates in English to a small kind of footwear?", "2018-03-17 01:12:17"));

    answerRepository.save(new Answer(question, 'A', "Augustus", false));
    answerRepository.save(new Answer(question, 'B', "Nero", false));
    answerRepository.save(new Answer(question, 'C', "Caligula", true));
  }

  private void saveQuestion614() {
    Question question;

    question = questionRepository.save(new Question(9, "Which pop star appeared in the original film version of “Hairspray”?", "2018-03-17 01:12:59"));

    answerRepository.save(new Answer(question, 'A', "Colleen Fitzpatrick", true));
    answerRepository.save(new Answer(question, 'B', "Blu Cantrell", false));
    answerRepository.save(new Answer(question, 'C', "Willa Ford", false));
  }

  private void saveQuestion615() {
    Question question;

    question = questionRepository.save(new Question(10, "Which of these states does NOT currently have an In-N-Out?", "2018-03-17 01:13:45"));

    answerRepository.save(new Answer(question, 'A', "New Mexico", true));
    answerRepository.save(new Answer(question, 'B', "Utah", false));
    answerRepository.save(new Answer(question, 'C', "Arizona", false));
  }

  private void saveQuestion616() {
    Question question;

    question = questionRepository.save(new Question(11, "The co-creators of Kazaa also helped develop which product?", "2018-03-17 01:14:34"));

    answerRepository.save(new Answer(question, 'A', "Skype", true));
    answerRepository.save(new Answer(question, 'B', "Winamp", false));
    answerRepository.save(new Answer(question, 'C', "LimeWire", false));
  }

  private void saveQuestion617() {
    Question question;

    question = questionRepository.save(new Question(12, "Which of these screenwriters once co-wrote the script for a flop SNL film?", "2018-03-17 01:15:55"));

    answerRepository.save(new Answer(question, 'A', "Aaron Sorkin", false));
    answerRepository.save(new Answer(question, 'B', "Quentin Tarantino", true));
    answerRepository.save(new Answer(question, 'C', "Carrie Fisher", false));
  }

  private void saveQuestion618() {
    Question question;

    question = questionRepository.save(new Question(1, "In the kids’ song, “if you’re happy and you know it,” you do what?", "2018-03-18 01:04:54"));

    answerRepository.save(new Answer(question, 'A', "Shuck some clams", false));
    answerRepository.save(new Answer(question, 'B', "Clap your hands", true));
    answerRepository.save(new Answer(question, 'C', "Steam a ham", false));
  }

  private void saveQuestion619() {
    Question question;

    question = questionRepository.save(new Question(2, "What TV show title would you say after clinking glasses for a toast?", "2018-03-18 01:05:29"));

    answerRepository.save(new Answer(question, 'A', "Young Sheldon", false));
    answerRepository.save(new Answer(question, 'B', "Cheers", true));
    answerRepository.save(new Answer(question, 'C', "Kevin Can Wait", false));
  }

  private void saveQuestion620() {
    Question question;

    question = questionRepository.save(new Question(3, "When it comes to college sports, what does the first “A” stand for in NCAA?", "2018-03-18 01:06:27"));

    answerRepository.save(new Answer(question, 'A', "Amateur", false));
    answerRepository.save(new Answer(question, 'B', "Athletic", true));
    answerRepository.save(new Answer(question, 'C', "Academic", false));
  }

  private void saveQuestion621() {
    Question question;

    question = questionRepository.save(new Question(4, "Which of these pleasantly-scented plants is part of the mint family?", "2018-03-18 01:06:59"));

    answerRepository.save(new Answer(question, 'A', "Hyacinth", false));
    answerRepository.save(new Answer(question, 'B', "Hydrangea", false));
    answerRepository.save(new Answer(question, 'C', "Lavender", true));
  }

  private void saveQuestion622() {
    Question question;

    question = questionRepository.save(new Question(5, "Which of these is the name of a real, finch-like songbird?", "2018-03-18 01:07:48"));

    answerRepository.save(new Answer(question, 'A', "Whodah", false));
    answerRepository.save(new Answer(question, 'B', "Whydah", true));
    answerRepository.save(new Answer(question, 'C', "Howdah", false));
  }

  private void saveQuestion623() {
    Question question;

    question = questionRepository.save(new Question(6, "Norman Rockwell’s iconic Four Freedoms series contains a famous scene set where?", "2018-03-18 01:08:34"));

    answerRepository.save(new Answer(question, 'A', "Baseball game", false));
    answerRepository.save(new Answer(question, 'B', "Thanksgiving table", true));
    answerRepository.save(new Answer(question, 'C', "Diner counter", false));
  }

  private void saveQuestion624() {
    Question question;

    question = questionRepository.save(new Question(7, "Which of these is suggested in the Lamaze method of giving birth?", "2018-03-18 01:09:16"));

    answerRepository.save(new Answer(question, 'A', "Moving during labor", true));
    answerRepository.save(new Answer(question, 'B', "Inducing at a set tim… https://t.co/eJ3WrMzM92", false));
  }

  private void saveQuestion625() {
    Question question;

    question = questionRepository.save(new Question(8, "Which of these symbols appears on the dice in Milton Bradley's Jumanji board game?", "2018-03-18 01:10:05"));

    answerRepository.save(new Answer(question, 'A', "Rhinoceros", false));
    answerRepository.save(new Answer(question, 'B', "Racquet", true));
    answerRepository.save(new Answer(question, 'C', "Safari hat", false));
  }

  private void saveQuestion626() {
    Question question;

    question = questionRepository.save(new Question(9, "The Kuiper Belt is home to which of these bodies?", "2018-03-18 01:11:01"));

    answerRepository.save(new Answer(question, 'A', "Jupiter", false));
    answerRepository.save(new Answer(question, 'B', "Pluto", true));
    answerRepository.save(new Answer(question, 'C', "Mars", false));
  }

  private void saveQuestion627() {
    Question question;

    question = questionRepository.save(new Question(10, "In the 1960s, Radio Shack was purchased by a company specializing in what?", "2018-03-18 01:11:46"));

    answerRepository.save(new Answer(question, 'A', "High-end audio", false));
    answerRepository.save(new Answer(question, 'B', "Plastics", false));
    answerRepository.save(new Answer(question, 'C', "Leather", true));
  }

  private void saveQuestion628() {
    Question question;

    question = questionRepository.save(new Question(11, "The protagonist of what classic novel is named after a real-life fireman?", "2018-03-18 01:12:34"));

    answerRepository.save(new Answer(question, 'A', "Adventures of Tom Sawyer", true));
    answerRepository.save(new Answer(question, 'B', "Slaughte… https://t.co/fWE0dyoE8s", false));
  }

  private void saveQuestion629() {
    Question question;

    question = questionRepository.save(new Question(12, "What was Galileo sentenced to do as punishment for writing about heliocentrism?", "2018-03-18 01:13:50"));

    answerRepository.save(new Answer(question, 'A', "Pay indulgences", false));
    answerRepository.save(new Answer(question, 'B', "Destroy his library", false));
    answerRepository.save(new Answer(question, 'C', "Recite psalms", true));
  }

  private void saveQuestion630() {
    Question question;

    question = questionRepository.save(new Question(1, "Which of these is a German clock with a bird inside?", "2018-03-19 01:08:01"));

    answerRepository.save(new Answer(question, 'A', "Honey Boo Boo clock", false));
    answerRepository.save(new Answer(question, 'B', "Cuckoo clock", true));
    answerRepository.save(new Answer(question, 'C', "Biological clock", false));
  }

  private void saveQuestion631() {
    Question question;

    question = questionRepository.save(new Question(2, "Which of these is an optional section on the SAT standardized test?", "2018-03-19 01:08:55"));

    answerRepository.save(new Answer(question, 'A', "Hot yoga", false));
    answerRepository.save(new Answer(question, 'B', "Laser tag", false));
    answerRepository.save(new Answer(question, 'C', "Essay", true));
  }

  private void saveQuestion632() {
    Question question;

    question = questionRepository.save(new Question(3, "Which article of clothing is also the name of a stinging insect?", "2018-03-19 01:10:37"));

    answerRepository.save(new Answer(question, 'A', "Pink jeggings", false));
    answerRepository.save(new Answer(question, 'B', "Red sweatpants", false));
    answerRepository.save(new Answer(question, 'C', "Yellow jacket", true));
  }

  private void saveQuestion633() {
    Question question;

    question = questionRepository.save(new Question(4, "Which of these is NOT an ingredient in a traditional Chicago-style hot dog?", "2018-03-19 01:11:00"));

    answerRepository.save(new Answer(question, 'A', "Heated ketchup", true));
    answerRepository.save(new Answer(question, 'B', "Yellow mustard", false));
    answerRepository.save(new Answer(question, 'C', "Sweet relish", false));
  }

  private void saveQuestion634() {
    Question question;

    question = questionRepository.save(new Question(5, "What term is often used to describe overly ornate, flowery writing?", "2018-03-19 01:11:35"));

    answerRepository.save(new Answer(question, 'A', "Blue prose", false));
    answerRepository.save(new Answer(question, 'B', "Purple prose", true));
    answerRepository.save(new Answer(question, 'C', "Violet prose", false));
  }

  private void saveQuestion635() {
    Question question;

    question = questionRepository.save(new Question(6, "In the tech world, the acronym “IoT” typically stands for what?", "2018-03-19 01:12:25"));

    answerRepository.save(new Answer(question, 'A', "Internet-Only Telephone", false));
    answerRepository.save(new Answer(question, 'B', "In/Out Transfer", false));
    answerRepository.save(new Answer(question, 'C', "Internet of Things", true));
  }

  private void saveQuestion636() {
    Question question;

    question = questionRepository.save(new Question(7, "What traditional stew inspired the 1930s invention of the slow cooker?", "2018-03-19 01:13:15"));

    answerRepository.save(new Answer(question, 'A', "Gumbo", false));
    answerRepository.save(new Answer(question, 'B', "Goulash", false));
    answerRepository.save(new Answer(question, 'C', "Cholent", true));
  }

  private void saveQuestion637() {
    Question question;

    question = questionRepository.save(new Question(8, "What is the only U.S. state home to two Ivy League schools?", "2018-03-19 01:14:12"));

    answerRepository.save(new Answer(question, 'A', "New York", true));
    answerRepository.save(new Answer(question, 'B', "Massachusetts", false));
    answerRepository.save(new Answer(question, 'C', "Pennsylvania", false));
  }

  private void saveQuestion638() {
    Question question;

    question = questionRepository.save(new Question(9, "The defunct channel Court TV briefly owned what popular website?", "2018-03-19 01:15:11"));

    answerRepository.save(new Answer(question, 'A', "The Smoking Gun", true));
    answerRepository.save(new Answer(question, 'B', "https://t.co/2LZEqJvVj0", false));
    answerRepository.save(new Answer(question, 'C', "SCOTUSblog", false));
  }

  private void saveQuestion639() {
    Question question;

    question = questionRepository.save(new Question(10, "The Marvin Gaye hit “What’s Going On” featured backup vocals by members of what team?", "2018-03-19 01:15:59"));

    answerRepository.save(new Answer(question, 'A', "Kansas City Chiefs", false));
    answerRepository.save(new Answer(question, 'B', "Detr… https://t.co/vpkJgJXJnF", false));
  }

  private void saveQuestion640() {
    Question question;

    question = questionRepository.save(new Question(11, "In the U.S., light intensity is often measured with a unit named what?", "2018-03-19 01:16:39"));

    answerRepository.save(new Answer(question, 'A', "Hand-lamp", false));
    answerRepository.save(new Answer(question, 'B', "Foot-candle", true));
    answerRepository.save(new Answer(question, 'C', "Head-torch", false));
  }

  private void saveQuestion641() {
    Question question;

    question = questionRepository.save(new Question(12, "Which of these monuments lends its name to a common domestic chicken breed?", "2018-03-19 01:17:18"));

    answerRepository.save(new Answer(question, 'A', "The Alamo", false));
    answerRepository.save(new Answer(question, 'B', "Plymouth Rock", true));
    answerRepository.save(new Answer(question, 'C', "Lincoln Memorial", false));
  }

  private void saveQuestion642() {
    Question question;

    question = questionRepository.save(new Question(13, "Which of these was NOT a phone made by BlackBerry?", "2018-03-19 01:18:28"));

    answerRepository.save(new Answer(question, 'A', "Electron", false));
    answerRepository.save(new Answer(question, 'B', "Atom", true));
    answerRepository.save(new Answer(question, 'C', "Quark", false));
  }

  private void saveQuestion643() {
    Question question;

    question = questionRepository.save(new Question(14, "The first flag of which state contained the Latin for “don’t touch me”?", "2018-03-19 01:20:07"));

    answerRepository.save(new Answer(question, 'A', "Delaware", false));
    answerRepository.save(new Answer(question, 'B', "South Carolina", false));
    answerRepository.save(new Answer(question, 'C', "Alabama", true));
  }

  private void saveQuestion644() {
    Question question;

    question = questionRepository.save(new Question(15, "Which company is listed on both the Dow Jones Industrial Average and the NASDAQ-100?", "2018-03-19 01:21:18"));

    answerRepository.save(new Answer(question, 'A', "IBM", false));
    answerRepository.save(new Answer(question, 'B', "T-Mobile", false));
    answerRepository.save(new Answer(question, 'C', "Intel", true));
  }

  private void saveQuestion645() {
    Question question;

    question = questionRepository.save(new Question(16, "Which of these is NOT the name of a geographical feature on the Moon?", "2018-03-19 01:21:36"));

    answerRepository.save(new Answer(question, 'A', "Foaming Sea", false));
    answerRepository.save(new Answer(question, 'B', "Sunset Sea", true));
    answerRepository.save(new Answer(question, 'C', "Sea of Waves", false));
  }

  private void saveQuestion646() {
    Question question;

    question = questionRepository.save(new Question(17, "What was the prime reason for the 14th-century leadership crisis in the Catholic church?", "2018-03-19 01:22:32"));

    answerRepository.save(new Answer(question, 'A', "Rival popes", true));
    answerRepository.save(new Answer(question, 'B', "Empero… https://t.co/Qv98kCj4qS", false));
  }

  private void saveQuestion647() {
    Question question;

    question = questionRepository.save(new Question(18, "Which fashion designer did NOT graduate from the prestigious Central Saint Martins?", "2018-03-19 01:23:16"));

    answerRepository.save(new Answer(question, 'A', "Riccardo Tisci", false));
    answerRepository.save(new Answer(question, 'B', "Zac Posen", false));
    answerRepository.save(new Answer(question, 'C', "Olivier Rousteing", true));
  }

  private void saveQuestion648() {
    Question question;

    question = questionRepository.save(new Question(19, "Which skin mark is most likely to come and go with the seasons?", "2018-03-19 01:24:07"));

    answerRepository.save(new Answer(question, 'A', "Rhytides", false));
    answerRepository.save(new Answer(question, 'B', "Ephelides", true));
    answerRepository.save(new Answer(question, 'C', "Lentigines", false));
  }

  private void saveQuestion649() {
    Question question;

    question = questionRepository.save(new Question(20, "Which of these is traditionally a layer in a Nanaimo bar?", "2018-03-19 01:24:51"));

    answerRepository.save(new Answer(question, 'A', "Ice cream", false));
    answerRepository.save(new Answer(question, 'B', "Whipped cream", false));
    answerRepository.save(new Answer(question, 'C', "Butter icing", true));
  }

  private void saveQuestion650() {
    Question question;

    question = questionRepository.save(new Question(21, "Which of these films does NOT share a name with a NASA space probe?", "2018-03-19 01:25:35"));

    answerRepository.save(new Answer(question, 'A', "Juno", false));
    answerRepository.save(new Answer(question, 'B', "Stardust", false));
    answerRepository.save(new Answer(question, 'C', "Prometheus", true));
  }

  private void saveQuestion651() {
    Question question;

    question = questionRepository.save(new Question(22, "Which of these authors has a supermodel granddaughter?", "2018-03-19 01:26:19"));

    answerRepository.save(new Answer(question, 'A', "Antoine de Saint-Exupéry", false));
    answerRepository.save(new Answer(question, 'B', "Maurice Sendak", false));
    answerRepository.save(new Answer(question, 'C', "Roald Dahl", true));
  }

  private void saveQuestion652() {
    Question question;

    question = questionRepository.save(new Question(23, "Which of these animals is NOT known for being able to reproduce without a male partner?", "2018-03-19 01:26:56"));

    answerRepository.save(new Answer(question, 'A', "Komodo dragon", false));
    answerRepository.save(new Answer(question, 'B', "Hammerh… https://t.co/5hXpGPCnq7", false));
  }

  private void saveQuestion653() {
    Question question;

    question = questionRepository.save(new Question(24, "Which character appears in the Shakespeare play whose title comes first alphabetically?", "2018-03-19 01:29:36"));

    answerRepository.save(new Answer(question, 'A', "Octavius Caesar", false));
    answerRepository.save(new Answer(question, 'B', "Bertram", true));
    answerRepository.save(new Answer(question, 'C', "Adriana", false));
  }

  private void saveQuestion654() {
    Question question;

    question = questionRepository.save(new Question(1, "What meal combines elements of breakfast and lunch?", "2018-03-19 19:04:20"));

    answerRepository.save(new Answer(question, 'A', "Linner", false));
    answerRepository.save(new Answer(question, 'B', "Supsert", false));
    answerRepository.save(new Answer(question, 'C', "Brunch", true));
  }

  private void saveQuestion655() {
    Question question;

    question = questionRepository.save(new Question(2, "What is the name of the roller coaster feature that takes riders around in a complete circle?", "2018-03-19 19:05:08"));

    answerRepository.save(new Answer(question, 'A', "Lose-the-hat", false));
    answerRepository.save(new Answer(question, 'B', "Lo… https://t.co/sQiXEePGgS", false));
  }

  private void saveQuestion656() {
    Question question;

    question = questionRepository.save(new Question(3, "What is a common symptom of a deviated septum?", "2018-03-19 19:05:48"));

    answerRepository.save(new Answer(question, 'A', "Snoring", true));
    answerRepository.save(new Answer(question, 'B', "Hearing loss", false));
    answerRepository.save(new Answer(question, 'C', "Rapid heartbeat", false));
  }

  private void saveQuestion657() {
    Question question;

    question = questionRepository.save(new Question(4, "Who is the youngest current Supreme Court Justice?", "2018-03-19 19:06:28"));

    answerRepository.save(new Answer(question, 'A', "Elena Kagan", false));
    answerRepository.save(new Answer(question, 'B', "Sonia Sotomayor", false));
    answerRepository.save(new Answer(question, 'C', "Neil Gorsuch", true));
  }

  private void saveQuestion658() {
    Question question;

    question = questionRepository.save(new Question(5, "The military unit responsible for the Pope’s safety is composed of citizens of what country?", "2018-03-19 19:07:11"));

    answerRepository.save(new Answer(question, 'A', "Switzerland", true));
    answerRepository.save(new Answer(question, 'B', "Italy", false));
    answerRepository.save(new Answer(question, 'C', "Vatican City", false));
  }

  private void saveQuestion659() {
    Question question;

    question = questionRepository.save(new Question(6, "“Zen and the Art of Motorcycle Maintenance” gets its name from an earlier book about what?", "2018-03-19 19:07:56"));

    answerRepository.save(new Answer(question, 'A', "Archery", true));
    answerRepository.save(new Answer(question, 'B', "Bicycling", false));
    answerRepository.save(new Answer(question, 'C', "Gardening", false));
  }

  private void saveQuestion660() {
    Question question;

    question = questionRepository.save(new Question(7, "An annual holiday at Emory University features students being let out of class by what?", "2018-03-19 19:08:53"));

    answerRepository.save(new Answer(question, 'A', "Skeleton", true));
    answerRepository.save(new Answer(question, 'B', "Peach mascot", false));
    answerRepository.save(new Answer(question, 'C', "Male cheerleaders", false));
  }

  private void saveQuestion661() {
    Question question;

    question = questionRepository.save(new Question(8, "Which of these cities was founded two separate times?", "2018-03-19 19:09:36"));

    answerRepository.save(new Answer(question, 'A', "Rome", false));
    answerRepository.save(new Answer(question, 'B', "Zurich", false));
    answerRepository.save(new Answer(question, 'C', "Buenos Aires", true));
  }

  private void saveQuestion662() {
    Question question;

    question = questionRepository.save(new Question(9, "Which concept is at the core of a dance style named for Martha Graham?", "2018-03-19 19:10:23"));

    answerRepository.save(new Answer(question, 'A', "Contraction &amp; release", true));
    answerRepository.save(new Answer(question, 'B', "Lock &amp; leap", false));
    answerRepository.save(new Answer(question, 'C', "Pointe &amp; step", false));
  }

  private void saveQuestion663() {
    Question question;

    question = questionRepository.save(new Question(10, "Which of these is NOT a breed of duck?", "2018-03-19 19:11:08"));

    answerRepository.save(new Answer(question, 'A', "Green Marsh", true));
    answerRepository.save(new Answer(question, 'B', "Silver Bantam", false));
    answerRepository.save(new Answer(question, 'C', "Welsh Harlequin", false));
  }

  private void saveQuestion664() {
    Question question;

    question = questionRepository.save(new Question(11, "Which of these is the name of one of the moons of the largest planet in our solar system?", "2018-03-19 19:11:46"));

    answerRepository.save(new Answer(question, 'A', "Kale", true));
    answerRepository.save(new Answer(question, 'B', "Coriander", false));
    answerRepository.save(new Answer(question, 'C', "Vega", false));
  }

  private void saveQuestion665() {
    Question question;

    question = questionRepository.save(new Question(12, "What startup's name came from the co-founder watching a Fellini movie?", "2018-03-19 19:13:20"));

    answerRepository.save(new Answer(question, 'A', "Vimeo", false));
    answerRepository.save(new Answer(question, 'B', "Twilio", false));
    answerRepository.save(new Answer(question, 'C', "Etsy", true));
  }

  private void saveQuestion666() {
    Question question;

    question = questionRepository.save(new Question(1, "The Girl Scouts hold an annual fundraiser by selling what?", "2018-03-20 01:06:12"));

    answerRepository.save(new Answer(question, 'A', "Bootleg DVDs", false));
    answerRepository.save(new Answer(question, 'B', "Stock tips", false));
    answerRepository.save(new Answer(question, 'C', "Cookies", true));
  }

  private void saveQuestion667() {
    Question question;

    question = questionRepository.save(new Question(2, "Which of these is a popular breakfast item served with maple syrup?", "2018-03-20 01:07:02"));

    answerRepository.save(new Answer(question, 'A', "English eggie weggies", false));
    answerRepository.save(new Answer(question, 'B', "Swedish House Mafia", false));
    answerRepository.save(new Answer(question, 'C', "French toast", true));
  }

  private void saveQuestion668() {
    Question question;

    question = questionRepository.save(new Question(3, "Ben &amp; Jerry’s Cherry Garcia flavor is a pun on the lead singer of what band?", "2018-03-20 01:07:40"));

    answerRepository.save(new Answer(question, 'A', "Grateful Dead", true));
    answerRepository.save(new Answer(question, 'B', "Phish", false));
    answerRepository.save(new Answer(question, 'C', "Rolling Stones", false));
  }

  private void saveQuestion669() {
    Question question;

    question = questionRepository.save(new Question(4, "Which of these basketball terms is also a measurement of computer performance?", "2018-03-20 01:08:37"));

    answerRepository.save(new Answer(question, 'A', "Flops", true));
    answerRepository.save(new Answer(question, 'B', "Dunks", false));
    answerRepository.save(new Answer(question, 'C', "Dimes", false));
  }

  private void saveQuestion670() {
    Question question;

    question = questionRepository.save(new Question(5, "What phrase completes the old English rhyme that begins, “Something old, something new”?", "2018-03-20 01:09:23"));

    answerRepository.save(new Answer(question, 'A', "May your love be true", false));
    answerRepository.save(new Answer(question, 'B', "", false));
  }

  private void saveQuestion671() {
    Question question;

    question = questionRepository.save(new Question(6, "Which of these dogs falls into the American Kennel Club’s “Working Group”?", "2018-03-20 01:10:22"));

    answerRepository.save(new Answer(question, 'A', "Golden retriever", false));
    answerRepository.save(new Answer(question, 'B', "Collie", false));
    answerRepository.save(new Answer(question, 'C', "Boxer", true));
  }

  private void saveQuestion672() {
    Question question;

    question = questionRepository.save(new Question(7, "Which of these long-ago empires originated in North Africa?", "2018-03-20 01:11:11"));

    answerRepository.save(new Answer(question, 'A', "Carthaginian", true));
    answerRepository.save(new Answer(question, 'B', "Ottoman", false));
    answerRepository.save(new Answer(question, 'C', "Byzantine", false));
  }

  private void saveQuestion673() {
    Question question;

    question = questionRepository.save(new Question(8, "Jane Morgan was a nom de plume for the author of which of these works?", "2018-03-20 01:12:01"));

    answerRepository.save(new Answer(question, 'A', "Wuthering Heights", false));
    answerRepository.save(new Answer(question, 'B', "Last of the Mohicans", true));
    answerRepository.save(new Answer(question, 'C', "Jane Eyre", false));
  }

  private void saveQuestion674() {
    Question question;

    question = questionRepository.save(new Question(9, "Once a body of water, which of these regions is now dried out?", "2018-03-20 01:12:40"));

    answerRepository.save(new Answer(question, 'A', "Aral Sea", true));
    answerRepository.save(new Answer(question, 'B', "Caspian Sea", false));
    answerRepository.save(new Answer(question, 'C', "Lake Balkhash", false));
  }

  private void saveQuestion675() {
    Question question;

    question = questionRepository.save(new Question(10, "In the Bible, which son of Jacob has the same mother as Joseph?", "2018-03-20 01:13:17"));

    answerRepository.save(new Answer(question, 'A', "Benjamin", true));
    answerRepository.save(new Answer(question, 'B', "Levi", false));
    answerRepository.save(new Answer(question, 'C', "Simeon", false));
  }

  private void saveQuestion676() {
    Question question;

    question = questionRepository.save(new Question(11, "Which of these is NOT the nickname of a World Darts Champion?", "2018-03-20 01:14:02"));

    answerRepository.save(new Answer(question, 'A', "Limestone Cowboy", false));
    answerRepository.save(new Answer(question, 'B', "Deadly Boomerang", false));
    answerRepository.save(new Answer(question, 'C', "Pinpoint King", true));
  }

  private void saveQuestion677() {
    Question question;

    question = questionRepository.save(new Question(12, "Which of these words is believed to come from a European dice game?", "2018-03-20 01:15:28"));

    answerRepository.save(new Answer(question, 'A', "Shenanigans", false));
    answerRepository.save(new Answer(question, 'B', "Tomfoolery", false));
    answerRepository.save(new Answer(question, 'C', "Hijinks", true));
  }

  private void saveQuestion678() {
    Question question;

    question = questionRepository.save(new Question(1, "In the U.S., a massive amount of gold is kept where?", "2018-03-20 19:04:22"));

    answerRepository.save(new Answer(question, 'A', "Frozen food aisle", false));
    answerRepository.save(new Answer(question, 'B', "Fort Knox", true));
    answerRepository.save(new Answer(question, 'C', "Louisiana swamplands", false));
  }

  private void saveQuestion679() {
    Question question;

    question = questionRepository.save(new Question(2, "By definition, what type of singing is usually done without any instrumental accompaniment?", "2018-03-20 19:05:01"));

    answerRepository.save(new Answer(question, 'A', "Piano recital", false));
    answerRepository.save(new Answer(question, 'B', "A c… https://t.co/RcwO5gsFXw", false));
  }

  private void saveQuestion680() {
    Question question;

    question = questionRepository.save(new Question(3, "Which of these is the name of an actual room in the White House?", "2018-03-20 19:05:36"));

    answerRepository.save(new Answer(question, 'A', "China Room", true));
    answerRepository.save(new Answer(question, 'B', "Balloon Room", false));
    answerRepository.save(new Answer(question, 'C', "Yoga Room", false));
  }

  private void saveQuestion681() {
    Question question;

    question = questionRepository.save(new Question(4, "What is the name for a word that came directly into English from another language?", "2018-03-20 19:06:13"));

    answerRepository.save(new Answer(question, 'A', "Theftword", false));
    answerRepository.save(new Answer(question, 'B', "Giftword", false));
    answerRepository.save(new Answer(question, 'C', "Loanword", true));
  }

  private void saveQuestion682() {
    Question question;

    question = questionRepository.save(new Question(5, "What is the official language of the tiny nation between France and Spain?", "2018-03-20 19:07:13"));

    answerRepository.save(new Answer(question, 'A', "Catalan", true));
    answerRepository.save(new Answer(question, 'B', "French", false));
    answerRepository.save(new Answer(question, 'C', "Spanish", false));
  }

  private void saveQuestion683() {
    Question question;

    question = questionRepository.save(new Question(6, "Technically, all licensed U.S. dentists are also officially what?", "2018-03-20 19:07:50"));

    answerRepository.save(new Answer(question, 'A', "Orthodontists", false));
    answerRepository.save(new Answer(question, 'B', "Dental surgeons", true));
    answerRepository.save(new Answer(question, 'C', "Private practitioners", false));
  }

  private void saveQuestion684() {
    Question question;

    question = questionRepository.save(new Question(7, "Which of these people is most likely to have a mutation in their melanocortin-1 receptor?", "2018-03-20 19:08:39"));

    answerRepository.save(new Answer(question, 'A', "Julianne Moore", true));
    answerRepository.save(new Answer(question, 'B', "Jon Hamm", false));
    answerRepository.save(new Answer(question, 'C', "Lucy Liu", false));
  }

  private void saveQuestion685() {
    Question question;

    question = questionRepository.save(new Question(8, "Which of these teams won a Stanley Cup before the NHL was founded?", "2018-03-20 19:09:15"));

    answerRepository.save(new Answer(question, 'A', "Montreal Canadiens", true));
    answerRepository.save(new Answer(question, 'B', "Boston Bruins", false));
    answerRepository.save(new Answer(question, 'C', "Toronto Maple Leafs", false));
  }

  private void saveQuestion686() {
    Question question;

    question = questionRepository.save(new Question(9, "Which of these television shows was NOT based on a British series?", "2018-03-20 19:09:59"));

    answerRepository.save(new Answer(question, 'A', "Say Yes to the Dress", true));
    answerRepository.save(new Answer(question, 'B', "Wife Swap", false));
    answerRepository.save(new Answer(question, 'C', "Trading Spaces", false));
  }

  private void saveQuestion687() {
    Question question;

    question = questionRepository.save(new Question(10, "The terms of Amazon's web services contain a clause regarding potential attacks by what?", "2018-03-20 19:10:43"));

    answerRepository.save(new Answer(question, 'A', "Zombies", true));
    answerRepository.save(new Answer(question, 'B', "Google", false));
    answerRepository.save(new Answer(question, 'C', "Underage hackers", false));
  }

  private void saveQuestion688() {
    Question question;

    question = questionRepository.save(new Question(11, "What distinction does airline Handley Page Transport have?", "2018-03-20 19:11:25"));

    answerRepository.save(new Answer(question, 'A', "First inflight movie", false));
    answerRepository.save(new Answer(question, 'B', "First to serve a meal", true));
    answerRepository.save(new Answer(question, 'C', "First to check a bag", false));
  }

  private void saveQuestion689() {
    Question question;

    question = questionRepository.save(new Question(12, "Which of these famous TV judges got their start in criminal court?", "2018-03-20 19:12:28"));

    answerRepository.save(new Answer(question, 'A', "Greg Mathis", false));
    answerRepository.save(new Answer(question, 'B', "Judy Sheindlin", false));
    answerRepository.save(new Answer(question, 'C', "Joe Brown", true));
  }

  private void saveQuestion690() {
    Question question;

    question = questionRepository.save(new Question(1, "Hydroelectric power generates electricity from what?", "2018-03-21 01:05:00"));

    answerRepository.save(new Answer(question, 'A', "Killer drum solos", false));
    answerRepository.save(new Answer(question, 'B', "Mean tweets", false));
    answerRepository.save(new Answer(question, 'C', "Water", true));
  }

  private void saveQuestion691() {
    Question question;

    question = questionRepository.save(new Question(2, "American folk hero &amp; apple enthusiast John Chapman was known by what nickname?", "2018-03-21 01:05:32"));

    answerRepository.save(new Answer(question, 'A', "Red Delicious Ricky", false));
    answerRepository.save(new Answer(question, 'B', "Johnny App… https://t.co/nQgEXbtty3", false));
  }

  private void saveQuestion692() {
    Question question;

    question = questionRepository.save(new Question(3, "By definition, a person who is ambidextrous is able to do what?", "2018-03-21 01:06:05"));

    answerRepository.save(new Answer(question, 'A', "Use both hands well", true));
    answerRepository.save(new Answer(question, 'B', "Speak two languages", false));
    answerRepository.save(new Answer(question, 'C', "Whistle", false));
  }

  private void saveQuestion693() {
    Question question;

    question = questionRepository.save(new Question(4, "The classic book “The Grapes of Wrath” is about a family's journey to what state?", "2018-03-21 01:06:43"));

    answerRepository.save(new Answer(question, 'A', "Alaska", false));
    answerRepository.save(new Answer(question, 'B', "California", true));
    answerRepository.save(new Answer(question, 'C', "Hawaii", false));
  }

  private void saveQuestion694() {
    Question question;

    question = questionRepository.save(new Question(5, "In which of these sports do competitors often wear jodhpurs?", "2018-03-21 01:07:22"));

    answerRepository.save(new Answer(question, 'A', "Cricket", false));
    answerRepository.save(new Answer(question, 'B', "Polo", true));
    answerRepository.save(new Answer(question, 'C', "Jai alai", false));
  }

  private void saveQuestion695() {
    Question question;

    question = questionRepository.save(new Question(6, "Moore’s Law is a famous observation that concerns what?", "2018-03-21 01:08:15"));

    answerRepository.save(new Answer(question, 'A', "Expansion of universe", false));
    answerRepository.save(new Answer(question, 'B', "Human evolution", false));
    answerRepository.save(new Answer(question, 'C', "Computing power", true));
  }

  private void saveQuestion696() {
    Question question;

    question = questionRepository.save(new Question(7, "Which of these exotic fruits is named for a local word for “hair”?", "2018-03-21 01:08:53"));

    answerRepository.save(new Answer(question, 'A', "Durian", false));
    answerRepository.save(new Answer(question, 'B', "Rambutan", true));
    answerRepository.save(new Answer(question, 'C', "Lychee", false));
  }

  private void saveQuestion697() {
    Question question;

    question = questionRepository.save(new Question(8, "Shopping mall staple Gadzooks was purchased by what fellow retailer?", "2018-03-21 01:09:43"));

    answerRepository.save(new Answer(question, 'A', "Forever 21", true));
    answerRepository.save(new Answer(question, 'B', "Hot Topic", false));
    answerRepository.save(new Answer(question, 'C', "Spencer's", false));
  }

  private void saveQuestion698() {
    Question question;

    question = questionRepository.save(new Question(9, "On her first recording, Billie Holiday was accompanied by what jazz legend?", "2018-03-21 01:10:29"));

    answerRepository.save(new Answer(question, 'A', "Benny Goodman", true));
    answerRepository.save(new Answer(question, 'B', "Duke Ellington", false));
    answerRepository.save(new Answer(question, 'C', "Count Basie", false));
  }

  private void saveQuestion699() {
    Question question;

    question = questionRepository.save(new Question(10, "Workers throughout Victoria, Australia get a day off every November for what sporting event?", "2018-03-21 01:11:22"));

    answerRepository.save(new Answer(question, 'A', "Cricket match", false));
    answerRepository.save(new Answer(question, 'B', "Horse race", true));
    answerRepository.save(new Answer(question, 'C', "Rugby game", false));
  }

  private void saveQuestion700() {
    Question question;

    question = questionRepository.save(new Question(11, "Which of these does NOT appear in both the original Pac-Man and Ms. Pac-Man?", "2018-03-21 01:12:02"));

    answerRepository.save(new Answer(question, 'A', "Banana", true));
    answerRepository.save(new Answer(question, 'B', "Apple", false));
    answerRepository.save(new Answer(question, 'C', "Strawberry", false));
  }

  private void saveQuestion701() {
    Question question;

    question = questionRepository.save(new Question(12, "The New-York Mirror newspaper notably employed which poet?", "2018-03-21 01:13:06"));

    answerRepository.save(new Answer(question, 'A', "Edgar Allan Poe", true));
    answerRepository.save(new Answer(question, 'B', "Walt Whitman", false));
    answerRepository.save(new Answer(question, 'C', "Langston Hughes", false));
  }

  private void saveQuestion702() {
    Question question;

    question = questionRepository.save(new Question(1, "In the popular rhyme, April showers bring what?", "2018-03-21 19:04:39"));

    answerRepository.save(new Answer(question, 'A', "CD towers", false));
    answerRepository.save(new Answer(question, 'B', "May flowers", true));
    answerRepository.save(new Answer(question, 'C', "Kenny Powers", false));
  }

  private void saveQuestion703() {
    Question question;

    question = questionRepository.save(new Question(2, "Smokey the Bear often preaches that only YOU can prevent what?", "2018-03-21 19:05:15"));

    answerRepository.save(new Answer(question, 'A', "Flash mobs", false));
    answerRepository.save(new Answer(question, 'B', "Reply all emails", false));
    answerRepository.save(new Answer(question, 'C', "Forest fires", true));
  }

  private void saveQuestion704() {
    Question question;

    question = questionRepository.save(new Question(3, "What is the zip code for Beverly Hills, California?", "2018-03-21 19:05:47"));

    answerRepository.save(new Answer(question, 'A', "10528", false));
    answerRepository.save(new Answer(question, 'B', "90210", true));
    answerRepository.save(new Answer(question, 'C', "01209", false));
  }

  private void saveQuestion705() {
    Question question;

    question = questionRepository.save(new Question(4, "In terms of miles traveled, which of these races is the longest?", "2018-03-21 19:06:33"));

    answerRepository.save(new Answer(question, 'A', "Daytona 500", false));
    answerRepository.save(new Answer(question, 'B', "Tour de France", true));
    answerRepository.save(new Answer(question, 'C', "Iron Man Triathlon", false));
  }

  private void saveQuestion706() {
    Question question;

    question = questionRepository.save(new Question(5, "Which of these winds is the fastest on the Beaufort Wind Scale?", "2018-03-21 19:07:09"));

    answerRepository.save(new Answer(question, 'A', "Strong gale", false));
    answerRepository.save(new Answer(question, 'B', "Near gale", false));
    answerRepository.save(new Answer(question, 'C', "Storm", true));
  }

  private void saveQuestion707() {
    Question question;

    question = questionRepository.save(new Question(6, "Which of these African landmarks is mentioned by name in Toto’s “Africa”?", "2018-03-21 19:08:11"));

    answerRepository.save(new Answer(question, 'A', "Timbuktu", false));
    answerRepository.save(new Answer(question, 'B', "Sahara", false));
    answerRepository.save(new Answer(question, 'C', "Serengeti", true));
  }

  private void saveQuestion708() {
    Question question;

    question = questionRepository.save(new Question(7, "Which rapper has NOT acted in a Fast &amp; Furious movie?", "2018-03-21 19:08:51"));

    answerRepository.save(new Answer(question, 'A', "Cam'ron", true));
    answerRepository.save(new Answer(question, 'B', "Ja Rule", false));
    answerRepository.save(new Answer(question, 'C', "Bow Wow", false));
  }

  private void saveQuestion709() {
    Question question;

    question = questionRepository.save(new Question(8, "What U.S. sports league currently has two different players named Sebastian Aho?", "2018-03-21 19:09:24"));

    answerRepository.save(new Answer(question, 'A', "NHL", true));
    answerRepository.save(new Answer(question, 'B', "MLB", false));
    answerRepository.save(new Answer(question, 'C', "NFL", false));
  }

  private void saveQuestion710() {
    Question question;

    question = questionRepository.save(new Question(9, "One of the earliest descriptions of dental floss appears in what landmark of literature?", "2018-03-21 19:10:01"));

    answerRepository.save(new Answer(question, 'A', "Pride and Prejudice", false));
    answerRepository.save(new Answer(question, 'B', "Little Women", false));
    answerRepository.save(new Answer(question, 'C', "Ulysses", true));
  }

  private void saveQuestion711() {
    Question question;

    question = questionRepository.save(new Question(10, "The artist behind what 20th-century masterpiece also competed in a World Chess Olympiad?", "2018-03-21 19:10:35"));

    answerRepository.save(new Answer(question, 'A', "Fountain", true));
    answerRepository.save(new Answer(question, 'B', "Christina… https://t.co/iebv0IOjp1", false));
  }

  private void saveQuestion712() {
    Question question;

    question = questionRepository.save(new Question(11, "Which of these would be classified using the Aarne-Thompson-Uther system?", "2018-03-21 19:11:16"));

    answerRepository.save(new Answer(question, 'A', "Meteor showers", false));
    answerRepository.save(new Answer(question, 'B', "Aesop's Fables", true));
    answerRepository.save(new Answer(question, 'C', "Blood-borne viruses", false));
  }

  private void saveQuestion713() {
    Question question;

    question = questionRepository.save(new Question(12, "Which of these is defined as a tautological place name?", "2018-03-21 19:12:27"));

    answerRepository.save(new Answer(question, 'A', "Lake Tahoe", true));
    answerRepository.save(new Answer(question, 'B', "Martha's Vineyard", false));
    answerRepository.save(new Answer(question, 'C', "Walla Walla, Washington", false));
  }

  private void saveQuestion714() {
    Question question;

    question = questionRepository.save(new Question(1, "Which of these is a boy wizard created by J.K. Rowling?", "2018-03-22 01:05:37"));

    answerRepository.save(new Answer(question, 'A', "Wand-a Sykes", false));
    answerRepository.save(new Answer(question, 'B', "Harry Potter", true));
    answerRepository.save(new Answer(question, 'C', "Waldo Wizardboy", false));
  }

  private void saveQuestion715() {
    Question question;

    question = questionRepository.save(new Question(2, "In golf, the best score on a single hole is popularly known as what?", "2018-03-22 01:06:09"));

    answerRepository.save(new Answer(question, 'A', "Golfy surprise", false));
    answerRepository.save(new Answer(question, 'B', "Hole in one", true));
    answerRepository.save(new Answer(question, 'C', "Self-driving par", false));
  }

  private void saveQuestion716() {
    Question question;

    question = questionRepository.save(new Question(3, "Parquet is a type of what?", "2018-03-22 01:06:53"));

    answerRepository.save(new Answer(question, 'A', "Wooden flooring", true));
    answerRepository.save(new Answer(question, 'B', "African bird", false));
    answerRepository.save(new Answer(question, 'C', "Brand of cream cheese", false));
  }

  private void saveQuestion717() {
    Question question;

    question = questionRepository.save(new Question(4, "Which of these professions is most likely to make a horseshoe?", "2018-03-22 01:07:26"));

    answerRepository.save(new Answer(question, 'A', "Farrier", true));
    answerRepository.save(new Answer(question, 'B', "Ophthalmologist", false));
    answerRepository.save(new Answer(question, 'C', "Notary", false));
  }

  private void saveQuestion718() {
    Question question;

    question = questionRepository.save(new Question(5, "The title of the Robert Frost poem “Out, Out—” alludes to which Shakespeare play?", "2018-03-22 01:07:56"));

    answerRepository.save(new Answer(question, 'A', "Romeo and Juliet", false));
    answerRepository.save(new Answer(question, 'B', "Macbeth", true));
    answerRepository.save(new Answer(question, 'C', "Hamlet", false));
  }

  private void saveQuestion719() {
    Question question;

    question = questionRepository.save(new Question(6, "Trailblazing chef Hélène Darroze has her own what?", "2018-03-22 01:08:31"));

    answerRepository.save(new Answer(question, 'A', "Restaurant in the Louvre", false));
    answerRepository.save(new Answer(question, 'B', "U.S. postage stamp", false));
    answerRepository.save(new Answer(question, 'C', "Barbie doll", true));
  }

  private void saveQuestion720() {
    Question question;

    question = questionRepository.save(new Question(7, "Which of these is NOT a variety of strawberry?", "2018-03-22 01:09:20"));

    answerRepository.save(new Answer(question, 'A', "Holland Bloom", true));
    answerRepository.save(new Answer(question, 'B', "Sweet Charlie", false));
    answerRepository.save(new Answer(question, 'C', "Ozark Beauty", false));
  }

  private void saveQuestion721() {
    Question question;

    question = questionRepository.save(new Question(8, "Which of these countries won its independence the soonest after the U.S. did?", "2018-03-22 01:09:58"));

    answerRepository.save(new Answer(question, 'A', "Mexico", false));
    answerRepository.save(new Answer(question, 'B', "Haiti", true));
    answerRepository.save(new Answer(question, 'C', "Cuba", false));
  }

  private void saveQuestion722() {
    Question question;

    question = questionRepository.save(new Question(9, "The fashion brand Opening Ceremony once put on a play co-written by what actor?", "2018-03-22 01:10:38"));

    answerRepository.save(new Answer(question, 'A', "Jonah Hill", true));
    answerRepository.save(new Answer(question, 'B', "Chloë Sevigny", false));
    answerRepository.save(new Answer(question, 'C', "Jesse Eisenberg", false));
  }

  private void saveQuestion723() {
    Question question;

    question = questionRepository.save(new Question(10, "Which of these products was originally developed for surgical use?", "2018-03-22 01:11:18"));

    answerRepository.save(new Answer(question, 'A', "Listerine", true));
    answerRepository.save(new Answer(question, 'B', "Bengay", false));
    answerRepository.save(new Answer(question, 'C', "VapoRub", false));
  }

  private void saveQuestion724() {
    Question question;

    question = questionRepository.save(new Question(11, "When written in all caps, which woman’s name is a classification system for moths?", "2018-03-22 01:12:00"));

    answerRepository.save(new Answer(question, 'A', "Mara", false));
    answerRepository.save(new Answer(question, 'B', "Emma", false));
    answerRepository.save(new Answer(question, 'C', "Mona", true));
  }

  private void saveQuestion725() {
    Question question;

    question = questionRepository.save(new Question(12, "Which of these musicians once featured in a movie based on “Blue’s Clues”?", "2018-03-22 01:13:03"));

    answerRepository.save(new Answer(question, 'A', "Ray Charles", true));
    answerRepository.save(new Answer(question, 'B', "Paul Simon", false));
    answerRepository.save(new Answer(question, 'C', "Ricky Martin", false));
  }

  private void saveQuestion726() {
    Question question;

    question = questionRepository.save(new Question(1, "According to legend, everything King Midas touched turned to what?", "2018-03-22 19:04:50"));

    answerRepository.save(new Answer(question, 'A', "Ovaltine", false));
    answerRepository.save(new Answer(question, 'B', "Gold", true));
    answerRepository.save(new Answer(question, 'C', "Funnel cakes", false));
  }

  private void saveQuestion727() {
    Question question;

    question = questionRepository.save(new Question(2, "Which of these is an annual car race in Indianapolis?", "2018-03-22 19:05:24"));

    answerRepository.save(new Answer(question, 'A', "Boss Baby 2", false));
    answerRepository.save(new Answer(question, 'B', "Seinfeld 2000", false));
    answerRepository.save(new Answer(question, 'C', "Indy 500", true));
  }

  private void saveQuestion728() {
    Question question;

    question = questionRepository.save(new Question(3, "The Richter scale is typically used to measure the magnitude of what?", "2018-03-22 19:05:58"));

    answerRepository.save(new Answer(question, 'A', "Earthquakes", true));
    answerRepository.save(new Answer(question, 'B', "Food spiciness", false));
    answerRepository.save(new Answer(question, 'C', "Bee stings", false));
  }

  private void saveQuestion729() {
    Question question;

    question = questionRepository.save(new Question(4, "Which of these classic novels was originally written in English?", "2018-03-22 19:06:33"));

    answerRepository.save(new Answer(question, 'A', "Madame Bovary", false));
    answerRepository.save(new Answer(question, 'B', "Dracula", true));
    answerRepository.save(new Answer(question, 'C', "Don Quixote", false));
  }

  private void saveQuestion730() {
    Question question;

    question = questionRepository.save(new Question(5, "Abraham Lincoln served Illinois as a member of which branch of Congress?", "2018-03-22 19:07:14"));

    answerRepository.save(new Answer(question, 'A', "Neither", false));
    answerRepository.save(new Answer(question, 'B', "House of Representatives", true));
    answerRepository.save(new Answer(question, 'C', "Senate", false));
  }

  private void saveQuestion731() {
    Question question;

    question = questionRepository.save(new Question(6, "The title of the rock record “Steal This Album!” references a controversial work by whom?", "2018-03-22 19:08:11"));

    answerRepository.save(new Answer(question, 'A', "Abbie Hoffman", true));
    answerRepository.save(new Answer(question, 'B', "Jack Kerouac", false));
    answerRepository.save(new Answer(question, 'C', "Karl Marx", false));
  }

  private void saveQuestion732() {
    Question question;

    question = questionRepository.save(new Question(7, "Which of these classic Cajun dishes was invented first?", "2018-03-22 19:08:47"));

    answerRepository.save(new Answer(question, 'A', "Bananas Foster", false));
    answerRepository.save(new Answer(question, 'B', "Oysters Rockefeller", true));
    answerRepository.save(new Answer(question, 'C', "Muffuletta", false));
  }

  private void saveQuestion733() {
    Question question;

    question = questionRepository.save(new Question(8, "Ardrey Kell High School in Charlotte, North Carolina played a major role in what meme?", "2018-03-22 19:09:35"));

    answerRepository.save(new Answer(question, 'A', "Water bottle flipping", true));
    answerRepository.save(new Answer(question, 'B', "", false));
  }

  private void saveQuestion734() {
    Question question;

    question = questionRepository.save(new Question(9, "Which plant is considered customary in an English royal wedding bouquet?", "2018-03-22 19:10:18"));

    answerRepository.save(new Answer(question, 'A', "Myrtle", true));
    answerRepository.save(new Answer(question, 'B', "Baby’s-breath", false));
    answerRepository.save(new Answer(question, 'C', "Roses", false));
  }

  private void saveQuestion735() {
    Question question;

    question = questionRepository.save(new Question(10, "The first YouTube Music Awards were co-hosted by the star of what film?", "2018-03-22 19:10:56"));

    answerRepository.save(new Answer(question, 'A', "Rushmore", true));
    answerRepository.save(new Answer(question, 'B', "San Andreas", false));
    answerRepository.save(new Answer(question, 'C', "Hancock", false));
  }

  private void saveQuestion736() {
    Question question;

    question = questionRepository.save(new Question(11, "Which of these legendary artifacts was found in the Nile Delta?", "2018-03-22 19:11:33"));

    answerRepository.save(new Answer(question, 'A', "Rosetta Stone", true));
    answerRepository.save(new Answer(question, 'B', "Elgin Marbles", false));
    answerRepository.save(new Answer(question, 'C', "Nefertiti Bust", false));
  }

  private void saveQuestion737() {
    Question question;

    question = questionRepository.save(new Question(12, "The author of “Treasure Island” also once wrote about the namesake of what cheese?", "2018-03-22 19:12:40"));

    answerRepository.save(new Answer(question, 'A', "Gorgonzola", false));
    answerRepository.save(new Answer(question, 'B', "Roquefort", false));
    answerRepository.save(new Answer(question, 'C', "Monterey Jack", true));
  }

  private void saveQuestion738() {
    Question question;

    question = questionRepository.save(new Question(1, "The container that children traditionally use to collect change is known as what?", "2018-03-23 01:04:04"));

    answerRepository.save(new Answer(question, 'A', "Piggy bank", true));
    answerRepository.save(new Answer(question, 'B', "Doggy zone", false));
    answerRepository.save(new Answer(question, 'C', "Horsey place", false));
  }

  private void saveQuestion739() {
    Question question;

    question = questionRepository.save(new Question(2, "In order to legally drive in the U.S., which of these do you need?", "2018-03-23 01:04:40"));

    answerRepository.save(new Answer(question, 'A', "Specially trained parrot", false));
    answerRepository.save(new Answer(question, 'B', "Spinning rims", false));
    answerRepository.save(new Answer(question, 'C', "License", true));
  }

  private void saveQuestion740() {
    Question question;

    question = questionRepository.save(new Question(3, "What color was the original Livestrong bracelet?", "2018-03-23 01:05:31"));

    answerRepository.save(new Answer(question, 'A', "Yellow", true));
    answerRepository.save(new Answer(question, 'B', "Green", false));
    answerRepository.save(new Answer(question, 'C', "Purple", false));
  }

  private void saveQuestion741() {
    Question question;

    question = questionRepository.save(new Question(4, "The Chunnel connects what two countries?", "2018-03-23 01:06:10"));

    answerRepository.save(new Answer(question, 'A', "Italy / Sweden", false));
    answerRepository.save(new Answer(question, 'B', "Canada / Mexico", false));
    answerRepository.save(new Answer(question, 'C', "England / France", true));
  }

  private void saveQuestion742() {
    Question question;

    question = questionRepository.save(new Question(5, "The “Streisand effect” describes when an attempt at what backfires?", "2018-03-23 01:06:55"));

    answerRepository.save(new Answer(question, 'A', "Career comeback", false));
    answerRepository.save(new Answer(question, 'B', "Restricting alimony", false));
    answerRepository.save(new Answer(question, 'C', "Privacy", true));
  }

  private void saveQuestion743() {
    Question question;

    question = questionRepository.save(new Question(6, "In 1534, why did England’s king appoint himself “Supreme Head” of his country’s church?", "2018-03-23 01:08:09"));

    answerRepository.save(new Answer(question, 'A', "Avoid prison", false));
    answerRepository.save(new Answer(question, 'B', "End his… https://t.co/izewWrdkv1", false));
  }

  private void saveQuestion744() {
    Question question;

    question = questionRepository.save(new Question(7, "Which of these awards has NOT been won by a U.S. First Lady?", "2018-03-23 01:08:51"));

    answerRepository.save(new Answer(question, 'A', "Emmy", false));
    answerRepository.save(new Answer(question, 'B', "Grammy", false));
    answerRepository.save(new Answer(question, 'C', "Oscar", true));
  }

  private void saveQuestion745() {
    Question question;

    question = questionRepository.save(new Question(8, "In towns like Edinburgh and Glasgow, homes traditionally have red doors to signify what?", "2018-03-23 01:09:35"));

    answerRepository.save(new Answer(question, 'A', "Paid off mortgage", true));
    answerRepository.save(new Answer(question, 'B', "", false));
  }

  private void saveQuestion746() {
    Question question;

    question = questionRepository.save(new Question(9, "Which singer launched the tape recorder revolution in America?", "2018-03-23 01:10:28"));

    answerRepository.save(new Answer(question, 'A', "Bing Crosby", true));
    answerRepository.save(new Answer(question, 'B', "Frank Sinatra", false));
    answerRepository.save(new Answer(question, 'C', "Tony Bennett", false));
  }

  private void saveQuestion747() {
    Question question;

    question = questionRepository.save(new Question(10, "Which of these countries has outlawed beauty pageants for kids?", "2018-03-23 01:11:10"));

    answerRepository.save(new Answer(question, 'A', "Canada", false));
    answerRepository.save(new Answer(question, 'B', "Finland", false));
    answerRepository.save(new Answer(question, 'C', "France", true));
  }

  private void saveQuestion748() {
    Question question;

    question = questionRepository.save(new Question(11, "How many U.S. states allow common law marriage?", "2018-03-23 01:11:57"));

    answerRepository.save(new Answer(question, 'A', "All of them", false));
    answerRepository.save(new Answer(question, 'B', "None of them", false));
    answerRepository.save(new Answer(question, 'C', "Some of them", true));
  }

  private void saveQuestion749() {
    Question question;

    question = questionRepository.save(new Question(12, "Which of these movies was its director's feature film debut?", "2018-03-23 01:13:24"));

    answerRepository.save(new Answer(question, 'A', "Being John Malkovich", true));
    answerRepository.save(new Answer(question, 'B', "Jaws", false));
    answerRepository.save(new Answer(question, 'C', "Moonlight", false));
  }

  private void saveQuestion750() {
    Question question;

    question = questionRepository.save(new Question(1, "Which of these activities is considered a form of aerobic exercise?", "2018-03-23 19:04:36"));

    answerRepository.save(new Answer(question, 'A', "Napping", false));
    answerRepository.save(new Answer(question, 'B', "Jogging", true));
    answerRepository.save(new Answer(question, 'C', "Tweeting", false));
  }

  private void saveQuestion751() {
    Question question;

    question = questionRepository.save(new Question(2, "In “Mister Rogers' Neighborhood,” what was Mr. Rogers’ first name?", "2018-03-23 19:05:18"));

    answerRepository.save(new Answer(question, 'A', "Agamemnon", false));
    answerRepository.save(new Answer(question, 'B', "Fred", true));
    answerRepository.save(new Answer(question, 'C', "Frodger", false));
  }

  private void saveQuestion752() {
    Question question;

    question = questionRepository.save(new Question(3, "What kitchen appliance is typically used to brown slices of bread?", "2018-03-23 19:06:00"));

    answerRepository.save(new Answer(question, 'A', "Toaster", true));
    answerRepository.save(new Answer(question, 'B', "Immersion blender", false));
    answerRepository.save(new Answer(question, 'C', "French press", false));
  }

  private void saveQuestion753() {
    Question question;

    question = questionRepository.save(new Question(4, "What is the official name of the large structure in the center of Chicago's Millennium Park?", "2018-03-23 19:06:39"));

    answerRepository.save(new Answer(question, 'A', "Chicago Bean", false));
    answerRepository.save(new Answer(question, 'B', "Sil… https://t.co/5q5ZSCgZDi", false));
  }

  private void saveQuestion754() {
    Question question;

    question = questionRepository.save(new Question(5, "Which of these is a distinctly Tibetan form of greeting?", "2018-03-23 19:07:23"));

    answerRepository.save(new Answer(question, 'A', "Slow nod", false));
    answerRepository.save(new Answer(question, 'B', "Touching foreheads", false));
    answerRepository.save(new Answer(question, 'C', "Sticking out your tongue", true));
  }

  private void saveQuestion755() {
    Question question;

    question = questionRepository.save(new Question(6, "What did Darwin consider “one of the most wonderful” plants in the world?", "2018-03-23 19:08:18"));

    answerRepository.save(new Answer(question, 'A', "Weeping willow", false));
    answerRepository.save(new Answer(question, 'B', "Bird of paradise", false));
    answerRepository.save(new Answer(question, 'C', "Venus flytrap", true));
  }

  private void saveQuestion756() {
    Question question;

    question = questionRepository.save(new Question(7, "Which of these legendary pieces of furniture was designed by a married couple?", "2018-03-23 19:09:01"));

    answerRepository.save(new Answer(question, 'A', "La-Z-Boy", false));
    answerRepository.save(new Answer(question, 'B', "Eames Lounge Chair", true));
    answerRepository.save(new Answer(question, 'C', "Aeron chair", false));
  }

  private void saveQuestion757() {
    Question question;

    question = questionRepository.save(new Question(8, "The composer for the “South Park” movie also provided music for which film?", "2018-03-23 19:09:52"));

    answerRepository.save(new Answer(question, 'A', "Minions", false));
    answerRepository.save(new Answer(question, 'B', "Hairspray", true));
    answerRepository.save(new Answer(question, 'C', "BASEketball", false));
  }

  private void saveQuestion758() {
    Question question;

    question = questionRepository.save(new Question(9, "Which of these was NOT invented by the same company as the other two?", "2018-03-23 19:10:34"));

    answerRepository.save(new Answer(question, 'A', "Nexcare Blister Bandages", false));
    answerRepository.save(new Answer(question, 'B', "Band-Aid", true));
    answerRepository.save(new Answer(question, 'C', "Ace bandages", false));
  }

  private void saveQuestion759() {
    Question question;

    question = questionRepository.save(new Question(10, "Which sauce did chef Marie-Antoine Carême’s name as one of his original “mothers”?", "2018-03-23 19:11:12"));

    answerRepository.save(new Answer(question, 'A', "Béchamel", true));
    answerRepository.save(new Answer(question, 'B', "Hollandaise", false));
    answerRepository.save(new Answer(question, 'C', "Tomato", false));
  }

  private void saveQuestion760() {
    Question question;

    question = questionRepository.save(new Question(11, "Which news anchor claims he once got into a minor car crash with a U.S. president?", "2018-03-23 19:11:51"));

    answerRepository.save(new Answer(question, 'A', "Geraldo Rivera", false));
    answerRepository.save(new Answer(question, 'B', "Larry King", true));
    answerRepository.save(new Answer(question, 'C', "Dan Rather", false));
  }

  private void saveQuestion761() {
    Question question;

    question = questionRepository.save(new Question(12, "Which city did Mary-Kate and Ashley Olsen NOT travel to in their straight-to-video oeuvre?", "2018-03-23 19:13:07"));

    answerRepository.save(new Answer(question, 'A', "Sydney", false));
    answerRepository.save(new Answer(question, 'B', "Salt Lake City", false));
    answerRepository.save(new Answer(question, 'C', "Milan", true));
  }

  private void saveQuestion762() {
    Question question;

    question = questionRepository.save(new Question(1, "A unicorn typically has one what on its head?", "2018-03-24 01:04:27"));

    answerRepository.save(new Answer(question, 'A', "Horn", true));
    answerRepository.save(new Answer(question, 'B', "Mustache", false));
    answerRepository.save(new Answer(question, 'C', "Nacho hat", false));
  }

  private void saveQuestion763() {
    Question question;

    question = questionRepository.save(new Question(2, "What is glass primarily made of?", "2018-03-24 01:05:08"));

    answerRepository.save(new Answer(question, 'A', "The film formed on gravy", false));
    answerRepository.save(new Answer(question, 'B', "Bubble wrap", false));
    answerRepository.save(new Answer(question, 'C', "Sand", true));
  }

  private void saveQuestion764() {
    Question question;

    question = questionRepository.save(new Question(3, "Which of these is a common breed of dog?", "2018-03-24 01:05:54"));

    answerRepository.save(new Answer(question, 'A', "Marmite", false));
    answerRepository.save(new Answer(question, 'B', "Malamute", true));
    answerRepository.save(new Answer(question, 'C', "Merman", false));
  }

  private void saveQuestion765() {
    Question question;

    question = questionRepository.save(new Question(4, "Which of these words means “in three pieces?”", "2018-03-24 01:06:38"));

    answerRepository.save(new Answer(question, 'A', "Tripartite", true));
    answerRepository.save(new Answer(question, 'B', "Troglodyte", false));
    answerRepository.save(new Answer(question, 'C', "Terracotta", false));
  }

  private void saveQuestion766() {
    Question question;

    question = questionRepository.save(new Question(5, "The cooking method “al pastor” came to Mexico from what country?", "2018-03-24 01:07:28"));

    answerRepository.save(new Answer(question, 'A', "El Salvador", false));
    answerRepository.save(new Answer(question, 'B', "Spain", false));
    answerRepository.save(new Answer(question, 'C', "Lebanon", true));
  }

  private void saveQuestion767() {
    Question question;

    question = questionRepository.save(new Question(6, "Which work by Roald Dahl was adapted into a 3-act opera in 1998?", "2018-03-24 01:08:32"));

    answerRepository.save(new Answer(question, 'A', "Matilda", false));
    answerRepository.save(new Answer(question, 'B', "James &amp; the Giant Peach", false));
    answerRepository.save(new Answer(question, 'C', "The Fantastic Mr. Fox", true));
  }

  private void saveQuestion768() {
    Question question;

    question = questionRepository.save(new Question(7, "The CEO of what tech company turned heads in 2013 by buying a funeral home?", "2018-03-24 01:09:31"));

    answerRepository.save(new Answer(question, 'A', "Tesla", false));
    answerRepository.save(new Answer(question, 'B', "Airbnb", false));
    answerRepository.save(new Answer(question, 'C', "Yahoo", true));
  }

  private void saveQuestion769() {
    Question question;

    question = questionRepository.save(new Question(8, "The capital of which state is also the French form of the name Peter?", "2018-03-24 01:10:19"));

    answerRepository.save(new Answer(question, 'A', "Wyoming", false));
    answerRepository.save(new Answer(question, 'B', "North Dakota", false));
    answerRepository.save(new Answer(question, 'C', "South Dakota", true));
  }

  private void saveQuestion770() {
    Question question;

    question = questionRepository.save(new Question(9, "Which of these courtroom TV shows debuted in the 1950s?", "2018-03-24 01:10:58"));

    answerRepository.save(new Answer(question, 'A', "America's Court", false));
    answerRepository.save(new Answer(question, 'B', "Divorce Court", true));
    answerRepository.save(new Answer(question, 'C', "The People's Court", false));
  }

  private void saveQuestion771() {
    Question question;

    question = questionRepository.save(new Question(10, "The mockingbird is NOT the state bird of which of these states?", "2018-03-24 01:11:38"));

    answerRepository.save(new Answer(question, 'A', "Texas", false));
    answerRepository.save(new Answer(question, 'B', "Arkansas", false));
    answerRepository.save(new Answer(question, 'C', "Alabama", true));
  }

  private void saveQuestion772() {
    Question question;

    question = questionRepository.save(new Question(11, "A photo of Meryl Streep yelling through her hands was taken at what 2015 awards show?", "2018-03-24 01:12:19"));

    answerRepository.save(new Answer(question, 'A', "Oscars", false));
    answerRepository.save(new Answer(question, 'B', "Golden Globes", false));
    answerRepository.save(new Answer(question, 'C', "SAG Awards", true));
  }

  private void saveQuestion773() {
    Question question;

    question = questionRepository.save(new Question(12, "Which of these events traditionally occurs on the Tuesday after Easter in Tobago?", "2018-03-24 01:14:08"));

    answerRepository.save(new Answer(question, 'A', "Goat race", true));
    answerRepository.save(new Answer(question, 'B', "Rabbit jumping… https://t.co/mirtzCta3F", false));
  }

  private void saveQuestion774() {
    Question question;

    question = questionRepository.save(new Question(1, "What was Neil Armstrong’s most famous achievement?", "2018-03-25 01:04:46"));

    answerRepository.save(new Answer(question, 'A', "Learning French", false));
    answerRepository.save(new Answer(question, 'B', "Eating 14 cupcakes", false));
    answerRepository.save(new Answer(question, 'C', "Walking on the moon", true));
  }

  private void saveQuestion775() {
    Question question;

    question = questionRepository.save(new Question(2, "Which of these is most often worn between feet and shoes?", "2018-03-25 01:05:28"));

    answerRepository.save(new Answer(question, 'A', "Paper towels", false));
    answerRepository.save(new Answer(question, 'B', "Socks", true));
    answerRepository.save(new Answer(question, 'C', "More shoes", false));
  }

  private void saveQuestion776() {
    Question question;

    question = questionRepository.save(new Question(3, "Which of these animals is classified as an arachnid?", "2018-03-25 01:06:35"));

    answerRepository.save(new Answer(question, 'A', "Wolf spider", true));
    answerRepository.save(new Answer(question, 'B', "Vampire bat", false));
    answerRepository.save(new Answer(question, 'C', "Seahorse", false));
  }

  private void saveQuestion777() {
    Question question;

    question = questionRepository.save(new Question(4, "Which of these poker hands typically beats the other two?", "2018-03-25 01:07:21"));

    answerRepository.save(new Answer(question, 'A', "Straight", false));
    answerRepository.save(new Answer(question, 'B', "Flush", false));
    answerRepository.save(new Answer(question, 'C', "Full house", true));
  }

  private void saveQuestion778() {
    Question question;

    question = questionRepository.save(new Question(5, "The Greek names of the two moons of Mars literally translate to what?", "2018-03-25 01:08:12"));

    answerRepository.save(new Answer(question, 'A', "Mother and Daughter", false));
    answerRepository.save(new Answer(question, 'B', "Destiny and Promise", false));
    answerRepository.save(new Answer(question, 'C', "Fear and Panic", true));
  }

  private void saveQuestion779() {
    Question question;

    question = questionRepository.save(new Question(6, "A 2014 online gag convinced some people to recharge their iPhones by doing what?", "2018-03-25 01:09:17"));

    answerRepository.save(new Answer(question, 'A', "Microwaving them", true));
    answerRepository.save(new Answer(question, 'B', "Plugging… https://t.co/l3M70SKcPW", false));
  }

  private void saveQuestion780() {
    Question question;

    question = questionRepository.save(new Question(7, "What flavor of cream filled the first Twinkies?", "2018-03-25 01:09:56"));

    answerRepository.save(new Answer(question, 'A', "Vanilla", false));
    answerRepository.save(new Answer(question, 'B', "Banana", true));
    answerRepository.save(new Answer(question, 'C', "Peanut butter", false));
  }

  private void saveQuestion781() {
    Question question;

    question = questionRepository.save(new Question(8, "In the popular Asian sport sepak takraw, players strike the ball with what?", "2018-03-25 01:10:40"));

    answerRepository.save(new Answer(question, 'A', "Feet", true));
    answerRepository.save(new Answer(question, 'B', "Hands", false));
    answerRepository.save(new Answer(question, 'C', "Sticks", false));
  }

  private void saveQuestion782() {
    Question question;

    question = questionRepository.save(new Question(9, "Aside from Walt Disney, the most Oscar-nominated person in history is known for what?", "2018-03-25 01:11:34"));

    answerRepository.save(new Answer(question, 'A', "Visual effects", false));
    answerRepository.save(new Answer(question, 'B', "Costume design", false));
    answerRepository.save(new Answer(question, 'C', "Composing", true));
  }

  private void saveQuestion783() {
    Question question;

    question = questionRepository.save(new Question(10, "The luna moth lives its entire adult life without doing what?", "2018-03-25 01:12:33"));

    answerRepository.save(new Answer(question, 'A', "Mating", false));
    answerRepository.save(new Answer(question, 'B', "Eating", true));
    answerRepository.save(new Answer(question, 'C', "Flying", false));
  }

  private void saveQuestion784() {
    Question question;

    question = questionRepository.save(new Question(11, "Which of these chemical elements gets its name from a mythical creature?", "2018-03-25 01:13:23"));

    answerRepository.save(new Answer(question, 'A', "Hassium", false));
    answerRepository.save(new Answer(question, 'B', "Xenon", false));
    answerRepository.save(new Answer(question, 'C', "Cobalt", true));
  }

  private void saveQuestion785() {
    Question question;

    question = questionRepository.save(new Question(12, "Herman Melville dedicated “Moby-Dick” to the author of what other classic work?", "2018-03-25 01:15:00"));

    answerRepository.save(new Answer(question, 'A', "Twice-Told Tales", true));
    answerRepository.save(new Answer(question, 'B', "Paul Rever… https://t.co/dGIuxH7S3y", false));
  }

  private void saveQuestion786() {
    Question question;

    question = questionRepository.save(new Question(1, "In an old legend, what did Arthur pull out of a stone to become king?", "2018-03-26 01:08:11"));

    answerRepository.save(new Answer(question, 'A', "Sword", true));
    answerRepository.save(new Answer(question, 'B', "Bird's nest", false));
    answerRepository.save(new Answer(question, 'C', "Fat stacks", false));
  }

  private void saveQuestion787() {
    Question question;

    question = questionRepository.save(new Question(2, "What is the predominant keyboard layout in North America?", "2018-03-26 01:08:59"));

    answerRepository.save(new Answer(question, 'A', "QWERTY", true));
    answerRepository.save(new Answer(question, 'B', "FLIRTY", false));
    answerRepository.save(new Answer(question, 'C', "THRIVING", false));
  }

  private void saveQuestion788() {
    Question question;

    question = questionRepository.save(new Question(3, "A popular board game is titled “Chutes and” what?", "2018-03-26 01:10:13"));

    answerRepository.save(new Answer(question, 'A', "Leopards", false));
    answerRepository.save(new Answer(question, 'B', "Ladders", true));
    answerRepository.save(new Answer(question, 'C', "Lawyers", false));
  }

  private void saveQuestion789() {
    Question question;

    question = questionRepository.save(new Question(4, "Neapolitan ice cream gets its name from a city in what country?", "2018-03-26 01:10:53"));

    answerRepository.save(new Answer(question, 'A', "Italy", true));
    answerRepository.save(new Answer(question, 'B', "Germany", false));
    answerRepository.save(new Answer(question, 'C', "Canada", false));
  }

  private void saveQuestion790() {
    Question question;

    question = questionRepository.save(new Question(5, "What fashion brand's logo depicts a woman famous for her fierce appearance?", "2018-03-26 01:11:34"));

    answerRepository.save(new Answer(question, 'A', "Versace", true));
    answerRepository.save(new Answer(question, 'B', "Chanel", false));
    answerRepository.save(new Answer(question, 'C', "Gucci", false));
  }

  private void saveQuestion791() {
    Question question;

    question = questionRepository.save(new Question(6, "By definition, a skinflint is someone who does NOT like doing what?", "2018-03-26 01:12:24"));

    answerRepository.save(new Answer(question, 'A', "Wearing clothes", false));
    answerRepository.save(new Answer(question, 'B', "Spending money", true));
    answerRepository.save(new Answer(question, 'C', "Speaking in public", false));
  }

  private void saveQuestion792() {
    Question question;

    question = questionRepository.save(new Question(7, "What do camels primarily store in their humps?", "2018-03-26 01:13:03"));

    answerRepository.save(new Answer(question, 'A', "Fat", true));
    answerRepository.save(new Answer(question, 'B', "Water", false));
    answerRepository.save(new Answer(question, 'C', "Salt", false));
  }

  private void saveQuestion793() {
    Question question;

    question = questionRepository.save(new Question(8, "The author of “Chitty Chitty Bang Bang” also created what literary character?", "2018-03-26 01:13:53"));

    answerRepository.save(new Answer(question, 'A', "Mary Poppins", false));
    answerRepository.save(new Answer(question, 'B', "Winnie the Pooh", false));
    answerRepository.save(new Answer(question, 'C', "James Bond", true));
  }

  private void saveQuestion794() {
    Question question;

    question = questionRepository.save(new Question(9, "The dinosaur genus Zuul gets its name from what film franchise?", "2018-03-26 01:15:05"));

    answerRepository.save(new Answer(question, 'A', "Jurassic Park", false));
    answerRepository.save(new Answer(question, 'B', "The Land Before Time", false));
    answerRepository.save(new Answer(question, 'C', "Ghostbusters", true));
  }

  private void saveQuestion795() {
    Question question;

    question = questionRepository.save(new Question(10, "In which of these would you most likely find a wet cell battery?", "2018-03-26 01:15:53"));

    answerRepository.save(new Answer(question, 'A', "TV remote control", false));
    answerRepository.save(new Answer(question, 'B', "Laptop computer", false));
    answerRepository.save(new Answer(question, 'C', "Cellphone tower", true));
  }

  private void saveQuestion796() {
    Question question;

    question = questionRepository.save(new Question(11, "Which of these terms is a common bicycle part?", "2018-03-26 01:16:32"));

    answerRepository.save(new Answer(question, 'A', "Lawyer lips", true));
    answerRepository.save(new Answer(question, 'B', "Fireman fingers", false));
    answerRepository.save(new Answer(question, 'C', "Trainer toes", false));
  }

  private void saveQuestion797() {
    Question question;

    question = questionRepository.save(new Question(12, "In his first-ever video game appearance, Mario had what profession?", "2018-03-26 01:17:17"));

    answerRepository.save(new Answer(question, 'A', "Chef", false));
    answerRepository.save(new Answer(question, 'B', "Carpenter", true));
    answerRepository.save(new Answer(question, 'C', "Plumber", false));
  }

  private void saveQuestion798() {
    Question question;

    question = questionRepository.save(new Question(13, "Which of these ’80s movies earned an Oscar nomination?", "2018-03-26 01:17:58"));

    answerRepository.save(new Answer(question, 'A', "The Karate Kid", true));
    answerRepository.save(new Answer(question, 'B', "Risky Business", false));
    answerRepository.save(new Answer(question, 'C', "The Breakfast Club", false));
  }

  private void saveQuestion799() {
    Question question;

    question = questionRepository.save(new Question(14, "Which of these vice presidents served under a president carved on Mount Rushmore?", "2018-03-26 01:18:50"));

    answerRepository.save(new Answer(question, 'A', "Henry Wallace", false));
    answerRepository.save(new Answer(question, 'B', "Hannibal Hamlin", true));
    answerRepository.save(new Answer(question, 'C', "Elbridge Gerry", false));
  }

  private void saveQuestion800() {
    Question question;

    question = questionRepository.save(new Question(15, "Which of these was inducted into the National Toy Hall of Fame first?", "2018-03-26 01:19:47"));

    answerRepository.save(new Answer(question, 'A', "Wiffle ball", false));
    answerRepository.save(new Answer(question, 'B', "Game Boy", true));
    answerRepository.save(new Answer(question, 'C', "Rubik’s Cube", false));
  }

  private void saveQuestion801() {
    Question question;

    question = questionRepository.save(new Question(16, "Which university’s marching band has a giant instrument that used to be radioactive?", "2018-03-26 01:20:45"));

    answerRepository.save(new Answer(question, 'A', "U of Chicago", false));
    answerRepository.save(new Answer(question, 'B', "Purdue", false));
    answerRepository.save(new Answer(question, 'C', "U of Texas", true));
  }

  private void saveQuestion802() {
    Question question;

    question = questionRepository.save(new Question(17, "The element lutetium gets its name from an old name for what European city?", "2018-03-26 01:21:43"));

    answerRepository.save(new Answer(question, 'A', "London", false));
    answerRepository.save(new Answer(question, 'B', "Paris", true));
    answerRepository.save(new Answer(question, 'C', "Helsinki", false));
  }

  private void saveQuestion803() {
    Question question;

    question = questionRepository.save(new Question(18, "Facebook's first logo featured the actor who played which of these characters in a film?", "2018-03-26 01:22:43"));

    answerRepository.save(new Answer(question, 'A', "Tony Stark", false));
    answerRepository.save(new Answer(question, 'B', "Cameron W… https://t.co/ccBUAAWS9E", false));
  }

  private void saveQuestion804() {
    Question question;

    question = questionRepository.save(new Question(19, "In 2017, what publication revived the first U.S. newspaper written and edited by women?", "2018-03-26 01:23:36"));

    answerRepository.save(new Answer(question, 'A', "Chicago Tribune", false));
    answerRepository.save(new Answer(question, 'B', "New Y… https://t.co/VVWLzHOLC6", false));
  }

  private void saveQuestion805() {
    Question question;

    question = questionRepository.save(new Question(20, "Which of these major Hollywood films was shot in Toronto?", "2018-03-26 01:25:02"));

    answerRepository.save(new Answer(question, 'A', "L.A. Confidential", false));
    answerRepository.save(new Answer(question, 'B', "Gangs of New York", false));
    answerRepository.save(new Answer(question, 'C', "Chicago", true));
  }

  private void saveQuestion806() {
    Question question;

    question = questionRepository.save(new Question(21, "Which two U.S. states' capitals are located the farthest apart from each other?", "2018-03-26 01:26:08"));

    answerRepository.save(new Answer(question, 'A', "Florida / Maine", true));
    answerRepository.save(new Answer(question, 'B', "New Mexico… https://t.co/YZwVyiXLmS", false));
  }

  private void saveQuestion807() {
    Question question;

    question = questionRepository.save(new Question(1, "Trees often grow from what?", "2018-03-26 19:04:24"));

    answerRepository.save(new Answer(question, 'A', "AstroTurf", false));
    answerRepository.save(new Answer(question, 'B', "Seeds", true));
    answerRepository.save(new Answer(question, 'C', "Peanut butter", false));
  }

  private void saveQuestion808() {
    Question question;

    question = questionRepository.save(new Question(2, "A common type of hair tie covered in fabric is known as what?", "2018-03-26 19:04:56"));

    answerRepository.save(new Answer(question, 'A', "Scrunchie", true));
    answerRepository.save(new Answer(question, 'B', "Munchie", false));
    answerRepository.save(new Answer(question, 'C', "Lunchie", false));
  }

  private void saveQuestion809() {
    Question question;

    question = questionRepository.save(new Question(3, "The word “fortnight” literally means what?", "2018-03-26 19:05:37"));

    answerRepository.save(new Answer(question, 'A', "Nighttime battle", false));
    answerRepository.save(new Answer(question, 'B', "Tomorrow night", false));
    answerRepository.save(new Answer(question, 'C', "Two weeks", true));
  }

  private void saveQuestion810() {
    Question question;

    question = questionRepository.save(new Question(4, "“Bollywood” is a portmanteau of what city and Hollywood?", "2018-03-26 19:06:23"));

    answerRepository.save(new Answer(question, 'A', "Bombay", true));
    answerRepository.save(new Answer(question, 'B', "Boca Raton", false));
    answerRepository.save(new Answer(question, 'C', "Boston", false));
  }

  private void saveQuestion811() {
    Question question;

    question = questionRepository.save(new Question(5, "In which type of exercise class would you most likely use a reformer?", "2018-03-26 19:07:02"));

    answerRepository.save(new Answer(question, 'A', "Zumba", false));
    answerRepository.save(new Answer(question, 'B', "Pilates", true));
    answerRepository.save(new Answer(question, 'C', "Spin", false));
  }

  private void saveQuestion812() {
    Question question;

    question = questionRepository.save(new Question(6, "Which of these is an acronym used to remember the mathematical order of operations?", "2018-03-26 19:07:42"));

    answerRepository.save(new Answer(question, 'A', "EMPADS", false));
    answerRepository.save(new Answer(question, 'B', "SADMEP", false));
    answerRepository.save(new Answer(question, 'C', "PEMDAS", true));
  }

  private void saveQuestion813() {
    Question question;

    question = questionRepository.save(new Question(7, "Which of these films would be considered a “Pygmalion” story?", "2018-03-26 19:08:27"));

    answerRepository.save(new Answer(question, 'A', "Romeo + Juliet", false));
    answerRepository.save(new Answer(question, 'B', "She’s the Man", false));
    answerRepository.save(new Answer(question, 'C', "She’s All That", true));
  }

  private void saveQuestion814() {
    Question question;

    question = questionRepository.save(new Question(8, "Which of these countries built a city shaped like a First Lady's facial profile?", "2018-03-26 19:09:09"));

    answerRepository.save(new Answer(question, 'A', "Argentina", true));
    answerRepository.save(new Answer(question, 'B', "France", false));
    answerRepository.save(new Answer(question, 'C', "North Korea", false));
  }

  private void saveQuestion815() {
    Question question;

    question = questionRepository.save(new Question(9, "The payment company Square has a board member who runs what fast food chain?", "2018-03-26 19:10:04"));

    answerRepository.save(new Answer(question, 'A', "Shake Shack", true));
    answerRepository.save(new Answer(question, 'B', "Five Guys", false));
    answerRepository.save(new Answer(question, 'C', "In-N-Out", false));
  }

  private void saveQuestion816() {
    Question question;

    question = questionRepository.save(new Question(10, "Amtrak trains do NOT stop in which of these places?", "2018-03-26 19:10:46"));

    answerRepository.save(new Answer(question, 'A', "Glacier National Park", false));
    answerRepository.save(new Answer(question, 'B', "Langley, VA", true));
    answerRepository.save(new Answer(question, 'C', "Niagara Falls", false));
  }

  private void saveQuestion817() {
    Question question;

    question = questionRepository.save(new Question(11, "The first U.S. hotel to offer room service is now part of what hospitality chain?", "2018-03-26 19:11:27"));

    answerRepository.save(new Answer(question, 'A', "Hilton", true));
    answerRepository.save(new Answer(question, 'B', "Four Seasons", false));
    answerRepository.save(new Answer(question, 'C', "Starwood", false));
  }

  private void saveQuestion818() {
    Question question;

    question = questionRepository.save(new Question(12, "The stage name “Chubby Checker” was selected in homage to the performer of what song?", "2018-03-26 19:12:33"));

    answerRepository.save(new Answer(question, 'A', "Blueberry Hill", true));
    answerRepository.save(new Answer(question, 'B', "Roll O… https://t.co/fkMjjrumWb", false));
  }

  private void saveQuestion819() {
    Question question;

    question = questionRepository.save(new Question(1, "What type of card is typically used to make purchases at stores?", "2018-03-27 01:04:18"));

    answerRepository.save(new Answer(question, 'A', "Credit", true));
    answerRepository.save(new Answer(question, 'B', "Blockbuster", false));
    answerRepository.save(new Answer(question, 'C', "Birthday", false));
  }

  private void saveQuestion820() {
    Question question;

    question = questionRepository.save(new Question(2, "What hairstyle is named for a part of an animal?", "2018-03-27 01:04:54"));

    answerRepository.save(new Answer(question, 'A', "Horseholder", false));
    answerRepository.save(new Answer(question, 'B', "Bowl cut", false));
    answerRepository.save(new Answer(question, 'C', "Ponytail", true));
  }

  private void saveQuestion821() {
    Question question;

    question = questionRepository.save(new Question(3, "Which of these is a common type of node in the human body?", "2018-03-27 01:05:31"));

    answerRepository.save(new Answer(question, 'A', "Nymph", false));
    answerRepository.save(new Answer(question, 'B', "Lymph", true));
    answerRepository.save(new Answer(question, 'C', "Dymph", false));
  }

  private void saveQuestion822() {
    Question question;

    question = questionRepository.save(new Question(4, "In the U.S., a trial without a jury is known as what?", "2018-03-27 01:06:44"));

    answerRepository.save(new Answer(question, 'A', "Blank trial", false));
    answerRepository.save(new Answer(question, 'B', "Bench trial", true));
    answerRepository.save(new Answer(question, 'C', "Mistrial", false));
  }

  private void saveQuestion823() {
    Question question;

    question = questionRepository.save(new Question(5, "In English, the Chinese term for paparazzi literally translates to what?", "2018-03-27 01:07:27"));

    answerRepository.save(new Answer(question, 'A', "Laser focused", false));
    answerRepository.save(new Answer(question, 'B', "Puppy squad", true));
    answerRepository.save(new Answer(question, 'C', "Buzzing insects", false));
  }

  private void saveQuestion824() {
    Question question;

    question = questionRepository.save(new Question(6, "Which of these is NOT a “Little Critter” book title?", "2018-03-27 01:08:19"));

    answerRepository.save(new Answer(question, 'A', "Just a Mess", false));
    answerRepository.save(new Answer(question, 'B', "My Summer Vacation", true));
    answerRepository.save(new Answer(question, 'C', "I Was So Mad", false));
  }

  private void saveQuestion825() {
    Question question;

    question = questionRepository.save(new Question(7, "In the Austin Powers films, what type of cat was Mr. Bigglesworth before his cryogenic freeze?", "2018-03-27 01:08:56"));

    answerRepository.save(new Answer(question, 'A', "Siamese", false));
    answerRepository.save(new Answer(question, 'B', "Persian", true));
    answerRepository.save(new Answer(question, 'C', "Sphynx", false));
  }

  private void saveQuestion826() {
    Question question;

    question = questionRepository.save(new Question(8, "What Edgar Allan Poe poem allegedly lends its name to a U.S. Air Force facility?", "2018-03-27 01:09:35"));

    answerRepository.save(new Answer(question, 'A', "Dream-Land", true));
    answerRepository.save(new Answer(question, 'B', "The Raven", false));
    answerRepository.save(new Answer(question, 'C', "The Haunted Palace", false));
  }

  private void saveQuestion827() {
    Question question;

    question = questionRepository.save(new Question(9, "Which state is home to what is considered the deepest lake in the U.S.?", "2018-03-27 01:10:22"));

    answerRepository.save(new Answer(question, 'A', "Minnesota", false));
    answerRepository.save(new Answer(question, 'B', "Michigan", false));
    answerRepository.save(new Answer(question, 'C', "Oregon", true));
  }

  private void saveQuestion828() {
    Question question;

    question = questionRepository.save(new Question(10, "Which of these films earned the dreaded “thumbs down” from Roger Ebert?", "2018-03-27 01:11:02"));

    answerRepository.save(new Answer(question, 'A', "Full Metal Jacket", true));
    answerRepository.save(new Answer(question, 'B', "Demolition Man", false));
    answerRepository.save(new Answer(question, 'C', "Junior", false));
  }

  private void saveQuestion829() {
    Question question;

    question = questionRepository.save(new Question(11, "Which of these technological breakthroughs was invented by a man?", "2018-03-27 01:12:10"));

    answerRepository.save(new Answer(question, 'A', "Windshield wipers", false));
    answerRepository.save(new Answer(question, 'B', "Kevlar", false));
    answerRepository.save(new Answer(question, 'C', "Aerosol can", true));
  }

  private void saveQuestion830() {
    Question question;

    question = questionRepository.save(new Question(12, "In a famous folktale, what archer stole from the rich and gave to the poor?", "2018-03-27 01:58:15"));

    answerRepository.save(new Answer(question, 'A', "Jumpman", false));
    answerRepository.save(new Answer(question, 'B', "Robin Hood", true));
    answerRepository.save(new Answer(question, 'C', "Mr. Steal Your Girl", false));
  }

  private void saveQuestion831() {
    Question question;

    question = questionRepository.save(new Question(13, "In the fashion world, different color combinations for a single design are known as what?", "2018-03-27 01:58:51"));

    answerRepository.save(new Answer(question, 'A', "Colorways", true));
    answerRepository.save(new Answer(question, 'B', "Flashschemes", false));
    answerRepository.save(new Answer(question, 'C', "Gridstuffs", false));
  }

  private void saveQuestion832() {
    Question question;

    question = questionRepository.save(new Question(14, "What is the largest animal ever known to have lived?", "2018-03-27 01:59:46"));

    answerRepository.save(new Answer(question, 'A', "Blue whale", true));
    answerRepository.save(new Answer(question, 'B', "Woolly mammoth", false));
    answerRepository.save(new Answer(question, 'C', "Apatosaurus", false));
  }

  private void saveQuestion833() {
    Question question;

    question = questionRepository.save(new Question(15, "By volume, the air we breathe is mostly made up of what element?", "2018-03-27 02:00:47"));

    answerRepository.save(new Answer(question, 'A', "Nitrogen", true));
    answerRepository.save(new Answer(question, 'B', "Oxygen", false));
    answerRepository.save(new Answer(question, 'C', "Carbon dioxide", false));
  }

  private void saveQuestion834() {
    Question question;

    question = questionRepository.save(new Question(16, "Before inventing Nike's air soles, where did the creator work?", "2018-03-27 02:01:28"));

    answerRepository.save(new Answer(question, 'A', "NASA", true));
    answerRepository.save(new Answer(question, 'B', "Porsche", false));
    answerRepository.save(new Answer(question, 'C', "Levi's", false));
  }

  private void saveQuestion835() {
    Question question;

    question = questionRepository.save(new Question(17, "What day is Mexico's equivalent to July 4th in the U.S.?", "2018-03-27 02:02:12"));

    answerRepository.save(new Answer(question, 'A', "May 5", false));
    answerRepository.save(new Answer(question, 'B', "March 5", false));
    answerRepository.save(new Answer(question, 'C', "September 16", true));
  }

  private void saveQuestion836() {
    Question question;

    question = questionRepository.save(new Question(18, "For high-end sneakers, which of these acronyms describes shoes that are usually easiest to get?", "2018-03-27 02:03:20"));

    answerRepository.save(new Answer(question, 'A', "HTM", false));
    answerRepository.save(new Answer(question, 'B', "GS", true));
    answerRepository.save(new Answer(question, 'C', "PE", false));
  }

  private void saveQuestion837() {
    Question question;

    question = questionRepository.save(new Question(19, "Which of these was NOT one of the canonical seven wonders of the ancient world?", "2018-03-27 02:04:04"));

    answerRepository.save(new Answer(question, 'A', "Lighthouse", false));
    answerRepository.save(new Answer(question, 'B', "Mausoleum", false));
    answerRepository.save(new Answer(question, 'C', "Library", true));
  }

  private void saveQuestion838() {
    Question question;

    question = questionRepository.save(new Question(20, "The first Bo Jackson Nike TV ad featured the musical act famous for recording what song?", "2018-03-27 02:04:55"));

    answerRepository.save(new Answer(question, 'A', "Revolution", false));
    answerRepository.save(new Answer(question, 'B', "Hustlin’", false));
    answerRepository.save(new Answer(question, 'C', "I’m a Man", true));
  }

  private void saveQuestion839() {
    Question question;

    question = questionRepository.save(new Question(21, "Which of these actors has NOT played a person forced to live inside a bubble?", "2018-03-27 02:05:47"));

    answerRepository.save(new Answer(question, 'A', "Jake Gyllenhaal", false));
    answerRepository.save(new Answer(question, 'B', "John Travolta", false));
    answerRepository.save(new Answer(question, 'C', "Jason Alexander", true));
  }

  private void saveQuestion840() {
    Question question;

    question = questionRepository.save(new Question(22, "Which of these toys debuted in stores during JFK’s presidency?", "2018-03-27 02:06:36"));

    answerRepository.save(new Answer(question, 'A', "RC helicopter", false));
    answerRepository.save(new Answer(question, 'B', "G.I. Joe", false));
    answerRepository.save(new Answer(question, 'C', "Slip ’N Slide", true));
  }

  private void saveQuestion841() {
    Question question;

    question = questionRepository.save(new Question(23, "Which athlete deliberately incorporated soccer shoe concepts into their own sneaker design?", "2018-03-27 02:07:33"));

    answerRepository.save(new Answer(question, 'A', "Kobe Bryant", true));
    answerRepository.save(new Answer(question, 'B', "Ser… https://t.co/Mpo5FuOkZT", false));
  }

  private void saveQuestion842() {
    Question question;

    question = questionRepository.save(new Question(24, "Though their designs are similar, which of these countries’ flags has the most colors?", "2018-03-27 02:08:24"));

    answerRepository.save(new Answer(question, 'A', "Laos", true));
    answerRepository.save(new Answer(question, 'B', "Palau", false));
    answerRepository.save(new Answer(question, 'C', "Bangladesh", false));
  }

  private void saveQuestion843() {
    Question question;

    question = questionRepository.save(new Question(25, "Which of these duos consists of two people NOT born in the same year?", "2018-03-27 02:09:27"));

    answerRepository.save(new Answer(question, 'A', "Simon &amp; Garfunkel", false));
    answerRepository.save(new Answer(question, 'B', "OutKast", false));
    answerRepository.save(new Answer(question, 'C', "The White Stripes", true));
  }

  private void saveQuestion844() {
    Question question;

    question = questionRepository.save(new Question(26, "Which of these nations’ capital cities is located at the highest altitude?", "2018-03-27 02:11:00"));

    answerRepository.save(new Answer(question, 'A', "Ethiopia", true));
    answerRepository.save(new Answer(question, 'B', "Kenya", false));
    answerRepository.save(new Answer(question, 'C', "Chile", false));
  }

  private void saveQuestion845() {
    Question question;

    question = questionRepository.save(new Question(1, "Firefighters often have which of these things attached to their trucks?", "2018-03-27 19:04:43"));

    answerRepository.save(new Answer(question, 'A', "LinkedIn profile", false));
    answerRepository.save(new Answer(question, 'B', "PDFs", false));
    answerRepository.save(new Answer(question, 'C', "Hose", true));
  }

  private void saveQuestion846() {
    Question question;

    question = questionRepository.save(new Question(2, "The letters in the federal agency IRS stand for what?", "2018-03-27 19:05:16"));

    answerRepository.save(new Answer(question, 'A', "Infinitely Rude Staff", false));
    answerRepository.save(new Answer(question, 'B', "Internal Revenue Service", true));
    answerRepository.save(new Answer(question, 'C', "Incredibly Rare Sneakers", false));
  }

  private void saveQuestion847() {
    Question question;

    question = questionRepository.save(new Question(3, "In which country do people typically answer the phone by saying “Pronto”?", "2018-03-27 19:05:50"));

    answerRepository.save(new Answer(question, 'A', "China", false));
    answerRepository.save(new Answer(question, 'B', "Canada", false));
    answerRepository.save(new Answer(question, 'C', "Italy", true));
  }

  private void saveQuestion848() {
    Question question;

    question = questionRepository.save(new Question(4, "Legal work done without charging a fee is known as what?", "2018-03-27 19:06:30"));

    answerRepository.save(new Answer(question, 'A', "Habeas corpus", false));
    answerRepository.save(new Answer(question, 'B', "Affidavit", false));
    answerRepository.save(new Answer(question, 'C', "Pro bono", true));
  }

  private void saveQuestion849() {
    Question question;

    question = questionRepository.save(new Question(5, "What is the main symptom of the genetic condition known as heterochromia?", "2018-03-27 19:07:15"));

    answerRepository.save(new Answer(question, 'A', "Ambidextrousness", false));
    answerRepository.save(new Answer(question, 'B', "Really long toes", false));
    answerRepository.save(new Answer(question, 'C', "", false));
  }

  private void saveQuestion850() {
    Question question;

    question = questionRepository.save(new Question(6, "What did now-defunct teen magazine YM stand for?", "2018-03-27 19:07:53"));

    answerRepository.save(new Answer(question, 'A', "Your Magazine", false));
    answerRepository.save(new Answer(question, 'B', "Young Miss", true));
    answerRepository.save(new Answer(question, 'C', "Yes Mademoiselle", false));
  }

  private void saveQuestion851() {
    Question question;

    question = questionRepository.save(new Question(7, "“Tales from the Crypt” was originally on the same U.S. network as which show?", "2018-03-27 19:08:33"));

    answerRepository.save(new Answer(question, 'A', "Full House", false));
    answerRepository.save(new Answer(question, 'B', "Fraggle Rock", true));
    answerRepository.save(new Answer(question, 'C', "Animaniacs", false));
  }

  private void saveQuestion852() {
    Question question;

    question = questionRepository.save(new Question(8, "In the Catholic Church, which of these is considered the most powerful?", "2018-03-27 19:09:09"));

    answerRepository.save(new Answer(question, 'A', "Vicar general", false));
    answerRepository.save(new Answer(question, 'B', "Archbishop", true));
    answerRepository.save(new Answer(question, 'C', "Archdeacon", false));
  }

  private void saveQuestion853() {
    Question question;

    question = questionRepository.save(new Question(9, "What is the last spoken line in Samuel Beckett’s “Waiting for Godot”?", "2018-03-27 19:09:51"));

    answerRepository.save(new Answer(question, 'A', "Yes, let’s go.", true));
    answerRepository.save(new Answer(question, 'B', "Let's wait some more.", false));
    answerRepository.save(new Answer(question, 'C', "Is he coming?", false));
  }

  private void saveQuestion854() {
    Question question;

    question = questionRepository.save(new Question(10, "Which of these men has been knighted by the Queen of England?", "2018-03-27 19:10:32"));

    answerRepository.save(new Answer(question, 'A', "Keith Richards", false));
    answerRepository.save(new Answer(question, 'B', "Hugh Grant", false));
    answerRepository.save(new Answer(question, 'C', "Rudy Giuliani", true));
  }

  private void saveQuestion855() {
    Question question;

    question = questionRepository.save(new Question(11, "Which of these Canadian territories stretches farthest north?", "2018-03-27 19:11:29"));

    answerRepository.save(new Answer(question, 'A', "Nunavut", true));
    answerRepository.save(new Answer(question, 'B', "Northwest Territories", false));
    answerRepository.save(new Answer(question, 'C', "Yukon", false));
  }

  private void saveQuestion856() {
    Question question;

    question = questionRepository.save(new Question(12, "Which of these hit rock songs did NOT appear on a debut album?", "2018-03-27 19:12:40"));

    answerRepository.save(new Answer(question, 'A', "Last Nite", false));
    answerRepository.save(new Answer(question, 'B', "Buddy Holly", false));
    answerRepository.save(new Answer(question, 'C', "Wonderwall", true));
  }

  private void saveQuestion857() {
    Question question;

    question = questionRepository.save(new Question(1, "Street art that involves spraying paint on walls is known as what?", "2018-03-28 01:05:03"));

    answerRepository.save(new Answer(question, 'A', "Peter Griffin", false));
    answerRepository.save(new Answer(question, 'B', "Giraffe", false));
    answerRepository.save(new Answer(question, 'C', "Graffiti", true));
  }

  private void saveQuestion858() {
    Question question;

    question = questionRepository.save(new Question(2, "In book publishing, a novel with a soft cover is typically called what?", "2018-03-28 01:05:36"));

    answerRepository.save(new Answer(question, 'A', "Paperback", true));
    answerRepository.save(new Answer(question, 'B', "Pillow", false));
    answerRepository.save(new Answer(question, 'C', "Wimpy", false));
  }

  private void saveQuestion859() {
    Question question;

    question = questionRepository.save(new Question(3, "In arithmetic, how is a number squared?", "2018-03-28 01:06:40"));

    answerRepository.save(new Answer(question, 'A', "Added to its reciprocal", false));
    answerRepository.save(new Answer(question, 'B', "Multiplied by itself", true));
    answerRepository.save(new Answer(question, 'C', "Divided by antecedent", false));
  }

  private void saveQuestion860() {
    Question question;

    question = questionRepository.save(new Question(4, "The flight recorder known as the airplane “black box” is typically what color?", "2018-03-28 01:07:21"));

    answerRepository.save(new Answer(question, 'A', "Green", false));
    answerRepository.save(new Answer(question, 'B', "Black", false));
    answerRepository.save(new Answer(question, 'C', "Orange", true));
  }

  private void saveQuestion861() {
    Question question;

    question = questionRepository.save(new Question(5, "Which of these U.S. national parks is home to a supervolcano?", "2018-03-28 01:08:06"));

    answerRepository.save(new Answer(question, 'A', "Yosemite", false));
    answerRepository.save(new Answer(question, 'B', "Zion", false));
    answerRepository.save(new Answer(question, 'C', "Yellowstone", true));
  }

  private void saveQuestion862() {
    Question question;

    question = questionRepository.save(new Question(6, "The wigs worn by barristers in English courts are usually made with which kind of hair?", "2018-03-28 01:08:50"));

    answerRepository.save(new Answer(question, 'A', "Equine", true));
    answerRepository.save(new Answer(question, 'B', "Synthetic", false));
    answerRepository.save(new Answer(question, 'C', "Hominine", false));
  }

  private void saveQuestion863() {
    Question question;

    question = questionRepository.save(new Question(7, "In AOL Instant Messenger, what default sound played when friends appeared online?", "2018-03-28 01:09:33"));

    answerRepository.save(new Answer(question, 'A', "Door opening", true));
    answerRepository.save(new Answer(question, 'B', "Car horn", false));
    answerRepository.save(new Answer(question, 'C', "Bicycle bell", false));
  }

  private void saveQuestion864() {
    Question question;

    question = questionRepository.save(new Question(8, "Which of these Broadway productions ran for the most shows?", "2018-03-28 01:10:19"));

    answerRepository.save(new Answer(question, 'A', "Cats", false));
    answerRepository.save(new Answer(question, 'B', "Les Misérables", false));
    answerRepository.save(new Answer(question, 'C', "Chicago", true));
  }

  private void saveQuestion865() {
    Question question;

    question = questionRepository.save(new Question(9, "In cooking, what do chefs set up before they make a meal?", "2018-03-28 01:11:06"));

    answerRepository.save(new Answer(question, 'A', "Mise-en-chine", false));
    answerRepository.save(new Answer(question, 'B', "Mise-en-scène", false));
    answerRepository.save(new Answer(question, 'C', "Mise-en-place", true));
  }

  private void saveQuestion866() {
    Question question;

    question = questionRepository.save(new Question(10, "A famous 1945 short story is written from the point of view of which novel’s protagonist?", "2018-03-28 01:11:48"));

    answerRepository.save(new Answer(question, 'A', "The Grapes of Wrath", false));
    answerRepository.save(new Answer(question, 'B', "", false));
  }

  private void saveQuestion867() {
    Question question;

    question = questionRepository.save(new Question(11, "According to ancient lore, what, if obtained, would bring good luck to wedding guests?", "2018-03-28 01:12:28"));

    answerRepository.save(new Answer(question, 'A', "Something blue", false));
    answerRepository.save(new Answer(question, 'B', "Pieces… https://t.co/EQr9dViFzc", false));
  }

  private void saveQuestion868() {
    Question question;

    question = questionRepository.save(new Question(12, "Which of these celebrities owns an island near the location of the doomed Fyre Festival?", "2018-03-28 01:13:54"));

    answerRepository.save(new Answer(question, 'A', "Ja Rule", false));
    answerRepository.save(new Answer(question, 'B', "Steve Martin", false));
    answerRepository.save(new Answer(question, 'C', "Tyler Perry", true));
  }

  private void saveQuestion869() {
    Question question;

    question = questionRepository.save(new Question(1, "What is the main ingredient in ketchup?", "2018-03-28 19:04:26"));

    answerRepository.save(new Answer(question, 'A', "Atlantic cod", false));
    answerRepository.save(new Answer(question, 'B', "Melted copper", false));
    answerRepository.save(new Answer(question, 'C', "Tomatoes", true));
  }

  private void saveQuestion870() {
    Question question;

    question = questionRepository.save(new Question(2, "In an old expression, “what’s good for the goose” is also good for the what?", "2018-03-28 19:05:22"));

    answerRepository.save(new Answer(question, 'A', "Gander", true));
    answerRepository.save(new Answer(question, 'B', "People of Wakanda", false));
    answerRepository.save(new Answer(question, 'C', "Goose's social media", false));
  }

  private void saveQuestion871() {
    Question question;

    question = questionRepository.save(new Question(3, "By definition, a myopic person is considered what?", "2018-03-28 19:06:14"));

    answerRepository.save(new Answer(question, 'A', "Mopey", false));
    answerRepository.save(new Answer(question, 'B', "Nearsighted", true));
    answerRepository.save(new Answer(question, 'C', "Photographer", false));
  }

  private void saveQuestion872() {
    Question question;

    question = questionRepository.save(new Question(4, "Which of these is the name of a piece of furniture AND a vast historical empire?", "2018-03-28 19:06:37"));

    answerRepository.save(new Answer(question, 'A', "Ottoman", true));
    answerRepository.save(new Answer(question, 'B', "Credenza", false));
    answerRepository.save(new Answer(question, 'C', "Macedonian", false));
  }

  private void saveQuestion873() {
    Question question;

    question = questionRepository.save(new Question(5, "Which of these is the correct spelling of 1,000 years?", "2018-03-28 19:07:11"));

    answerRepository.save(new Answer(question, 'A', "Millenium", false));
    answerRepository.save(new Answer(question, 'B', "Millennium", true));
    answerRepository.save(new Answer(question, 'C', "Milennium", false));
  }

  private void saveQuestion874() {
    Question question;

    question = questionRepository.save(new Question(6, "Which of these is NOT one of the two measurements in a blood pressure reading?", "2018-03-28 19:07:55"));

    answerRepository.save(new Answer(question, 'A', "Diastolic", false));
    answerRepository.save(new Answer(question, 'B', "Hemostatic", true));
    answerRepository.save(new Answer(question, 'C', "Systolic", false));
  }

  private void saveQuestion875() {
    Question question;

    question = questionRepository.save(new Question(7, "On AFI’s list of greatest film heroes and villains, who played a character listed as both?", "2018-03-28 19:08:37"));

    answerRepository.save(new Answer(question, 'A', "Anthony Hopkins", false));
    answerRepository.save(new Answer(question, 'B', "Ar… https://t.co/dBfh9Y9LKm", false));
  }

  private void saveQuestion876() {
    Question question;

    question = questionRepository.save(new Question(8, "Who was the first woman to serve as a Supreme Court justice?", "2018-03-28 19:09:26"));

    answerRepository.save(new Answer(question, 'A', "Sandra Day O’Connor", true));
    answerRepository.save(new Answer(question, 'B', "Madeleine Albright", false));
    answerRepository.save(new Answer(question, 'C', "Ruth Bader Ginsburg", false));
  }

  private void saveQuestion877() {
    Question question;

    question = questionRepository.save(new Question(9, "Which is the title of an actual video game in the Grand Theft Auto series?", "2018-03-28 19:10:07"));

    answerRepository.save(new Answer(question, 'A', "Beggar’s Bargain", false));
    answerRepository.save(new Answer(question, 'B', "Chinatown Wars", true));
    answerRepository.save(new Answer(question, 'C', "Desperation Row", false));
  }

  private void saveQuestion878() {
    Question question;

    question = questionRepository.save(new Question(10, "In which of these places does the capital city NOT contain the name of the country?", "2018-03-28 19:10:53"));

    answerRepository.save(new Answer(question, 'A', "Kuwait", false));
    answerRepository.save(new Answer(question, 'B', "Barbados", true));
    answerRepository.save(new Answer(question, 'C', "Guatemala", false));
  }

  private void saveQuestion879() {
    Question question;

    question = questionRepository.save(new Question(11, "The SNL cast member with the autobiography called “It’s Always Something” played what character?", "2018-03-28 19:11:39"));

    answerRepository.save(new Answer(question, 'A', "Emily Litella… https://t.co/yz4SSCDpT9", true));
  }

  private void saveQuestion880() {
    Question question;

    question = questionRepository.save(new Question(12, "When the U.N. declared 2016 “The International Year of Pulses,” it was to promote awareness of what?", "2018-03-28 19:12:51"));

    answerRepository.save(new Answer(question, 'A', "Legumes", true));
    answerRepository.save(new Answer(question, 'B', "", false));
  }

  private void saveQuestion881() {
    Question question;

    question = questionRepository.save(new Question(1, "What festive term also describes a hidden feature in a video game?", "2018-03-29 01:11:45"));

    answerRepository.save(new Answer(question, 'A', "Easter egg", true));
    answerRepository.save(new Answer(question, 'B', "Halloween candy bucket", false));
    answerRepository.save(new Answer(question, 'C', "Christmas sweater vest", false));
  }

  private void saveQuestion882() {
    Question question;

    question = questionRepository.save(new Question(2, "In the Spielberg film “E.T.”, what does E.T. stand for?", "2018-03-29 01:12:22"));

    answerRepository.save(new Answer(question, 'A', "Extra Terrestrial", true));
    answerRepository.save(new Answer(question, 'B', "Enchilada Thief", false));
    answerRepository.save(new Answer(question, 'C', "Earl Torgeson", false));
  }

  private void saveQuestion883() {
    Question question;

    question = questionRepository.save(new Question(3, "What classic ’80s TV character was an alien from the planet Melmac?", "2018-03-29 01:13:08"));

    answerRepository.save(new Answer(question, 'A', "ALF", true));
    answerRepository.save(new Answer(question, 'B', "Alex P. Keaton", false));
    answerRepository.save(new Answer(question, 'C', "MacGyver", false));
  }

  private void saveQuestion884() {
    Question question;

    question = questionRepository.save(new Question(4, "Which of these is NOT an example of a redundant acronym?", "2018-03-29 01:13:47"));

    answerRepository.save(new Answer(question, 'A', "PIN number", false));
    answerRepository.save(new Answer(question, 'B', "ATM machine", false));
    answerRepository.save(new Answer(question, 'C', "PEZ dispenser", true));
  }

  private void saveQuestion885() {
    Question question;

    question = questionRepository.save(new Question(5, "Which of these stars famously performed at the Berlin Wall before it began to fall?", "2018-03-29 01:14:56"));

    answerRepository.save(new Answer(question, 'A', "Bruce Springsteen", true));
    answerRepository.save(new Answer(question, 'B', "David… https://t.co/50OLkcz5Lj", false));
  }

  private void saveQuestion886() {
    Question question;

    question = questionRepository.save(new Question(6, "In the Eurythmics’ debut hit video, what color was the lead singer’s hair?", "2018-03-29 01:15:57"));

    answerRepository.save(new Answer(question, 'A', "Orange", true));
    answerRepository.save(new Answer(question, 'B', "Blonde", false));
    answerRepository.save(new Answer(question, 'C', "Pink", false));
  }

  private void saveQuestion887() {
    Question question;

    question = questionRepository.save(new Question(7, "In the book “Ready Player One,” the hero's spacecraft is named after the author of what novel?", "2018-03-29 01:16:47"));

    answerRepository.save(new Answer(question, 'A', "The Shining", false));
    answerRepository.save(new Answer(question, 'B', "A… https://t.co/1oQzG7jbv4", false));
  }

  private void saveQuestion888() {
    Question question;

    question = questionRepository.save(new Question(8, "Closely tied to “perestroika,” what does the Russian word “glasnost” mean?", "2018-03-29 01:17:36"));

    answerRepository.save(new Answer(question, 'A', "Economics", false));
    answerRepository.save(new Answer(question, 'B', "Restructuring", false));
    answerRepository.save(new Answer(question, 'C', "Openness", true));
  }

  private void saveQuestion889() {
    Question question;

    question = questionRepository.save(new Question(9, "Which of these songs does NOT feature an elaborate synthesizer solo?", "2018-03-29 01:18:26"));

    answerRepository.save(new Answer(question, 'A', "“Jump” by Van Halen", false));
    answerRepository.save(new Answer(question, 'B', "“Subdivisions” by Ru… https://t.co/SM6O0U3D7M", false));
  }

  private void saveQuestion890() {
    Question question;

    question = questionRepository.save(new Question(10, "In an early scene in “WarGames,” Matthew Broderick grabs a textbook off of what arcade game?", "2018-03-29 01:19:23"));

    answerRepository.save(new Answer(question, 'A', "Dig Dug", true));
    answerRepository.save(new Answer(question, 'B', "Galaga", false));
    answerRepository.save(new Answer(question, 'C', "Zaxxon", false));
  }

  private void saveQuestion891() {
    Question question;

    question = questionRepository.save(new Question(11, "The founder of which of these startups has more Twitter followers than Mark Zuckerberg?", "2018-03-29 01:20:37"));

    answerRepository.save(new Answer(question, 'A', "Dropbox", false));
    answerRepository.save(new Answer(question, 'B', "WhatsApp", false));
    answerRepository.save(new Answer(question, 'C', "Box", true));
  }

  private void saveQuestion892() {
    Question question;

    question = questionRepository.save(new Question(12, "A crystal egg plays a key role in an ’80s film that had what working title?", "2018-03-29 01:21:29"));

    answerRepository.save(new Answer(question, 'A', "White Boys Off the Lake", true));
    answerRepository.save(new Answer(question, 'B', "A Boy's… https://t.co/9R89UZN7mg", false));
  }

  private void saveQuestion893() {
    Question question;

    question = questionRepository.save(new Question(13, "Which of these nations shares its border with the most countries?", "2018-03-29 01:22:20"));

    answerRepository.save(new Answer(question, 'A', "Austria", true));
    answerRepository.save(new Answer(question, 'B', "Bolivia", false));
    answerRepository.save(new Answer(question, 'C', "Mali", false));
  }

  private void saveQuestion894() {
    Question question;

    question = questionRepository.save(new Question(14, "The creator of the first video game Easter egg shares his name with a lead actor in which film?", "2018-03-29 01:23:22"));

    answerRepository.save(new Answer(question, 'A', "Stand by Me", false));
    answerRepository.save(new Answer(question, 'B', "P… https://t.co/swj0g9XAiR", false));
  }

  private void saveQuestion895() {
    Question question;

    question = questionRepository.save(new Question(15, "In “Dirty Dancing,” what does Patrick Swayze say right after declaring, “Nobody puts baby in a corner”?", "2018-03-29 01:24:38"));

    answerRepository.save(new Answer(question, 'A', "Nobody", false));
    answerRepository.save(new Answer(question, 'B', "Ready?", false));
    answerRepository.save(new Answer(question, 'C', "Come on", true));
  }

  private void saveQuestion896() {
    Question question;

    question = questionRepository.save(new Question(1, "What kind of salad normally contains the most lettuce?", "2018-03-29 19:04:02"));

    answerRepository.save(new Answer(question, 'A', "Potato salad", false));
    answerRepository.save(new Answer(question, 'B', "Fruit salad", false));
    answerRepository.save(new Answer(question, 'C', "Caesar salad", true));
  }

  private void saveQuestion897() {
    Question question;

    question = questionRepository.save(new Question(2, "Militia soldiers in the American Revolutionary War were commonly called what?", "2018-03-29 19:04:34"));

    answerRepository.save(new Answer(question, 'A', "Minutemen", true));
    answerRepository.save(new Answer(question, 'B', "Millenniummen", false));
    answerRepository.save(new Answer(question, 'C', "Monthmen", false));
  }

  private void saveQuestion898() {
    Question question;

    question = questionRepository.save(new Question(3, "In the NCAA Basketball Tournament, the last four teams alive are known as the what?", "2018-03-29 19:05:07"));

    answerRepository.save(new Answer(question, 'A', "Lone Survivors", false));
    answerRepository.save(new Answer(question, 'B', "Grand Slams", false));
    answerRepository.save(new Answer(question, 'C', "Final Four", true));
  }

  private void saveQuestion899() {
    Question question;

    question = questionRepository.save(new Question(4, "What pedal is usually missing from a car with automatic transmission?", "2018-03-29 19:05:45"));

    answerRepository.save(new Answer(question, 'A', "Brake", false));
    answerRepository.save(new Answer(question, 'B', "Gas", false));
    answerRepository.save(new Answer(question, 'C', "Clutch", true));
  }

  private void saveQuestion900() {
    Question question;

    question = questionRepository.save(new Question(5, "Which famous character does NOT grow larger by interacting with a mushroom?", "2018-03-29 19:06:20"));

    answerRepository.save(new Answer(question, 'A', "Alice in Wonderland", false));
    answerRepository.save(new Answer(question, 'B', "Nintendo’s Mario", false));
    answerRepository.save(new Answer(question, 'C', "Thumbelina", true));
  }

  private void saveQuestion901() {
    Question question;

    question = questionRepository.save(new Question(6, "What was “Weird Al” Yankovic’s birth name?", "2018-03-29 19:06:57"));

    answerRepository.save(new Answer(question, 'A', "Albert Yarborough", false));
    answerRepository.save(new Answer(question, 'B', "Alfred Yankovic", true));
    answerRepository.save(new Answer(question, 'C', "Adam Iacopino", false));
  }

  private void saveQuestion902() {
    Question question;

    question = questionRepository.save(new Question(7, "“Betteridge’s Law” is a famous observation about what?", "2018-03-29 19:07:34"));

    answerRepository.save(new Answer(question, 'A', "Headlines", true));
    answerRepository.save(new Answer(question, 'B', "Smartphone size", false));
    answerRepository.save(new Answer(question, 'C', "Cable news ratings", false));
  }

  private void saveQuestion903() {
    Question question;

    question = questionRepository.save(new Question(8, "Who directed the motion picture credited as the first to show a flushing toilet?", "2018-03-29 19:08:16"));

    answerRepository.save(new Answer(question, 'A', "Alfred Hitchcock", true));
    answerRepository.save(new Answer(question, 'B', "Frank Capra", false));
    answerRepository.save(new Answer(question, 'C', "John Waters", false));
  }

  private void saveQuestion904() {
    Question question;

    question = questionRepository.save(new Question(9, "What type of medical treatment gets its name from the Latin for “I shall please”?", "2018-03-29 19:08:54"));

    answerRepository.save(new Answer(question, 'A', "Analgesic", false));
    answerRepository.save(new Answer(question, 'B', "Narcotic", false));
    answerRepository.save(new Answer(question, 'C', "Placebo", true));
  }

  private void saveQuestion905() {
    Question question;

    question = questionRepository.save(new Question(10, "In the heyday of the Mutoscope, where would you have been most likely to find one?", "2018-03-29 19:09:35"));

    answerRepository.save(new Answer(question, 'A', "Horse racetrack", false));
    answerRepository.save(new Answer(question, 'B', "Amusement… https://t.co/u6R3g3c0jV", false));
  }

  private void saveQuestion906() {
    Question question;

    question = questionRepository.save(new Question(11, "What African nation gets its name from the Arabic for “The Islands”?", "2018-03-29 19:10:20"));

    answerRepository.save(new Answer(question, 'A', "Madagascar", false));
    answerRepository.save(new Answer(question, 'B', "Algeria", true));
    answerRepository.save(new Answer(question, 'C', "Comoros", false));
  }

  private void saveQuestion907() {
    Question question;

    question = questionRepository.save(new Question(12, "Which of these is NOT a kind of apple?", "2018-03-29 19:12:00"));

    answerRepository.save(new Answer(question, 'A', "Dog’s Snout", false));
    answerRepository.save(new Answer(question, 'B', "Bloody Ploughman", false));
    answerRepository.save(new Answer(question, 'C', "Everett's Knave", true));
  }

  private void saveQuestion908() {
    Question question;

    question = questionRepository.save(new Question(1, "According to the old song “Row, Row, Row Your Boat,” life is but a what?", "2018-03-30 01:04:08"));

    answerRepository.save(new Answer(question, 'A', "Dream", true));
    answerRepository.save(new Answer(question, 'B', "Massive phoenix tattoo", false));
    answerRepository.save(new Answer(question, 'C', "Bitcoin scam", false));
  }

  private void saveQuestion909() {
    Question question;

    question = questionRepository.save(new Question(2, "By definition, a person who cuts hair is often referred to as what?", "2018-03-30 01:04:40"));

    answerRepository.save(new Answer(question, 'A', "Birder", false));
    answerRepository.save(new Answer(question, 'B', "Bugbear", false));
    answerRepository.save(new Answer(question, 'C', "Barber", true));
  }

  private void saveQuestion910() {
    Question question;

    question = questionRepository.save(new Question(3, "Which of these music genres peaked in popularity during the 1970s?", "2018-03-30 01:05:20"));

    answerRepository.save(new Answer(question, 'A', "Doo-wop", false));
    answerRepository.save(new Answer(question, 'B', "Disco", true));
    answerRepository.save(new Answer(question, 'C', "Rap", false));
  }

  private void saveQuestion911() {
    Question question;

    question = questionRepository.save(new Question(4, "Which of these animals provides a key ingredient in traditional mayonnaise?", "2018-03-30 01:05:52"));

    answerRepository.save(new Answer(question, 'A', "Sheep", false));
    answerRepository.save(new Answer(question, 'B', "Chicken", true));
    answerRepository.save(new Answer(question, 'C', "Cow", false));
  }

  private void saveQuestion912() {
    Question question;

    question = questionRepository.save(new Question(5, "In professional wrestling, bad guys are called “heels” and good guys are known as what?", "2018-03-30 01:06:31"));

    answerRepository.save(new Answer(question, 'A', "Hands", false));
    answerRepository.save(new Answer(question, 'B', "Faces", true));
    answerRepository.save(new Answer(question, 'C', "Torsos", false));
  }

  private void saveQuestion913() {
    Question question;

    question = questionRepository.save(new Question(6, "Which of these cat breeds gets its name from an island in Asia?", "2018-03-30 01:07:17"));

    answerRepository.save(new Answer(question, 'A', "Balinese", true));
    answerRepository.save(new Answer(question, 'B', "Persian", false));
    answerRepository.save(new Answer(question, 'C', "Siamese", false));
  }

  private void saveQuestion914() {
    Question question;

    question = questionRepository.save(new Question(7, "Who made the gaming console that indicated a breakdown with the “red ring of death?”`", "2018-03-30 01:08:09"));

    answerRepository.save(new Answer(question, 'A', "Sony", false));
    answerRepository.save(new Answer(question, 'B', "Nintendo", false));
    answerRepository.save(new Answer(question, 'C', "Microsoft", true));
  }

  private void saveQuestion915() {
    Question question;

    question = questionRepository.save(new Question(8, "The director of “Mad Max: Fury Road” also directed which of these movies?", "2018-03-30 01:08:42"));

    answerRepository.save(new Answer(question, 'A', "Borat", false));
    answerRepository.save(new Answer(question, 'B', "Live Free or Die Hard", false));
    answerRepository.save(new Answer(question, 'C', "Babe: Pig in the City", true));
  }

  private void saveQuestion916() {
    Question question;

    question = questionRepository.save(new Question(9, "Which of these people is NOT an inductee into the Internet Hall of Fame?", "2018-03-30 01:09:23"));

    answerRepository.save(new Answer(question, 'A', "Tim Berners-Lee", false));
    answerRepository.save(new Answer(question, 'B', "Al Gore", false));
    answerRepository.save(new Answer(question, 'C', "Steve Jobs", true));
  }

  private void saveQuestion917() {
    Question question;

    question = questionRepository.save(new Question(10, "The U.S. founding father famous for his experiments with electricity was born in what city?", "2018-03-30 01:10:26"));

    answerRepository.save(new Answer(question, 'A', "London", false));
    answerRepository.save(new Answer(question, 'B', "Boston", true));
    answerRepository.save(new Answer(question, 'C', "Philadelphia", false));
  }

  private void saveQuestion918() {
    Question question;

    question = questionRepository.save(new Question(11, "According to Guinness World Records, the hit single containing the most words was recorded by what artist?", "2018-03-30 01:11:07"));

    answerRepository.save(new Answer(question, 'A', "Emine… https://t.co/RGGxjl8tJH", false));
  }

  private void saveQuestion919() {
    Question question;

    question = questionRepository.save(new Question(12, "The Smart Car started as a collaboration between a car company and what?", "2018-03-30 01:12:30"));

    answerRepository.save(new Answer(question, 'A', "Watchmaker", true));
    answerRepository.save(new Answer(question, 'B', "Website", false));
    answerRepository.save(new Answer(question, 'C', "Travel guide", false));
  }

  private void saveQuestion920() {
    Question question;

    question = questionRepository.save(new Question(1, "The Cy Young Award is given each year to Major League Baseball's best what?", "2018-03-30 19:07:08"));

    answerRepository.save(new Answer(question, 'A', "Mascots", false));
    answerRepository.save(new Answer(question, 'B', "Fans", false));
    answerRepository.save(new Answer(question, 'C', "Pitchers", true));
  }

  private void saveQuestion921() {
    Question question;

    question = questionRepository.save(new Question(2, "When it comes to mail, what does the Z in “ZIP Code” stand for?", "2018-03-30 19:07:52"));

    answerRepository.save(new Answer(question, 'A', "Zoom", false));
    answerRepository.save(new Answer(question, 'B', "Zero", false));
    answerRepository.save(new Answer(question, 'C', "Zone", true));
  }

  private void saveQuestion922() {
    Question question;

    question = questionRepository.save(new Question(3, "Which of these phrases is slang for a bad thing?", "2018-03-30 19:08:36"));

    answerRepository.save(new Answer(question, 'A', "Dog’s breakfast", true));
    answerRepository.save(new Answer(question, 'B', "Bee's knees", false));
    answerRepository.save(new Answer(question, 'C', "Cat's pajamas", false));
  }

  private void saveQuestion923() {
    Question question;

    question = questionRepository.save(new Question(4, "Thanks to the time it took to make, what movie was almost called “12 Years”?", "2018-03-30 19:09:14"));

    answerRepository.save(new Answer(question, 'A', "Boyhood", true));
    answerRepository.save(new Answer(question, 'B', "The LEGO Movie", false));
    answerRepository.save(new Answer(question, 'C', "Castaway", false));
  }

  private void saveQuestion924() {
    Question question;

    question = questionRepository.save(new Question(5, "The Latin phrase “tempus fugit” literally translates to what?", "2018-03-30 19:10:00"));

    answerRepository.save(new Answer(question, 'A', "Buyer beware", false));
    answerRepository.save(new Answer(question, 'B', "Come together", false));
    answerRepository.save(new Answer(question, 'C', "Time flies", true));
  }

  private void saveQuestion925() {
    Question question;

    question = questionRepository.save(new Question(6, "Which U.S. president’s middle name is Gamaliel?", "2018-03-30 19:10:32"));

    answerRepository.save(new Answer(question, 'A', "Warren Harding", true));
    answerRepository.save(new Answer(question, 'B', "James Polk", false));
    answerRepository.save(new Answer(question, 'C', "Rutherford Hayes", false));
  }

  private void saveQuestion926() {
    Question question;

    question = questionRepository.save(new Question(7, "Sleeping through winter is hibernation, but sleeping through summer is called what?", "2018-03-30 19:11:16"));

    answerRepository.save(new Answer(question, 'A', "Transolation", false));
    answerRepository.save(new Answer(question, 'B', "Estivation", true));
    answerRepository.save(new Answer(question, 'C', "Decarburization", false));
  }

  private void saveQuestion927() {
    Question question;

    question = questionRepository.save(new Question(8, "Which of these states borders the Hawkeye State?", "2018-03-30 19:12:02"));

    answerRepository.save(new Answer(question, 'A', "The Volunteer State", false));
    answerRepository.save(new Answer(question, 'B', "The Peace Garden State", false));
    answerRepository.save(new Answer(question, 'C', "The Show Me State", true));
  }

  private void saveQuestion928() {
    Question question;

    question = questionRepository.save(new Question(9, "What dog breed was named for a region in Germany and Poland?", "2018-03-30 19:12:42"));

    answerRepository.save(new Answer(question, 'A', "Pomeranian", true));
    answerRepository.save(new Answer(question, 'B', "Doberman Pinscher", false));
    answerRepository.save(new Answer(question, 'C', "Poodle", false));
  }

  private void saveQuestion929() {
    Question question;

    question = questionRepository.save(new Question(10, "Adam Sandler did NOT receive a Kids Choice Award for his work in which movie?", "2018-03-30 19:14:02"));

    answerRepository.save(new Answer(question, 'A', "Mr. Deeds", false));
    answerRepository.save(new Answer(question, 'B', "Grown Ups 2", false));
    answerRepository.save(new Answer(question, 'C', "Happy Gilmore", true));
  }

  private void saveQuestion930() {
    Question question;

    question = questionRepository.save(new Question(1, "TGIF most commonly stands for “Thank God It’s” what?", "2018-03-31 01:03:57"));

    answerRepository.save(new Answer(question, 'A', "Friday", true));
    answerRepository.save(new Answer(question, 'B', "Frankenstein", false));
    answerRepository.save(new Answer(question, 'C', "Flavortown", false));
  }

  private void saveQuestion931() {
    Question question;

    question = questionRepository.save(new Question(2, "In which of these places were rulers known as pharaohs?", "2018-03-31 01:04:31"));

    answerRepository.save(new Answer(question, 'A', "Ancient Egypt", true));
    answerRepository.save(new Answer(question, 'B', "Medieval Japan", false));
    answerRepository.save(new Answer(question, 'C', "Studio54", false));
  }

  private void saveQuestion932() {
    Question question;

    question = questionRepository.save(new Question(3, "In astronomical terms, what is the opposite of a full moon?", "2018-03-31 01:05:29"));

    answerRepository.save(new Answer(question, 'A', "Fresh moon", false));
    answerRepository.save(new Answer(question, 'B', "New moon", true));
    answerRepository.save(new Answer(question, 'C', "Hungry moon", false));
  }

  private void saveQuestion933() {
    Question question;

    question = questionRepository.save(new Question(4, "In which of these sports can a player NOT get a strike?", "2018-03-31 01:06:04"));

    answerRepository.save(new Answer(question, 'A', "Bowling", false));
    answerRepository.save(new Answer(question, 'B', "Baseball", false));
    answerRepository.save(new Answer(question, 'C', "Basketball", true));
  }

  private void saveQuestion934() {
    Question question;

    question = questionRepository.save(new Question(5, "Which of these U.S. states is known for its panhandle?", "2018-03-31 01:06:37"));

    answerRepository.save(new Answer(question, 'A', "Florida", true));
    answerRepository.save(new Answer(question, 'B', "Iowa", false));
    answerRepository.save(new Answer(question, 'C', "Montana", false));
  }

  private void saveQuestion935() {
    Question question;

    question = questionRepository.save(new Question(6, "What is the name of the scientific process that turns sugars into alcohol?", "2018-03-31 01:07:14"));

    answerRepository.save(new Answer(question, 'A', "Fermentation", true));
    answerRepository.save(new Answer(question, 'B', "Photosynthesis", false));
    answerRepository.save(new Answer(question, 'C', "Mutation", false));
  }

  private void saveQuestion936() {
    Question question;

    question = questionRepository.save(new Question(7, "Which of these is both a city in Morocco AND a common style of hat?", "2018-03-31 01:07:52"));

    answerRepository.save(new Answer(question, 'A', "Kangol", false));
    answerRepository.save(new Answer(question, 'B', "Fez", true));
    answerRepository.save(new Answer(question, 'C', "Tangier", false));
  }

  private void saveQuestion937() {
    Question question;

    question = questionRepository.save(new Question(8, "The guitarist in the E Street Band starred in which television show?", "2018-03-31 01:08:32"));

    answerRepository.save(new Answer(question, 'A', "The Sopranos", true));
    answerRepository.save(new Answer(question, 'B', "The Practice", false));
    answerRepository.save(new Answer(question, 'C', "Rescue Me", false));
  }

  private void saveQuestion938() {
    Question question;

    question = questionRepository.save(new Question(9, "In the U.S., which of these job uniforms is illegal to wear if you do not have that job?", "2018-03-31 01:09:13"));

    answerRepository.save(new Answer(question, 'A', "Surgeon", false));
    answerRepository.save(new Answer(question, 'B', "Postal worker", true));
    answerRepository.save(new Answer(question, 'C', "Airline pilot", false));
  }

  private void saveQuestion939() {
    Question question;

    question = questionRepository.save(new Question(10, "In 18th-century London, people mocked the first public user of which of these accessories?", "2018-03-31 01:09:51"));

    answerRepository.save(new Answer(question, 'A', "Sunglasses", false));
    answerRepository.save(new Answer(question, 'B', "Umbrella", true));
    answerRepository.save(new Answer(question, 'C', "Purse", false));
  }

  private void saveQuestion940() {
    Question question;

    question = questionRepository.save(new Question(11, "The co-creator of the first baby monitor was recruited after his design of what?", "2018-03-31 01:10:38"));

    answerRepository.save(new Answer(question, 'A', "Portable radio", false));
    answerRepository.save(new Answer(question, 'B', "Crib", false));
    answerRepository.save(new Answer(question, 'C', "Coffee table", true));
  }

  private void saveQuestion941() {
    Question question;

    question = questionRepository.save(new Question(12, "Painter Margaret Keane’s work directly inspired which cartoon series?", "2018-03-31 01:12:08"));

    answerRepository.save(new Answer(question, 'A', "Jem and the Holograms", false));
    answerRepository.save(new Answer(question, 'B', "The Powerpuff Girls", true));
    answerRepository.save(new Answer(question, 'C', "My Little Pony", false));
  }

  private void saveQuestion942() {
    Question question;

    question = questionRepository.save(new Question(1, "On Broadway, a “triple threat” is a person who sings, dances and what?", "2018-04-01 01:06:09"));

    answerRepository.save(new Answer(question, 'A', "Acts", true));
    answerRepository.save(new Answer(question, 'B', "Bakes cakes", false));
    answerRepository.save(new Answer(question, 'C', "Trains dogs", false));
  }

  private void saveQuestion943() {
    Question question;

    question = questionRepository.save(new Question(2, "Abraham Lincoln is known for wearing what kind of headgear?", "2018-04-01 01:06:38"));

    answerRepository.save(new Answer(question, 'A', "Propeller cap", false));
    answerRepository.save(new Answer(question, 'B', "Stovepipe hat", true));
    answerRepository.save(new Answer(question, 'C', "Supreme beanie", false));
  }

  private void saveQuestion944() {
    Question question;

    question = questionRepository.save(new Question(3, "Which of these foods is NOT a type of onion?", "2018-04-01 01:07:31"));

    answerRepository.save(new Answer(question, 'A', "Scallion", false));
    answerRepository.save(new Answer(question, 'B', "Shallot", false));
    answerRepository.save(new Answer(question, 'C', "Scallop", true));
  }

  private void saveQuestion945() {
    Question question;

    question = questionRepository.save(new Question(4, "Which of these jobs requires a training and testing period that takes about 34 months?", "2018-04-01 01:09:10"));

    answerRepository.save(new Answer(question, 'A', "IKEA store manager", false));
    answerRepository.save(new Answer(question, 'B', "Lou… https://t.co/BkejdmYRkU", false));
  }

  private void saveQuestion946() {
    Question question;

    question = questionRepository.save(new Question(5, "What is the correct spelling of the bear family that has starred in hundreds of popular kids’ books?", "2018-04-01 01:09:47"));

    answerRepository.save(new Answer(question, 'A', "Berensteen… https://t.co/uI7Pmkphcz", false));
  }

  private void saveQuestion947() {
    Question question;

    question = questionRepository.save(new Question(6, "The song used in the viral Mannequin Challenge meme features a solo by what rapper?", "2018-04-01 01:10:39"));

    answerRepository.save(new Answer(question, 'A', "Jay-Z", false));
    answerRepository.save(new Answer(question, 'B', "Gucci Mane", true));
    answerRepository.save(new Answer(question, 'C', "2 Chainz", false));
  }

  private void saveQuestion948() {
    Question question;

    question = questionRepository.save(new Question(7, "What kind of number is the decimal expansion of 1/7?", "2018-04-01 01:11:22"));

    answerRepository.save(new Answer(question, 'A', "Endless but repeating", true));
    answerRepository.save(new Answer(question, 'B', "Irrational", false));
    answerRepository.save(new Answer(question, 'C', "Ending", false));
  }

  private void saveQuestion949() {
    Question question;

    question = questionRepository.save(new Question(8, "Birders use what four-letter word to refer to hard-to-classify birds?", "2018-04-01 01:12:03"));

    answerRepository.save(new Answer(question, 'A', "Anon", false));
    answerRepository.save(new Answer(question, 'B', "Spuh", true));
    answerRepository.save(new Answer(question, 'C', "Drib", false));
  }

  private void saveQuestion950() {
    Question question;

    question = questionRepository.save(new Question(9, "Which U.S. state's capital city is home to an NHL team?", "2018-04-01 01:12:50"));

    answerRepository.save(new Answer(question, 'A', "Ohio", true));
    answerRepository.save(new Answer(question, 'B', "Florida", false));
    answerRepository.save(new Answer(question, 'C', "Pennsylvania", false));
  }

  private void saveQuestion951() {
    Question question;

    question = questionRepository.save(new Question(10, "Mozart’s “The Marriage of Figaro” continues the story of what other opera?", "2018-04-01 01:13:25"));

    answerRepository.save(new Answer(question, 'A', "The Barber of Seville", true));
    answerRepository.save(new Answer(question, 'B', "Rigoletto", false));
    answerRepository.save(new Answer(question, 'C', "La Traviata", false));
  }

  private void saveQuestion952() {
    Question question;

    question = questionRepository.save(new Question(11, "Who was the last elected U.S. president to NOT hold office as either a Democrat or Republican?", "2018-04-01 01:14:30"));

    answerRepository.save(new Answer(question, 'A', "Millard Fillmore… https://t.co/bsU0C7poQ1", false));
  }

  private void saveQuestion953() {
    Question question;

    question = questionRepository.save(new Question(1, "Snorkelers in the water are most likely to wear what on their feet?", "2018-04-02 01:06:17"));

    answerRepository.save(new Answer(question, 'A', "Clown shoes", false));
    answerRepository.save(new Answer(question, 'B', "Stiletto heels", false));
    answerRepository.save(new Answer(question, 'C', "Swim fins", true));
  }

  private void saveQuestion954() {
    Question question;

    question = questionRepository.save(new Question(2, "A classic Shakespeare play details the doomed love between Romeo and who?", "2018-04-02 01:06:56"));

    answerRepository.save(new Answer(question, 'A', "Juliet", true));
    answerRepository.save(new Answer(question, 'B', "Jessica Simpson", false));
    answerRepository.save(new Answer(question, 'C', "Ms. Jackson", false));
  }

  private void saveQuestion955() {
    Question question;

    question = questionRepository.save(new Question(3, "The notion that “Anything that can go wrong will go wrong” is popularly known as what?", "2018-04-02 01:07:43"));

    answerRepository.save(new Answer(question, 'A', "Peter Principle", false));
    answerRepository.save(new Answer(question, 'B', "Murphy… https://t.co/2rd4FtPrrj", false));
  }

  private void saveQuestion956() {
    Question question;

    question = questionRepository.save(new Question(4, "What basketball term derives from a French phrase that circus acrobats used to shout?", "2018-04-02 01:08:18"));

    answerRepository.save(new Answer(question, 'A', "Alley-oop", true));
    answerRepository.save(new Answer(question, 'B', "Slam dunk", false));
    answerRepository.save(new Answer(question, 'C', "Airball", false));
  }

  private void saveQuestion957() {
    Question question;

    question = questionRepository.save(new Question(5, "The holiday of Passover commemorates events that took place in what ancient civilization?", "2018-04-02 01:09:05"));

    answerRepository.save(new Answer(question, 'A', "Egypt", true));
    answerRepository.save(new Answer(question, 'B', "Babylonia", false));
    answerRepository.save(new Answer(question, 'C', "Macedonia", false));
  }

  private void saveQuestion958() {
    Question question;

    question = questionRepository.save(new Question(6, "Which of these figures is known for wearing a mackintosh?", "2018-04-02 01:10:01"));

    answerRepository.save(new Answer(question, 'A', "Steve Jobs", false));
    answerRepository.save(new Answer(question, 'B', "Inspector Gadget", true));
    answerRepository.save(new Answer(question, 'C', "Johnny Appleseed", false));
  }

  private void saveQuestion959() {
    Question question;

    question = questionRepository.save(new Question(7, "Which of these punctuation marks can be found in an interrobang?", "2018-04-02 01:10:51"));

    answerRepository.save(new Answer(question, 'A', "Ampersand", false));
    answerRepository.save(new Answer(question, 'B', "Pound sign", false));
    answerRepository.save(new Answer(question, 'C', "Question mark", true));
  }

  private void saveQuestion960() {
    Question question;

    question = questionRepository.save(new Question(8, "Which of these countries celebrates Easter with both an Easter Bunny and an Easter Bilby?", "2018-04-02 01:11:30"));

    answerRepository.save(new Answer(question, 'A', "Sweden", false));
    answerRepository.save(new Answer(question, 'B', "Canada", false));
    answerRepository.save(new Answer(question, 'C', "Australia", true));
  }

  private void saveQuestion961() {
    Question question;

    question = questionRepository.save(new Question(9, "The music of Rick Astley played a direct role in bringing down the leader of what country?", "2018-04-02 01:12:14"));

    answerRepository.save(new Answer(question, 'A', "Libya", false));
    answerRepository.save(new Answer(question, 'B', "Venezuela", false));
    answerRepository.save(new Answer(question, 'C', "Panama", true));
  }

  private void saveQuestion962() {
    Question question;

    question = questionRepository.save(new Question(10, "Who owns the NFL record for consecutive playoff games with at least two touchdown passes?", "2018-04-02 01:13:01"));

    answerRepository.save(new Answer(question, 'A', "Joe Flacco", true));
    answerRepository.save(new Answer(question, 'B', "Joe Montana", false));
    answerRepository.save(new Answer(question, 'C', "Tom Brady", false));
  }

  private void saveQuestion963() {
    Question question;

    question = questionRepository.save(new Question(11, "The capital city of which country sits at the southernmost latitude?", "2018-04-02 01:14:07"));

    answerRepository.save(new Answer(question, 'A', "Uruguay", true));
    answerRepository.save(new Answer(question, 'B', "Madagascar", false));
    answerRepository.save(new Answer(question, 'C', "Indonesia", false));
  }

  private void saveQuestion964() {
    Question question;

    question = questionRepository.save(new Question(12, "According to an infamous ’80s hoax, April Fools’ Day was created by a Roman court jester named what?", "2018-04-02 01:15:41"));

    answerRepository.save(new Answer(question, 'A', "Kugel", true));
    answerRepository.save(new Answer(question, 'B', "Constantine", false));
    answerRepository.save(new Answer(question, 'C', "Boskin", false));
  }

  private void saveQuestion965() {
    Question question;

    question = questionRepository.save(new Question(1, "Ignoring someone is also known as “giving them the cold” what?", "2018-04-02 19:03:42"));

    answerRepository.save(new Answer(question, 'A', "Shoulder", true));
    answerRepository.save(new Answer(question, 'B', "Pudding", false));
    answerRepository.save(new Answer(question, 'C', "Goblin", false));
  }

  private void saveQuestion966() {
    Question question;

    question = questionRepository.save(new Question(2, "Which of these is a common type of truck?", "2018-04-02 19:04:11"));

    answerRepository.save(new Answer(question, 'A', "Pick-up", true));
    answerRepository.save(new Answer(question, 'B', "Put-down", false));
    answerRepository.save(new Answer(question, 'C', "Leave-there", false));
  }

  private void saveQuestion967() {
    Question question;

    question = questionRepository.save(new Question(3, "What day of the week is named for the moon?", "2018-04-02 19:04:43"));

    answerRepository.save(new Answer(question, 'A', "Monday", true));
    answerRepository.save(new Answer(question, 'B', "Wednesday", false));
    answerRepository.save(new Answer(question, 'C', "Thursday", false));
  }

  private void saveQuestion968() {
    Question question;

    question = questionRepository.save(new Question(4, "Las Vegas welcomes visitors with an iconic sign that declares the city is what?", "2018-04-02 19:05:17"));

    answerRepository.save(new Answer(question, 'A', "Historic", false));
    answerRepository.save(new Answer(question, 'B', "Scenic", false));
    answerRepository.save(new Answer(question, 'C', "Fabulous", true));
  }

  private void saveQuestion969() {
    Question question;

    question = questionRepository.save(new Question(5, "What ingredient is the difference between vanilla ice cream and French vanilla ice cream?", "2018-04-02 19:05:54"));

    answerRepository.save(new Answer(question, 'A', "Crème fraîche", false));
    answerRepository.save(new Answer(question, 'B', "Egg yolk", true));
    answerRepository.save(new Answer(question, 'C', "Rum", false));
  }

  private void saveQuestion970() {
    Question question;

    question = questionRepository.save(new Question(6, "Tenzing Norgay is credited as one of the first two men to reach what place?", "2018-04-02 19:06:28"));

    answerRepository.save(new Answer(question, 'A', "Top of Mt. Everest", true));
    answerRepository.save(new Answer(question, 'B', "South Pole", false));
    answerRepository.save(new Answer(question, 'C', "North Pole", false));
  }

  private void saveQuestion971() {
    Question question;

    question = questionRepository.save(new Question(7, "What company’s New York Stock Exchange symbol is simply its name in all capitals?", "2018-04-02 19:07:44"));

    answerRepository.save(new Answer(question, 'A', "IBM", true));
    answerRepository.save(new Answer(question, 'B', "Nike", false));
    answerRepository.save(new Answer(question, 'C', "Visa", false));
  }

  private void saveQuestion972() {
    Question question;

    question = questionRepository.save(new Question(8, "What band gets its name from an autobiography by an itinerant Welsh poet?", "2018-04-02 19:07:52"));

    answerRepository.save(new Answer(question, 'A', "Pink Floyd", false));
    answerRepository.save(new Answer(question, 'B', "Supertramp", true));
    answerRepository.save(new Answer(question, 'C', "Traveling Wilburys", false));
  }

  private void saveQuestion973() {
    Question question;

    question = questionRepository.save(new Question(9, "Project Star Gate was once a secret government program researching what?", "2018-04-02 19:08:50"));

    answerRepository.save(new Answer(question, 'A', "Cryptozoology", false));
    answerRepository.save(new Answer(question, 'B', "Ghosts", false));
    answerRepository.save(new Answer(question, 'C', "ESP", true));
  }

  private void saveQuestion974() {
    Question question;

    question = questionRepository.save(new Question(10, "A 1939 Supreme Court decision ruled against workers taking part in what kind of strike?", "2018-04-02 19:09:15"));

    answerRepository.save(new Answer(question, 'A', "Walkout", false));
    answerRepository.save(new Answer(question, 'B', "Labor slowdown", false));
    answerRepository.save(new Answer(question, 'C', "Sit-down", true));
  }

  private void saveQuestion975() {
    Question question;

    question = questionRepository.save(new Question(11, "Which of these is NOT an ongoing award given to professional cartoonists?", "2018-04-02 19:10:13"));

    answerRepository.save(new Answer(question, 'A', "Harvey", false));
    answerRepository.save(new Answer(question, 'B', "Reuben", false));
    answerRepository.save(new Answer(question, 'C', "Segar", true));
  }

  private void saveQuestion976() {
    Question question;

    question = questionRepository.save(new Question(12, "The title of a 1975 best-seller by Stephen King appears in the lyrics of what hip-hop hit?", "2018-04-02 19:11:24"));

    answerRepository.save(new Answer(question, 'A', "99 Problems", false));
    answerRepository.save(new Answer(question, 'B', "Anaconda", false));
    answerRepository.save(new Answer(question, 'C', "Lose Yourself", true));
  }

  private void saveQuestion977() {
    Question question;

    question = questionRepository.save(new Question(1, "The phrase “hit the hay” generally means you are about to do what?", "2018-04-03 01:03:44"));

    answerRepository.save(new Answer(question, 'A', "Speak in tongues", false));
    answerRepository.save(new Answer(question, 'B', "Slamdance", false));
    answerRepository.save(new Answer(question, 'C', "Sleep", true));
  }

  private void saveQuestion978() {
    Question question;

    question = questionRepository.save(new Question(2, "The area where one practices Japanese martial arts is often called what?", "2018-04-03 01:04:16"));

    answerRepository.save(new Answer(question, 'A', "Dojo", true));
    answerRepository.save(new Answer(question, 'B', "Department of Justice", false));
    answerRepository.save(new Answer(question, 'C', "DJ Tanner’s house", false));
  }

  private void saveQuestion979() {
    Question question;

    question = questionRepository.save(new Question(3, "On a map, Italy is often said to resemble what everyday item?", "2018-04-03 01:04:47"));

    answerRepository.save(new Answer(question, 'A', "Boot", true));
    answerRepository.save(new Answer(question, 'B', "Catcher's mitt", false));
    answerRepository.save(new Answer(question, 'C', "Wine glass", false));
  }

  private void saveQuestion980() {
    Question question;

    question = questionRepository.save(new Question(4, "Which of these is a common synonym for instructional?", "2018-04-03 01:05:17"));

    answerRepository.save(new Answer(question, 'A', "Didactic", true));
    answerRepository.save(new Answer(question, 'B', "Diametric", false));
    answerRepository.save(new Answer(question, 'C', "Diacritic", false));
  }

  private void saveQuestion981() {
    Question question;

    question = questionRepository.save(new Question(5, "Pink Floyd’s “Dark Side of the Moon” most famously syncs with what movie?", "2018-04-03 01:05:58"));

    answerRepository.save(new Answer(question, 'A', "The Empire Strikes Back", false));
    answerRepository.save(new Answer(question, 'B', "Apollo 13", false));
    answerRepository.save(new Answer(question, 'C', "The Wizard of Oz", true));
  }

  private void saveQuestion982() {
    Question question;

    question = questionRepository.save(new Question(6, "Henry David Thoreau’s “Walden” detailed his cabin life in which state?", "2018-04-03 01:06:31"));

    answerRepository.save(new Answer(question, 'A', "Massachusetts", true));
    answerRepository.save(new Answer(question, 'B', "Vermont", false));
    answerRepository.save(new Answer(question, 'C', "New Hampshire", false));
  }

  private void saveQuestion983() {
    Question question;

    question = questionRepository.save(new Question(7, "Which of these demonstrates heliotropism?", "2018-04-03 01:07:20"));

    answerRepository.save(new Answer(question, 'A', "Polarized sunglasses", false));
    answerRepository.save(new Answer(question, 'B', "Suntan lotion", false));
    answerRepository.save(new Answer(question, 'C', "Sunflowers", true));
  }

  private void saveQuestion984() {
    Question question;

    question = questionRepository.save(new Question(8, "Which of these video game consoles was released first?", "2018-04-03 01:07:53"));

    answerRepository.save(new Answer(question, 'A', "Sony PlayStation", false));
    answerRepository.save(new Answer(question, 'B', "Sega Saturn", true));
    answerRepository.save(new Answer(question, 'C', "Game Boy Color", false));
  }

  private void saveQuestion985() {
    Question question;

    question = questionRepository.save(new Question(9, "In 1982 U.S. regulators began allowing American trains to phase out what?", "2018-04-03 01:08:27"));

    answerRepository.save(new Answer(question, 'A', "Ham radios", false));
    answerRepository.save(new Answer(question, 'B', "Smoking cars", false));
    answerRepository.save(new Answer(question, 'C', "Cabooses", true));
  }

  private void saveQuestion986() {
    Question question;

    question = questionRepository.save(new Question(10, "Which of these two-dimensional shapes has the most sides?", "2018-04-03 01:09:16"));

    answerRepository.save(new Answer(question, 'A', "Chiliagon", true));
    answerRepository.save(new Answer(question, 'B', "Octadecagon", false));
    answerRepository.save(new Answer(question, 'C', "Enneadecagon", false));
  }

  private void saveQuestion987() {
    Question question;

    question = questionRepository.save(new Question(11, "In which of the following musicals does the first Holy Roman Emperor appear?", "2018-04-03 01:10:14"));

    answerRepository.save(new Answer(question, 'A', "Pippin", true));
    answerRepository.save(new Answer(question, 'B', "Spamalot", false));
    answerRepository.save(new Answer(question, 'C', "Man of La Mancha", false));
  }

  private void saveQuestion988() {
    Question question;

    question = questionRepository.save(new Question(12, "Which movie features an actor named Edgar Allan Poe playing a character named Edgar Allan Poe?", "2018-04-03 01:11:14"));

    answerRepository.save(new Answer(question, 'A', "The Crow", false));
    answerRepository.save(new Answer(question, 'B', "Night… https://t.co/rcABQLq0sX", false));
  }

  private void saveQuestion989() {
    Question question;

    question = questionRepository.save(new Question(1, "Humorous clips of mishaps in radio, TV and movies are known as what?", "2018-04-05 19:04:18"));

    answerRepository.save(new Answer(question, 'A', "Bloopers", true));
    answerRepository.save(new Answer(question, 'B', "Chump-ups", false));
    answerRepository.save(new Answer(question, 'C', "Squeeblets", false));
  }

  private void saveQuestion990() {
    Question question;

    question = questionRepository.save(new Question(2, "The Golden Globe Awards are put on by what association?", "2018-04-05 19:04:48"));

    answerRepository.save(new Answer(question, 'A', "Harlem Globetrotters", false));
    answerRepository.save(new Answer(question, 'B', "Hollywood Foreign Press", true));
    answerRepository.save(new Answer(question, 'C', "Justice League", false));
  }

  private void saveQuestion991() {
    Question question;

    question = questionRepository.save(new Question(3, "According to the cartoon's theme song, what made Clifford the Big Red Dog so big?", "2018-04-05 19:06:25"));

    answerRepository.save(new Answer(question, 'A', "Acromegaly", false));
    answerRepository.save(new Answer(question, 'B', "Radiation", false));
    answerRepository.save(new Answer(question, 'C', "Emily Elizabeth's love", true));
  }

  private void saveQuestion992() {
    Question question;

    question = questionRepository.save(new Question(4, "Which of these MLB teams is one of only two located in the Mountain Time Zone?", "2018-04-05 19:06:42"));

    answerRepository.save(new Answer(question, 'A', "Minnesota Twins", false));
    answerRepository.save(new Answer(question, 'B', "Arizona Diamon… https://t.co/yaw2fLLfrY", false));
  }

  private void saveQuestion993() {
    Question question;

    question = questionRepository.save(new Question(5, "Before leaving office, what president's staff removed dozens of W's from White House keyboards?", "2018-04-05 19:07:18"));

    answerRepository.save(new Answer(question, 'A', "Bill Clinton", true));
    answerRepository.save(new Answer(question, 'B', "", false));
  }

  private void saveQuestion994() {
    Question question;

    question = questionRepository.save(new Question(6, "Which of these words is considered a contronym?", "2018-04-05 19:07:57"));

    answerRepository.save(new Answer(question, 'A', "Waste", false));
    answerRepository.save(new Answer(question, 'B', "Dart", false));
    answerRepository.save(new Answer(question, 'C', "Seed", true));
  }

  private void saveQuestion995() {
    Question question;

    question = questionRepository.save(new Question(7, "What curious shape has NASA observed on the planet Saturn’s northernmost point?", "2018-04-05 19:09:10"));

    answerRepository.save(new Answer(question, 'A', "Dodecahedron", false));
    answerRepository.save(new Answer(question, 'B', "Hexagon", true));
    answerRepository.save(new Answer(question, 'C', "Triangle", false));
  }

  private void saveQuestion996() {
    Question question;

    question = questionRepository.save(new Question(8, "Which of these movies did NOT win an Academy Award for Best Original Song?", "2018-04-05 19:09:15"));

    answerRepository.save(new Answer(question, 'A', "Footloose", true));
    answerRepository.save(new Answer(question, 'B', "Flashdance", false));
    answerRepository.save(new Answer(question, 'C', "Dirty Dancing", false));
  }

  private void saveQuestion997() {
    Question question;

    question = questionRepository.save(new Question(9, "In the 1990s, a Texas county designated what as its official phone greeting?", "2018-04-05 19:09:55"));

    answerRepository.save(new Answer(question, 'A', "Howdy", false));
    answerRepository.save(new Answer(question, 'B', "Heaven-o", true));
    answerRepository.save(new Answer(question, 'C', "Ahoy-hoy", false));
  }

  private void saveQuestion998() {
    Question question;

    question = questionRepository.save(new Question(10, "Which of these desserts gets its name from a very old term for “small sausage”?", "2018-04-05 19:10:37"));

    answerRepository.save(new Answer(question, 'A', "Cobbler", false));
    answerRepository.save(new Answer(question, 'B', "Pudding", true));
    answerRepository.save(new Answer(question, 'C', "Trifle", false));
  }

  private void saveQuestion999() {
    Question question;

    question = questionRepository.save(new Question(11, "The Declaration of Independence was NOT signed by which of these people?", "2018-04-05 19:11:43"));

    answerRepository.save(new Answer(question, 'A', "John Adams", false));
    answerRepository.save(new Answer(question, 'B', "Josiah Bartlett", false));
    answerRepository.save(new Answer(question, 'C', "George Washington", true));
  }

  private void saveQuestion1000() {
    Question question;

    question = questionRepository.save(new Question(1, "Which of these are commonly worn to bed?", "2018-04-06 01:04:50"));

    answerRepository.save(new Answer(question, 'A', "Oven mitts", false));
    answerRepository.save(new Answer(question, 'B', "Overalls", false));
    answerRepository.save(new Answer(question, 'C', "Pajamas", true));
  }

  private void saveQuestion1001() {
    Question question;

    question = questionRepository.save(new Question(2, "Which of these is a common type of flying insect?", "2018-04-06 01:05:22"));

    answerRepository.save(new Answer(question, 'A', "Fumblebee", false));
    answerRepository.save(new Answer(question, 'B', "Mumblebee", false));
    answerRepository.save(new Answer(question, 'C', "Bumblebee", true));
  }

  private void saveQuestion1002() {
    Question question;

    question = questionRepository.save(new Question(3, "What word is typically used to refer to a serving of ribs?", "2018-04-06 01:05:55"));

    answerRepository.save(new Answer(question, 'A', "Cob", false));
    answerRepository.save(new Answer(question, 'B', "Rack", true));
    answerRepository.save(new Answer(question, 'C', "Hoist", false));
  }

  private void saveQuestion1003() {
    Question question;

    question = questionRepository.save(new Question(4, "How long is a single term for a US senator?", "2018-04-06 01:06:28"));

    answerRepository.save(new Answer(question, 'A', "Two years", false));
    answerRepository.save(new Answer(question, 'B', "Six Years", true));
    answerRepository.save(new Answer(question, 'C', "Eight years", false));
  }

  private void saveQuestion1004() {
    Question question;

    question = questionRepository.save(new Question(5, "What rapper starred in the movie that made “Bye, Felicia” a catchphrase?", "2018-04-06 01:07:22"));

    answerRepository.save(new Answer(question, 'A', "Will Smith", false));
    answerRepository.save(new Answer(question, 'B', "Ice Cube", true));
    answerRepository.save(new Answer(question, 'C', "Eminem", false));
  }

  private void saveQuestion1005() {
    Question question;

    question = questionRepository.save(new Question(6, "Which of these is NOT one of the Benelux nations?", "2018-04-06 01:07:57"));

    answerRepository.save(new Answer(question, 'A', "Belgium", false));
    answerRepository.save(new Answer(question, 'B', "Netherlands", false));
    answerRepository.save(new Answer(question, 'C', "Liechtenstein", true));
  }

  private void saveQuestion1006() {
    Question question;

    question = questionRepository.save(new Question(7, "Whose work would you be most likely to learn more about on https://t.co/wIN6SjdXeh?", "2018-04-06 01:08:50"));

    answerRepository.save(new Answer(question, 'A', "Robert Cray", true));
    answerRepository.save(new Answer(question, 'B', "Bob &amp; Ray", false));
    answerRepository.save(new Answer(question, 'C', "Bobby Flay", false));
  }

  private void saveQuestion1007() {
    Question question;

    question = questionRepository.save(new Question(8, "What ’70s sitcom had a theme song composed by Quincy Jones?", "2018-04-06 01:09:36"));

    answerRepository.save(new Answer(question, 'A', "Good Times", false));
    answerRepository.save(new Answer(question, 'B', "What’s Happening!!", false));
    answerRepository.save(new Answer(question, 'C', "Sanford &amp; Son", true));
  }

  private void saveQuestion1008() {
    Question question;

    question = questionRepository.save(new Question(9, "If an event is biennial, how many times will it happen in a decade?", "2018-04-06 01:10:24"));

    answerRepository.save(new Answer(question, 'A', "Ten", false));
    answerRepository.save(new Answer(question, 'B', "Five", true));
    answerRepository.save(new Answer(question, 'C', "Twenty", false));
  }

  private void saveQuestion1009() {
    Question question;

    question = questionRepository.save(new Question(10, "Who was NOT a com.trivia.model for Grant Wood’s painting American Gothic?", "2018-04-06 01:11:12"));

    answerRepository.save(new Answer(question, 'A', "Wood's grocer", true));
    answerRepository.save(new Answer(question, 'B', "Wood’s sister", false));
    answerRepository.save(new Answer(question, 'C', "Wood's dentist", false));
  }

  private void saveQuestion1010() {
    Question question;

    question = questionRepository.save(new Question(11, "Michael Douglas’s first Oscar was for a film set where?", "2018-04-06 01:11:58"));

    answerRepository.save(new Answer(question, 'A', "Investment Bank", false));
    answerRepository.save(new Answer(question, 'B', "Battlefield", false));
    answerRepository.save(new Answer(question, 'C', "Mental Institution", true));
  }

  private void saveQuestion1011() {
    Question question;

    question = questionRepository.save(new Question(12, "Which of these sports typically uses the heaviest standard ball?", "2018-04-06 01:13:13"));

    answerRepository.save(new Answer(question, 'A', "Cricket", false));
    answerRepository.save(new Answer(question, 'B', "Baseball", false));
    answerRepository.save(new Answer(question, 'C', "Fast-pitch softball", true));
  }

  private void saveQuestion1012() {
    Question question;

    question = questionRepository.save(new Question(1, "According to a famous saying, “a journey of a thousand miles begins with a single” what?", "2018-04-06 19:04:25"));

    answerRepository.save(new Answer(question, 'A', "Energy drink", false));
    answerRepository.save(new Answer(question, 'B', "Step", true));
    answerRepository.save(new Answer(question, 'C', "Ride-hailing app", false));
  }

  private void saveQuestion1013() {
    Question question;

    question = questionRepository.save(new Question(2, "The chief judge of the US Supreme Court is called what?", "2018-04-06 19:05:01"));

    answerRepository.save(new Answer(question, 'A', "Chief Justice", true));
    answerRepository.save(new Answer(question, 'B', "Chief Moose", false));
    answerRepository.save(new Answer(question, 'C', "Chief Wiggum", false));
  }

  private void saveQuestion1014() {
    Question question;

    question = questionRepository.save(new Question(3, "By definition, people who are somnambulists do what?", "2018-04-06 19:06:01"));

    answerRepository.save(new Answer(question, 'A', "Walk in their sleep", true));
    answerRepository.save(new Answer(question, 'B', "Eat at their desks", false));
    answerRepository.save(new Answer(question, 'C', "Work from home", false));
  }

  private void saveQuestion1015() {
    Question question;

    question = questionRepository.save(new Question(4, "In baseball, a player is said to get a “golden sombrero” for doing what?", "2018-04-06 19:06:39"));

    answerRepository.save(new Answer(question, 'A', "Breaking bat", false));
    answerRepository.save(new Answer(question, 'B', "Striking out four times… https://t.co/wbHgb0fs5E", false));
  }

  private void saveQuestion1016() {
    Question question;

    question = questionRepository.save(new Question(5, "Which of these Ivy League schools is situated farthest north?", "2018-04-06 19:07:34"));

    answerRepository.save(new Answer(question, 'A', "Brown", false));
    answerRepository.save(new Answer(question, 'B', "Cornell", false));
    answerRepository.save(new Answer(question, 'C', "Dartmouth", true));
  }

  private void saveQuestion1017() {
    Question question;

    question = questionRepository.save(new Question(6, "Which of these European nations currently has a king?", "2018-04-06 19:08:11"));

    answerRepository.save(new Answer(question, 'A', "Finland", false));
    answerRepository.save(new Answer(question, 'B', "Austria", false));
    answerRepository.save(new Answer(question, 'C', "Belgium", true));
  }

  private void saveQuestion1018() {
    Question question;

    question = questionRepository.save(new Question(7, "The voice of what “Toy Story” character also played the titular role in \"Sully\"?", "2018-04-06 19:08:55"));

    answerRepository.save(new Answer(question, 'A', "Slinky Dog", false));
    answerRepository.save(new Answer(question, 'B', "Buzz Lightyear", false));
    answerRepository.save(new Answer(question, 'C', "Woody", true));
  }

  private void saveQuestion1019() {
    Question question;

    question = questionRepository.save(new Question(8, "Which author’s breakout success was an essay about working at Macy’s?", "2018-04-06 19:09:34"));

    answerRepository.save(new Answer(question, 'A', "David Eggers", false));
    answerRepository.save(new Answer(question, 'B', "David Foster Wallace", false));
    answerRepository.save(new Answer(question, 'C', "David Sedaris", true));
  }

  private void saveQuestion1020() {
    Question question;

    question = questionRepository.save(new Question(9, "Which state’s most populated city has the most people?", "2018-04-06 19:10:15"));

    answerRepository.save(new Answer(question, 'A', "Colorado", false));
    answerRepository.save(new Answer(question, 'B', "Maryland", false));
    answerRepository.save(new Answer(question, 'C', "Ohio", true));
  }

  private void saveQuestion1021() {
    Question question;

    question = questionRepository.save(new Question(10, "What NBA team's owner once said, “There's no chance the iPhone is going to get any significant market share”?", "2018-04-06 19:11:02"));

    answerRepository.save(new Answer(question, 'A', "LA… https://t.co/5djD6ecZLf", false));
  }

  private void saveQuestion1022() {
    Question question;

    question = questionRepository.save(new Question(11, "What is the name of the figure considered to be a four-dimensional equivalent of a Mobius strip?", "2018-04-06 19:11:57"));

    answerRepository.save(new Answer(question, 'A', "Klein Bottle… https://t.co/FNmdRB6XXC", true));
  }

  private void saveQuestion1023() {
    Question question;

    question = questionRepository.save(new Question(12, "Which of these candies was introduced first?", "2018-04-06 19:13:08"));

    answerRepository.save(new Answer(question, 'A', "Life Savers", false));
    answerRepository.save(new Answer(question, 'B', "Charleston Chew", false));
    answerRepository.save(new Answer(question, 'C', "Tootsie Rolls", true));
  }

  private void saveQuestion1024() {
    Question question;

    question = questionRepository.save(new Question(1, "What is applied to unpopped corn to pop it?", "2018-04-07 01:05:27"));

    answerRepository.save(new Answer(question, 'A', "Peer pressure", false));
    answerRepository.save(new Answer(question, 'B', "Heat", true));
    answerRepository.save(new Answer(question, 'C', "Nail polish", false));
  }

  private void saveQuestion1025() {
    Question question;

    question = questionRepository.save(new Question(2, "What advice would you most likely get from an orthodontist?", "2018-04-07 01:06:03"));

    answerRepository.save(new Answer(question, 'A', "Dye your hair", false));
    answerRepository.save(new Answer(question, 'B', "Finish that screenplay", false));
    answerRepository.save(new Answer(question, 'C', "Floss regularly", true));
  }

  private void saveQuestion1026() {
    Question question;

    question = questionRepository.save(new Question(3, "Which of these names also refers specifically to a male duck?", "2018-04-07 01:06:37"));

    answerRepository.save(new Answer(question, 'A', "Meek", false));
    answerRepository.save(new Answer(question, 'B', "Mill", false));
    answerRepository.save(new Answer(question, 'C', "Drake", true));
  }

  private void saveQuestion1027() {
    Question question;

    question = questionRepository.save(new Question(4, "Which magazine is known for its annual ranking of the 400 wealthiest Americans?", "2018-04-07 01:07:23"));

    answerRepository.save(new Answer(question, 'A', "Financial Times", false));
    answerRepository.save(new Answer(question, 'B', "Fortune", false));
    answerRepository.save(new Answer(question, 'C', "Forbes", true));
  }

  private void saveQuestion1028() {
    Question question;

    question = questionRepository.save(new Question(5, "Which of the five main human senses primarily relies on papillae?", "2018-04-07 01:07:59"));

    answerRepository.save(new Answer(question, 'A', "Taste", true));
    answerRepository.save(new Answer(question, 'B', "Sight", false));
    answerRepository.save(new Answer(question, 'C', "Hearing", false));
  }

  private void saveQuestion1029() {
    Question question;

    question = questionRepository.save(new Question(6, "Which US state has a capital city with an American Indian name?", "2018-04-07 01:08:42"));

    answerRepository.save(new Answer(question, 'A', "Arizona", false));
    answerRepository.save(new Answer(question, 'B', "Florida", true));
    answerRepository.save(new Answer(question, 'C', "North Dakota", false));
  }

  private void saveQuestion1030() {
    Question question;

    question = questionRepository.save(new Question(7, "Which of these common food additives comes from the ocean?", "2018-04-07 01:09:26"));

    answerRepository.save(new Answer(question, 'A', "Guar gum", false));
    answerRepository.save(new Answer(question, 'B', "Carrageenan", true));
    answerRepository.save(new Answer(question, 'C', "Pectin", false));
  }

  private void saveQuestion1031() {
    Question question;

    question = questionRepository.save(new Question(8, "To Londoners, the board game Americans know as “Clue” is known as what?", "2018-04-07 01:10:12"));

    answerRepository.save(new Answer(question, 'A', "Cluewho", false));
    answerRepository.save(new Answer(question, 'B', "Cluetime", false));
    answerRepository.save(new Answer(question, 'C', "Cluedo", true));
  }

  private void saveQuestion1032() {
    Question question;

    question = questionRepository.save(new Question(9, "Eggs Benedict made with crab meat instead of ham is commonly known as what?", "2018-04-07 01:10:54"));

    answerRepository.save(new Answer(question, 'A', "Eggs Juno", false));
    answerRepository.save(new Answer(question, 'B', "Eggs Poseidon", false));
    answerRepository.save(new Answer(question, 'C', "Eggs Neptune", true));
  }

  private void saveQuestion1033() {
    Question question;

    question = questionRepository.save(new Question(10, "The name of the famous satellite “Sputnik” roughly translates to what?", "2018-04-07 01:11:42"));

    answerRepository.save(new Answer(question, 'A', "Sky walker", false));
    answerRepository.save(new Answer(question, 'B', "View tomorrow", false));
    answerRepository.save(new Answer(question, 'C', "Travel companion", true));
  }

  private void saveQuestion1034() {
    Question question;

    question = questionRepository.save(new Question(11, "Ransom Riggs’s debut novel was adapted into a movie by what director?", "2018-04-07 01:12:24"));

    answerRepository.save(new Answer(question, 'A', "Richard Linklater", false));
    answerRepository.save(new Answer(question, 'B', "Tim Burton", true));
    answerRepository.save(new Answer(question, 'C', "Guillermo del Toro", false));
  }

  private void saveQuestion1035() {
    Question question;

    question = questionRepository.save(new Question(12, "A son of Rutherford B. Hayes co-founded a company that invented what household item?", "2018-04-07 01:13:37"));

    answerRepository.save(new Answer(question, 'A', "Brillo pad", false));
    answerRepository.save(new Answer(question, 'B', "Vacuum cleaner", false));
    answerRepository.save(new Answer(question, 'C', "D battery", true));
  }

  private void saveQuestion1036() {
    Question question;

    question = questionRepository.save(new Question(1, "What is the main ingredient in sawdust?", "2018-04-08 01:03:49"));

    answerRepository.save(new Answer(question, 'A', "Wood", true));
    answerRepository.save(new Answer(question, 'B', "Freon", false));
    answerRepository.save(new Answer(question, 'C', "Potatoes", false));
  }

  private void saveQuestion1037() {
    Question question;

    question = questionRepository.save(new Question(2, "Which is a consequence of letting iron get wet?", "2018-04-08 01:04:39"));

    answerRepository.save(new Answer(question, 'A', "Common cold", false));
    answerRepository.save(new Answer(question, 'B', "Shrinkage", false));
    answerRepository.save(new Answer(question, 'C', "Rust", true));
  }

  private void saveQuestion1038() {
    Question question;

    question = questionRepository.save(new Question(3, "What state is home to the tallest mountain peak in the US?", "2018-04-08 01:05:11"));

    answerRepository.save(new Answer(question, 'A', "Alaska", true));
    answerRepository.save(new Answer(question, 'B', "Massachusetts", false));
    answerRepository.save(new Answer(question, 'C', "Florida", false));
  }

  private void saveQuestion1039() {
    Question question;

    question = questionRepository.save(new Question(4, "Newborn flamingoes are typically what color?", "2018-04-08 01:05:47"));

    answerRepository.save(new Answer(question, 'A', "Light gray", true));
    answerRepository.save(new Answer(question, 'B', "Pale green", false));
    answerRepository.save(new Answer(question, 'C', "Dark red", false));
  }

  private void saveQuestion1040() {
    Question question;

    question = questionRepository.save(new Question(5, "Created in a 1970 contest, the universal recycling symbol depicts what?", "2018-04-08 01:06:22"));

    answerRepository.save(new Answer(question, 'A', "Crumpled-up paper", false));
    answerRepository.save(new Answer(question, 'B', "Tree inside a circle", false));
    answerRepository.save(new Answer(question, 'C', "Three arrows", true));
  }

  private void saveQuestion1041() {
    Question question;

    question = questionRepository.save(new Question(6, "Which sport does NOT use an official who is officially referred to as a “referee”?", "2018-04-08 01:06:58"));

    answerRepository.save(new Answer(question, 'A', "Hockey", false));
    answerRepository.save(new Answer(question, 'B', "Baseball", true));
    answerRepository.save(new Answer(question, 'C', "Football", false));
  }

  private void saveQuestion1042() {
    Question question;

    question = questionRepository.save(new Question(7, "Where will you find the only Ivy League university named after the state it is in?", "2018-04-08 01:07:33"));

    answerRepository.save(new Answer(question, 'A', "Pennsylvania", true));
    answerRepository.save(new Answer(question, 'B', "Massachusetts", false));
    answerRepository.save(new Answer(question, 'C', "Connecticut", false));
  }

  private void saveQuestion1043() {
    Question question;

    question = questionRepository.save(new Question(8, "Which of these terms is used to refer to one nautical mile per hour?", "2018-04-08 01:08:08"));

    answerRepository.save(new Answer(question, 'A', "Knot", true));
    answerRepository.save(new Answer(question, 'B', "League", false));
    answerRepository.save(new Answer(question, 'C', "Fathom", false));
  }

  private void saveQuestion1044() {
    Question question;

    question = questionRepository.save(new Question(9, "Which of these is the name of an actual ceremonial county in  England?", "2018-04-08 01:08:42"));

    answerRepository.save(new Answer(question, 'A', "Buckinghamshire", true));
    answerRepository.save(new Answer(question, 'B', "Windsorshire", false));
    answerRepository.save(new Answer(question, 'C', "Westminstershire", false));
  }

  private void saveQuestion1045() {
    Question question;

    question = questionRepository.save(new Question(10, "“Sphenopalatine ganglioneuralgia” is the scientific term for what?", "2018-04-08 01:09:27"));

    answerRepository.save(new Answer(question, 'A', "Severe embarrassment", false));
    answerRepository.save(new Answer(question, 'B', "Absentmindedness", false));
    answerRepository.save(new Answer(question, 'C', "Ice cream headache", true));
  }

  private void saveQuestion1046() {
    Question question;

    question = questionRepository.save(new Question(11, "Alfred, Lord Tennyson’s “Charge of the Light Brigade” commemorates a battle in what conflict?", "2018-04-08 01:10:06"));

    answerRepository.save(new Answer(question, 'A', "Crimean War", true));
    answerRepository.save(new Answer(question, 'B', "F… https://t.co/U7lqNn99B9", false));
  }

  private void saveQuestion1047() {
    Question question;

    question = questionRepository.save(new Question(12, "The Beatles song “Glass Onion” does NOT refer to which earlier Beatles song?", "2018-04-08 01:10:56"));

    answerRepository.save(new Answer(question, 'A', "I Am the Walrus", false));
    answerRepository.save(new Answer(question, 'B', "Lady Madonna", false));
    answerRepository.save(new Answer(question, 'C', "A Day in the Life", true));
  }

  private void saveQuestion1048() {
    Question question;

    question = questionRepository.save(new Question(1, "Bonnie &amp; Clyde were wanted by police for committing what crime?", "2018-04-09 01:05:14"));

    answerRepository.save(new Answer(question, 'A', "Bank robbery", true));
    answerRepository.save(new Answer(question, 'B', "Excessive PDA", false));
    answerRepository.save(new Answer(question, 'C', "Destination wedding", false));
  }

  private void saveQuestion1049() {
    Question question;

    question = questionRepository.save(new Question(2, "In the Bible, Moses came down from Mount Sinai with tablets containing what?", "2018-04-09 01:05:54"));

    answerRepository.save(new Answer(question, 'A', "10 commandments", true));
    answerRepository.save(new Answer(question, 'B', "20 coupons", false));
    answerRepository.save(new Answer(question, 'C', "6000 unread emails", false));
  }

  private void saveQuestion1050() {
    Question question;

    question = questionRepository.save(new Question(3, "Which of these professionals is most likely to claim to have ESP?", "2018-04-09 01:07:00"));

    answerRepository.save(new Answer(question, 'A', "Lifeguard", false));
    answerRepository.save(new Answer(question, 'B', "Psychic", true));
    answerRepository.save(new Answer(question, 'C', "Gym teacher", false));
  }

  private void saveQuestion1051() {
    Question question;

    question = questionRepository.save(new Question(4, "What is the capital of Australia?", "2018-04-09 01:07:41"));

    answerRepository.save(new Answer(question, 'A', "Canberra", true));
    answerRepository.save(new Answer(question, 'B', "Melbourne", false));
    answerRepository.save(new Answer(question, 'C', "Sydney", false));
  }

  private void saveQuestion1052() {
    Question question;

    question = questionRepository.save(new Question(5, "A restaurant dish that is prepared when you order it is said to be cooked how?", "2018-04-09 01:08:28"));

    answerRepository.save(new Answer(question, 'A', "A la plancha", false));
    answerRepository.save(new Answer(question, 'B', "A la minute", true));
    answerRepository.save(new Answer(question, 'C', "A la carte", false));
  }

  private void saveQuestion1053() {
    Question question;

    question = questionRepository.save(new Question(6, "When spelled out, what is the only number whose letters appear in alphabetical order?", "2018-04-09 01:09:25"));

    answerRepository.save(new Answer(question, 'A', "11", false));
    answerRepository.save(new Answer(question, 'B', "4", false));
    answerRepository.save(new Answer(question, 'C', "40", true));
  }

  private void saveQuestion1054() {
    Question question;

    question = questionRepository.save(new Question(7, "The titles of most Sherlock Holmes stories begin with what three words?", "2018-04-09 01:10:05"));

    answerRepository.save(new Answer(question, 'A', "The Mystery of", false));
    answerRepository.save(new Answer(question, 'B', "The Case of", false));
    answerRepository.save(new Answer(question, 'C', "The Adventure of", true));
  }

  private void saveQuestion1055() {
    Question question;

    question = questionRepository.save(new Question(8, "By definition, aleatoric music is considered to be what?", "2018-04-09 01:10:52"));

    answerRepository.save(new Answer(question, 'A', "Random", true));
    answerRepository.save(new Answer(question, 'B', "Cinematic", false));
    answerRepository.save(new Answer(question, 'C', "Mournful", false));
  }

  private void saveQuestion1056() {
    Question question;

    question = questionRepository.save(new Question(9, "Which of these iconic mountains sits at the southernmost latitude?", "2018-04-09 01:11:35"));

    answerRepository.save(new Answer(question, 'A', "Mount Everest", true));
    answerRepository.save(new Answer(question, 'B', "K2", false));
    answerRepository.save(new Answer(question, 'C', "Mount Fuji", false));
  }

  private void saveQuestion1057() {
    Question question;

    question = questionRepository.save(new Question(10, "A famous 1977 FBI sting to unmask KGB operatives had what curious name?", "2018-04-09 01:12:24"));

    answerRepository.save(new Answer(question, 'A', "Moscow-Mule", false));
    answerRepository.save(new Answer(question, 'B', "Fancy-Bear", false));
    answerRepository.save(new Answer(question, 'C', "Lemon-Aid", true));
  }

  private void saveQuestion1058() {
    Question question;

    question = questionRepository.save(new Question(11, "Which singer does NOT have a star on the Hollywood Walk of Fame?", "2018-04-09 01:13:01"));

    answerRepository.save(new Answer(question, 'A', "Janet Jackson", false));
    answerRepository.save(new Answer(question, 'B', "Celine Dion", false));
    answerRepository.save(new Answer(question, 'C', "Madonna", true));
  }

  private void saveQuestion1059() {
    Question question;

    question = questionRepository.save(new Question(12, "Which of these classic novels has the longest first sentence?", "2018-04-09 01:14:02"));

    answerRepository.save(new Answer(question, 'A', "The Old Man and the Sea", true));
    answerRepository.save(new Answer(question, 'B', "The Sound and the Fury", false));
    answerRepository.save(new Answer(question, 'C', "The Great Gatsby", false));
  }

  private void saveQuestion1060() {
    Question question;

    question = questionRepository.save(new Question(1, "What are pocket calculators traditionally used for?", "2018-04-09 19:04:09"));

    answerRepository.save(new Answer(question, 'A', "Arithmetic", true));
    answerRepository.save(new Answer(question, 'B', "Blending smoothies", false));
    answerRepository.save(new Answer(question, 'C', "Dispensing legal advice", false));
  }

  private void saveQuestion1061() {
    Question question;

    question = questionRepository.save(new Question(2, "Which of the following is a US state?", "2018-04-09 19:04:44"));

    answerRepository.save(new Answer(question, 'A', "Louisiana", true));
    answerRepository.save(new Answer(question, 'B', "Florizona", false));
    answerRepository.save(new Answer(question, 'C', "Texylvania", false));
  }

  private void saveQuestion1062() {
    Question question;

    question = questionRepository.save(new Question(3, "Which of these is designed to make easily erasable marks?", "2018-04-09 19:06:00"));

    answerRepository.save(new Answer(question, 'A', "Tattoo needle", false));
    answerRepository.save(new Answer(question, 'B', "Pencil", true));
    answerRepository.save(new Answer(question, 'C', "Permanent marker", false));
  }

  private void saveQuestion1063() {
    Question question;

    question = questionRepository.save(new Question(4, "When in flight, what letter of the alphabet do migrating geese most commonly form?", "2018-04-09 19:06:36"));

    answerRepository.save(new Answer(question, 'A', "T", false));
    answerRepository.save(new Answer(question, 'B', "X", false));
    answerRepository.save(new Answer(question, 'C', "V", true));
  }

  private void saveQuestion1064() {
    Question question;

    question = questionRepository.save(new Question(5, "Which of these is the name of a real chemical element?", "2018-04-09 19:07:17"));

    answerRepository.save(new Answer(question, 'A', "Byzantium", false));
    answerRepository.save(new Answer(question, 'B', "Adamantium", false));
    answerRepository.save(new Answer(question, 'C', "Titanium", true));
  }

  private void saveQuestion1065() {
    Question question;

    question = questionRepository.save(new Question(6, "Who has NOT hosted an edition of the science miniseries “Cosmos”?", "2018-04-09 19:08:01"));

    answerRepository.save(new Answer(question, 'A', "Neil deGrasse Tyson", false));
    answerRepository.save(new Answer(question, 'B', "Bill Nye", true));
    answerRepository.save(new Answer(question, 'C', "Carl Sagan", false));
  }

  private void saveQuestion1066() {
    Question question;

    question = questionRepository.save(new Question(7, "What old-fashioned musical instrument shares its name with a Greek muse?", "2018-04-09 19:08:52"));

    answerRepository.save(new Answer(question, 'A', "Calliope", true));
    answerRepository.save(new Answer(question, 'B', "Orphica", false));
    answerRepository.save(new Answer(question, 'C', "Ocarina", false));
  }

  private void saveQuestion1067() {
    Question question;

    question = questionRepository.save(new Question(8, "Which profession would normally use a Bristol board?", "2018-04-09 19:09:37"));

    answerRepository.save(new Answer(question, 'A', "Chemist", false));
    answerRepository.save(new Answer(question, 'B', "Gardener", false));
    answerRepository.save(new Answer(question, 'C', "Artist", true));
  }

  private void saveQuestion1068() {
    Question question;

    question = questionRepository.save(new Question(9, "Which of these synonyms for “small amount” comes from a Japanese word?", "2018-04-09 19:10:22"));

    answerRepository.save(new Answer(question, 'A', "Skosh", true));
    answerRepository.save(new Answer(question, 'B', "Bit", false));
    answerRepository.save(new Answer(question, 'C', "Iota", false));
  }

  private void saveQuestion1069() {
    Question question;

    question = questionRepository.save(new Question(10, "When England had no monarch during the 17th century, the ruler held what title?", "2018-04-09 19:11:12"));

    answerRepository.save(new Answer(question, 'A', "Lord Protector", true));
    answerRepository.save(new Answer(question, 'B', "Executive Regent", false));
    answerRepository.save(new Answer(question, 'C', "Minister General", false));
  }

  private void saveQuestion1070() {
    Question question;

    question = questionRepository.save(new Question(11, "Which of these Super Mario trademarks was featured in the 1983 arcade game “Mario Bros.”?", "2018-04-09 19:11:57"));

    answerRepository.save(new Answer(question, 'A', "Fire Flower", false));
    answerRepository.save(new Answer(question, 'B', "Scrolli… https://t.co/T8di3DsKDv", false));
  }

  private void saveQuestion1071() {
    Question question;

    question = questionRepository.save(new Question(12, "In Canada's national anthem, what word is used to describe Canadian hearts?", "2018-04-09 19:13:06"));

    answerRepository.save(new Answer(question, 'A', "True", false));
    answerRepository.save(new Answer(question, 'B', "Strong", false));
    answerRepository.save(new Answer(question, 'C', "Glowing", true));
  }

  private void saveQuestion1072() {
    Question question;

    question = questionRepository.save(new Question(1, "White precipitation that falls from the sky is called what?", "2018-04-10 01:04:36"));

    answerRepository.save(new Answer(question, 'A', "Bordeaux", false));
    answerRepository.save(new Answer(question, 'B', "Snow", true));
    answerRepository.save(new Answer(question, 'C', "Henry David Thoreau", false));
  }

  private void saveQuestion1073() {
    Question question;

    question = questionRepository.save(new Question(2, "In anatomy, different parts of an organism are often separated by what?", "2018-04-10 01:05:10"));

    answerRepository.save(new Answer(question, 'A', "White picket fences", false));
    answerRepository.save(new Answer(question, 'B', "Limousine partitions", false));
    answerRepository.save(new Answer(question, 'C', "Membranes", true));
  }

  private void saveQuestion1074() {
    Question question;

    question = questionRepository.save(new Question(3, "In political elections, someone who is currently in office is known as what?", "2018-04-10 01:06:32"));

    answerRepository.save(new Answer(question, 'A', "Incumbent", true));
    answerRepository.save(new Answer(question, 'B', "Incubator", false));
    answerRepository.save(new Answer(question, 'C', "Incubus", false));
  }

  private void saveQuestion1075() {
    Question question;

    question = questionRepository.save(new Question(4, "By definition, whole-body cryotherapy traditionally involves what?", "2018-04-10 01:07:13"));

    answerRepository.save(new Answer(question, 'A', "Freezing-cold chambers", true));
    answerRepository.save(new Answer(question, 'B', "High-intensity ex… https://t.co/ytwpYFdgWt", false));
  }

  private void saveQuestion1076() {
    Question question;

    question = questionRepository.save(new Question(5, "Which of these materials is most commonly used as a plant fertilizer?", "2018-04-10 01:07:51"));

    answerRepository.save(new Answer(question, 'A', "Toothpaste", false));
    answerRepository.save(new Answer(question, 'B', "Glass", false));
    answerRepository.save(new Answer(question, 'C', "Eggshells", true));
  }

  private void saveQuestion1077() {
    Question question;

    question = questionRepository.save(new Question(6, "What word refers to 128 cubic feet of firewood?", "2018-04-10 01:08:27"));

    answerRepository.save(new Answer(question, 'A', "Cord", true));
    answerRepository.save(new Answer(question, 'B', "Course", false));
    answerRepository.save(new Answer(question, 'C', "Corner", false));
  }

  private void saveQuestion1078() {
    Question question;

    question = questionRepository.save(new Question(7, "A late 19th-century essay introduced the concept of brunch as a way to address what?", "2018-04-10 01:09:10"));

    answerRepository.save(new Answer(question, 'A', "Loss of appetite", false));
    answerRepository.save(new Answer(question, 'B', "Lack of funds", false));
    answerRepository.save(new Answer(question, 'C', "Hangover", true));
  }

  private void saveQuestion1079() {
    Question question;

    question = questionRepository.save(new Question(8, "The world’s premier cheese-rolling festival features what kind of cheese?", "2018-04-10 01:09:55"));

    answerRepository.save(new Answer(question, 'A', "Double Gloucester", true));
    answerRepository.save(new Answer(question, 'B', "St-Andre Triple… https://t.co/p1bq5gNaJZ", false));
  }

  private void saveQuestion1080() {
    Question question;

    question = questionRepository.save(new Question(9, "When read as a Roman numeral, which president’s middle initial has a value of 1000?", "2018-04-10 01:10:53"));

    answerRepository.save(new Answer(question, 'A', "James Polk", false));
    answerRepository.save(new Answer(question, 'B', "Dwight Eisenhower", false));
    answerRepository.save(new Answer(question, 'C', "Richard Nixon", true));
  }

  private void saveQuestion1081() {
    Question question;

    question = questionRepository.save(new Question(10, "The Lil Wayne hit “6 Foot 7 Foot” samples a song prominently featured in which Tim Burton film?", "2018-04-10 01:11:31"));

    answerRepository.save(new Answer(question, 'A', "Beetlejuice", true));
    answerRepository.save(new Answer(question, 'B', "Mars Attacks!", false));
    answerRepository.save(new Answer(question, 'C', "Batman", false));
  }

  private void saveQuestion1082() {
    Question question;

    question = questionRepository.save(new Question(11, "Which of these is a real title from the “Mr. Men” book series?", "2018-04-10 01:12:24"));

    answerRepository.save(new Answer(question, 'A', "Mr. Thoughtful", false));
    answerRepository.save(new Answer(question, 'B', "Mr. Nonsense", true));
    answerRepository.save(new Answer(question, 'C', "Mr. No", false));
  }

  private void saveQuestion1083() {
    Question question;

    question = questionRepository.save(new Question(12, "Which of these bands did NOT play at the inaugural Coachella festival?", "2018-04-10 01:13:45"));

    answerRepository.save(new Answer(question, 'A', "Beck", false));
    answerRepository.save(new Answer(question, 'B', "Tool", false));
    answerRepository.save(new Answer(question, 'C', "Radiohead", true));
  }

  private void saveQuestion1084() {
    Question question;

    question = questionRepository.save(new Question(1, "Which of these is a common circus act?", "2018-04-10 19:04:03"));

    answerRepository.save(new Answer(question, 'A', "DJ battle", false));
    answerRepository.save(new Answer(question, 'B', "History lecture", false));
    answerRepository.save(new Answer(question, 'C', "Human cannonball", true));
  }

  private void saveQuestion1085() {
    Question question;

    question = questionRepository.save(new Question(2, "What character appears on stickers that warn children of poisons?", "2018-04-10 19:04:48"));

    answerRepository.save(new Answer(question, 'A', "Mr. Yum", false));
    answerRepository.save(new Answer(question, 'B', "Mr. Yuk", true));
    answerRepository.save(new Answer(question, 'C', "Mr. D. Lishus", false));
  }

  private void saveQuestion1086() {
    Question question;

    question = questionRepository.save(new Question(3, "What color is in the middle of most three-color traffic lights?", "2018-04-10 19:06:02"));

    answerRepository.save(new Answer(question, 'A', "Yellow", true));
    answerRepository.save(new Answer(question, 'B', "Green", false));
    answerRepository.save(new Answer(question, 'C', "Red", false));
  }

  private void saveQuestion1087() {
    Question question;

    question = questionRepository.save(new Question(4, "What is the official language of Brazil?", "2018-04-10 19:06:43"));

    answerRepository.save(new Answer(question, 'A', "Spanish", false));
    answerRepository.save(new Answer(question, 'B', "French", false));
    answerRepository.save(new Answer(question, 'C', "Portuguese", true));
  }

  private void saveQuestion1088() {
    Question question;

    question = questionRepository.save(new Question(5, "Which of the following pastas literally translates to “little ears”?", "2018-04-10 19:07:23"));

    answerRepository.save(new Answer(question, 'A', "Rotelle", false));
    answerRepository.save(new Answer(question, 'B', "Ricciolini", false));
    answerRepository.save(new Answer(question, 'C', "Orecchiette", true));
  }

  private void saveQuestion1089() {
    Question question;

    question = questionRepository.save(new Question(6, "What are the scientists on “The Muppet Show” named for?", "2018-04-10 19:08:08"));

    answerRepository.save(new Answer(question, 'A', "Lab equipment", true));
    answerRepository.save(new Answer(question, 'B', "Astronomers", false));
    answerRepository.save(new Answer(question, 'C', "Universities", false));
  }

  private void saveQuestion1090() {
    Question question;

    question = questionRepository.save(new Question(7, "What shape are the faces of an octahedron?", "2018-04-10 19:08:44"));

    answerRepository.save(new Answer(question, 'A', "Trapezoids", false));
    answerRepository.save(new Answer(question, 'B', "Pentagons", false));
    answerRepository.save(new Answer(question, 'C', "Triangles", true));
  }

  private void saveQuestion1091() {
    Question question;

    question = questionRepository.save(new Question(8, "Which is NOT the name of a Marx Brother?", "2018-04-10 19:09:30"));

    answerRepository.save(new Answer(question, 'A', "Zeppo", false));
    answerRepository.save(new Answer(question, 'B', "Gummo", false));
    answerRepository.save(new Answer(question, 'C', "Jocko", true));
  }

  private void saveQuestion1092() {
    Question question;

    question = questionRepository.save(new Question(9, "When put side by side, which two state postal abbreviations form a postal word?", "2018-04-10 19:10:24"));

    answerRepository.save(new Answer(question, 'A', "Mississippi / Iowa", false));
    answerRepository.save(new Answer(question, 'B', "Missouri /… https://t.co/9FLGvqCdig", false));
  }

  private void saveQuestion1093() {
    Question question;

    question = questionRepository.save(new Question(10, "Which US state's capital lies at the highest altitude?", "2018-04-10 19:11:04"));

    answerRepository.save(new Answer(question, 'A', "Colorado", false));
    answerRepository.save(new Answer(question, 'B', "Wyoming", false));
    answerRepository.save(new Answer(question, 'C', "New Mexico", true));
  }

  private void saveQuestion1094() {
    Question question;

    question = questionRepository.save(new Question(11, "What did Mr. Potato Head give to C. Everett Koop at a 1980s press event?", "2018-04-10 19:11:51"));

    answerRepository.save(new Answer(question, 'A', "Plant", false));
    answerRepository.save(new Answer(question, 'B', "Plaque", false));
    answerRepository.save(new Answer(question, 'C', "Pipe", true));
  }

  private void saveQuestion1095() {
    Question question;

    question = questionRepository.save(new Question(12, "Which UK country has a NON-mythical national animal?", "2018-04-10 19:12:58"));

    answerRepository.save(new Answer(question, 'A', "England", true));
    answerRepository.save(new Answer(question, 'B', "Scotland", false));
    answerRepository.save(new Answer(question, 'C', "Wales", false));
  }

  private void saveQuestion1096() {
    Question question;

    question = questionRepository.save(new Question(1, "Which of these is the name of an island in Hawaii?", "2018-04-11 01:04:03"));

    answerRepository.save(new Answer(question, 'A', "Australia", false));
    answerRepository.save(new Answer(question, 'B', "Iceland", false));
    answerRepository.save(new Answer(question, 'C', "Maui", true));
  }

  private void saveQuestion1097() {
    Question question;

    question = questionRepository.save(new Question(2, "In a humorous saying for British nobility, the second-born child is known as the what?", "2018-04-11 01:04:39"));

    answerRepository.save(new Answer(question, 'A', "Flair", false));
    answerRepository.save(new Answer(question, 'B', "Cher", false));
    answerRepository.save(new Answer(question, 'C', "Spare", true));
  }

  private void saveQuestion1098() {
    Question question;

    question = questionRepository.save(new Question(3, "Which of these clothing items is specifically worn to handle cold weather?", "2018-04-11 01:05:41"));

    answerRepository.save(new Answer(question, 'A', "Parka", true));
    answerRepository.save(new Answer(question, 'B', "Slip", false));
    answerRepository.save(new Answer(question, 'C', "Culottes", false));
  }

  private void saveQuestion1099() {
    Question question;

    question = questionRepository.save(new Question(4, "Thanks to an old process for quick copying, architectural plans are traditionally what color?", "2018-04-11 01:06:17"));

    answerRepository.save(new Answer(question, 'A', "Black", false));
    answerRepository.save(new Answer(question, 'B', "Orange", false));
    answerRepository.save(new Answer(question, 'C', "Blue", true));
  }

  private void saveQuestion1100() {
    Question question;

    question = questionRepository.save(new Question(5, "Which popular game uses a doubling cube?", "2018-04-11 01:06:55"));

    answerRepository.save(new Answer(question, 'A', "Bunco", false));
    answerRepository.save(new Answer(question, 'B', "Backgammon", true));
    answerRepository.save(new Answer(question, 'C', "Yahtzee", false));
  }

  private void saveQuestion1101() {
    Question question;

    question = questionRepository.save(new Question(6, "Which word is spelled the same way in the United States and the United Kingdom?", "2018-04-11 01:07:40"));

    answerRepository.save(new Answer(question, 'A', "Television", true));
    answerRepository.save(new Answer(question, 'B', "Center", false));
    answerRepository.save(new Answer(question, 'C', "Humor", false));
  }

  private void saveQuestion1102() {
    Question question;

    question = questionRepository.save(new Question(7, "During World War I, what dog breed was widely renamed “liberty hound” in the US?", "2018-04-11 01:08:14"));

    answerRepository.save(new Answer(question, 'A', "Golden Retriever", false));
    answerRepository.save(new Answer(question, 'B', "English Mastiff", false));
    answerRepository.save(new Answer(question, 'C', "Wiener dog", true));
  }

  private void saveQuestion1103() {
    Question question;

    question = questionRepository.save(new Question(8, "Which of these is a required exam at Harry Potter's Hogwarts school?", "2018-04-11 01:09:00"));

    answerRepository.save(new Answer(question, 'A', "O.W.L.", true));
    answerRepository.save(new Answer(question, 'B', "T.O.A.D.", false));
    answerRepository.save(new Answer(question, 'C', "C.A.T.", false));
  }

  private void saveQuestion1104() {
    Question question;

    question = questionRepository.save(new Question(9, "The earliest known human writing occurred near what river?", "2018-04-11 01:09:42"));

    answerRepository.save(new Answer(question, 'A', "Tigris", true));
    answerRepository.save(new Answer(question, 'B', "Thames", false));
    answerRepository.save(new Answer(question, 'C', "Yangtze", false));
  }

  private void saveQuestion1105() {
    Question question;

    question = questionRepository.save(new Question(10, "In Dr. Seuss’s “The Cat in the Hat Comes Back,” what is inside the Cat’s hat?", "2018-04-11 01:10:19"));

    answerRepository.save(new Answer(question, 'A', "Many smaller cats", true));
    answerRepository.save(new Answer(question, 'B', "All-weather… https://t.co/gYkv7zd73J", false));
  }

  private void saveQuestion1106() {
    Question question;

    question = questionRepository.save(new Question(11, "Which pair of nations has units of currency with the same name?", "2018-04-11 01:10:59"));

    answerRepository.save(new Answer(question, 'A', "Egypt / Australia", false));
    answerRepository.save(new Answer(question, 'B', "Fiji / Gabon", false));
    answerRepository.save(new Answer(question, 'C', "India / Seychelles", true));
  }

  private void saveQuestion1107() {
    Question question;

    question = questionRepository.save(new Question(12, "Which has NOT been the name of an Android operating system?", "2018-04-11 01:11:57"));

    answerRepository.save(new Answer(question, 'A', "Jelly Bean", false));
    answerRepository.save(new Answer(question, 'B', "Butterscotch", true));
    answerRepository.save(new Answer(question, 'C', "Froyo", false));
  }

  private void saveQuestion1108() {
    Question question;

    question = questionRepository.save(new Question(1, "What do candles on a birthday cake traditionally represent?", "2018-04-11 20:15:06"));

    answerRepository.save(new Answer(question, 'A', "Number of friends", false));
    answerRepository.save(new Answer(question, 'B', "Age", true));
    answerRepository.save(new Answer(question, 'C', "Love of fire", false));
  }

  private void saveQuestion1109() {
    Question question;

    question = questionRepository.save(new Question(2, "Which of these Georges was a US president?", "2018-04-11 20:15:51"));

    answerRepository.save(new Answer(question, 'A', "George Washington", true));
    answerRepository.save(new Answer(question, 'B', "George Jefferson", false));
    answerRepository.save(new Answer(question, 'C', "George Clinton", false));
  }

  private void saveQuestion1110() {
    Question question;

    question = questionRepository.save(new Question(3, "The biggest lake in the US borders which of these states?", "2018-04-11 20:17:55"));

    answerRepository.save(new Answer(question, 'A', "Illinois", false));
    answerRepository.save(new Answer(question, 'B', "Iowa", false));
    answerRepository.save(new Answer(question, 'C', "Wisconsin", true));
  }

  private void saveQuestion1111() {
    Question question;

    question = questionRepository.save(new Question(4, "What land animal holds the Guinness World Record for the largest mouth?", "2018-04-11 20:18:47"));

    answerRepository.save(new Answer(question, 'A', "Hippopotamus", true));
    answerRepository.save(new Answer(question, 'B', "African elephant", false));
    answerRepository.save(new Answer(question, 'C', "Bengal tiger", false));
  }

  private void saveQuestion1112() {
    Question question;

    question = questionRepository.save(new Question(5, "Where is the largest sawgrass prairie in North America?", "2018-04-11 20:19:35"));

    answerRepository.save(new Answer(question, 'A', "Montana", false));
    answerRepository.save(new Answer(question, 'B', "Arkansas", false));
    answerRepository.save(new Answer(question, 'C', "Florida", true));
  }

  private void saveQuestion1113() {
    Question question;

    question = questionRepository.save(new Question(6, "Which of these scientists is credited as the first to give her subjects names instead of numbers?", "2018-04-11 20:20:32"));

    answerRepository.save(new Answer(question, 'A', "Margaret Mead… https://t.co/GAExmO54pT", false));
  }

  private void saveQuestion1114() {
    Question question;

    question = questionRepository.save(new Question(7, "Which of these best describes the symbol for “NOT” in American Sign Language?", "2018-04-11 20:21:48"));

    answerRepository.save(new Answer(question, 'A', "Crossed forearms", false));
    answerRepository.save(new Answer(question, 'B', "Index finger t… https://t.co/lFOyPaVDmg", false));
  }

  private void saveQuestion1115() {
    Question question;

    question = questionRepository.save(new Question(8, "Measured by magnitude, the largest recorded earthquake in US history hit what city hardest?", "2018-04-11 20:22:00"));

    answerRepository.save(new Answer(question, 'A', "San Francisco, CA", false));
    answerRepository.save(new Answer(question, 'B', "", false));
  }

  private void saveQuestion1116() {
    Question question;

    question = questionRepository.save(new Question(9, "Which of these is NOT a word in the gene-editing acronym CRISPR?", "2018-04-11 20:22:49"));

    answerRepository.save(new Answer(question, 'A', "Palindromic", false));
    answerRepository.save(new Answer(question, 'B', "Repeats", false));
    answerRepository.save(new Answer(question, 'C', "Sequence", true));
  }

  private void saveQuestion1117() {
    Question question;

    question = questionRepository.save(new Question(10, "Koko the gorilla is famous for doing which of these things?", "2018-04-11 20:23:43"));

    answerRepository.save(new Answer(question, 'A', "Knowing her birthday", false));
    answerRepository.save(new Answer(question, 'B', "Meeting a US president", false));
    answerRepository.save(new Answer(question, 'C', "Keeping a pet", true));
  }

  private void saveQuestion1118() {
    Question question;

    question = questionRepository.save(new Question(11, "In the original “Rampage” arcade game, which monster’s face is NOT featured on the title screen?", "2018-04-11 20:24:37"));

    answerRepository.save(new Answer(question, 'A', "Gorilla", true));
    answerRepository.save(new Answer(question, 'B', "Lizard", false));
    answerRepository.save(new Answer(question, 'C', "Werewolf", false));
  }

  private void saveQuestion1119() {
    Question question;

    question = questionRepository.save(new Question(12, "According to ancient Rome’s iconic epic, what hero was hidden inside the Trojan Horse?", "2018-04-11 20:25:41"));

    answerRepository.save(new Answer(question, 'A', "Hercules", false));
    answerRepository.save(new Answer(question, 'B', "Ulysses", true));
    answerRepository.save(new Answer(question, 'C', "Achilles", false));
  }

  private void saveQuestion1120() {
    Question question;

    question = questionRepository.save(new Question(13, "Which of these synonyms for “big” traces its roots to the biggest country on Earth?", "2018-04-11 20:27:08"));

    answerRepository.save(new Answer(question, 'A', "Behemoth", false));
    answerRepository.save(new Answer(question, 'B', "Gargantuan", false));
    answerRepository.save(new Answer(question, 'C', "Mammoth", true));
  }

  private void saveQuestion1121() {
    Question question;

    question = questionRepository.save(new Question(1, "In a popular saying, “a picture is worth a thousand” what?", "2018-04-12 01:05:31"));

    answerRepository.save(new Answer(question, 'A', "Photoshop tweaks", false));
    answerRepository.save(new Answer(question, 'B', "Bitcoins", false));
    answerRepository.save(new Answer(question, 'C', "Words", true));
  }

  private void saveQuestion1122() {
    Question question;

    question = questionRepository.save(new Question(2, "Which of these is one of the five standard human senses?", "2018-04-12 01:06:08"));

    answerRepository.save(new Answer(question, 'A', "Touch", true));
    answerRepository.save(new Answer(question, 'B', "Hutch", false));
    answerRepository.save(new Answer(question, 'C', "Smutch", false));
  }

  private void saveQuestion1123() {
    Question question;

    question = questionRepository.save(new Question(3, "A 2002 law requires US candidates to say which of these phrases in political ads?", "2018-04-12 01:07:04"));

    answerRepository.save(new Answer(question, 'A', "I approve this message", true));
    answerRepository.save(new Answer(question, 'B', "My… https://t.co/js8KMtaDP1", false));
  }

  private void saveQuestion1124() {
    Question question;

    question = questionRepository.save(new Question(4, "What is the proper name for a maker of barrels?", "2018-04-12 01:07:41"));

    answerRepository.save(new Answer(question, 'A', "Cooper", true));
    answerRepository.save(new Answer(question, 'B', "Fletcher", false));
    answerRepository.save(new Answer(question, 'C', "Chandler", false));
  }

  private void saveQuestion1125() {
    Question question;

    question = questionRepository.save(new Question(5, "Passing a soccer ball through an opponent’s legs is known as a what?", "2018-04-12 01:08:34"));

    answerRepository.save(new Answer(question, 'A', "Peppercorn", false));
    answerRepository.save(new Answer(question, 'B', "Star anise", false));
    answerRepository.save(new Answer(question, 'C', "Nutmeg", true));
  }

  private void saveQuestion1126() {
    Question question;

    question = questionRepository.save(new Question(6, "Which of these major cities is NOT a state capital?", "2018-04-12 01:09:12"));

    answerRepository.save(new Answer(question, 'A', "Boston", false));
    answerRepository.save(new Answer(question, 'B', "Denver", false));
    answerRepository.save(new Answer(question, 'C', "Detroit", true));
  }

  private void saveQuestion1127() {
    Question question;

    question = questionRepository.save(new Question(7, "Rockstar Games has produced two video games based on which film franchise?", "2018-04-12 01:10:00"));

    answerRepository.save(new Answer(question, 'A', "The Fast and the Furious", false));
    answerRepository.save(new Answer(question, 'B', "Shrek", false));
    answerRepository.save(new Answer(question, 'C', "Austin Powers", true));
  }

  private void saveQuestion1128() {
    Question question;

    question = questionRepository.save(new Question(8, "The first beta blocker was developed to treat what ailment?", "2018-04-12 01:10:46"));

    answerRepository.save(new Answer(question, 'A', "Sinus infection", false));
    answerRepository.save(new Answer(question, 'B', "Chest pain", true));
    answerRepository.save(new Answer(question, 'C', "High blood pressure", false));
  }

  private void saveQuestion1129() {
    Question question;

    question = questionRepository.save(new Question(9, "The reality show “Strange Love” starred a founding member of what hip-hop act?", "2018-04-12 01:11:41"));

    answerRepository.save(new Answer(question, 'A', "Run-DMC", false));
    answerRepository.save(new Answer(question, 'B', "Wu-Tang Clan", false));
    answerRepository.save(new Answer(question, 'C', "Public Enemy", true));
  }

  private void saveQuestion1130() {
    Question question;

    question = questionRepository.save(new Question(10, "A bull terrier honored by the military after World War I later became what university’s mascot?", "2018-04-12 01:12:19"));

    answerRepository.save(new Answer(question, 'A', "Navy", false));
    answerRepository.save(new Answer(question, 'B', "Universi… https://t.co/mEFphCtX0C", false));
  }

  private void saveQuestion1131() {
    Question question;

    question = questionRepository.save(new Question(11, "Theo and Noah are the names of what animals gifted to the pope for Christmas 2014?", "2018-04-12 01:12:58"));

    answerRepository.save(new Answer(question, 'A', "Donkeys", true));
    answerRepository.save(new Answer(question, 'B', "Platypuses", false));
    answerRepository.save(new Answer(question, 'C', "Ravens", false));
  }

  private void saveQuestion1132() {
    Question question;

    question = questionRepository.save(new Question(12, "Which of these songs does NOT have the same melody as the other two?", "2018-04-12 01:14:07"));

    answerRepository.save(new Answer(question, 'A', "The Alphabet Song", false));
    answerRepository.save(new Answer(question, 'B', "Frère Jacques", true));
    answerRepository.save(new Answer(question, 'C', "Baa Baa Black Sheep", false));
  }

  private void saveQuestion1133() {
    Question question;

    question = questionRepository.save(new Question(1, "What does the small hand on a clock typically indicate?", "2018-04-12 19:04:03"));

    answerRepository.save(new Answer(question, 'A', "Hours", true));
    answerRepository.save(new Answer(question, 'B', "Wolves", false));
    answerRepository.save(new Answer(question, 'C', "Dumplings", false));
  }

  private void saveQuestion1134() {
    Question question;

    question = questionRepository.save(new Question(2, "What are French fries usually made out of?", "2018-04-12 19:04:47"));

    answerRepository.save(new Answer(question, 'A', "Potatoes", true));
    answerRepository.save(new Answer(question, 'B', "Leeks", false));
    answerRepository.save(new Answer(question, 'C', "Lettuce", false));
  }

  private void saveQuestion1135() {
    Question question;

    question = questionRepository.save(new Question(3, "Which of these is a common breed of cat?", "2018-04-12 19:05:20"));

    answerRepository.save(new Answer(question, 'A', "American Shorthair", true));
    answerRepository.save(new Answer(question, 'B', "Border Collie", false));
    answerRepository.save(new Answer(question, 'C', "Great Dane", false));
  }

  private void saveQuestion1136() {
    Question question;

    question = questionRepository.save(new Question(4, "In construction, steel rods that are used to reinforce concrete are called what?", "2018-04-12 19:05:58"));

    answerRepository.save(new Answer(question, 'A', "Rebars", true));
    answerRepository.save(new Answer(question, 'B', "Rebuses", false));
    answerRepository.save(new Answer(question, 'C', "Rebukes", false));
  }

  private void saveQuestion1137() {
    Question question;

    question = questionRepository.save(new Question(5, "By definition, where are people known as Turkmen from?", "2018-04-12 19:06:40"));

    answerRepository.save(new Answer(question, 'A', "Turkmenistan", true));
    answerRepository.save(new Answer(question, 'B', "Turks and Caicos Islands", false));
    answerRepository.save(new Answer(question, 'C', "Turkey", false));
  }

  private void saveQuestion1138() {
    Question question;

    question = questionRepository.save(new Question(6, "Our solar system’s main asteroid belt lies between the orbits of which two planets?", "2018-04-12 19:07:30"));

    answerRepository.save(new Answer(question, 'A', "Mercury / Venus", false));
    answerRepository.save(new Answer(question, 'B', "Jupiter /… https://t.co/sdeHue1RxX", false));
  }

  private void saveQuestion1139() {
    Question question;

    question = questionRepository.save(new Question(7, "What is the name of the company behind the classic “Doom” and “Quake” computer games?", "2018-04-12 19:08:15"));

    answerRepository.save(new Answer(question, 'A', "Id", true));
    answerRepository.save(new Answer(question, 'B', "Superego", false));
    answerRepository.save(new Answer(question, 'C', "Ego", false));
  }

  private void saveQuestion1140() {
    Question question;

    question = questionRepository.save(new Question(8, "Which of these US presidents was NEVER impeached?", "2018-04-12 19:08:55"));

    answerRepository.save(new Answer(question, 'A', "Richard Nixon", true));
    answerRepository.save(new Answer(question, 'B', "Bill Clinton", false));
    answerRepository.save(new Answer(question, 'C', "Andrew Johnson", false));
  }

  private void saveQuestion1141() {
    Question question;

    question = questionRepository.save(new Question(9, "Dr. Charles Drew’s greatest contribution to medicine was in what area?", "2018-04-12 19:09:42"));

    answerRepository.save(new Answer(question, 'A', "Cardiology", false));
    answerRepository.save(new Answer(question, 'B', "Hematology", true));
    answerRepository.save(new Answer(question, 'C', "Osteology", false));
  }

  private void saveQuestion1142() {
    Question question;

    question = questionRepository.save(new Question(10, "Which of these animals is NOT known to have passed the mirror self-recognition test?", "2018-04-12 19:10:26"));

    answerRepository.save(new Answer(question, 'A', "Magpie", false));
    answerRepository.save(new Answer(question, 'B', "Dolphin", false));
    answerRepository.save(new Answer(question, 'C', "Gibbon", true));
  }

  private void saveQuestion1143() {
    Question question;

    question = questionRepository.save(new Question(11, "Which is both a type of subatomic quark particle and a Motorola smartphone?", "2018-04-12 19:11:08"));

    answerRepository.save(new Answer(question, 'A', "Spice", false));
    answerRepository.save(new Answer(question, 'B', "Charm", true));
    answerRepository.save(new Answer(question, 'C', "Up", false));
  }

  private void saveQuestion1144() {
    Question question;

    question = questionRepository.save(new Question(12, "The world's largest living single-stem tree is named for a soldier who fought where?", "2018-04-12 19:12:09"));

    answerRepository.save(new Answer(question, 'A', "Battle of Shiloh", true));
    answerRepository.save(new Answer(question, 'B', "Battl… https://t.co/qshxJ7qdC4", false));
  }

  private void saveQuestion1145() {
    Question question;

    question = questionRepository.save(new Question(1, "According to the old saying, “actions speak louder than” what?", "2018-04-13 01:04:09"));

    answerRepository.save(new Answer(question, 'A', "Words", true));
    answerRepository.save(new Answer(question, 'B', "Washing machines", false));
    answerRepository.save(new Answer(question, 'C', "Wendy Williams", false));
  }

  private void saveQuestion1146() {
    Question question;

    question = questionRepository.save(new Question(2, "The author Bram Stoker created what famous vampire in 1897?", "2018-04-13 01:04:42"));

    answerRepository.save(new Answer(question, 'A', "Count Dracula", true));
    answerRepository.save(new Answer(question, 'B', "Bitey Perry", false));
    answerRepository.save(new Answer(question, 'C', "Bat Damon", false));
  }

  private void saveQuestion1147() {
    Question question;

    question = questionRepository.save(new Question(3, "Which of these cinnamons is typically found at the supermarket?", "2018-04-13 01:05:18"));

    answerRepository.save(new Answer(question, 'A', "Cinnamon seeds", false));
    answerRepository.save(new Answer(question, 'B', "Cinnamon bricks", false));
    answerRepository.save(new Answer(question, 'C', "Cinnamon sticks", true));
  }

  private void saveQuestion1148() {
    Question question;

    question = questionRepository.save(new Question(4, "“Le Monde” is a daily newspaper based in what capital city?", "2018-04-13 01:05:54"));

    answerRepository.save(new Answer(question, 'A', "Rome", false));
    answerRepository.save(new Answer(question, 'B', "Madrid", false));
    answerRepository.save(new Answer(question, 'C', "Paris", true));
  }

  private void saveQuestion1149() {
    Question question;

    question = questionRepository.save(new Question(5, "Which of these words refers to a part of a bird’s stomach that grinds food?", "2018-04-13 01:06:33"));

    answerRepository.save(new Answer(question, 'A', "Gizzard", true));
    answerRepository.save(new Answer(question, 'B', "Mizzen", false));
    answerRepository.save(new Answer(question, 'C', "Doozle", false));
  }

  private void saveQuestion1150() {
    Question question;

    question = questionRepository.save(new Question(6, "What classic game features a piece called a spinner?", "2018-04-13 01:07:09"));

    answerRepository.save(new Answer(question, 'A', "Tiddlywinks", false));
    answerRepository.save(new Answer(question, 'B', "Dominoes", true));
    answerRepository.save(new Answer(question, 'C', "Jacks", false));
  }

  private void saveQuestion1151() {
    Question question;

    question = questionRepository.save(new Question(7, "A famous Emily Dickinson poem compared which of these phenomena to a bee?", "2018-04-13 01:07:50"));

    answerRepository.save(new Answer(question, 'A', "Hope", false));
    answerRepository.save(new Answer(question, 'B', "Fame", true));
    answerRepository.save(new Answer(question, 'C', "Joy", false));
  }

  private void saveQuestion1152() {
    Question question;

    question = questionRepository.save(new Question(8, "The DARPA project “FastRunner” is a robot whose design resembles what speedy animal?", "2018-04-13 01:08:46"));

    answerRepository.save(new Answer(question, 'A', "Tiger", false));
    answerRepository.save(new Answer(question, 'B', "Dog", false));
    answerRepository.save(new Answer(question, 'C', "Ostrich", true));
  }

  private void saveQuestion1153() {
    Question question;

    question = questionRepository.save(new Question(9, "Which of these culinary terms is also the name of an active volcano?", "2018-04-13 01:09:20"));

    answerRepository.save(new Answer(question, 'A', "Fra Diavolo", false));
    answerRepository.save(new Answer(question, 'B', "Marsala", false));
    answerRepository.save(new Answer(question, 'C', "Stromboli", true));
  }

  private void saveQuestion1154() {
    Question question;

    question = questionRepository.save(new Question(10, "Which of these hit ’80s songs is NOT by a band whose name is a continent?", "2018-04-13 01:09:56"));

    answerRepository.save(new Answer(question, 'A', "Heat of the Moment", false));
    answerRepository.save(new Answer(question, 'B', "Eye of the Tiger", true));
    answerRepository.save(new Answer(question, 'C', "The Final Countdown", false));
  }

  private void saveQuestion1155() {
    Question question;

    question = questionRepository.save(new Question(11, "Which candy company’s name was formed from its founder’s name and home city?", "2018-04-13 01:10:34"));

    answerRepository.save(new Answer(question, 'A', "Hershey", false));
    answerRepository.save(new Answer(question, 'B', "Haribo", true));
    answerRepository.save(new Answer(question, 'C', "Necco", false));
  }

  private void saveQuestion1156() {
    Question question;

    question = questionRepository.save(new Question(12, "Which of these ’80s films has the greatest age gap between its romantic leads?", "2018-04-13 01:11:47"));

    answerRepository.save(new Answer(question, 'A', "Moonstruck", true));
    answerRepository.save(new Answer(question, 'B', "Overboard", false));
    answerRepository.save(new Answer(question, 'C', "Bull Durham", false));
  }

  private void saveQuestion1157() {
    Question question;

    question = questionRepository.save(new Question(1, "What does a thermometer primarily measure?", "2018-04-13 19:04:25"));

    answerRepository.save(new Answer(question, 'A', "Hope", false));
    answerRepository.save(new Answer(question, 'B', "Temperature", true));
    answerRepository.save(new Answer(question, 'C', "Distance", false));
  }

  private void saveQuestion1158() {
    Question question;

    question = questionRepository.save(new Question(2, "What common term means a prying or interfering person?", "2018-04-13 19:04:56"));

    answerRepository.save(new Answer(question, 'A', "Bossybaby", false));
    answerRepository.save(new Answer(question, 'B', "Buzzybiddy", false));
    answerRepository.save(new Answer(question, 'C', "Busybody", true));
  }

  private void saveQuestion1159() {
    Question question;

    question = questionRepository.save(new Question(3, "The term “blog” is short for what?", "2018-04-13 19:05:32"));

    answerRepository.save(new Answer(question, 'A', "Back-linking of guests", false));
    answerRepository.save(new Answer(question, 'B', "Web log", true));
    answerRepository.save(new Answer(question, 'C', "Bluetooth object gate", false));
  }

  private void saveQuestion1160() {
    Question question;

    question = questionRepository.save(new Question(4, "Which of these animals is a crustacean?", "2018-04-13 19:06:09"));

    answerRepository.save(new Answer(question, 'A', "Fiddler crab", true));
    answerRepository.save(new Answer(question, 'B', "Recluse spider", false));
    answerRepository.save(new Answer(question, 'C', "Pilot fish", false));
  }

  private void saveQuestion1161() {
    Question question;

    question = questionRepository.save(new Question(5, "An actor who speaks directly to the camera or audience is said to be breaking what?", "2018-04-13 19:06:44"));

    answerRepository.save(new Answer(question, 'A', "The third camera", false));
    answerRepository.save(new Answer(question, 'B', "The four… https://t.co/IoTBQxlP00", false));
  }

  private void saveQuestion1162() {
    Question question;

    question = questionRepository.save(new Question(6, "What is the island containing Haiti and the Dominican Republic called?", "2018-04-13 19:07:28"));

    answerRepository.save(new Answer(question, 'A', "Dominica", false));
    answerRepository.save(new Answer(question, 'B', "New Providence", false));
    answerRepository.save(new Answer(question, 'C', "Hispaniola", true));
  }

  private void saveQuestion1163() {
    Question question;

    question = questionRepository.save(new Question(7, "Which of these is an actual Nobel Prize category?", "2018-04-13 19:08:09"));

    answerRepository.save(new Answer(question, 'A', "Chemistry", true));
    answerRepository.save(new Answer(question, 'B', "Engineering", false));
    answerRepository.save(new Answer(question, 'C', "Mathematics", false));
  }

  private void saveQuestion1164() {
    Question question;

    question = questionRepository.save(new Question(8, "What is the name of George RR Martin’s best-selling fantasy novel series?", "2018-04-13 19:08:54"));

    answerRepository.save(new Answer(question, 'A', "A Song of Ice and Fire", true));
    answerRepository.save(new Answer(question, 'B', "The Rains… https://t.co/syJ9dGlPz8", false));
  }

  private void saveQuestion1165() {
    Question question;

    question = questionRepository.save(new Question(9, "For the US 50 State Quarters Program, Ohio and North Carolina argued over the rights to a famous what?", "2018-04-13 19:09:40"));

    answerRepository.save(new Answer(question, 'A', "Vehicle", true));
    answerRepository.save(new Answer(question, 'B', "Building", false));
    answerRepository.save(new Answer(question, 'C', "Animal", false));
  }

  private void saveQuestion1166() {
    Question question;

    question = questionRepository.save(new Question(10, "Including today, how many “Friday the 13ths” will occur during 2018?", "2018-04-13 19:10:17"));

    answerRepository.save(new Answer(question, 'A', "Two", true));
    answerRepository.save(new Answer(question, 'B', "Four", false));
    answerRepository.save(new Answer(question, 'C', "Six", false));
  }

  private void saveQuestion1167() {
    Question question;

    question = questionRepository.save(new Question(11, "Which of these is a bone in the human body AND a geometric form?", "2018-04-13 19:11:00"));

    answerRepository.save(new Answer(question, 'A', "Ethmoid", false));
    answerRepository.save(new Answer(question, 'B', "Rhomboid", false));
    answerRepository.save(new Answer(question, 'C', "Trapezium", true));
  }

  private void saveQuestion1168() {
    Question question;

    question = questionRepository.save(new Question(12, "Which of these mountain peaks does NOT get its name from a color?", "2018-04-13 19:12:12"));

    answerRepository.save(new Answer(question, 'A', "Monte Rosa, Switzerland", true));
    answerRepository.save(new Answer(question, 'B', "Pico Turquino, Cuba", false));
    answerRepository.save(new Answer(question, 'C', "Mont Blanc, France", false));
  }

  private void saveQuestion1169() {
    Question question;

    question = questionRepository.save(new Question(1, "What playwright wrote “Macbeth”?", "2018-04-14 01:06:25"));

    answerRepository.save(new Answer(question, 'A', "Tommy Wiseau", false));
    answerRepository.save(new Answer(question, 'B', "William Shakespeare", true));
    answerRepository.save(new Answer(question, 'C', "Lin-Manuel Miranda", false));
  }

  private void saveQuestion1170() {
    Question question;

    question = questionRepository.save(new Question(2, "What device is used to amplify sound?", "2018-04-14 01:07:09"));

    answerRepository.save(new Answer(question, 'A', "Micrometer", false));
    answerRepository.save(new Answer(question, 'B', "Microscope", false));
    answerRepository.save(new Answer(question, 'C', "Microphone", true));
  }

  private void saveQuestion1171() {
    Question question;

    question = questionRepository.save(new Question(3, "What sport usually has higher numbers in the final score than the other two?", "2018-04-14 01:07:58"));

    answerRepository.save(new Answer(question, 'A', "Soccer", false));
    answerRepository.save(new Answer(question, 'B', "Football", false));
    answerRepository.save(new Answer(question, 'C', "Basketball", true));
  }

  private void saveQuestion1172() {
    Question question;

    question = questionRepository.save(new Question(4, "“The Landlord’s Game” by Elizabeth Magie evolved into what classic board game?", "2018-04-14 01:08:38"));

    answerRepository.save(new Answer(question, 'A', "Monopoly", true));
    answerRepository.save(new Answer(question, 'B', "Sorry!", false));
    answerRepository.save(new Answer(question, 'C', "Trouble", false));
  }

  private void saveQuestion1173() {
    Question question;

    question = questionRepository.save(new Question(5, "What chemical element was observed on the Sun before it was discovered on Earth?", "2018-04-14 01:09:38"));

    answerRepository.save(new Answer(question, 'A', "Helium", true));
    answerRepository.save(new Answer(question, 'B', "Hydrogen", false));
    answerRepository.save(new Answer(question, 'C', "Neon", false));
  }

  private void saveQuestion1174() {
    Question question;

    question = questionRepository.save(new Question(6, "Which Ivy League school is by far the most recently founded?", "2018-04-14 01:10:30"));

    answerRepository.save(new Answer(question, 'A', "Cornell", true));
    answerRepository.save(new Answer(question, 'B', "Brown", false));
    answerRepository.save(new Answer(question, 'C', "Dartmouth", false));
  }

  private void saveQuestion1175() {
    Question question;

    question = questionRepository.save(new Question(7, "What is the literal translation of the pope’s Twitter handle?", "2018-04-14 01:11:12"));

    answerRepository.save(new Answer(question, 'A', "The Lord's voice", false));
    answerRepository.save(new Answer(question, 'B', "Pope 26", false));
    answerRepository.save(new Answer(question, 'C', "Bridge-builder", true));
  }

  private void saveQuestion1176() {
    Question question;

    question = questionRepository.save(new Question(8, "Which of these orders of insects has the largest number of species?", "2018-04-14 01:11:53"));

    answerRepository.save(new Answer(question, 'A', "Beetles", true));
    answerRepository.save(new Answer(question, 'B', "Cockroaches", false));
    answerRepository.save(new Answer(question, 'C', "Flies", false));
  }

  private void saveQuestion1177() {
    Question question;

    question = questionRepository.save(new Question(9, "What nation’s population lives mainly on islands locally known as “North Island” and “South Island”?", "2018-04-14 01:12:37"));

    answerRepository.save(new Answer(question, 'A', "New Zealand… https://t.co/wmbm1qabAv", false));
  }

  private void saveQuestion1178() {
    Question question;

    question = questionRepository.save(new Question(10, "What was noteworthy about the world depicted in Edwin Abbott’s classic novel “Flatland”?", "2018-04-14 01:13:14"));

    answerRepository.save(new Answer(question, 'A', "Emotionless", false));
    answerRepository.save(new Answer(question, 'B', "Intense… https://t.co/cJuu5AThDK", false));
  }

  private void saveQuestion1179() {
    Question question;

    question = questionRepository.save(new Question(11, "Which is the INCORRECT pairing of actress to “Golden Girl”?", "2018-04-14 01:13:56"));

    answerRepository.save(new Answer(question, 'A', "Rue / Blanche", false));
    answerRepository.save(new Answer(question, 'B', "Betty / Sophia", true));
    answerRepository.save(new Answer(question, 'C', "Bea / Dorothy", false));
  }

  private void saveQuestion1180() {
    Question question;

    question = questionRepository.save(new Question(12, "The only Super Bowl halftime show broadcast in 3D had what theme?", "2018-04-14 01:15:11"));

    answerRepository.save(new Answer(question, 'A', "Rock ‘n’ roll magic show", true));
    answerRepository.save(new Answer(question, 'B', "Musical trip to… https://t.co/VzjX2WAiay", false));
  }

  private void saveQuestion1181() {
    Question question;

    question = questionRepository.save(new Question(1, "Which of these is one of the four cardinal directions on a compass?", "2018-04-15 01:06:39"));

    answerRepository.save(new Answer(question, 'A', "Chicago West", false));
    answerRepository.save(new Answer(question, 'B', "North", true));
    answerRepository.save(new Answer(question, 'C', "NCIS: New Orleans", false));
  }

  private void saveQuestion1182() {
    Question question;

    question = questionRepository.save(new Question(2, "A popular card game involves telling your opponent to do what?", "2018-04-15 01:07:12"));

    answerRepository.save(new Answer(question, 'A', "Get a job", false));
    answerRepository.save(new Answer(question, 'B', "Go fish", true));
    answerRepository.save(new Answer(question, 'C', "Go get me a coffee", false));
  }

  private void saveQuestion1183() {
    Question question;

    question = questionRepository.save(new Question(3, "By area, which of these US states is biggest?", "2018-04-15 01:08:09"));

    answerRepository.save(new Answer(question, 'A', "Texas", true));
    answerRepository.save(new Answer(question, 'B', "California", false));
    answerRepository.save(new Answer(question, 'C', "Utah", false));
  }

  private void saveQuestion1184() {
    Question question;

    question = questionRepository.save(new Question(4, "Surviving the Titanic earned Molly Brown what nickname?", "2018-04-15 01:08:48"));

    answerRepository.save(new Answer(question, 'A', "Unforgettable", false));
    answerRepository.save(new Answer(question, 'B', "Unsinkable", true));
    answerRepository.save(new Answer(question, 'C', "Unbreakable", false));
  }

  private void saveQuestion1185() {
    Question question;

    question = questionRepository.save(new Question(5, "Which of the following is NOT made from natural fibers?", "2018-04-15 01:09:24"));

    answerRepository.save(new Answer(question, 'A', "Olefin", true));
    answerRepository.save(new Answer(question, 'B', "Rayon", false));
    answerRepository.save(new Answer(question, 'C', "Jute", false));
  }

  private void saveQuestion1186() {
    Question question;

    question = questionRepository.save(new Question(6, "In meteorology, okta units measure which of these things?", "2018-04-15 01:10:10"));

    answerRepository.save(new Answer(question, 'A', "Wind speed", false));
    answerRepository.save(new Answer(question, 'B', "Barometric pressure", false));
    answerRepository.save(new Answer(question, 'C', "Cloudiness", true));
  }

  private void saveQuestion1187() {
    Question question;

    question = questionRepository.save(new Question(7, "Which US federal tax return form is known as the “short” one?", "2018-04-15 01:10:53"));

    answerRepository.save(new Answer(question, 'A', "Form 1040", false));
    answerRepository.save(new Answer(question, 'B', "Form 1040A", true));
    answerRepository.save(new Answer(question, 'C', "Form 1040EZ", false));
  }

  private void saveQuestion1188() {
    Question question;

    question = questionRepository.save(new Question(8, "Which of the following countries sets speed limits in miles per hour?", "2018-04-15 01:11:33"));

    answerRepository.save(new Answer(question, 'A', "Canada", false));
    answerRepository.save(new Answer(question, 'B', "India", false));
    answerRepository.save(new Answer(question, 'C', "Britain", true));
  }

  private void saveQuestion1189() {
    Question question;

    question = questionRepository.save(new Question(9, "Which of these enlightenment philosophers also wrote a ridiculously steamy novel?", "2018-04-15 01:12:14"));

    answerRepository.save(new Answer(question, 'A', "John Locke", false));
    answerRepository.save(new Answer(question, 'B', "Denis Diderot", true));
    answerRepository.save(new Answer(question, 'C', "René Descartes", false));
  }

  private void saveQuestion1190() {
    Question question;

    question = questionRepository.save(new Question(10, "A founder of publishing house Simon &amp; Schuster is the parent of a famous what?", "2018-04-15 01:12:57"));

    answerRepository.save(new Answer(question, 'A', "Architect", false));
    answerRepository.save(new Answer(question, 'B', "Singer", true));
    answerRepository.save(new Answer(question, 'C', "Athlete", false));
  }

  private void saveQuestion1191() {
    Question question;

    question = questionRepository.save(new Question(11, "Which of these entrepreneurs has the most followers on Instagram?", "2018-04-15 01:13:46"));

    answerRepository.save(new Answer(question, 'A', "Daymond John", true));
    answerRepository.save(new Answer(question, 'B', "Kevin O’Leary", false));
    answerRepository.save(new Answer(question, 'C', "Barbara Corcoran", false));
  }

  private void saveQuestion1192() {
    Question question;

    question = questionRepository.save(new Question(12, "Which of these singers has an eponymous album title?", "2018-04-15 01:14:52"));

    answerRepository.save(new Answer(question, 'A', "Demi Lovato", true));
    answerRepository.save(new Answer(question, 'B', "Carly Rae Jepsen", false));
    answerRepository.save(new Answer(question, 'C', "Selena Gomez", false));
  }

  private void saveQuestion1193() {
    Question question;

    question = questionRepository.save(new Question(1, "Which of these is a common type of building?", "2018-04-19 19:03:55"));

    answerRepository.save(new Answer(question, 'A', "Skyscraper", true));
    answerRepository.save(new Answer(question, 'B', "Sky Ferreira", false));
    answerRepository.save(new Answer(question, 'C', "Skywalker", false));
  }

  private void saveQuestion1194() {
    Question question;

    question = questionRepository.save(new Question(2, "Typically, what kind of sauce is on a cheese pizza?", "2018-04-19 19:04:25"));

    answerRepository.save(new Answer(question, 'A', "Glue", false));
    answerRepository.save(new Answer(question, 'B', "Tomato", true));
    answerRepository.save(new Answer(question, 'C', "Paint", false));
  }

  private void saveQuestion1195() {
    Question question;

    question = questionRepository.save(new Question(3, "Which of these words is also a common term in arithmetic?", "2018-04-19 19:05:05"));

    answerRepository.save(new Answer(question, 'A', "Discord", false));
    answerRepository.save(new Answer(question, 'B', "Dissolution", false));
    answerRepository.save(new Answer(question, 'C', "Division", true));
  }

  private void saveQuestion1196() {
    Question question;

    question = questionRepository.save(new Question(4, "Which of these is a real zodiac sign?", "2018-04-19 19:05:38"));

    answerRepository.save(new Answer(question, 'A', "Equinox", false));
    answerRepository.save(new Answer(question, 'B', "Taurus", true));
    answerRepository.save(new Answer(question, 'C', "Nova", false));
  }

  private void saveQuestion1197() {
    Question question;

    question = questionRepository.save(new Question(5, "Which Reese Witherspoon movie has gotten a Broadway musical adaptation?", "2018-04-19 19:06:13"));

    answerRepository.save(new Answer(question, 'A', "Election", false));
    answerRepository.save(new Answer(question, 'B', "Walk the Line", false));
    answerRepository.save(new Answer(question, 'C', "Legally Blonde", true));
  }

  private void saveQuestion1198() {
    Question question;

    question = questionRepository.save(new Question(6, "As quoted on a US gov’t website, who said that income tax is “the hardest thing in the world to understand”?", "2018-04-19 19:06:48"));

    answerRepository.save(new Answer(question, 'A', "Alb… https://t.co/HFyfmcoTCb", false));
  }

  private void saveQuestion1199() {
    Question question;

    question = questionRepository.save(new Question(7, "The name of a facility for mentally ill foes of Batman is taken from a story by what author?", "2018-04-19 19:07:39"));

    answerRepository.save(new Answer(question, 'A', "HG Wells", false));
    answerRepository.save(new Answer(question, 'B', "HL Mencken", false));
    answerRepository.save(new Answer(question, 'C', "HP Lovecraft", true));
  }

  private void saveQuestion1200() {
    Question question;

    question = questionRepository.save(new Question(8, "A 2017 hack of the “Harvard Crimson” front page made fun of what celebrity?", "2018-04-19 19:08:13"));

    answerRepository.save(new Answer(question, 'A', "Malia Obama", false));
    answerRepository.save(new Answer(question, 'B', "Mark Zuckerberg", true));
    answerRepository.save(new Answer(question, 'C', "Natalie Portman", false));
  }

  private void saveQuestion1201() {
    Question question;

    question = questionRepository.save(new Question(9, "Which of these insects is typically the heaviest by far?", "2018-04-19 19:08:50"));

    answerRepository.save(new Answer(question, 'A', "Giant weta", false));
    answerRepository.save(new Answer(question, 'B', "Goliath beetle", true));
    answerRepository.save(new Answer(question, 'C', "Rhinoceros cockroach", false));
  }

  private void saveQuestion1202() {
    Question question;

    question = questionRepository.save(new Question(10, "Which gulf is NOT located at the northern end of the Red Sea?", "2018-04-19 19:09:32"));

    answerRepository.save(new Answer(question, 'A', "Aden", true));
    answerRepository.save(new Answer(question, 'B', "Aqaba", false));
    answerRepository.save(new Answer(question, 'C', "Suez", false));
  }

  private void saveQuestion1203() {
    Question question;

    question = questionRepository.save(new Question(11, "Who was appointed to the US Senate despite being too young to legally serve?", "2018-04-19 19:10:14"));

    answerRepository.save(new Answer(question, 'A', "Henry Clay Sr.", true));
    answerRepository.save(new Answer(question, 'B', "Stephen A. Douglas", false));
    answerRepository.save(new Answer(question, 'C', "John C. Calhoun", false));
  }

  private void saveQuestion1204() {
    Question question;

    question = questionRepository.save(new Question(12, "The first streaming-only album to win a Grammy takes its title from a kind of what?", "2018-04-19 19:11:14"));

    answerRepository.save(new Answer(question, 'A', "Liqueur", false));
    answerRepository.save(new Answer(question, 'B', "Children’s activi… https://t.co/Jknx5Bw96s", false));
  }

  private void saveQuestion1205() {
    Question question;

    question = questionRepository.save(new Question(1, "Soup is typically eaten with what kind of kitchen utensil?", "2018-04-20 01:08:56"));

    answerRepository.save(new Answer(question, 'A', "Toothpick", false));
    answerRepository.save(new Answer(question, 'B', "Spoon", true));
    answerRepository.save(new Answer(question, 'C', "Meat thermometer", false));
  }

  private void saveQuestion1206() {
    Question question;

    question = questionRepository.save(new Question(2, "The Earth is covered in about 70 percent what?", "2018-04-20 01:09:27"));

    answerRepository.save(new Answer(question, 'A', "Leather", false));
    answerRepository.save(new Answer(question, 'B', "Water", true));
    answerRepository.save(new Answer(question, 'C', "Frank Ocean", false));
  }

  private void saveQuestion1207() {
    Question question;

    question = questionRepository.save(new Question(3, "The warning that police give arrested suspects are known as what “rights”?", "2018-04-20 01:10:03"));

    answerRepository.save(new Answer(question, 'A', "Samantha", false));
    answerRepository.save(new Answer(question, 'B', "Miranda", true));
    answerRepository.save(new Answer(question, 'C', "Charlotte", false));
  }

  private void saveQuestion1208() {
    Question question;

    question = questionRepository.save(new Question(4, "In writing, what set of rules regulates the order of words?", "2018-04-20 01:10:40"));

    answerRepository.save(new Answer(question, 'A', "Spelling", false));
    answerRepository.save(new Answer(question, 'B', "Arithmetic", false));
    answerRepository.save(new Answer(question, 'C', "Syntax", true));
  }

  private void saveQuestion1209() {
    Question question;

    question = questionRepository.save(new Question(5, "What landmark did Ronald Reagan famously tell Mikhail Gorbachev to tear down?", "2018-04-20 01:11:53"));

    answerRepository.save(new Answer(question, 'A', "Great Wall of China", false));
    answerRepository.save(new Answer(question, 'B', "Berlin Wall… https://t.co/S6G4NFcoTG", false));
  }

  private void saveQuestion1210() {
    Question question;

    question = questionRepository.save(new Question(6, "Which of these singers referred to himself as “the Lizard King”?", "2018-04-20 01:11:58"));

    answerRepository.save(new Answer(question, 'A', "Gene Simmons", false));
    answerRepository.save(new Answer(question, 'B', "Steven Tyler", false));
    answerRepository.save(new Answer(question, 'C', "Jim Morrison", true));
  }

  private void saveQuestion1211() {
    Question question;

    question = questionRepository.save(new Question(7, "What is the nickname of the NHL player with the record for most games ever played?", "2018-04-20 01:13:01"));

    answerRepository.save(new Answer(question, 'A', "Mr. Goalie", false));
    answerRepository.save(new Answer(question, 'B', "Mr. Hockey", true));
    answerRepository.save(new Answer(question, 'C', "Mr. Invincible", false));
  }

  private void saveQuestion1212() {
    Question question;

    question = questionRepository.save(new Question(8, "When referring to cameras, which of these words is part of the acronym DSLR?", "2018-04-20 01:13:32"));

    answerRepository.save(new Answer(question, 'A', "Light", false));
    answerRepository.save(new Answer(question, 'B', "Direct", false));
    answerRepository.save(new Answer(question, 'C', "Single", true));
  }

  private void saveQuestion1213() {
    Question question;

    question = questionRepository.save(new Question(9, "Before “This American Life,” Ira Glass was the co-host of an NPR show based in what city?", "2018-04-20 01:14:15"));

    answerRepository.save(new Answer(question, 'A', "Chicago", true));
    answerRepository.save(new Answer(question, 'B', "Boston", false));
    answerRepository.save(new Answer(question, 'C', "New York City", false));
  }

  private void saveQuestion1214() {
    Question question;

    question = questionRepository.save(new Question(10, "Which of these actors does NOT have their own brand of wine?", "2018-04-20 01:14:48"));

    answerRepository.save(new Answer(question, 'A', "Kate Hudson", false));
    answerRepository.save(new Answer(question, 'B', "Anne Hathaway", true));
    answerRepository.save(new Answer(question, 'C', "Drew Barrymore", false));
  }

  private void saveQuestion1215() {
    Question question;

    question = questionRepository.save(new Question(11, "Which game was created by the same mind behind RoboRally?", "2018-04-20 01:15:25"));

    answerRepository.save(new Answer(question, 'A', "Magic: The Gathering", true));
    answerRepository.save(new Answer(question, 'B', "Settlers of Catan", false));
    answerRepository.save(new Answer(question, 'C', "Hearthstone", false));
  }

  private void saveQuestion1216() {
    Question question;

    question = questionRepository.save(new Question(12, "Which of these fashion designers once lost his job because the clothes he designed were too grunge?", "2018-04-20 01:16:44"));

    answerRepository.save(new Answer(question, 'A', "Marc Jacobs… https://t.co/Ec7lN6SBoZ", false));
  }

  private void saveQuestion1217() {
    Question question;

    question = questionRepository.save(new Question(1, "According to Kermit the Frog, “It’s not easy being” what?", "2018-04-20 19:03:46"));

    answerRepository.save(new Answer(question, 'A', "Green", true));
    answerRepository.save(new Answer(question, 'B', "Gorgeous", false));
    answerRepository.save(new Answer(question, 'C', "Goth", false));
  }

  private void saveQuestion1218() {
    Question question;

    question = questionRepository.save(new Question(2, "What is the largest planet in our solar system?", "2018-04-20 19:04:14"));

    answerRepository.save(new Answer(question, 'A', "Jupiter", true));
    answerRepository.save(new Answer(question, 'B', "Super Mercury", false));
    answerRepository.save(new Answer(question, 'C', "Mars after a bee sting", false));
  }

  private void saveQuestion1219() {
    Question question;

    question = questionRepository.save(new Question(3, "What computational device predates pocket calculators by thousands of years?", "2018-04-20 19:05:48"));

    answerRepository.save(new Answer(question, 'A', "Desktop computer", false));
    answerRepository.save(new Answer(question, 'B', "Abacus", true));
    answerRepository.save(new Answer(question, 'C', "Slide rule", false));
  }

  private void saveQuestion1220() {
    Question question;

    question = questionRepository.save(new Question(4, "The tiny country of Liechtenstein borders what two nations?", "2018-04-20 19:06:00"));

    answerRepository.save(new Answer(question, 'A', "France / Germany", false));
    answerRepository.save(new Answer(question, 'B', "Austria / Switzerland", true));
    answerRepository.save(new Answer(question, 'C', "Belgium / Netherlands", false));
  }

  private void saveQuestion1221() {
    Question question;

    question = questionRepository.save(new Question(5, "What does “brimstone,” as mentioned in the Bible, refer to?", "2018-04-20 19:06:25"));

    answerRepository.save(new Answer(question, 'A', "Granite", false));
    answerRepository.save(new Answer(question, 'B', "Sulfur", true));
    answerRepository.save(new Answer(question, 'C', "Lava", false));
  }

  private void saveQuestion1222() {
    Question question;

    question = questionRepository.save(new Question(6, "Along with California, what state was the first to pass a medical marijuana proposition?", "2018-04-20 19:07:27"));

    answerRepository.save(new Answer(question, 'A', "Alaska", false));
    answerRepository.save(new Answer(question, 'B', "Colorado", false));
    answerRepository.save(new Answer(question, 'C', "Arizona", true));
  }

  private void saveQuestion1223() {
    Question question;

    question = questionRepository.save(new Question(7, "According to its inventor, the graphics format spelled G-I-F is pronounced how?", "2018-04-20 19:07:47"));

    answerRepository.save(new Answer(question, 'A', "“gif”", false));
    answerRepository.save(new Answer(question, 'B', "“jif”", true));
    answerRepository.save(new Answer(question, 'C', "“zhif”", false));
  }

  private void saveQuestion1224() {
    Question question;

    question = questionRepository.save(new Question(8, "“Here Comes the Bride” was written by the composer of which opera?", "2018-04-20 19:09:24"));

    answerRepository.save(new Answer(question, 'A', "Don Giovanni", false));
    answerRepository.save(new Answer(question, 'B', "Carmen", false));
    answerRepository.save(new Answer(question, 'C', "Tristan and Isolde", true));
  }

  private void saveQuestion1225() {
    Question question;

    question = questionRepository.save(new Question(9, "The “Back to the Future” movie trilogy spans how long a period of time?", "2018-04-20 19:09:31"));

    answerRepository.save(new Answer(question, 'A', "130 years", true));
    answerRepository.save(new Answer(question, 'B', "60 years", false));
    answerRepository.save(new Answer(question, 'C', "100 years", false));
  }

  private void saveQuestion1226() {
    Question question;

    question = questionRepository.save(new Question(10, "Which of these dishes would most likely NOT be served at Buckingham Palace?", "2018-04-20 19:10:28"));

    answerRepository.save(new Answer(question, 'A', "Bananas Foster", false));
    answerRepository.save(new Answer(question, 'B', "Crepes Suzette", false));
    answerRepository.save(new Answer(question, 'C', "Lobster bisque", true));
  }

  private void saveQuestion1227() {
    Question question;

    question = questionRepository.save(new Question(1, "Which is a component of most modern computers?", "2018-04-21 01:06:25"));

    answerRepository.save(new Answer(question, 'A', "Keyboard", true));
    answerRepository.save(new Answer(question, 'B', "Wind chime", false));
    answerRepository.save(new Answer(question, 'C', "Grease trap", false));
  }

  private void saveQuestion1228() {
    Question question;

    question = questionRepository.save(new Question(2, "Uprooted thistle plants that are driven about by the wind are known as what?", "2018-04-21 01:07:09"));

    answerRepository.save(new Answer(question, 'A', "Fumbleseeds", false));
    answerRepository.save(new Answer(question, 'B', "Tumbleweeds", true));
    answerRepository.save(new Answer(question, 'C', "Stumbletweeds", false));
  }

  private void saveQuestion1229() {
    Question question;

    question = questionRepository.save(new Question(3, "What internet term is named for a mythical creature?", "2018-04-21 01:07:44"));

    answerRepository.save(new Answer(question, 'A', "Noob", false));
    answerRepository.save(new Answer(question, 'B', "Spam", false));
    answerRepository.save(new Answer(question, 'C', "Troll", true));
  }

  private void saveQuestion1230() {
    Question question;

    question = questionRepository.save(new Question(4, "Fancy Scotch whisky is often described as “single” what?", "2018-04-21 01:08:15"));

    answerRepository.save(new Answer(question, 'A', "Match", false));
    answerRepository.save(new Answer(question, 'B', "Malt", true));
    answerRepository.save(new Answer(question, 'C', "Mash", false));
  }

  private void saveQuestion1231() {
    Question question;

    question = questionRepository.save(new Question(5, "What does the “S” stand for in the government agency TSA?", "2018-04-21 01:08:44"));

    answerRepository.save(new Answer(question, 'A', "Screening", false));
    answerRepository.save(new Answer(question, 'B', "Safety", false));
    answerRepository.save(new Answer(question, 'C', "Security", true));
  }

  private void saveQuestion1232() {
    Question question;

    question = questionRepository.save(new Question(6, "According to the creator, which of these classic characters is actually NOT a cat?", "2018-04-21 01:09:16"));

    answerRepository.save(new Answer(question, 'A', "The Cat in the Hat", false));
    answerRepository.save(new Answer(question, 'B', "Hello Kitty", true));
    answerRepository.save(new Answer(question, 'C', "Felix the Cat", false));
  }

  private void saveQuestion1233() {
    Question question;

    question = questionRepository.save(new Question(7, "In what language is “555” internet slang for laughter?", "2018-04-21 01:09:46"));

    answerRepository.save(new Answer(question, 'A', "Thai", true));
    answerRepository.save(new Answer(question, 'B', "Korean", false));
    answerRepository.save(new Answer(question, 'C', "Chinese", false));
  }

  private void saveQuestion1234() {
    Question question;

    question = questionRepository.save(new Question(8, "Which of these actors is famous for the classic movie line “I'm walkin’ here!”?", "2018-04-21 01:10:32"));

    answerRepository.save(new Answer(question, 'A', "Robert De Niro", false));
    answerRepository.save(new Answer(question, 'B', "Dustin Hoffman", true));
    answerRepository.save(new Answer(question, 'C', "Al Pacino", false));
  }

  private void saveQuestion1235() {
    Question question;

    question = questionRepository.save(new Question(9, "The invention known as the Archimedes’ screw is typically used for what?", "2018-04-21 01:11:08"));

    answerRepository.save(new Answer(question, 'A', "Pumping water", true));
    answerRepository.save(new Answer(question, 'B', "Fastening wood", false));
    answerRepository.save(new Answer(question, 'C', "Preparing meat", false));
  }

  private void saveQuestion1236() {
    Question question;

    question = questionRepository.save(new Question(10, "In which discipline are you most likely to learn about morphemes?", "2018-04-21 01:11:38"));

    answerRepository.save(new Answer(question, 'A', "Nuclear chemistry", false));
    answerRepository.save(new Answer(question, 'B', "Marine biology", false));
    answerRepository.save(new Answer(question, 'C', "Linguistics", true));
  }

  private void saveQuestion1237() {
    Question question;

    question = questionRepository.save(new Question(11, "When ranking the seven continents by population, which is in the exact middle?", "2018-04-21 01:12:15"));

    answerRepository.save(new Answer(question, 'A', "Europe", false));
    answerRepository.save(new Answer(question, 'B', "South America", false));
    answerRepository.save(new Answer(question, 'C', "North America", true));
  }

  private void saveQuestion1238() {
    Question question;

    question = questionRepository.save(new Question(12, "Which show did NOT feature a main cast member who played one of Jerry’s girlfriends on “Seinfeld”?", "2018-04-21 01:13:05"));

    answerRepository.save(new Answer(question, 'A', "Friends", false));
    answerRepository.save(new Answer(question, 'B', "Gilmore Girls", false));
    answerRepository.save(new Answer(question, 'C', "Wings", true));
  }

  private void saveQuestion1239() {
    Question question;

    question = questionRepository.save(new Question(1, "What kind of power do televisions run on?", "2018-04-22 01:03:42"));

    answerRepository.save(new Answer(question, 'A', "Electricity", true));
    answerRepository.save(new Answer(question, 'B', "Caffeine", false));
    answerRepository.save(new Answer(question, 'C', "Pure charisma", false));
  }

  private void saveQuestion1240() {
    Question question;

    question = questionRepository.save(new Question(2, "Which of these awards is given to the NBA’s best first-year player?", "2018-04-22 01:04:13"));

    answerRepository.save(new Answer(question, 'A', "America’s Cup", false));
    answerRepository.save(new Answer(question, 'B', "Independent Spirit Award", false));
    answerRepository.save(new Answer(question, 'C', "Rookie of the Year", true));
  }

  private void saveQuestion1241() {
    Question question;

    question = questionRepository.save(new Question(3, "Which of these Beatles songs is sung entirely in English?", "2018-04-22 01:06:11"));

    answerRepository.save(new Answer(question, 'A', "Norwegian Wood", true));
    answerRepository.save(new Answer(question, 'B', "Across the Universe", false));
    answerRepository.save(new Answer(question, 'C', "Michelle", false));
  }

  private void saveQuestion1242() {
    Question question;

    question = questionRepository.save(new Question(4, "Of the following cities, which is farthest west?", "2018-04-22 01:06:54"));

    answerRepository.save(new Answer(question, 'A', "Los Angeles", false));
    answerRepository.save(new Answer(question, 'B', "Boise", false));
    answerRepository.save(new Answer(question, 'C', "Reno", true));
  }

  private void saveQuestion1243() {
    Question question;

    question = questionRepository.save(new Question(5, "What singer shares a name with a bygone empire headquartered in Ghana?", "2018-04-22 01:07:40"));

    answerRepository.save(new Answer(question, 'A', "Shakira", false));
    answerRepository.save(new Answer(question, 'B', "Ashanti", true));
    answerRepository.save(new Answer(question, 'C', "Aaliyah", false));
  }

  private void saveQuestion1244() {
    Question question;

    question = questionRepository.save(new Question(6, "Which of these battles did NOT happen during World War II?", "2018-04-22 01:08:16"));

    answerRepository.save(new Answer(question, 'A', "Battle of Verdun", true));
    answerRepository.save(new Answer(question, 'B', "Battle of the Bulge", false));
    answerRepository.save(new Answer(question, 'C', "Battle of Midway", false));
  }

  private void saveQuestion1245() {
    Question question;

    question = questionRepository.save(new Question(7, "What PBS icon was named an honorary captain of a National Hockey League team?", "2018-04-22 01:08:53"));

    answerRepository.save(new Answer(question, 'A', "Mister Rogers", true));
    answerRepository.save(new Answer(question, 'B', "Bob Ross", false));
    answerRepository.save(new Answer(question, 'C', "William F. Buckley Jr.", false));
  }

  private void saveQuestion1246() {
    Question question;

    question = questionRepository.save(new Question(8, "The so-called “Billionaire Boys Club” of the 1980s got rich quick through what?", "2018-04-22 01:09:24"));

    answerRepository.save(new Answer(question, 'A', "Penny stocks", false));
    answerRepository.save(new Answer(question, 'B', "Ponzi schemes", true));
    answerRepository.save(new Answer(question, 'C', "Junk bonds", false));
  }

  private void saveQuestion1247() {
    Question question;

    question = questionRepository.save(new Question(9, "Which of these nations has NOT produced a secretary-general of the United Nations?", "2018-04-22 01:10:10"));

    answerRepository.save(new Answer(question, 'A', "Brazil", true));
    answerRepository.save(new Answer(question, 'B', "Egypt", false));
    answerRepository.save(new Answer(question, 'C', "Sweden", false));
  }

  private void saveQuestion1248() {
    Question question;

    question = questionRepository.save(new Question(10, "Where was Richard Nixon speaking when he famously declared, “I am not a crook”?", "2018-04-22 01:11:01"));

    answerRepository.save(new Answer(question, 'A', "Knott’s Berry Farm", false));
    answerRepository.save(new Answer(question, 'B', "Disney World", true));
    answerRepository.save(new Answer(question, 'C', "SeaWorld", false));
  }

  private void saveQuestion1249() {
    Question question;

    question = questionRepository.save(new Question(1, "“Dirty water dog” is a New York City nickname for what edible street food?", "2018-04-23 01:04:08"));

    answerRepository.save(new Answer(question, 'A', "Spaghetti", false));
    answerRepository.save(new Answer(question, 'B', "Hot dog", true));
    answerRepository.save(new Answer(question, 'C', "Mushroom soup", false));
  }

  private void saveQuestion1250() {
    Question question;

    question = questionRepository.save(new Question(2, "A house in need of repairs and remodeling is known as what?", "2018-04-23 01:04:47"));

    answerRepository.save(new Answer(question, 'A', "Tree-plugger", false));
    answerRepository.save(new Answer(question, 'B', "Fixer-upper", true));
    answerRepository.save(new Answer(question, 'C', "Trash can-lugger", false));
  }

  private void saveQuestion1251() {
    Question question;

    question = questionRepository.save(new Question(3, "A police officer can search your house without a warrant if they have what cause?", "2018-04-23 01:05:24"));

    answerRepository.save(new Answer(question, 'A', "Notable", false));
    answerRepository.save(new Answer(question, 'B', "Probable", true));
    answerRepository.save(new Answer(question, 'C', "Acute", false));
  }

  private void saveQuestion1252() {
    Question question;

    question = questionRepository.save(new Question(4, "The tech term “malware” combines what word with software?", "2018-04-23 01:06:01"));

    answerRepository.save(new Answer(question, 'A', "Malicious", true));
    answerRepository.save(new Answer(question, 'B', "Malfunctioning", false));
    answerRepository.save(new Answer(question, 'C', "Malevolent", false));
  }

  private void saveQuestion1253() {
    Question question;

    question = questionRepository.save(new Question(5, "In “The Silence of the Lambs,” Hannibal Lecter paired his fava beans with a wine from what country?", "2018-04-23 01:06:41"));

    answerRepository.save(new Answer(question, 'A', "France", false));
    answerRepository.save(new Answer(question, 'B', "Italy", true));
    answerRepository.save(new Answer(question, 'C', "Argentina", false));
  }

  private void saveQuestion1254() {
    Question question;

    question = questionRepository.save(new Question(6, "Which of these synonyms for “large” was coined most recently?", "2018-04-23 01:07:22"));

    answerRepository.save(new Answer(question, 'A', "Prodigious", false));
    answerRepository.save(new Answer(question, 'B', "Humongous", true));
    answerRepository.save(new Answer(question, 'C', "Ginormous", false));
  }

  private void saveQuestion1255() {
    Question question;

    question = questionRepository.save(new Question(7, "According to the author of “Harry Potter,” where is Hogwarts?", "2018-04-23 01:08:10"));

    answerRepository.save(new Answer(question, 'A', "Ireland", false));
    answerRepository.save(new Answer(question, 'B', "England", false));
    answerRepository.save(new Answer(question, 'C', "Scotland", true));
  }

  private void saveQuestion1256() {
    Question question;

    question = questionRepository.save(new Question(8, "Legendary NBA player Larry Bird went on to coach what team?", "2018-04-23 01:08:53"));

    answerRepository.save(new Answer(question, 'A', "Boston Celtics", false));
    answerRepository.save(new Answer(question, 'B', "Indiana Pacers", true));
    answerRepository.save(new Answer(question, 'C', "Los Angeles Lakers", false));
  }

  private void saveQuestion1257() {
    Question question;

    question = questionRepository.save(new Question(9, "Which of these US states’ capitals has the fewest residents?", "2018-04-23 01:09:34"));

    answerRepository.save(new Answer(question, 'A', "Maryland", true));
    answerRepository.save(new Answer(question, 'B', "Minnesota", false));
    answerRepository.save(new Answer(question, 'C', "Iowa", false));
  }

  private void saveQuestion1258() {
    Question question;

    question = questionRepository.save(new Question(10, "Which of these rappers is the tallest?", "2018-04-23 01:10:24"));

    answerRepository.save(new Answer(question, 'A', "Lil Yachty", true));
    answerRepository.save(new Answer(question, 'B', "Lil Uzi Vert", false));
    answerRepository.save(new Answer(question, 'C', "Lil Wayne", false));
  }

  private void saveQuestion1259() {
    Question question;

    question = questionRepository.save(new Question(11, "What kind of tax does NOT apply in the regular edition of Monopoly?", "2018-04-23 01:11:06"));

    answerRepository.save(new Answer(question, 'A', "Property tax", true));
    answerRepository.save(new Answer(question, 'B', "Poor tax", false));
    answerRepository.save(new Answer(question, 'C', "Income tax", false));
  }

  private void saveQuestion1260() {
    Question question;

    question = questionRepository.save(new Question(12, "The heroine of Disney’s “The Little Mermaid” was based on a star of what classic sitcom?", "2018-04-23 01:11:39"));

    answerRepository.save(new Answer(question, 'A', "Who’s the Boss", true));
    answerRepository.save(new Answer(question, 'B', "Dif… https://t.co/mfa6uChPWi", false));
  }

  private void saveQuestion1261() {
    Question question;

    question = questionRepository.save(new Question(13, "When the US dollar currency was created, what was its value pegged to?", "2018-04-23 01:12:17"));

    answerRepository.save(new Answer(question, 'A', "Price of gold", false));
    answerRepository.save(new Answer(question, 'B', "French franc", false));
    answerRepository.save(new Answer(question, 'C', "Spanish silver dollar", true));
  }

  private void saveQuestion1262() {
    Question question;

    question = questionRepository.save(new Question(14, "Which of these major ancient cities was located the farthest north?", "2018-04-23 01:13:00"));

    answerRepository.save(new Answer(question, 'A', "Carthage", false));
    answerRepository.save(new Answer(question, 'B', "Lutetia", true));
    answerRepository.save(new Answer(question, 'C', "Byzantium", false));
  }

  private void saveQuestion1263() {
    Question question;

    question = questionRepository.save(new Question(15, "Which person is NOT mentioned in REM’s “It’s the End of the World as We Know It”?", "2018-04-23 01:13:53"));

    answerRepository.save(new Answer(question, 'A', "Leonard Cohen", true));
    answerRepository.save(new Answer(question, 'B', "Leonid Brezhnev", false));
    answerRepository.save(new Answer(question, 'C', "Lester Bangs", false));
  }

  private void saveQuestion1264() {
    Question question;

    question = questionRepository.save(new Question(1, "Which of these sandwiches is often grilled?", "2018-04-23 19:04:09"));

    answerRepository.save(new Answer(question, 'A', "Cheese", true));
    answerRepository.save(new Answer(question, 'B', "Knuckle", false));
    answerRepository.save(new Answer(question, 'C', "Earl", false));
  }

  private void saveQuestion1265() {
    Question question;

    question = questionRepository.save(new Question(2, "What is the term for illegally crossing the street while not at a crosswalk?", "2018-04-23 19:04:42"));

    answerRepository.save(new Answer(question, 'A', "Joewalking", false));
    answerRepository.save(new Answer(question, 'B', "Mikewalking", false));
    answerRepository.save(new Answer(question, 'C', "Jaywalking", true));
  }

  private void saveQuestion1266() {
    Question question;

    question = questionRepository.save(new Question(3, "Which of these is considered an oxymoron?", "2018-04-23 19:05:34"));

    answerRepository.save(new Answer(question, 'A', "Jumbo shrimp", true));
    answerRepository.save(new Answer(question, 'B', "Sizzling fajitas", false));
    answerRepository.save(new Answer(question, 'C', "Albino alligator", false));
  }

  private void saveQuestion1267() {
    Question question;

    question = questionRepository.save(new Question(4, "The camera was first featured in which iPhone com.trivia.model?", "2018-04-23 19:06:01"));

    answerRepository.save(new Answer(question, 'A', "iPhone 3GS", false));
    answerRepository.save(new Answer(question, 'B', "iPhone 3G", false));
    answerRepository.save(new Answer(question, 'C', "First generation iPhone", true));
  }

  private void saveQuestion1268() {
    Question question;

    question = questionRepository.save(new Question(5, "According to lore, what did the Sphinx ask for before allowing visitors into Thebes?", "2018-04-23 19:06:43"));

    answerRepository.save(new Answer(question, 'A', "Offer a gift", false));
    answerRepository.save(new Answer(question, 'B', "Pay a toll", false));
    answerRepository.save(new Answer(question, 'C', "Answer a riddle", true));
  }

  private void saveQuestion1269() {
    Question question;

    question = questionRepository.save(new Question(6, "The director of the horror classic “Scream” also directed which film?", "2018-04-23 19:07:23"));

    answerRepository.save(new Answer(question, 'A', "Mr. Holland’s Opus", false));
    answerRepository.save(new Answer(question, 'B', "Music of the Heart", true));
    answerRepository.save(new Answer(question, 'C', "School of Rock", false));
  }

  private void saveQuestion1270() {
    Question question;

    question = questionRepository.save(new Question(7, "Which of these is also known as “the devil’s game”?", "2018-04-23 19:08:08"));

    answerRepository.save(new Answer(question, 'A', "Blackjack", false));
    answerRepository.save(new Answer(question, 'B', "Roulette", true));
    answerRepository.save(new Answer(question, 'C', "Poker", false));
  }

  private void saveQuestion1271() {
    Question question;

    question = questionRepository.save(new Question(8, "Which of these US states does NOT have a sales tax?", "2018-04-23 19:08:45"));

    answerRepository.save(new Answer(question, 'A', "Ohio", false));
    answerRepository.save(new Answer(question, 'B', "Oklahoma", false));
    answerRepository.save(new Answer(question, 'C', "Oregon", true));
  }

  private void saveQuestion1272() {
    Question question;

    question = questionRepository.save(new Question(9, "The concept now known as the “uncanny valley” was created by a scientist from what country?", "2018-04-23 19:09:20"));

    answerRepository.save(new Answer(question, 'A', "Japan", true));
    answerRepository.save(new Answer(question, 'B', "USA", false));
    answerRepository.save(new Answer(question, 'C', "France", false));
  }

  private void saveQuestion1273() {
    Question question;

    question = questionRepository.save(new Question(10, "Which state is home to a NASA facility named for the 35th US president?", "2018-04-23 19:10:08"));

    answerRepository.save(new Answer(question, 'A', "Texas", false));
    answerRepository.save(new Answer(question, 'B', "Florida", true));
    answerRepository.save(new Answer(question, 'C', "Virginia", false));
  }

  private void saveQuestion1274() {
    Question question;

    question = questionRepository.save(new Question(11, "In Psy’s viral 2012 song from South Korea, the term “oppa” loosely translates to which of these?", "2018-04-23 19:10:51"));

    answerRepository.save(new Answer(question, 'A', "Big time", false));
    answerRepository.save(new Answer(question, 'B', "Big brother", true));
    answerRepository.save(new Answer(question, 'C', "Big spender", false));
  }

  private void saveQuestion1275() {
    Question question;

    question = questionRepository.save(new Question(12, "In the children’s book, which of these foods did “The Very Hungry Caterpillar” eat?", "2018-04-23 19:11:46"));

    answerRepository.save(new Answer(question, 'A', "Banana", false));
    answerRepository.save(new Answer(question, 'B', "Pizza", false));
    answerRepository.save(new Answer(question, 'C', "Cupcake", true));
  }

  private void saveQuestion1276() {
    Question question;

    question = questionRepository.save(new Question(1, "In 1954, Roger Bannister became the first man to do what in under four minutes?", "2018-04-24 01:04:19"));

    answerRepository.save(new Answer(question, 'A', "Run a mile", true));
    answerRepository.save(new Answer(question, 'B', "Respond to my te… https://t.co/1MnSM7uOkU", false));
  }

  private void saveQuestion1277() {
    Question question;

    question = questionRepository.save(new Question(2, "A catchy song is sometimes referred to as what?", "2018-04-24 01:04:59"));

    answerRepository.save(new Answer(question, 'A', "Hair tarantula", false));
    answerRepository.save(new Answer(question, 'B', "Face-spider", false));
    answerRepository.save(new Answer(question, 'C', "Earworm", true));
  }

  private void saveQuestion1278() {
    Question question;

    question = questionRepository.save(new Question(3, "Which of these is another word for “another word for”?", "2018-04-24 01:05:37"));

    answerRepository.save(new Answer(question, 'A', "Zimmerman", false));
    answerRepository.save(new Answer(question, 'B', "Synonym", true));
    answerRepository.save(new Answer(question, 'C', "Cinnamon", false));
  }

  private void saveQuestion1279() {
    Question question;

    question = questionRepository.save(new Question(4, "The longest side of a right triangle is called the what?", "2018-04-24 01:06:13"));

    answerRepository.save(new Answer(question, 'A', "Hypotension", false));
    answerRepository.save(new Answer(question, 'B', "Hypothalamus", false));
    answerRepository.save(new Answer(question, 'C', "Hypotenuse", true));
  }

  private void saveQuestion1280() {
    Question question;

    question = questionRepository.save(new Question(5, "You would find a cloaca in the digestive system of which of these animals?", "2018-04-24 01:06:48"));

    answerRepository.save(new Answer(question, 'A', "Caterpillar", false));
    answerRepository.save(new Answer(question, 'B', "Chameleon", true));
    answerRepository.save(new Answer(question, 'C', "Chimpanzee", false));
  }

  private void saveQuestion1281() {
    Question question;

    question = questionRepository.save(new Question(6, "Which singer’s daughter was once the creative director of French fashion house Chloé?", "2018-04-24 01:07:31"));

    answerRepository.save(new Answer(question, 'A', "Steven Tyler", false));
    answerRepository.save(new Answer(question, 'B', "Paul McCartney", true));
    answerRepository.save(new Answer(question, 'C', "David Bowie", false));
  }

  private void saveQuestion1282() {
    Question question;

    question = questionRepository.save(new Question(7, "Which of these religious movements was founded by a woman?", "2018-04-24 01:08:16"));

    answerRepository.save(new Answer(question, 'A', "Jehovah’s Witnesses", false));
    answerRepository.save(new Answer(question, 'B', "Christian Science", true));
    answerRepository.save(new Answer(question, 'C', "Rastafari", false));
  }

  private void saveQuestion1283() {
    Question question;

    question = questionRepository.save(new Question(8, "Which of these celebrities is NOT mentioned by name in LFO’s “Summer Girls”?", "2018-04-24 01:09:05"));

    answerRepository.save(new Answer(question, 'A', "Michael J. Fox", false));
    answerRepository.save(new Answer(question, 'B', "Macaulay Culkin", false));
    answerRepository.save(new Answer(question, 'C', "Vanilla Ice", true));
  }

  private void saveQuestion1284() {
    Question question;

    question = questionRepository.save(new Question(9, "Which of these countries relies on nuclear power for more than 75 percent of its electricity?", "2018-04-24 01:09:42"));

    answerRepository.save(new Answer(question, 'A', "France", true));
    answerRepository.save(new Answer(question, 'B', "Russia", false));
    answerRepository.save(new Answer(question, 'C', "Japan", false));
  }

  private void saveQuestion1285() {
    Question question;

    question = questionRepository.save(new Question(10, "Charles Darwin was born on the same exact date and year as which president?", "2018-04-24 01:10:28"));

    answerRepository.save(new Answer(question, 'A', "Thomas Jefferson", false));
    answerRepository.save(new Answer(question, 'B', "Abraham Lincoln", true));
    answerRepository.save(new Answer(question, 'C', "Theodore Roosevelt", false));
  }

  private void saveQuestion1286() {
    Question question;

    question = questionRepository.save(new Question(11, "In which of these novels is the first word the same as the title?", "2018-04-24 01:11:06"));

    answerRepository.save(new Answer(question, 'A', "Lolita", true));
    answerRepository.save(new Answer(question, 'B', "Frankenstein", false));
    answerRepository.save(new Answer(question, 'C', "Dracula", false));
  }

  private void saveQuestion1287() {
    Question question;

    question = questionRepository.save(new Question(12, "Which TV show faced critical backlash after a controversial turn-of-the-millennium hairstyle change?", "2018-04-24 01:11:59"));

    answerRepository.save(new Answer(question, 'A', "Sex and the… https://t.co/mUztZSxbQd", false));
  }

  private void saveQuestion1288() {
    Question question;

    question = questionRepository.save(new Question(1, "Author Ian Fleming created what spy code-named 007?", "2018-04-24 19:03:53"));

    answerRepository.save(new Answer(question, 'A', "Spyler the Creator", false));
    answerRepository.save(new Answer(question, 'B', "James Bond", true));
    answerRepository.save(new Answer(question, 'C', "Spyin’ Gosling", false));
  }

  private void saveQuestion1289() {
    Question question;

    question = questionRepository.save(new Question(2, "Which of these is typically sold in a bakery?", "2018-04-24 19:04:29"));

    answerRepository.save(new Answer(question, 'A', "Muffins", true));
    answerRepository.save(new Answer(question, 'B', "Top hats", false));
    answerRepository.save(new Answer(question, 'C', "Power saws", false));
  }

  private void saveQuestion1290() {
    Question question;

    question = questionRepository.save(new Question(3, "Which of these words is a synonym for “unstable”?", "2018-04-24 19:05:07"));

    answerRepository.save(new Answer(question, 'A', "Trickle", false));
    answerRepository.save(new Answer(question, 'B', "Sickle", false));
    answerRepository.save(new Answer(question, 'C', "Fickle", true));
  }

  private void saveQuestion1291() {
    Question question;

    question = questionRepository.save(new Question(4, "NASA’s Curiosity Rover was built to explore the surface of what?", "2018-04-24 19:05:47"));

    answerRepository.save(new Answer(question, 'A', "The moon", false));
    answerRepository.save(new Answer(question, 'B', "Jupiter", false));
    answerRepository.save(new Answer(question, 'C', "Mars", true));
  }

  private void saveQuestion1292() {
    Question question;

    question = questionRepository.save(new Question(5, "The Golden Glove is a US prize given out to top performers in what sport?", "2018-04-24 19:06:29"));

    answerRepository.save(new Answer(question, 'A', "Bowling", false));
    answerRepository.save(new Answer(question, 'B', "UFC", false));
    answerRepository.save(new Answer(question, 'C', "Boxing", true));
  }

  private void saveQuestion1293() {
    Question question;

    question = questionRepository.save(new Question(6, "“Boss of Me” by They Might Be Giants was the theme song to what sitcom?", "2018-04-24 19:07:03"));

    answerRepository.save(new Answer(question, 'A', "30 Rock", false));
    answerRepository.save(new Answer(question, 'B', "Malcolm in the Middle", true));
    answerRepository.save(new Answer(question, 'C', "The Office", false));
  }

  private void saveQuestion1294() {
    Question question;

    question = questionRepository.save(new Question(7, "The digastric muscle can be found directly under what body part?", "2018-04-24 19:07:40"));

    answerRepository.save(new Answer(question, 'A', "Jaw", true));
    answerRepository.save(new Answer(question, 'B', "Heart", false));
    answerRepository.save(new Answer(question, 'C', "Stomach", false));
  }

  private void saveQuestion1295() {
    Question question;

    question = questionRepository.save(new Question(8, "Because he likes the “lessons,” what film has the rapper known as Puff Daddy watched at least 63 times?", "2018-04-24 19:08:30"));

    answerRepository.save(new Answer(question, 'A', "Scarface", true));
    answerRepository.save(new Answer(question, 'B', "Big", false));
    answerRepository.save(new Answer(question, 'C', "Titanic", false));
  }

  private void saveQuestion1296() {
    Question question;

    question = questionRepository.save(new Question(9, "Meat Loaf’s album “Bat Out of Hell” features songs originally written for a musical about who?", "2018-04-24 19:09:10"));

    answerRepository.save(new Answer(question, 'A', "James Dean", false));
    answerRepository.save(new Answer(question, 'B', "Dracula", false));
    answerRepository.save(new Answer(question, 'C', "Peter Pan", true));
  }

  private void saveQuestion1297() {
    Question question;

    question = questionRepository.save(new Question(10, "Which of these scientists has a common tie knot named in his honor?", "2018-04-24 19:09:55"));

    answerRepository.save(new Answer(question, 'A', "Ernest Rutherford", false));
    answerRepository.save(new Answer(question, 'B', "Joseph Priestley", false));
    answerRepository.save(new Answer(question, 'C', "Lord Kelvin", true));
  }

  private void saveQuestion1298() {
    Question question;

    question = questionRepository.save(new Question(11, "Which of these words was invented by Jonathan Swift and is a synonym for “big”?", "2018-04-24 19:10:38"));

    answerRepository.save(new Answer(question, 'A', "Brobdingnagian", true));
    answerRepository.save(new Answer(question, 'B', "Lilliputian", false));
    answerRepository.save(new Answer(question, 'C', "Gargantuan", false));
  }

  private void saveQuestion1299() {
    Question question;

    question = questionRepository.save(new Question(12, "Paul Newman is mentioned in the first line of what novel?", "2018-04-24 19:11:31"));

    answerRepository.save(new Answer(question, 'A', "The Hustler", false));
    answerRepository.save(new Answer(question, 'B', "The Outsiders", true));
    answerRepository.save(new Answer(question, 'C', "Get Shorty", false));
  }

  private void saveQuestion1300() {
    Question question;

    question = questionRepository.save(new Question(1, "Clothes normally go from a washing machine to what other machine?", "2018-04-25 01:03:48"));

    answerRepository.save(new Answer(question, 'A', "Fax", false));
    answerRepository.save(new Answer(question, 'B', "Dryer", true));
    answerRepository.save(new Answer(question, 'C', "ATM", false));
  }

  private void saveQuestion1301() {
    Question question;

    question = questionRepository.save(new Question(2, "Which of these animals is usually the smallest?", "2018-04-25 01:04:23"));

    answerRepository.save(new Answer(question, 'A', "Goose", true));
    answerRepository.save(new Answer(question, 'B', "Moose", false));
    answerRepository.save(new Answer(question, 'C', "Bruce Willis", false));
  }

  private void saveQuestion1302() {
    Question question;

    question = questionRepository.save(new Question(3, "Which of these is a shade of red?", "2018-04-25 01:05:03"));

    answerRepository.save(new Answer(question, 'A', "Crimson", true));
    answerRepository.save(new Answer(question, 'B', "Turquoise", false));
    answerRepository.save(new Answer(question, 'C', "Emerald", false));
  }

  private void saveQuestion1303() {
    Question question;

    question = questionRepository.save(new Question(4, "By definition, numbers that are less than zero are classified as what?", "2018-04-25 01:05:40"));

    answerRepository.save(new Answer(question, 'A', "Imaginary", false));
    answerRepository.save(new Answer(question, 'B', "Negative", true));
    answerRepository.save(new Answer(question, 'C', "Transcendental", false));
  }

  private void saveQuestion1304() {
    Question question;

    question = questionRepository.save(new Question(5, "What shape best describes the USDA’s current diagram of a balanced diet?", "2018-04-25 01:06:19"));

    answerRepository.save(new Answer(question, 'A', "Square", false));
    answerRepository.save(new Answer(question, 'B', "Pyramid", false));
    answerRepository.save(new Answer(question, 'C', "Circle", true));
  }

  private void saveQuestion1305() {
    Question question;

    question = questionRepository.save(new Question(6, "Which state’s capital contains the name of the state?", "2018-04-25 01:07:12"));

    answerRepository.save(new Answer(question, 'A', "Indiana", true));
    answerRepository.save(new Answer(question, 'B', "Iowa", false));
    answerRepository.save(new Answer(question, 'C', "Maine", false));
  }

  private void saveQuestion1306() {
    Question question;

    question = questionRepository.save(new Question(7, "Which of these terms refers to the outer region of the Sun’s atmosphere?", "2018-04-25 01:07:49"));

    answerRepository.save(new Answer(question, 'A', "Tacoma", false));
    answerRepository.save(new Answer(question, 'B', "Corona", true));
    answerRepository.save(new Answer(question, 'C', "Zygoma", false));
  }

  private void saveQuestion1307() {
    Question question;

    question = questionRepository.save(new Question(8, "Which animal is NOT a species of wild cat?", "2018-04-25 01:08:27"));

    answerRepository.save(new Answer(question, 'A', "Rorqual", true));
    answerRepository.save(new Answer(question, 'B', "Oncilla", false));
    answerRepository.save(new Answer(question, 'C', "Margay", false));
  }

  private void saveQuestion1308() {
    Question question;

    question = questionRepository.save(new Question(9, "The lead actor in “Better Call Saul” starred on what ’90s sketch comedy TV series?", "2018-04-25 01:09:10"));

    answerRepository.save(new Answer(question, 'A', "Mr. Show", true));
    answerRepository.save(new Answer(question, 'B', "The State", false));
    answerRepository.save(new Answer(question, 'C', "Kids in the Hall", false));
  }

  private void saveQuestion1309() {
    Question question;

    question = questionRepository.save(new Question(10, "Which of these would a doctor most likely make use of?", "2018-04-25 01:09:50"));

    answerRepository.save(new Answer(question, 'A', "Clinopinacoid", false));
    answerRepository.save(new Answer(question, 'B', "Xiphiplastron", false));
    answerRepository.save(new Answer(question, 'C', "Armamentarium", true));
  }

  private void saveQuestion1310() {
    Question question;

    question = questionRepository.save(new Question(11, "Which US president did NOT win a Nobel Peace Prize?", "2018-04-25 01:10:40"));

    answerRepository.save(new Answer(question, 'A', "Woodrow Wilson", false));
    answerRepository.save(new Answer(question, 'B', "Franklin Roosevelt", true));
    answerRepository.save(new Answer(question, 'C', "Teddy Roosevelt", false));
  }

  private void saveQuestion1311() {
    Question question;

    question = questionRepository.save(new Question(12, "The author of which of these works also wrote a famous biography of Christopher Columbus?", "2018-04-25 01:11:33"));

    answerRepository.save(new Answer(question, 'A', "Rip Van Winkle", true));
    answerRepository.save(new Answer(question, 'B', "A… https://t.co/fbf0eRqD0M", false));
  }

  private void saveQuestion1312() {
    Question question;

    question = questionRepository.save(new Question(1, "The duration of a pregnancy is usually measured in what?", "2018-04-25 19:04:32"));

    answerRepository.save(new Answer(question, 'A', "Laughter", false));
    answerRepository.save(new Answer(question, 'B', "Trimesters", true));
    answerRepository.save(new Answer(question, 'C', "Cups of decaf", false));
  }

  private void saveQuestion1313() {
    Question question;

    question = questionRepository.save(new Question(2, "Which of these is most likely to cause hair static?", "2018-04-25 19:05:02"));

    answerRepository.save(new Answer(question, 'A', "Peeling an orange", false));
    answerRepository.save(new Answer(question, 'B', "Eating too much tuna", false));
    answerRepository.save(new Answer(question, 'C', "Taking off a sweater", true));
  }

  private void saveQuestion1314() {
    Question question;

    question = questionRepository.save(new Question(3, "Which of these shapes has the most sides?", "2018-04-25 19:05:33"));

    answerRepository.save(new Answer(question, 'A', "Hexagon", true));
    answerRepository.save(new Answer(question, 'B', "Pentagon", false));
    answerRepository.save(new Answer(question, 'C', "Rhombus", false));
  }

  private void saveQuestion1315() {
    Question question;

    question = questionRepository.save(new Question(4, "Which of these would be considered a peccadillo?", "2018-04-25 19:06:10"));

    answerRepository.save(new Answer(question, 'A', "Tardiness", true));
    answerRepository.save(new Answer(question, 'B', "Identity theft", false));
    answerRepository.save(new Answer(question, 'C', "Kidnapping", false));
  }

  private void saveQuestion1316() {
    Question question;

    question = questionRepository.save(new Question(5, "Which of these terms refers to a popular type of wooden board used for decorating?", "2018-04-25 19:06:49"));

    answerRepository.save(new Answer(question, 'A', "Shiplap", true));
    answerRepository.save(new Answer(question, 'B', "Boatcull", false));
    answerRepository.save(new Answer(question, 'C', "Craftpanel", false));
  }

  private void saveQuestion1317() {
    Question question;

    question = questionRepository.save(new Question(6, "The 20th century US Supreme Court Justice Marshall was born with what first name?", "2018-04-25 19:07:23"));

    answerRepository.save(new Answer(question, 'A', "Thoroughly", false));
    answerRepository.save(new Answer(question, 'B', "Thergood", false));
    answerRepository.save(new Answer(question, 'C', "Thoroughgood", true));
  }

  private void saveQuestion1318() {
    Question question;

    question = questionRepository.save(new Question(7, "The game now known as laser tag began as a 1979 toy inspired by what franchise?", "2018-04-25 19:08:15"));

    answerRepository.save(new Answer(question, 'A', "Star Trek", true));
    answerRepository.save(new Answer(question, 'B', "The Jetsons", false));
    answerRepository.save(new Answer(question, 'C', "Doctor Who", false));
  }

  private void saveQuestion1319() {
    Question question;

    question = questionRepository.save(new Question(8, "The designer of the Louis Vuitton Multicolore monogram has also created album cover art for which musician?", "2018-04-25 19:08:50"));

    answerRepository.save(new Answer(question, 'A', "Drak… https://t.co/gd7WqG5gpp", false));
  }

  private void saveQuestion1320() {
    Question question;

    question = questionRepository.save(new Question(9, "In the film version of “Matilda,” which Olympic sport did Miss Trunchbull compete in?", "2018-04-25 19:09:27"));

    answerRepository.save(new Answer(question, 'A', "Pole vault", false));
    answerRepository.save(new Answer(question, 'B', "Fencing", false));
    answerRepository.save(new Answer(question, 'C', "Javelin", true));
  }

  private void saveQuestion1321() {
    Question question;

    question = questionRepository.save(new Question(10, "A massive 2017 hit by Selena Gomez sampled a ’70s song with what memorable lyric?", "2018-04-25 19:10:06"));

    answerRepository.save(new Answer(question, 'A', "Qu’est-ce que c’est", true));
    answerRepository.save(new Answer(question, 'B', "You d… https://t.co/Z8ITHsDOgz", false));
  }

  private void saveQuestion1322() {
    Question question;

    question = questionRepository.save(new Question(11, "Which of these creatures is NOT represented by a professional Japanese baseball team?", "2018-04-25 19:10:55"));

    answerRepository.save(new Answer(question, 'A', "Dragon", false));
    answerRepository.save(new Answer(question, 'B', "Carp", false));
    answerRepository.save(new Answer(question, 'C', "Lizard", true));
  }

  private void saveQuestion1323() {
    Question question;

    question = questionRepository.save(new Question(12, "Denver’s Union Station once banned which of these things?", "2018-04-25 19:11:57"));

    answerRepository.save(new Answer(question, 'A', "Whistling", false));
    answerRepository.save(new Answer(question, 'B', "Wearing red", false));
    answerRepository.save(new Answer(question, 'C', "Kissing", true));
  }

  private void saveQuestion1324() {
    Question question;

    question = questionRepository.save(new Question(1, "Which of these typically stores sweet treats?", "2018-04-26 01:05:06"));

    answerRepository.save(new Answer(question, 'A', "Jacuzzi", false));
    answerRepository.save(new Answer(question, 'B', "Cookie jar", true));
    answerRepository.save(new Answer(question, 'C', "Shrimp boat", false));
  }

  private void saveQuestion1325() {
    Question question;

    question = questionRepository.save(new Question(2, "Which term describes pajamas with initials stitched onto them?", "2018-04-26 01:05:37"));

    answerRepository.save(new Answer(question, 'A', "Monogrammed", true));
    answerRepository.save(new Answer(question, 'B', "Monorailed", false));
    answerRepository.save(new Answer(question, 'C', "Monologued", false));
  }

  private void saveQuestion1326() {
    Question question;

    question = questionRepository.save(new Question(3, "What type of wine is spoiled in a hit ’90s song by Alanis Morissette?", "2018-04-26 01:07:21"));

    answerRepository.save(new Answer(question, 'A', "Chardonnay", true));
    answerRepository.save(new Answer(question, 'B', "Sherry", false));
    answerRepository.save(new Answer(question, 'C', "Merlot", false));
  }

  private void saveQuestion1327() {
    Question question;

    question = questionRepository.save(new Question(4, "Which of these children’s books was written and illustrated by the same person?", "2018-04-26 01:08:04"));

    answerRepository.save(new Answer(question, 'A', "Goodnight Moon", false));
    answerRepository.save(new Answer(question, 'B', "The Story of F… https://t.co/AdXVwfCsut", false));
  }

  private void saveQuestion1328() {
    Question question;

    question = questionRepository.save(new Question(5, "By definition, an expert in amanuensis is helpful in what?", "2018-04-26 01:08:57"));

    answerRepository.save(new Answer(question, 'A', "Administering shots", false));
    answerRepository.save(new Answer(question, 'B', "Writing letters", true));
    answerRepository.save(new Answer(question, 'C', "Cleaning lab equipment", false));
  }

  private void saveQuestion1329() {
    Question question;

    question = questionRepository.save(new Question(6, "What music legend’s hat stole the show at the 2009 presidential inauguration?", "2018-04-26 01:09:39"));

    answerRepository.save(new Answer(question, 'A', "Aretha Franklin", true));
    answerRepository.save(new Answer(question, 'B', "Keith Urban", false));
    answerRepository.save(new Answer(question, 'C', "Pharrell", false));
  }

  private void saveQuestion1330() {
    Question question;

    question = questionRepository.save(new Question(7, "The creator of which of these fonts has publicly declared it “the best font in the world”?", "2018-04-26 01:10:24"));

    answerRepository.save(new Answer(question, 'A', "Comic sans", true));
    answerRepository.save(new Answer(question, 'B', "Papyrus", false));
    answerRepository.save(new Answer(question, 'C', "Helvetica", false));
  }

  private void saveQuestion1331() {
    Question question;

    question = questionRepository.save(new Question(8, "Which of these shows typically features voiceover narration instead of an on-screen host?", "2018-04-26 01:11:06"));

    answerRepository.save(new Answer(question, 'A', "Flip or Flop", false));
    answerRepository.save(new Answer(question, 'B', "Fixer Upper", false));
    answerRepository.save(new Answer(question, 'C', "House Hunters", true));
  }

  private void saveQuestion1332() {
    Question question;

    question = questionRepository.save(new Question(9, "Bessie, the US equivalent to the Loch Ness monster, is rumored to live in what lake?", "2018-04-26 01:11:52"));

    answerRepository.save(new Answer(question, 'A', "Superior", false));
    answerRepository.save(new Answer(question, 'B', "Erie", true));
    answerRepository.save(new Answer(question, 'C', "Ontario", false));
  }

  private void saveQuestion1333() {
    Question question;

    question = questionRepository.save(new Question(10, "Which of these veteran filmmakers has directed an R-rated movie?", "2018-04-26 01:13:02"));

    answerRepository.save(new Answer(question, 'A', "Chris Columbus", false));
    answerRepository.save(new Answer(question, 'B', "Nancy Meyers", true));
    answerRepository.save(new Answer(question, 'C', "JJ Abrams", false));
  }

  private void saveQuestion1334() {
    Question question;

    question = questionRepository.save(new Question(1, "Andy Warhol reportedly once said that “everyone will be world-famous for” how long?", "2018-04-26 03:34:57"));

    answerRepository.save(new Answer(question, 'A', "At least an hour", false));
    answerRepository.save(new Answer(question, 'B', "To infin… https://t.co/FkoTg1cjCY", false));
  }

  private void saveQuestion1335() {
    Question question;

    question = questionRepository.save(new Question(2, "What is the name of the traditional Japanese art form that combines dancing and theater?", "2018-04-26 03:35:39"));

    answerRepository.save(new Answer(question, 'A', "Surfboarding", false));
    answerRepository.save(new Answer(question, 'B', "Kabuki", true));
    answerRepository.save(new Answer(question, 'C', "Pattycake", false));
  }

  private void saveQuestion1336() {
    Question question;

    question = questionRepository.save(new Question(3, "What type of grinning animal is famously featured in “Alice’s Adventures in Wonderland”?", "2018-04-26 03:36:21"));

    answerRepository.save(new Answer(question, 'A', "Pig", false));
    answerRepository.save(new Answer(question, 'B', "Lizard", false));
    answerRepository.save(new Answer(question, 'C', "Cat", true));
  }

  private void saveQuestion1337() {
    Question question;

    question = questionRepository.save(new Question(4, "Who lends his name to the machines that typically resurface the ice at skating rinks?", "2018-04-26 03:36:57"));

    answerRepository.save(new Answer(question, 'A', "Frank Zamboni", true));
    answerRepository.save(new Answer(question, 'B', "Charles Ponzi", false));
    answerRepository.save(new Answer(question, 'C', "Brian Boitano", false));
  }

  private void saveQuestion1338() {
    Question question;

    question = questionRepository.save(new Question(5, "Though it is still several years away, the fifth day of May in 2025 has what unofficial title?", "2018-04-26 03:37:38"));

    answerRepository.save(new Answer(question, 'A', "Fibonacci Day", false));
    answerRepository.save(new Answer(question, 'B', "", false));
  }

  private void saveQuestion1339() {
    Question question;

    question = questionRepository.save(new Question(6, "Which of these is NOT part of the modern version of the Hippocratic Oath?", "2018-04-26 03:38:26"));

    answerRepository.save(new Answer(question, 'A', "Secret-keeping", false));
    answerRepository.save(new Answer(question, 'B', "Respect for physicians", false));
    answerRepository.save(new Answer(question, 'C', "Punctuality", true));
  }

  private void saveQuestion1340() {
    Question question;

    question = questionRepository.save(new Question(7, "Which of these places named its capital after John the Baptist?", "2018-04-26 03:39:04"));

    answerRepository.save(new Answer(question, 'A', "Cuba", false));
    answerRepository.save(new Answer(question, 'B', "Puerto Rico", true));
    answerRepository.save(new Answer(question, 'C', "The Bahamas", false));
  }

  private void saveQuestion1341() {
    Question question;

    question = questionRepository.save(new Question(8, "The director of which film appeared in several episodes of “Degrassi: The Next Generation”?", "2018-04-26 03:39:44"));

    answerRepository.save(new Answer(question, 'A', "Clerks", true));
    answerRepository.save(new Answer(question, 'B', "Knocked Up", false));
    answerRepository.save(new Answer(question, 'C', "The Sixth Sense", false));
  }

  private void saveQuestion1342() {
    Question question;

    question = questionRepository.save(new Question(9, "Which of these words is NOT part of the diving acronym SCUBA?", "2018-04-26 03:40:22"));

    answerRepository.save(new Answer(question, 'A', "Apparatus", false));
    answerRepository.save(new Answer(question, 'B', "Contained", false));
    answerRepository.save(new Answer(question, 'C', "Sport", true));
  }

  private void saveQuestion1343() {
    Question question;

    question = questionRepository.save(new Question(10, "Which island purportedly inspired the setting for Shakespeare’s “The Tempest”?", "2018-04-26 03:40:53"));

    answerRepository.save(new Answer(question, 'A', "Montserrat", false));
    answerRepository.save(new Answer(question, 'B', "Anguilla", false));
    answerRepository.save(new Answer(question, 'C', "Bermuda", true));
  }

  private void saveQuestion1344() {
    Question question;

    question = questionRepository.save(new Question(11, "The acclaimed author of “The Year of Magical Thinking” has appeared in ads for what fashion brand?", "2018-04-26 03:41:48"));

    answerRepository.save(new Answer(question, 'A', "Givenchy", false));
    answerRepository.save(new Answer(question, 'B', "Chanel", false));
    answerRepository.save(new Answer(question, 'C', "Céline", true));
  }

  private void saveQuestion1345() {
    Question question;

    question = questionRepository.save(new Question(12, "Bob Marley’s son performs the theme song for a hit animated TV show about a talking what?", "2018-04-26 03:43:06"));

    answerRepository.save(new Answer(question, 'A', "Sponge", false));
    answerRepository.save(new Answer(question, 'B', "Aardvark", true));
    answerRepository.save(new Answer(question, 'C', "Horse", false));
  }

  private void saveQuestion1346() {
    Question question;

    question = questionRepository.save(new Question(1, "A single piece of clothing that covers the entire body is called what?", "2018-04-26 19:04:29"));

    answerRepository.save(new Answer(question, 'A', "Whatsie", false));
    answerRepository.save(new Answer(question, 'B', "Whosie", false));
    answerRepository.save(new Answer(question, 'C', "Onesie", true));
  }

  private void saveQuestion1347() {
    Question question;

    question = questionRepository.save(new Question(2, "Which of these irons is a common heat-styling tool for hair?", "2018-04-26 19:05:01"));

    answerRepository.save(new Answer(question, 'A', "Jeremy", false));
    answerRepository.save(new Answer(question, 'B', "Curling", true));
    answerRepository.save(new Answer(question, 'C', "Cast", false));
  }

  private void saveQuestion1348() {
    Question question;

    question = questionRepository.save(new Question(3, "What is the name of the first book of the Christian Bible?", "2018-04-26 19:05:35"));

    answerRepository.save(new Answer(question, 'A', "The Sorcerer’s Stone", false));
    answerRepository.save(new Answer(question, 'B', "Genesis", true));
    answerRepository.save(new Answer(question, 'C', "Fellowship of the Ring", false));
  }

  private void saveQuestion1349() {
    Question question;

    question = questionRepository.save(new Question(4, "Which of these terms means “common people”?", "2018-04-26 19:06:12"));

    answerRepository.save(new Answer(question, 'A', "Perth Amboy", false));
    answerRepository.save(new Answer(question, 'B', "Hoi polloi", true));
    answerRepository.save(new Answer(question, 'C', "Bok choy", false));
  }

  private void saveQuestion1350() {
    Question question;

    question = questionRepository.save(new Question(5, "Geographically speaking, an atoll is a type of what?", "2018-04-26 19:06:46"));

    answerRepository.save(new Answer(question, 'A', "Island", true));
    answerRepository.save(new Answer(question, 'B', "Peninsula", false));
    answerRepository.save(new Answer(question, 'C', "Isthmus", false));
  }

  private void saveQuestion1351() {
    Question question;

    question = questionRepository.save(new Question(6, "Which of these is a right granted by the Sixth Amendment?", "2018-04-26 19:07:30"));

    answerRepository.save(new Answer(question, 'A', "Private trial", false));
    answerRepository.save(new Answer(question, 'B', "Public trial", true));
    answerRepository.save(new Answer(question, 'C', "Trial without a jury", false));
  }

  private void saveQuestion1352() {
    Question question;

    question = questionRepository.save(new Question(7, "What does the Italian exclamation “Basta!” translate to in English?", "2018-04-26 19:08:00"));

    answerRepository.save(new Answer(question, 'A', "Enough!", true));
    answerRepository.save(new Answer(question, 'B', "Great!", false));
    answerRepository.save(new Answer(question, 'C', "Pasta!", false));
  }

  private void saveQuestion1353() {
    Question question;

    question = questionRepository.save(new Question(8, "Which US president never had a spouse?", "2018-04-26 19:08:37"));

    answerRepository.save(new Answer(question, 'A', "James Buchanan", true));
    answerRepository.save(new Answer(question, 'B', "Martin Van Buren", false));
    answerRepository.save(new Answer(question, 'C', "John Tyler", false));
  }

  private void saveQuestion1354() {
    Question question;

    question = questionRepository.save(new Question(9, "The Swiss Open has twice given out which of these to a top tennis player?", "2018-04-26 19:09:09"));

    answerRepository.save(new Answer(question, 'A', "Giant cheese wheel", false));
    answerRepository.save(new Answer(question, 'B', "Tuft of Swiss grass", false));
    answerRepository.save(new Answer(question, 'C', "Cow", true));
  }

  private void saveQuestion1355() {
    Question question;

    question = questionRepository.save(new Question(10, "Which of these brands does NOT have a designer contracted for life?", "2018-04-26 19:09:53"));

    answerRepository.save(new Answer(question, 'A', "Chanel", false));
    answerRepository.save(new Answer(question, 'B', "Gucci", true));
    answerRepository.save(new Answer(question, 'C', "Fendi", false));
  }

  private void saveQuestion1356() {
    Question question;

    question = questionRepository.save(new Question(11, "According to Japanese tradition, a wedding scheduled on “butsumetsu” would likely result in what?", "2018-04-26 19:10:26"));

    answerRepository.save(new Answer(question, 'A', "At least two c… https://t.co/E6SqhSsQrG", false));
  }

  private void saveQuestion1357() {
    Question question;

    question = questionRepository.save(new Question(12, "Which of these actors is known for tweeting pictures of his own paintings?", "2018-04-26 19:11:34"));

    answerRepository.save(new Answer(question, 'A', "Anthony Hopkins", true));
    answerRepository.save(new Answer(question, 'B', "Sam Neill", false));
    answerRepository.save(new Answer(question, 'C', "Michael Caine", false));
  }

  private void saveQuestion1358() {
    Question question;

    question = questionRepository.save(new Question(1, "Which is a common flavor of toothpaste?", "2018-04-27 01:05:17"));

    answerRepository.save(new Answer(question, 'A', "Mint", true));
    answerRepository.save(new Answer(question, 'B', "Salt", false));
    answerRepository.save(new Answer(question, 'C', "Mayonnaise", false));
  }

  private void saveQuestion1359() {
    Question question;

    question = questionRepository.save(new Question(2, "What is a derisive name for a large, generic suburban home?", "2018-04-27 01:05:48"));

    answerRepository.save(new Answer(question, 'A', "Piazza Hut", false));
    answerRepository.save(new Answer(question, 'B', "Burger Realm", false));
    answerRepository.save(new Answer(question, 'C', "McMansion", true));
  }

  private void saveQuestion1360() {
    Question question;

    question = questionRepository.save(new Question(3, "Which of these is a food that vegans would eat?", "2018-04-27 01:06:23"));

    answerRepository.save(new Answer(question, 'A', "Spinach", true));
    answerRepository.save(new Answer(question, 'B', "Strip steak", false));
    answerRepository.save(new Answer(question, 'C', "Tuna salad", false));
  }

  private void saveQuestion1361() {
    Question question;

    question = questionRepository.save(new Question(4, "Which of these US states is part of the Delmarva Peninsula?", "2018-04-27 01:06:55"));

    answerRepository.save(new Answer(question, 'A', "Arkansas", false));
    answerRepository.save(new Answer(question, 'B', "Maryland", true));
    answerRepository.save(new Answer(question, 'C', "Arizona", false));
  }

  private void saveQuestion1362() {
    Question question;

    question = questionRepository.save(new Question(5, "Thanks to its density, which of these elements is the heaviest?", "2018-04-27 01:07:29"));

    answerRepository.save(new Answer(question, 'A', "Lead", true));
    answerRepository.save(new Answer(question, 'B', "Silver", false));
    answerRepository.save(new Answer(question, 'C', "Aluminum", false));
  }

  private void saveQuestion1363() {
    Question question;

    question = questionRepository.save(new Question(6, "Which of these terms refers to avoiding tasks by pretending to be unable to do them?", "2018-04-27 01:08:02"));

    answerRepository.save(new Answer(question, 'A', "Aversion therapy", false));
    answerRepository.save(new Answer(question, 'B', "Strateg… https://t.co/6JniwqorIJ", false));
  }

  private void saveQuestion1364() {
    Question question;

    question = questionRepository.save(new Question(7, "What school shares its name with a character from the legends of King Arthur?", "2018-04-27 01:08:42"));

    answerRepository.save(new Answer(question, 'A', "Emory University", false));
    answerRepository.save(new Answer(question, 'B', "Notre Dame", true));
    answerRepository.save(new Answer(question, 'C', "Columbia University", false));
  }

  private void saveQuestion1365() {
    Question question;

    question = questionRepository.save(new Question(8, "Which of these artists has NOT recorded a song based on “Wuthering Heights”?", "2018-04-27 01:09:35"));

    answerRepository.save(new Answer(question, 'A', "Annie Lennox", true));
    answerRepository.save(new Answer(question, 'B', "Kate Bush", false));
    answerRepository.save(new Answer(question, 'C', "Celine Dion", false));
  }

  private void saveQuestion1366() {
    Question question;

    question = questionRepository.save(new Question(9, "The Theridion grallator is a Hawaiian spider famous for what distinctive pattern on its back?", "2018-04-27 01:10:21"));

    answerRepository.save(new Answer(question, 'A', "Smiley face", true));
    answerRepository.save(new Answer(question, 'B', "I… https://t.co/cVFrKy7rPS", false));
  }

  private void saveQuestion1367() {
    Question question;

    question = questionRepository.save(new Question(10, "Which Canadian author wrote a book nobody will be able to read until the next century?", "2018-04-27 01:11:10"));

    answerRepository.save(new Answer(question, 'A', "Alice Munro", false));
    answerRepository.save(new Answer(question, 'B', "Margaret Atwood", true));
    answerRepository.save(new Answer(question, 'C', "Yann Martel", false));
  }

  private void saveQuestion1368() {
    Question question;

    question = questionRepository.save(new Question(11, "The only dwarf planet in our solar system’s asteroid belt is named for a goddess of what?", "2018-04-27 01:11:47"));

    answerRepository.save(new Answer(question, 'A', "Wisdom", false));
    answerRepository.save(new Answer(question, 'B', "Agriculture", true));
    answerRepository.save(new Answer(question, 'C', "Dawn", false));
  }

  private void saveQuestion1369() {
    Question question;

    question = questionRepository.save(new Question(12, "Rumored to be made of unicorn horns, the throne chair of Denmark is actually made of what?", "2018-04-27 01:13:03"));

    answerRepository.save(new Answer(question, 'A', "Horse bones", false));
    answerRepository.save(new Answer(question, 'B', "White quartz", false));
    answerRepository.save(new Answer(question, 'C', "Narwhal tusks", true));
  }

  private void saveQuestion1370() {
    Question question;

    question = questionRepository.save(new Question(1, "@AndroidLibHunt @chwies1 @RyneHager @djleeds First featuring 😎 Thx @AndroidLibHunt", "2018-04-27 14:53:11"));

  }

  private void saveQuestion1371() {
    Question question;

    question = questionRepository.save(new Question(1, "Which machine would you most likely find in a gym?", "2018-04-27 19:04:13"));

    answerRepository.save(new Answer(question, 'A', "Karaoke machine", false));
    answerRepository.save(new Answer(question, 'B', "Deep fryer", false));
    answerRepository.save(new Answer(question, 'C', "Treadmill", true));
  }

  private void saveQuestion1372() {
    Question question;

    question = questionRepository.save(new Question(2, "According to an old saying, “You can’t judge a book by its” what?", "2018-04-27 19:04:50"));

    answerRepository.save(new Answer(question, 'A', "Index", false));
    answerRepository.save(new Answer(question, 'B', "Klout Score", false));
    answerRepository.save(new Answer(question, 'C', "Cover", true));
  }

  private void saveQuestion1373() {
    Question question;

    question = questionRepository.save(new Question(3, "Which of these is the name of a famous cartoon chipmunk?", "2018-04-27 19:05:22"));

    answerRepository.save(new Answer(question, 'A', "Mickey", false));
    answerRepository.save(new Answer(question, 'B', "Goofy", false));
    answerRepository.save(new Answer(question, 'C', "Alvin", true));
  }

  private void saveQuestion1374() {
    Question question;

    question = questionRepository.save(new Question(4, "Which of these properties is often measured in fluid ounces?", "2018-04-27 19:05:57"));

    answerRepository.save(new Answer(question, 'A', "Density", false));
    answerRepository.save(new Answer(question, 'B', "Volume", true));
    answerRepository.save(new Answer(question, 'C', "Viscosity", false));
  }

  private void saveQuestion1375() {
    Question question;

    question = questionRepository.save(new Question(5, "Which of these terms is used to describe the news media?", "2018-04-27 19:06:28"));

    answerRepository.save(new Answer(question, 'A', "Fourth estate", true));
    answerRepository.save(new Answer(question, 'B', "Second base", false));
    answerRepository.save(new Answer(question, 'C', "Third watch", false));
  }

  private void saveQuestion1376() {
    Question question;

    question = questionRepository.save(new Question(6, "In the 1989 film “Turner &amp; Hooch,” what kind of animal was Hooch?", "2018-04-27 19:07:17"));

    answerRepository.save(new Answer(question, 'A', "Dog", true));
    answerRepository.save(new Answer(question, 'B', "Ferret", false));
    answerRepository.save(new Answer(question, 'C', "Skunk", false));
  }

  private void saveQuestion1377() {
    Question question;

    question = questionRepository.save(new Question(7, "Which of these islands is in the Caribbean?", "2018-04-27 19:08:04"));

    answerRepository.save(new Answer(question, 'A', "Bora Bora", false));
    answerRepository.save(new Answer(question, 'B', "Seychelles", false));
    answerRepository.save(new Answer(question, 'C', "Saint Lucia", true));
  }

  private void saveQuestion1378() {
    Question question;

    question = questionRepository.save(new Question(8, "The rapper Q-Tip is part of what classic hip-hop group?", "2018-04-27 19:08:33"));

    answerRepository.save(new Answer(question, 'A', "A Tribe Called Quest", true));
    answerRepository.save(new Answer(question, 'B', "Public Enemy", false));
    answerRepository.save(new Answer(question, 'C', "De La Soul", false));
  }

  private void saveQuestion1379() {
    Question question;

    question = questionRepository.save(new Question(9, "The Barbie of Barbie doll fame shares her last name with what current government official?", "2018-04-27 19:09:14"));

    answerRepository.save(new Answer(question, 'A', "Secretary of Defense… https://t.co/UxFME9m8tW", false));
  }

  private void saveQuestion1380() {
    Question question;

    question = questionRepository.save(new Question(10, "Which of these dog breeds has won the most Best in Show awards at Westminster?", "2018-04-27 19:09:47"));

    answerRepository.save(new Answer(question, 'A', "English Setter", false));
    answerRepository.save(new Answer(question, 'B', "Scottish Terrier", true));
    answerRepository.save(new Answer(question, 'C', "Bichon Frise", false));
  }

  private void saveQuestion1381() {
    Question question;

    question = questionRepository.save(new Question(11, "The Lone Star State does NOT border which state?", "2018-04-27 19:10:34"));

    answerRepository.save(new Answer(question, 'A', "Centennial State", true));
    answerRepository.save(new Answer(question, 'B', "Land of Enchantment", false));
    answerRepository.save(new Answer(question, 'C', "Pelican State", false));
  }

  private void saveQuestion1382() {
    Question question;

    question = questionRepository.save(new Question(12, "Who was inducted into the National Inventors Hall of Fame first?", "2018-04-27 19:11:48"));

    answerRepository.save(new Answer(question, 'A', "Nikola Tesla", true));
    answerRepository.save(new Answer(question, 'B', "Philo Farnsworth", false));
    answerRepository.save(new Answer(question, 'C', "Louis Pasteur", false));
  }

  private void saveQuestion1383() {
    Question question;

    question = questionRepository.save(new Question(1, "Who is the Eiffel Tower named after?", "2018-04-28 01:04:51"));

    answerRepository.save(new Answer(question, 'A', "Gustave Eiffel", true));
    answerRepository.save(new Answer(question, 'B', "Gustave Tower", false));
    answerRepository.save(new Answer(question, 'C', "Indoor Football League", false));
  }

  private void saveQuestion1384() {
    Question question;

    question = questionRepository.save(new Question(2, "Which of these places is located in the tropics?", "2018-04-28 01:05:24"));

    answerRepository.save(new Answer(question, 'A', "Siberia", false));
    answerRepository.save(new Answer(question, 'B', "Hawaii", true));
    answerRepository.save(new Answer(question, 'C', "Antarctica", false));
  }

  private void saveQuestion1385() {
    Question question;

    question = questionRepository.save(new Question(3, "What is the name of the layer that lies between the crust and core of the Earth?", "2018-04-28 01:06:23"));

    answerRepository.save(new Answer(question, 'A', "Mantle", true));
    answerRepository.save(new Answer(question, 'B', "Ocean", false));
    answerRepository.save(new Answer(question, 'C', "Continent", false));
  }

  private void saveQuestion1386() {
    Question question;

    question = questionRepository.save(new Question(4, "Which of these is considered “higher” mathematics?", "2018-04-28 01:07:03"));

    answerRepository.save(new Answer(question, 'A', "Arithmetic", false));
    answerRepository.save(new Answer(question, 'B', "Area of a square", false));
    answerRepository.save(new Answer(question, 'C', "Vector calculus", true));
  }

  private void saveQuestion1387() {
    Question question;

    question = questionRepository.save(new Question(5, "Which of these is NOT one of Switzerland’s official languages?", "2018-04-28 01:07:39"));

    answerRepository.save(new Answer(question, 'A', "French", false));
    answerRepository.save(new Answer(question, 'B', "Italian", false));
    answerRepository.save(new Answer(question, 'C', "Dutch", true));
  }

  private void saveQuestion1388() {
    Question question;

    question = questionRepository.save(new Question(6, "On the periodic table of the elements, what are the horizontal rows called?", "2018-04-28 01:08:29"));

    answerRepository.save(new Answer(question, 'A', "Groups", false));
    answerRepository.save(new Answer(question, 'B', "Periods", true));
    answerRepository.save(new Answer(question, 'C', "Blocks", false));
  }

  private void saveQuestion1389() {
    Question question;

    question = questionRepository.save(new Question(7, "Which of these college football teams famously has the largest stadium?", "2018-04-28 01:09:12"));

    answerRepository.save(new Answer(question, 'A', "Crimson Tide", false));
    answerRepository.save(new Answer(question, 'B', "Wolverines", true));
    answerRepository.save(new Answer(question, 'C', "Longhorns", false));
  }

  private void saveQuestion1390() {
    Question question;

    question = questionRepository.save(new Question(8, "Which of these landmark Supreme Court cases was handed down first?", "2018-04-28 01:09:48"));

    answerRepository.save(new Answer(question, 'A', "Dred Scott v. Sandford", true));
    answerRepository.save(new Answer(question, 'B', "Brown v. Board", false));
    answerRepository.save(new Answer(question, 'C', "Plessy v. Ferguson", false));
  }

  private void saveQuestion1391() {
    Question question;

    question = questionRepository.save(new Question(9, "In the world of comic books, what does “retcon” mean?", "2018-04-28 01:10:27"));

    answerRepository.save(new Answer(question, 'A', "Retouched condition", false));
    answerRepository.save(new Answer(question, 'B', "Retroactive continuity", true));
    answerRepository.save(new Answer(question, 'C', "Retaliatory concussion", false));
  }

  private void saveQuestion1392() {
    Question question;

    question = questionRepository.save(new Question(10, "The Rolling Stones song “Sympathy for the Devil” was said to be inspired by what literary work?", "2018-04-28 01:11:05"));

    answerRepository.save(new Answer(question, 'A', "The Master and M… https://t.co/HwDThivHTB", false));
  }

  private void saveQuestion1393() {
    Question question;

    question = questionRepository.save(new Question(11, "Which of these is the title of only one book of the Bible?", "2018-04-28 01:11:52"));

    answerRepository.save(new Answer(question, 'A', "Kings", false));
    answerRepository.save(new Answer(question, 'B', "Chronicles", false));
    answerRepository.save(new Answer(question, 'C', "Judges", true));
  }

  private void saveQuestion1394() {
    Question question;

    question = questionRepository.save(new Question(12, "On AFI’s list of the top 100 movie quotes, two of the top three were spoken by what actor?", "2018-04-28 01:13:00"));

    answerRepository.save(new Answer(question, 'A', "Humphrey Bogart", false));
    answerRepository.save(new Answer(question, 'B', "Cl… https://t.co/wq7gdJf1Ma", false));
  }

  private void saveQuestion1395() {
    Question question;

    question = questionRepository.save(new Question(1, "Two items that are difficult to compare are often said to be what?", "2018-04-29 01:04:41"));

    answerRepository.save(new Answer(question, 'A', "Hoagies / grinders", false));
    answerRepository.save(new Answer(question, 'B', "Apples / oranges", true));
    answerRepository.save(new Answer(question, 'C', "Simons / Garfunkels", false));
  }

  private void saveQuestion1396() {
    Question question;

    question = questionRepository.save(new Question(2, "By definition, a hotel room advertised as having AC has what?", "2018-04-29 01:05:33"));

    answerRepository.save(new Answer(question, 'A', "Alive cockroaches", false));
    answerRepository.save(new Answer(question, 'B', "Almond cookies", false));
    answerRepository.save(new Answer(question, 'C', "Air conditioning", true));
  }

  private void saveQuestion1397() {
    Question question;

    question = questionRepository.save(new Question(3, "The comic strip “B.C.” is mainly about what?", "2018-04-29 01:06:05"));

    answerRepository.save(new Answer(question, 'A', "Aliens", false));
    answerRepository.save(new Answer(question, 'B', "Cavemen", true));
    answerRepository.save(new Answer(question, 'C', "Robots", false));
  }

  private void saveQuestion1398() {
    Question question;

    question = questionRepository.save(new Question(4, "Which of these particles is NOT found within an atomic nucleus?", "2018-04-29 01:06:50"));

    answerRepository.save(new Answer(question, 'A', "Electron", true));
    answerRepository.save(new Answer(question, 'B', "Proton", false));
    answerRepository.save(new Answer(question, 'C', "Neutron", false));
  }

  private void saveQuestion1399() {
    Question question;

    question = questionRepository.save(new Question(5, "What billionaire runs the corporate behemoth Berkshire Hathaway?", "2018-04-29 01:07:20"));

    answerRepository.save(new Answer(question, 'A', "Michael Bloomberg", false));
    answerRepository.save(new Answer(question, 'B', "Warren Buffett", true));
    answerRepository.save(new Answer(question, 'C', "Charles Koch", false));
  }

  private void saveQuestion1400() {
    Question question;

    question = questionRepository.save(new Question(6, "“Let My Love Open the Door” was a hit for a former member of what band?", "2018-04-29 01:08:00"));

    answerRepository.save(new Answer(question, 'A', "The Who", true));
    answerRepository.save(new Answer(question, 'B', "Genesis", false));
    answerRepository.save(new Answer(question, 'C', "Led Zeppelin", false));
  }

  private void saveQuestion1401() {
    Question question;

    question = questionRepository.save(new Question(7, "Which of these BBQ dishes is most closely tied to Kentucky?", "2018-04-29 01:08:39"));

    answerRepository.save(new Answer(question, 'A', "Chipped mutton", true));
    answerRepository.save(new Answer(question, 'B', "Brunswick stew", false));
    answerRepository.save(new Answer(question, 'C', "Dry ribs", false));
  }

  private void saveQuestion1402() {
    Question question;

    question = questionRepository.save(new Question(8, "Which of these words is used to refer to more than one ferret?", "2018-04-29 01:09:39"));

    answerRepository.save(new Answer(question, 'A', "Business", true));
    answerRepository.save(new Answer(question, 'B', "Punch", false));
    answerRepository.save(new Answer(question, 'C', "Clever", false));
  }

  private void saveQuestion1403() {
    Question question;

    question = questionRepository.save(new Question(9, "Which cartoon character made his first TV appearance in an ad for a fruit juice?", "2018-04-29 01:10:14"));

    answerRepository.save(new Answer(question, 'A', "Squidward Tentacles", false));
    answerRepository.save(new Answer(question, 'B', "Snoopy", false));
    answerRepository.save(new Answer(question, 'C', "Doug Funnie", true));
  }

  private void saveQuestion1404() {
    Question question;

    question = questionRepository.save(new Question(10, "You are most likely to hear the Tetum language spoken in which capital city?", "2018-04-29 01:10:52"));

    answerRepository.save(new Answer(question, 'A', "Dili", true));
    answerRepository.save(new Answer(question, 'B', "Mogadishu", false));
    answerRepository.save(new Answer(question, 'C', "La Paz", false));
  }

  private void saveQuestion1405() {
    Question question;

    question = questionRepository.save(new Question(11, "The New York Daily Advertiser was a newspaper famous for publishing what?", "2018-04-29 01:11:30"));

    answerRepository.save(new Answer(question, 'A', "First US coupons", false));
    answerRepository.save(new Answer(question, 'B', "Federalist Papers", true));
    answerRepository.save(new Answer(question, 'C', "Classifieds", false));
  }

  private void saveQuestion1406() {
    Question question;

    question = questionRepository.save(new Question(12, "The final words of which famous poem are written in the Sanskrit language?", "2018-04-29 01:12:42"));

    answerRepository.save(new Answer(question, 'A', "Ozymandias", false));
    answerRepository.save(new Answer(question, 'B', "The New Colossus", false));
    answerRepository.save(new Answer(question, 'C', "The Waste Land", true));
  }

  private void saveQuestion1407() {
    Question question;

    question = questionRepository.save(new Question(1, "Which of these is NOT a common type of underwear?", "2018-04-30 01:04:55"));

    answerRepository.save(new Answer(question, 'A', "Bee beard", true));
    answerRepository.save(new Answer(question, 'B', "Briefs", false));
    answerRepository.save(new Answer(question, 'C', "Boxers", false));
  }

  private void saveQuestion1408() {
    Question question;

    question = questionRepository.save(new Question(2, "A person who can’t decide something is said to be “sitting on the” what?", "2018-04-30 01:05:36"));

    answerRepository.save(new Answer(question, 'A', "Blockchain", false));
    answerRepository.save(new Answer(question, 'B', "Dock of the bay", false));
    answerRepository.save(new Answer(question, 'C', "Fence", true));
  }

  private void saveQuestion1409() {
    Question question;

    question = questionRepository.save(new Question(3, "When referring to the rodent, which of these is the correct plural form of “mouse”?", "2018-04-30 01:06:07"));

    answerRepository.save(new Answer(question, 'A', "Mouses", false));
    answerRepository.save(new Answer(question, 'B', "Octopi", false));
    answerRepository.save(new Answer(question, 'C', "Mice", true));
  }

  private void saveQuestion1410() {
    Question question;

    question = questionRepository.save(new Question(4, "What does the “A” in the biological acronym “DNA” stand for?", "2018-04-30 01:07:01"));

    answerRepository.save(new Answer(question, 'A', "Ardent", false));
    answerRepository.save(new Answer(question, 'B', "Acid", true));
    answerRepository.save(new Answer(question, 'C', "Adenine", false));
  }

  private void saveQuestion1411() {
    Question question;

    question = questionRepository.save(new Question(5, "What is the capital of the North Star State?", "2018-04-30 01:07:33"));

    answerRepository.save(new Answer(question, 'A', "Austin", false));
    answerRepository.save(new Answer(question, 'B', "Juneau", false));
    answerRepository.save(new Answer(question, 'C', "Saint Paul", true));
  }

  private void saveQuestion1412() {
    Question question;

    question = questionRepository.save(new Question(6, "Which of these investments takes longest to mature?", "2018-04-30 01:08:16"));

    answerRepository.save(new Answer(question, 'A', "T-bonds", true));
    answerRepository.save(new Answer(question, 'B', "T-notes", false));
    answerRepository.save(new Answer(question, 'C', "T-bills", false));
  }

  private void saveQuestion1413() {
    Question question;

    question = questionRepository.save(new Question(7, "The mnemonic “King Henry Doesn’t Usually Drink Chocolate Milk” is used to remember what?", "2018-04-30 01:08:58"));

    answerRepository.save(new Answer(question, 'A', "Moons of Saturn", false));
    answerRepository.save(new Answer(question, 'B', "Nobl… https://t.co/S1X782KDlr", false));
  }

  private void saveQuestion1414() {
    Question question;

    question = questionRepository.save(new Question(8, "Which of these states is home to the tallest structure in the Western Hemisphere?", "2018-04-30 01:09:34"));

    answerRepository.save(new Answer(question, 'A', "Washington", false));
    answerRepository.save(new Answer(question, 'B', "New York", false));
    answerRepository.save(new Answer(question, 'C', "North Dakota", true));
  }

  private void saveQuestion1415() {
    Question question;

    question = questionRepository.save(new Question(9, "Which of these is an anagram of “twelve plus one”?", "2018-04-30 01:10:30"));

    answerRepository.save(new Answer(question, 'A', "Eleven plus two", true));
    answerRepository.save(new Answer(question, 'B', "Twenty-one elves", false));
    answerRepository.save(new Answer(question, 'C', "Twelve one-ups", false));
  }

  private void saveQuestion1416() {
    Question question;

    question = questionRepository.save(new Question(10, "Guns N’ Roses once wrote a song with the same title as what author's most famous work?", "2018-04-30 01:11:11"));

    answerRepository.save(new Answer(question, 'A', "JD Salinger", true));
    answerRepository.save(new Answer(question, 'B', "F. Scott… https://t.co/5oPgBnMsLA", false));
  }

  private void saveQuestion1417() {
    Question question;

    question = questionRepository.save(new Question(11, "Which of the following cities is NOT home to an inaugural NHL team?", "2018-04-30 01:12:04"));

    answerRepository.save(new Answer(question, 'A', "Pittsburgh", true));
    answerRepository.save(new Answer(question, 'B', "Chicago", false));
    answerRepository.save(new Answer(question, 'C', "Detroit", false));
  }

  private void saveQuestion1418() {
    Question question;

    question = questionRepository.save(new Question(12, "Whose Twitter handle comes first in alphabetical order?", "2018-04-30 01:12:38"));

    answerRepository.save(new Answer(question, 'A', "Ellen DeGeneres", false));
    answerRepository.save(new Answer(question, 'B', "Neil Patrick Harris", true));
    answerRepository.save(new Answer(question, 'C', "LeBron James", false));
  }

  private void saveQuestion1419() {
    Question question;

    question = questionRepository.save(new Question(13, "Which of these is a character from the 1980s cartoon series titled “Ghostbusters”?", "2018-04-30 01:13:44"));

    answerRepository.save(new Answer(question, 'A', "Slimer", false));
    answerRepository.save(new Answer(question, 'B', "Ray Stantz", false));
    answerRepository.save(new Answer(question, 'C', "Eddie Spenser Jr.", true));
  }

  private void saveQuestion1420() {
    Question question;

    question = questionRepository.save(new Question(14, "Which nation’s flag features a simple geometric form meant to resemble the nation’s shape?", "2018-04-30 01:14:23"));

    answerRepository.save(new Answer(question, 'A', "Bosnia and Herzegovina", true));
    answerRepository.save(new Answer(question, 'B', "Nepal", false));
    answerRepository.save(new Answer(question, 'C', "Argentina", false));
  }

  private void saveQuestion1421() {
    Question question;

    question = questionRepository.save(new Question(15, "The last lines spoken by Shakespeare’s Romeo and Othello both include what word?", "2018-04-30 01:15:33"));

    answerRepository.save(new Answer(question, 'A', "Sleep", false));
    answerRepository.save(new Answer(question, 'B', "Kiss", true));
    answerRepository.save(new Answer(question, 'C', "Heart", false));
  }

  private void saveQuestion1422() {
    Question question;

    question = questionRepository.save(new Question(1, "Which of these is a common office supply?", "2018-04-30 19:04:43"));

    answerRepository.save(new Answer(question, 'A', "Clown shoes", false));
    answerRepository.save(new Answer(question, 'B', "Paper clips", true));
    answerRepository.save(new Answer(question, 'C', "Heated asphalt", false));
  }

  private void saveQuestion1423() {
    Question question;

    question = questionRepository.save(new Question(2, "Which of these is the name of the ship that famously brought the Pilgrims to America?", "2018-04-30 19:05:25"));

    answerRepository.save(new Answer(question, 'A', "Pacific Princess", false));
    answerRepository.save(new Answer(question, 'B', "SS Minnow", false));
    answerRepository.save(new Answer(question, 'C', "Mayflower", true));
  }

  private void saveQuestion1424() {
    Question question;

    question = questionRepository.save(new Question(3, "Which of these states lies farthest west?", "2018-04-30 19:05:49"));

    answerRepository.save(new Answer(question, 'A', "New Mexico", true));
    answerRepository.save(new Answer(question, 'B', "North Carolina", false));
    answerRepository.save(new Answer(question, 'C', "New Jersey", false));
  }

  private void saveQuestion1425() {
    Question question;

    question = questionRepository.save(new Question(4, "Which of these people was president of the US during the Civil War?", "2018-04-30 19:06:18"));

    answerRepository.save(new Answer(question, 'A', "Abraham Lincoln", true));
    answerRepository.save(new Answer(question, 'B', "Andrew Jackson", false));
    answerRepository.save(new Answer(question, 'C', "Ulysses S. Grant", false));
  }

  private void saveQuestion1426() {
    Question question;

    question = questionRepository.save(new Question(5, "What would you directly learn to do from the Chicago Manual of Style?", "2018-04-30 19:06:54"));

    answerRepository.save(new Answer(question, 'A', "Punctuate a sentence", true));
    answerRepository.save(new Answer(question, 'B', "Kern a font", false));
    answerRepository.save(new Answer(question, 'C', "Accessorize a dress", false));
  }

  private void saveQuestion1427() {
    Question question;

    question = questionRepository.save(new Question(6, "Which sport does NOT have a US Open?", "2018-04-30 19:07:25"));

    answerRepository.save(new Answer(question, 'A', "Tennis", false));
    answerRepository.save(new Answer(question, 'B', "Golf", false));
    answerRepository.save(new Answer(question, 'C', "Handball", true));
  }

  private void saveQuestion1428() {
    Question question;

    question = questionRepository.save(new Question(7, "What is the name of the treat that plays a key role in “The Lion, the Witch and the Wardrobe”?", "2018-04-30 19:07:55"));

    answerRepository.save(new Answer(question, 'A', "Turkish delight… https://t.co/u3cvhSkTbS", true));
  }

  private void saveQuestion1429() {
    Question question;

    question = questionRepository.save(new Question(8, "A “rack-and-pinion” assembly relies on what mechanical concept?", "2018-04-30 19:08:30"));

    answerRepository.save(new Answer(question, 'A', "Hydraulics", false));
    answerRepository.save(new Answer(question, 'B', "Gears", true));
    answerRepository.save(new Answer(question, 'C', "Springs", false));
  }

  private void saveQuestion1430() {
    Question question;

    question = questionRepository.save(new Question(9, "Which of these is both a body part and the phonetic pronunciation of a letter in the Hebrew alphabet?", "2018-04-30 19:09:06"));

    answerRepository.save(new Answer(question, 'A', "Gimel", false));
    answerRepository.save(new Answer(question, 'B', "Heel", false));
    answerRepository.save(new Answer(question, 'C', "Shin", true));
  }

  private void saveQuestion1431() {
    Question question;

    question = questionRepository.save(new Question(10, "What classic video game was partly designed by founders of Apple Computer?", "2018-04-30 19:09:45"));

    answerRepository.save(new Answer(question, 'A', "Defender", false));
    answerRepository.save(new Answer(question, 'B', "Asteroids", false));
    answerRepository.save(new Answer(question, 'C', "Breakout", true));
  }

  private void saveQuestion1432() {
    Question question;

    question = questionRepository.save(new Question(11, "Which city is NOT a terminus of the Panama Canal?", "2018-04-30 19:10:29"));

    answerRepository.save(new Answer(question, 'A', "Colón", false));
    answerRepository.save(new Answer(question, 'B', "Panama City", false));
    answerRepository.save(new Answer(question, 'C', "La Chorrera", true));
  }

  private void saveQuestion1433() {
    Question question;

    question = questionRepository.save(new Question(12, "The element named from the Latin for “flint” is typically used to make what?", "2018-04-30 19:11:33"));

    answerRepository.save(new Answer(question, 'A', "Explosives", false));
    answerRepository.save(new Answer(question, 'B', "Computer chips", true));
    answerRepository.save(new Answer(question, 'C', "Electrical wire", false));
  }

  private void saveQuestion1434() {
    Question question;

    question = questionRepository.save(new Question(1, "If your clothes catch fire, you are supposed to stop, drop, and what?", "2018-05-01 01:03:59"));

    answerRepository.save(new Answer(question, 'A', "Think", false));
    answerRepository.save(new Answer(question, 'B', "Roll", true));
    answerRepository.save(new Answer(question, 'C', "Freak", false));
  }

  private void saveQuestion1435() {
    Question question;

    question = questionRepository.save(new Question(2, "What term refers to diving headfirst into a pool with arms wide open at the start?", "2018-05-01 01:04:34"));

    answerRepository.save(new Answer(question, 'A', "Pig dive", false));
    answerRepository.save(new Answer(question, 'B', "Swan dive", true));
    answerRepository.save(new Answer(question, 'C', "Moose dive", false));
  }

  private void saveQuestion1436() {
    Question question;

    question = questionRepository.save(new Question(3, "What was the name of the wrestling giant who starred in “The Princess Bride”?", "2018-05-01 01:05:19"));

    answerRepository.save(new Answer(question, 'A', "Gerry", false));
    answerRepository.save(new Answer(question, 'B', "Mitch", false));
    answerRepository.save(new Answer(question, 'C', "André", true));
  }

  private void saveQuestion1437() {
    Question question;

    question = questionRepository.save(new Question(4, "Which of these words has won Oxford Dictionaries Word of the Year?", "2018-05-01 01:05:49"));

    answerRepository.save(new Answer(question, 'A', "Hundo", false));
    answerRepository.save(new Answer(question, 'B', "Unfriend", true));
    answerRepository.save(new Answer(question, 'C', "Yassss", false));
  }

  private void saveQuestion1438() {
    Question question;

    question = questionRepository.save(new Question(5, "Another way to express the number 1000 is to write “ten to the” what?", "2018-05-01 01:06:32"));

    answerRepository.save(new Answer(question, 'A', "Thousandth power", false));
    answerRepository.save(new Answer(question, 'B', "Tenth power", false));
    answerRepository.save(new Answer(question, 'C', "Third power", true));
  }

  private void saveQuestion1439() {
    Question question;

    question = questionRepository.save(new Question(6, "In which of these terms does the initial refer to the name of an emperor?", "2018-05-01 01:07:26"));

    answerRepository.save(new Answer(question, 'A', "W-2", false));
    answerRepository.save(new Answer(question, 'B', "C-Section", true));
    answerRepository.save(new Answer(question, 'C', "Q Rating", false));
  }

  private void saveQuestion1440() {
    Question question;

    question = questionRepository.save(new Question(7, "What European mountain range is named for its visibility to incoming American ships?", "2018-05-01 01:08:04"));

    answerRepository.save(new Answer(question, 'A', "Pecos Bill", false));
    answerRepository.save(new Answer(question, 'B', "Picos de Europa", true));
    answerRepository.save(new Answer(question, 'C', "Pico de Gallo", false));
  }

  private void saveQuestion1441() {
    Question question;

    question = questionRepository.save(new Question(8, "Which of these words can describe both a hat and a type of sleeve?", "2018-05-01 01:08:42"));

    answerRepository.save(new Answer(question, 'A', "Cap", true));
    answerRepository.save(new Answer(question, 'B', "Tam", false));
    answerRepository.save(new Answer(question, 'C', "Bowler", false));
  }

  private void saveQuestion1442() {
    Question question;

    question = questionRepository.save(new Question(9, "From where did the Titanic originally set sail?", "2018-05-01 01:09:25"));

    answerRepository.save(new Answer(question, 'A', "United States", false));
    answerRepository.save(new Answer(question, 'B', "England", false));
    answerRepository.save(new Answer(question, 'C', "Northern Ireland", true));
  }

  private void saveQuestion1443() {
    Question question;

    question = questionRepository.save(new Question(10, "Which of these video game companies first made playing cards?", "2018-05-01 01:10:11"));

    answerRepository.save(new Answer(question, 'A', "Nintendo", true));
    answerRepository.save(new Answer(question, 'B', "Atari", false));
    answerRepository.save(new Answer(question, 'C', "Sega", false));
  }

  private void saveQuestion1444() {
    Question question;

    question = questionRepository.save(new Question(11, "Which of these is actually in the country of Scotland?", "2018-05-01 01:10:43"));

    answerRepository.save(new Answer(question, 'A', "County of Scotland", false));
    answerRepository.save(new Answer(question, 'B', "Scotland Yard", false));
    answerRepository.save(new Answer(question, 'C', "Skye, Scotland", true));
  }

  private void saveQuestion1445() {
    Question question;

    question = questionRepository.save(new Question(12, "Though they all ended quickly, which of these late-night hosts had the shortest run?", "2018-05-01 01:11:47"));

    answerRepository.save(new Answer(question, 'A', "Magic Johnson", false));
    answerRepository.save(new Answer(question, 'B', "Pat Sajak", false));
    answerRepository.save(new Answer(question, 'C', "Chevy Chase", true));
  }

  private void saveQuestion1446() {
    Question question;

    question = questionRepository.save(new Question(1, "What color are most official New York taxicabs?", "2018-05-01 19:03:34"));

    answerRepository.save(new Answer(question, 'A', "Yellow", true));
    answerRepository.save(new Answer(question, 'B', "Rainbow", false));
    answerRepository.save(new Answer(question, 'C', "Red / White / Blue", false));
  }

  private void saveQuestion1447() {
    Question question;

    question = questionRepository.save(new Question(2, "The word “flauta” literally translates to what in English?", "2018-05-01 19:04:08"));

    answerRepository.save(new Answer(question, 'A', "Flimsy taco", false));
    answerRepository.save(new Answer(question, 'B', "Flute", true));
    answerRepository.save(new Answer(question, 'C', "Flux capacitor", false));
  }

  private void saveQuestion1448() {
    Question question;

    question = questionRepository.save(new Question(3, "What “butler” lent his name to a popular 1990s search engine?", "2018-05-01 19:04:48"));

    answerRepository.save(new Answer(question, 'A', "Mr. Belvedere", false));
    answerRepository.save(new Answer(question, 'B', "Jeeves", true));
    answerRepository.save(new Answer(question, 'C', "Malcolm", false));
  }

  private void saveQuestion1449() {
    Question question;

    question = questionRepository.save(new Question(4, "Which of these animated movies featured the song “A Whole New World”?", "2018-05-01 19:05:24"));

    answerRepository.save(new Answer(question, 'A', "Aladdin", true));
    answerRepository.save(new Answer(question, 'B', "Toy Story", false));
    answerRepository.save(new Answer(question, 'C', "An American Tail", false));
  }

  private void saveQuestion1450() {
    Question question;

    question = questionRepository.save(new Question(5, "What judge oversaw the 1994-95 trial of OJ Simpson?", "2018-05-01 19:05:59"));

    answerRepository.save(new Answer(question, 'A', "Lance Ito", true));
    answerRepository.save(new Answer(question, 'B', "Joe Brown", false));
    answerRepository.save(new Answer(question, 'C', "Mills Lane", false));
  }

  private void saveQuestion1451() {
    Question question;

    question = questionRepository.save(new Question(6, "Which of these fabrics is most closely associated with picnics?", "2018-05-01 19:06:37"));

    answerRepository.save(new Answer(question, 'A', "Tulle", false));
    answerRepository.save(new Answer(question, 'B', "Gingham", true));
    answerRepository.save(new Answer(question, 'C', "Seersucker", false));
  }

  private void saveQuestion1452() {
    Question question;

    question = questionRepository.save(new Question(7, "Eliza Schuyler Hamilton helped raise money to build what DC landmark?", "2018-05-01 19:07:15"));

    answerRepository.save(new Answer(question, 'A', "Jefferson Memorial", false));
    answerRepository.save(new Answer(question, 'B', "Washington Monument", true));
    answerRepository.save(new Answer(question, 'C', "Ford’s Theater", false));
  }

  private void saveQuestion1453() {
    Question question;

    question = questionRepository.save(new Question(8, "Which of these cities’ NBA teams has a bird as a mascot?", "2018-05-01 19:07:54"));

    answerRepository.save(new Answer(question, 'A', "Memphis", false));
    answerRepository.save(new Answer(question, 'B', "New Orleans", true));
    answerRepository.save(new Answer(question, 'C', "Charlotte", false));
  }

  private void saveQuestion1454() {
    Question question;

    question = questionRepository.save(new Question(9, "In publishing, what is typically found next to “verso”?", "2018-05-01 19:08:38"));

    answerRepository.save(new Answer(question, 'A', "Bolus", false));
    answerRepository.save(new Answer(question, 'B', "Menta", false));
    answerRepository.save(new Answer(question, 'C', "Recto", true));
  }

  private void saveQuestion1455() {
    Question question;

    question = questionRepository.save(new Question(10, "Which of these dogs is thought to NOT get its name from its color?", "2018-05-01 19:09:12"));

    answerRepository.save(new Answer(question, 'A', "Chocolate Lab", false));
    answerRepository.save(new Answer(question, 'B', "Golden Retriever", false));
    answerRepository.save(new Answer(question, 'C', "Greyhound", true));
  }

  private void saveQuestion1456() {
    Question question;

    question = questionRepository.save(new Question(11, "The two sides of the Great Wall of China face China and what?", "2018-05-01 19:09:57"));

    answerRepository.save(new Answer(question, 'A', "Russia", false));
    answerRepository.save(new Answer(question, 'B', "Mongolia", false));
    answerRepository.save(new Answer(question, 'C', "China", true));
  }

  private void saveQuestion1457() {
    Question question;

    question = questionRepository.save(new Question(12, "The actor behind which “Fresh Prince” character also had a long career voicing cartoon villains?", "2018-05-01 19:11:24"));

    answerRepository.save(new Answer(question, 'A', "Carlton", false));
    answerRepository.save(new Answer(question, 'B', "Philip", true));
    answerRepository.save(new Answer(question, 'C', "Geoffrey", false));
  }

  private void saveQuestion1458() {
    Question question;

    question = questionRepository.save(new Question(1, "Michael Jackson was known as the King of what?", "2018-05-02 01:03:55"));

    answerRepository.save(new Answer(question, 'A', "Breakfast", false));
    answerRepository.save(new Answer(question, 'B', "Pop", true));
    answerRepository.save(new Answer(question, 'C', "Bahrain", false));
  }

  private void saveQuestion1459() {
    Question question;

    question = questionRepository.save(new Question(2, "According to old superstition, in order to avoid a jinx you should knock on what?", "2018-05-02 01:04:28"));

    answerRepository.save(new Answer(question, 'A', "Wood", true));
    answerRepository.save(new Answer(question, 'B', "Your neighbor’s window", false));
    answerRepository.save(new Answer(question, 'C', "The Mona Lisa", false));
  }

  private void saveQuestion1460() {
    Question question;

    question = questionRepository.save(new Question(3, "What is the name of the imaginary line at zero degrees latitude?", "2018-05-02 01:05:14"));

    answerRepository.save(new Answer(question, 'A', "Prime Meridian", false));
    answerRepository.save(new Answer(question, 'B', "Equator", true));
    answerRepository.save(new Answer(question, 'C', "Tropic of Capricorn", false));
  }

  private void saveQuestion1461() {
    Question question;

    question = questionRepository.save(new Question(4, "The arrow next to the gas gauge on a car dashboard is designed to point to what?", "2018-05-02 01:05:52"));

    answerRepository.save(new Answer(question, 'A', "Oil gauge", false));
    answerRepository.save(new Answer(question, 'B', "Filler cap", true));
    answerRepository.save(new Answer(question, 'C', "Trunk", false));
  }

  private void saveQuestion1462() {
    Question question;

    question = questionRepository.save(new Question(5, "Frenchman Fernand Lamaze came up with a popular technique for what?", "2018-05-02 01:06:36"));

    answerRepository.save(new Answer(question, 'A', "Childbirth", true));
    answerRepository.save(new Answer(question, 'B', "Serving a tennis ball", false));
    answerRepository.save(new Answer(question, 'C', "Frying potatoes", false));
  }

  private void saveQuestion1463() {
    Question question;

    question = questionRepository.save(new Question(6, "If you filed an extension on your individual US tax return this year, when is your new deadline?", "2018-05-02 01:07:15"));

    answerRepository.save(new Answer(question, 'A', "October 15", true));
    answerRepository.save(new Answer(question, 'B', "August 15", false));
    answerRepository.save(new Answer(question, 'C', "June 15", false));
  }

  private void saveQuestion1464() {
    Question question;

    question = questionRepository.save(new Question(7, "Which of these phrases has NOT been the title of a James Bond film?", "2018-05-02 01:07:59"));

    answerRepository.save(new Answer(question, 'A', "Tomorrow Is Not Enough", true));
    answerRepository.save(new Answer(question, 'B', "Live and Let Die", false));
    answerRepository.save(new Answer(question, 'C', "For Your Eyes Only", false));
  }

  private void saveQuestion1465() {
    Question question;

    question = questionRepository.save(new Question(8, "Which of these nations shares a border with Italy?", "2018-05-02 01:08:37"));

    answerRepository.save(new Answer(question, 'A', "Serbia", false));
    answerRepository.save(new Answer(question, 'B', "Slovakia", false));
    answerRepository.save(new Answer(question, 'C', "Slovenia", true));
  }

  private void saveQuestion1466() {
    Question question;

    question = questionRepository.save(new Question(9, "What classic cartoon character’s catchphrase refers to a dish of corn and lima beans?", "2018-05-02 01:09:20"));

    answerRepository.save(new Answer(question, 'A', "Sylvester the Cat", true));
    answerRepository.save(new Answer(question, 'B', "Popeye", false));
    answerRepository.save(new Answer(question, 'C', "Mighty Mouse", false));
  }

  private void saveQuestion1467() {
    Question question;

    question = questionRepository.save(new Question(10, "Which of these prizes did author Annie Proulx NOT earn for “Brokeback Mountain”?", "2018-05-02 01:10:02"));

    answerRepository.save(new Answer(question, 'A', "Pulitzer", true));
    answerRepository.save(new Answer(question, 'B', "National Magazine Award", false));
    answerRepository.save(new Answer(question, 'C', "O. Henry", false));
  }

  private void saveQuestion1468() {
    Question question;

    question = questionRepository.save(new Question(11, "The 1980 US hockey team won the gold medal by defeating which country in the final game?", "2018-05-02 01:10:41"));

    answerRepository.save(new Answer(question, 'A', "Finland", true));
    answerRepository.save(new Answer(question, 'B', "Canada", false));
    answerRepository.save(new Answer(question, 'C', "Soviet Union", false));
  }

  private void saveQuestion1469() {
    Question question;

    question = questionRepository.save(new Question(12, "The phrase “always a bridesmaid, never a bride” was popularized by an ad campaign for what?", "2018-05-02 01:12:01"));

    answerRepository.save(new Answer(question, 'A', "Detergent", false));
    answerRepository.save(new Answer(question, 'B', "Lingerie", false));
    answerRepository.save(new Answer(question, 'C', "Mouthwash", true));
  }

  private void saveQuestion1470() {
    Question question;

    question = questionRepository.save(new Question(1, "Which of these body parts is also a common part of a chair?", "2018-05-02 19:03:47"));

    answerRepository.save(new Answer(question, 'A', "Spleen", false));
    answerRepository.save(new Answer(question, 'B', "Leg", true));
    answerRepository.save(new Answer(question, 'C', "Uvula", false));
  }

  private void saveQuestion1471() {
    Question question;

    question = questionRepository.save(new Question(2, "A dinner combining seafood and red meat is called “surf and” what?", "2018-05-02 19:04:18"));

    answerRepository.save(new Answer(question, 'A', "Smurf", false));
    answerRepository.save(new Answer(question, 'B', "Turf", true));
    answerRepository.save(new Answer(question, 'C', "Nerf", false));
  }

  private void saveQuestion1472() {
    Question question;

    question = questionRepository.save(new Question(3, "Which of these titles typically wields the most power at a corporation?", "2018-05-02 19:05:00"));

    answerRepository.save(new Answer(question, 'A', "CIO", false));
    answerRepository.save(new Answer(question, 'B', "CFO", false));
    answerRepository.save(new Answer(question, 'C', "CEO", true));
  }

  private void saveQuestion1473() {
    Question question;

    question = questionRepository.save(new Question(4, "Which of these species is the closest relative of the llama?", "2018-05-02 19:05:37"));

    answerRepository.save(new Answer(question, 'A', "Hamster", false));
    answerRepository.save(new Answer(question, 'B', "Alpaca", true));
    answerRepository.save(new Answer(question, 'C', "Rhinoceros", false));
  }

  private void saveQuestion1474() {
    Question question;

    question = questionRepository.save(new Question(5, "What fruit is also sometimes known as a “fuzzless peach”?", "2018-05-02 19:06:12"));

    answerRepository.save(new Answer(question, 'A', "Orange", false));
    answerRepository.save(new Answer(question, 'B', "Nectarine", true));
    answerRepository.save(new Answer(question, 'C', "Pomegranate", false));
  }

  private void saveQuestion1475() {
    Question question;

    question = questionRepository.save(new Question(6, "Despite his name, which of these musicians is actually from Morocco?", "2018-05-02 19:06:49"));

    answerRepository.save(new Answer(question, 'A', "French Montana", true));
    answerRepository.save(new Answer(question, 'B', "Flo Rida", false));
    answerRepository.save(new Answer(question, 'C', "Bruno Mars", false));
  }

  private void saveQuestion1476() {
    Question question;

    question = questionRepository.save(new Question(7, "“Association football” is the British term for a sport typically known as what in the US?", "2018-05-02 19:07:32"));

    answerRepository.save(new Answer(question, 'A', "Football", false));
    answerRepository.save(new Answer(question, 'B', "Rugby", false));
    answerRepository.save(new Answer(question, 'C', "Soccer", true));
  }

  private void saveQuestion1477() {
    Question question;

    question = questionRepository.save(new Question(8, "Of the US presidents born in the 20th century, who held office first?", "2018-05-02 19:08:10"));

    answerRepository.save(new Answer(question, 'A', "Dwight D. Eisenhower", false));
    answerRepository.save(new Answer(question, 'B', "John F. Kennedy", true));
    answerRepository.save(new Answer(question, 'C', "Lyndon B. Johnson", false));
  }

  private void saveQuestion1478() {
    Question question;

    question = questionRepository.save(new Question(9, "What long-running science fiction franchise began aboard the spacecraft Nostromo?", "2018-05-02 19:09:06"));

    answerRepository.save(new Answer(question, 'A', "Star Trek", false));
    answerRepository.save(new Answer(question, 'B', "Alien", true));
    answerRepository.save(new Answer(question, 'C', "Planet of the Apes", false));
  }

  private void saveQuestion1479() {
    Question question;

    question = questionRepository.save(new Question(10, "Which of these US states has the most official state songs?", "2018-05-02 19:09:58"));

    answerRepository.save(new Answer(question, 'A', "West Virginia", false));
    answerRepository.save(new Answer(question, 'B', "Tennessee", true));
    answerRepository.save(new Answer(question, 'C', "Texas", false));
  }

  private void saveQuestion1480() {
    Question question;

    question = questionRepository.save(new Question(11, "About how long does light from our Sun take to reach Earth?", "2018-05-02 19:10:50"));

    answerRepository.save(new Answer(question, 'A', "8.3 minutes", true));
    answerRepository.save(new Answer(question, 'B', "3.8 minutes", false));
    answerRepository.save(new Answer(question, 'C', "38 seconds", false));
  }

  private void saveQuestion1481() {
    Question question;

    question = questionRepository.save(new Question(12, "A direct flight from Bishkek to Ashgabat will nearly pass over which country’s capital?", "2018-05-02 19:11:43"));

    answerRepository.save(new Answer(question, 'A', "Uzbekistan", true));
    answerRepository.save(new Answer(question, 'B', "Kazakhstan", false));
    answerRepository.save(new Answer(question, 'C', "Afghanistan", false));
  }

  private void saveQuestion1482() {
    Question question;

    question = questionRepository.save(new Question(1, "Which of these is an important ingredient in making coffee?", "2018-05-03 01:03:54"));

    answerRepository.save(new Answer(question, 'A', "Bike chain lubricant", false));
    answerRepository.save(new Answer(question, 'B', "Hot water", true));
    answerRepository.save(new Answer(question, 'C', "Brown mustard", false));
  }

  private void saveQuestion1483() {
    Question question;

    question = questionRepository.save(new Question(2, "Which of these names is also a term that refers to a male deer?", "2018-05-03 01:04:33"));

    answerRepository.save(new Answer(question, 'A', "Gary", false));
    answerRepository.save(new Answer(question, 'B', "Buck", true));
    answerRepository.save(new Answer(question, 'C', "Alfredo", false));
  }

  private void saveQuestion1484() {
    Question question;

    question = questionRepository.save(new Question(3, "Which of these roots is often used to make naturally flavored root beer?", "2018-05-03 01:05:09"));

    answerRepository.save(new Answer(question, 'A', "Ginseng", false));
    answerRepository.save(new Answer(question, 'B', "Sarsaparilla", true));
    answerRepository.save(new Answer(question, 'C', "Cassava", false));
  }

  private void saveQuestion1485() {
    Question question;

    question = questionRepository.save(new Question(4, "In Richard Connell’s famous short story “The Most Dangerous Game,” what is being hunted?", "2018-05-03 01:05:41"));

    answerRepository.save(new Answer(question, 'A', "Whale", false));
    answerRepository.save(new Answer(question, 'B', "Man", true));
    answerRepository.save(new Answer(question, 'C', "Hound", false));
  }

  private void saveQuestion1486() {
    Question question;

    question = questionRepository.save(new Question(5, "What is the name of the robot that has spent more than 10 Earth years exploring Mars?", "2018-05-03 01:06:14"));

    answerRepository.save(new Answer(question, 'A', "Spirit", false));
    answerRepository.save(new Answer(question, 'B', "Pathfinder", false));
    answerRepository.save(new Answer(question, 'C', "Opportunity", true));
  }

  private void saveQuestion1487() {
    Question question;

    question = questionRepository.save(new Question(6, "In what holy location would you find the Dome of the Rock?", "2018-05-03 01:06:59"));

    answerRepository.save(new Answer(question, 'A', "Mount Sinai", false));
    answerRepository.save(new Answer(question, 'B', "Temple Mount", true));
    answerRepository.save(new Answer(question, 'C', "Mount of Olives", false));
  }

  private void saveQuestion1488() {
    Question question;

    question = questionRepository.save(new Question(7, "What is the real name of the co-founder of Cash Money Records?", "2018-05-03 01:07:31"));

    answerRepository.save(new Answer(question, 'A', "Dwayne Carter", false));
    answerRepository.save(new Answer(question, 'B', "Sean Combs", false));
    answerRepository.save(new Answer(question, 'C', "Bryan Williams", true));
  }

  private void saveQuestion1489() {
    Question question;

    question = questionRepository.save(new Question(8, "What US senator had a cameo in the comedy “Wedding Crashers”?", "2018-05-03 01:08:21"));

    answerRepository.save(new Answer(question, 'A', "Joe Lieberman", false));
    answerRepository.save(new Answer(question, 'B', "John McCain", true));
    answerRepository.save(new Answer(question, 'C', "Patrick Leahy", false));
  }

  private void saveQuestion1490() {
    Question question;

    question = questionRepository.save(new Question(9, "The current capital city of which country was NOT its capital in 1990?", "2018-05-03 01:08:56"));

    answerRepository.save(new Answer(question, 'A', "Nigeria", true));
    answerRepository.save(new Answer(question, 'B', "Côte d’Ivoire", false));
    answerRepository.save(new Answer(question, 'C', "Burkina Faso", false));
  }

  private void saveQuestion1491() {
    Question question;

    question = questionRepository.save(new Question(10, "As portrayed in “The King’s Speech,” which king quit and left his stammering brother to take the throne?", "2018-05-03 01:09:30"));

    answerRepository.save(new Answer(question, 'A', "Edward… https://t.co/9DRa19eJEo", false));
  }

  private void saveQuestion1492() {
    Question question;

    question = questionRepository.save(new Question(11, "Taylor Swift reportedly wrote \"Bad Blood\" about Katy Perry after a conflict over what?", "2018-05-03 01:10:05"));

    answerRepository.save(new Answer(question, 'A', "Backup dancers", true));
    answerRepository.save(new Answer(question, 'B', "Award… https://t.co/H6ro3iH6gj", false));
  }

  private void saveQuestion1493() {
    Question question;

    question = questionRepository.save(new Question(12, "In the 1920s, a man notoriously pushed what to the top of Pikes Peak using only his nose?", "2018-05-03 01:11:01"));

    answerRepository.save(new Answer(question, 'A', "Gumball", false));
    answerRepository.save(new Answer(question, 'B', "Peanut", true));
    answerRepository.save(new Answer(question, 'C', "FDR campaign button", false));
  }

  private void saveQuestion1494() {
    Question question;

    question = questionRepository.save(new Question(1, "What structure did King Kong famously climb?", "2018-05-03 19:03:49"));

    answerRepository.save(new Answer(question, 'A', "Mount Everest", false));
    answerRepository.save(new Answer(question, 'B', "Empire State Building", true));
    answerRepository.save(new Answer(question, 'C', "Hogwarts", false));
  }

  private void saveQuestion1495() {
    Question question;

    question = questionRepository.save(new Question(2, "What cartoon character repeatedly perishes on “South Park,” only to return every time?", "2018-05-03 19:04:20"));

    answerRepository.save(new Answer(question, 'A', "Darkwing Duck", false));
    answerRepository.save(new Answer(question, 'B', "Jon Snow", false));
    answerRepository.save(new Answer(question, 'C', "Kenny", true));
  }

  private void saveQuestion1496() {
    Question question;

    question = questionRepository.save(new Question(3, "If a British person asks to use your “lorry,” what do they want to use?", "2018-05-03 19:04:54"));

    answerRepository.save(new Answer(question, 'A', "Skateboard", false));
    answerRepository.save(new Answer(question, 'B', "Truck", true));
    answerRepository.save(new Answer(question, 'C', "Bathroom", false));
  }

  private void saveQuestion1497() {
    Question question;

    question = questionRepository.save(new Question(4, "What animal’s kid is literally called a “kid”?", "2018-05-03 19:05:42"));

    answerRepository.save(new Answer(question, 'A', "Sheep", false));
    answerRepository.save(new Answer(question, 'B', "Kangaroo", false));
    answerRepository.save(new Answer(question, 'C', "Goat", true));
  }

  private void saveQuestion1498() {
    Question question;

    question = questionRepository.save(new Question(5, "What is NOT one of Pittsburgh’s “Three Rivers”?", "2018-05-03 19:06:18"));

    answerRepository.save(new Answer(question, 'A', "Ohio", false));
    answerRepository.save(new Answer(question, 'B', "Beaver", true));
    answerRepository.save(new Answer(question, 'C', "Allegheny", false));
  }

  private void saveQuestion1499() {
    Question question;

    question = questionRepository.save(new Question(6, "Which of these places is naturally home to penguins?", "2018-05-03 19:06:55"));

    answerRepository.save(new Answer(question, 'A', "Alaska", false));
    answerRepository.save(new Answer(question, 'B', "South Africa", true));
    answerRepository.save(new Answer(question, 'C', "Mongolia", false));
  }

  private void saveQuestion1500() {
    Question question;

    question = questionRepository.save(new Question(7, "A character on “Seinfeld” once found the discarded set of what TV show host?", "2018-05-03 19:07:33"));

    answerRepository.save(new Answer(question, 'A', "Merv Griffin", true));
    answerRepository.save(new Answer(question, 'B', "Johnny Carson", false));
    answerRepository.save(new Answer(question, 'C', "Jerry Springer", false));
  }

  private void saveQuestion1501() {
    Question question;

    question = questionRepository.save(new Question(8, "Which of these tech companies does NOT have the same CEO as the other two?", "2018-05-03 19:08:09"));

    answerRepository.save(new Answer(question, 'A', "Kickstarter", true));
    answerRepository.save(new Answer(question, 'B', "Square", false));
    answerRepository.save(new Answer(question, 'C', "Twitter", false));
  }

  private void saveQuestion1502() {
    Question question;

    question = questionRepository.save(new Question(9, "In the film series, which of these boxers officially had a winning record against Rocky Balboa?", "2018-05-03 19:08:49"));

    answerRepository.save(new Answer(question, 'A', "James “Clubber”… https://t.co/uuvrMUUttP", false));
  }

  private void saveQuestion1503() {
    Question question;

    question = questionRepository.save(new Question(10, "In one of the biggest upsets in Tony history, a show about puppets beat out which of these musicals?", "2018-05-03 19:09:41"));

    answerRepository.save(new Answer(question, 'A', "Wicked", true));
    answerRepository.save(new Answer(question, 'B', "", false));
  }

  private void saveQuestion1504() {
    Question question;

    question = questionRepository.save(new Question(11, "In the history of US presidential elections, what third-party candidate got the most electoral votes?", "2018-05-03 19:10:21"));

    answerRepository.save(new Answer(question, 'A', "Ralph Nade… https://t.co/9DH4nslKzn", false));
  }

  private void saveQuestion1505() {
    Question question;

    question = questionRepository.save(new Question(12, "What date is inscribed on the granite waterfront monument in Massachusetts’ Pilgrim Memorial State Park?", "2018-05-03 19:11:25"));

    answerRepository.save(new Answer(question, 'A', "1620", true));
    answerRepository.save(new Answer(question, 'B', "1492", false));
    answerRepository.save(new Answer(question, 'C', "1776", false));
  }

  private void saveQuestion1506() {
    Question question;

    question = questionRepository.save(new Question(1, "Muhammad Ali famously said he could “float like a butterfly, sting like a” what?", "2018-05-04 01:04:25"));

    answerRepository.save(new Answer(question, 'A', "Jellyfish", false));
    answerRepository.save(new Answer(question, 'B', "Bee", true));
    answerRepository.save(new Answer(question, 'C', "Personal insult", false));
  }

  private void saveQuestion1507() {
    Question question;

    question = questionRepository.save(new Question(2, "If you are about to use foul language, you might say “pardon my” what?", "2018-05-04 01:05:00"));

    answerRepository.save(new Answer(question, 'A', "French", true));
    answerRepository.save(new Answer(question, 'B', "Screaming", false));
    answerRepository.save(new Answer(question, 'C', "Grandmother", false));
  }

  private void saveQuestion1508() {
    Question question;

    question = questionRepository.save(new Question(3, "In a trial, who is charged with proving guilt?", "2018-05-04 01:05:38"));

    answerRepository.save(new Answer(question, 'A', "Prosecution", true));
    answerRepository.save(new Answer(question, 'B', "Defense", false));
    answerRepository.save(new Answer(question, 'C', "Judge", false));
  }

  private void saveQuestion1509() {
    Question question;

    question = questionRepository.save(new Question(4, "The leading racer in the Tour de France typically wears what color?", "2018-05-04 01:06:22"));

    answerRepository.save(new Answer(question, 'A', "Black", false));
    answerRepository.save(new Answer(question, 'B', "Yellow", true));
    answerRepository.save(new Answer(question, 'C', "Green", false));
  }

  private void saveQuestion1510() {
    Question question;

    question = questionRepository.save(new Question(5, "Which breed of dog is NOT named in part for an island?", "2018-05-04 01:07:01"));

    answerRepository.save(new Answer(question, 'A', "Sheltie", false));
    answerRepository.save(new Answer(question, 'B', "St. Bernard", true));
    answerRepository.save(new Answer(question, 'C', "Maltese", false));
  }

  private void saveQuestion1511() {
    Question question;

    question = questionRepository.save(new Question(6, "Which of these sci-fi movie titles is also a scientific term that applies to black holes?", "2018-05-04 01:07:45"));

    answerRepository.save(new Answer(question, 'A', "Ex Machina", false));
    answerRepository.save(new Answer(question, 'B', "Solaris", false));
    answerRepository.save(new Answer(question, 'C', "Event Horizon", true));
  }

  private void saveQuestion1512() {
    Question question;

    question = questionRepository.save(new Question(7, "Which of these shirts would an Australian most likely call a “skivvy”?", "2018-05-04 01:08:24"));

    answerRepository.save(new Answer(question, 'A', "Turtleneck", true));
    answerRepository.save(new Answer(question, 'B', "Sleeveless T-shirt", false));
    answerRepository.save(new Answer(question, 'C', "Crop top", false));
  }

  private void saveQuestion1513() {
    Question question;

    question = questionRepository.save(new Question(8, "Which of these terms accurately describes America’s three most popular beer brands as of 2017?", "2018-05-04 01:09:17"));

    answerRepository.save(new Answer(question, 'A', "Lager", true));
    answerRepository.save(new Answer(question, 'B', "Ale", false));
    answerRepository.save(new Answer(question, 'C', "IPA", false));
  }

  private void saveQuestion1514() {
    Question question;

    question = questionRepository.save(new Question(9, "Which of these songs was recorded by a band originally named “On A Friday”?", "2018-05-04 01:09:55"));

    answerRepository.save(new Answer(question, 'A', "Idioteque", true));
    answerRepository.save(new Answer(question, 'B', "Creeping", false));
    answerRepository.save(new Answer(question, 'C', "Just Like Heaven", false));
  }

  private void saveQuestion1515() {
    Question question;

    question = questionRepository.save(new Question(10, "What is the relationship between the towns of Menlo Park, CA and Menlo Park, NJ?", "2018-05-04 01:10:48"));

    answerRepository.save(new Answer(question, 'A', "CA’s named for NJ’s", false));
    answerRepository.save(new Answer(question, 'B', "NJ’s nam… https://t.co/mcLUkhyfMz", false));
  }

  private void saveQuestion1516() {
    Question question;

    question = questionRepository.save(new Question(11, "Which of these did Beyoncé use to announce her first pregnancy?", "2018-05-04 01:11:27"));

    answerRepository.save(new Answer(question, 'A', "Her official website", false));
    answerRepository.save(new Answer(question, 'B', "Instagram", false));
    answerRepository.save(new Answer(question, 'C', "Awards show", true));
  }

  private void saveQuestion1517() {
    Question question;

    question = questionRepository.save(new Question(12, "In Greek mythology, who abandoned his mother and sister to fight alongside the Trojans?", "2018-05-04 01:12:26"));

    answerRepository.save(new Answer(question, 'A', "Achilles", false));
    answerRepository.save(new Answer(question, 'B', "Odysseus", false));
    answerRepository.save(new Answer(question, 'C', "Ares", true));
  }

  private void saveQuestion1518() {
    Question question;

    question = questionRepository.save(new Question(1, "Who typically wins a marathon?", "2018-05-04 19:03:43"));

    answerRepository.save(new Answer(question, 'A', "Fastest runner", true));
    answerRepository.save(new Answer(question, 'B', "Loudest yeller", false));
    answerRepository.save(new Answer(question, 'C', "Messiest eater", false));
  }

  private void saveQuestion1519() {
    Question question;

    question = questionRepository.save(new Question(2, "Which is one of the three categories of Shakespeare’s plays?", "2018-05-04 19:04:19"));

    answerRepository.save(new Answer(question, 'A', "Technothrillers", false));
    answerRepository.save(new Answer(question, 'B', "Tragedies", true));
    answerRepository.save(new Answer(question, 'C', "Single-camera sitcoms", false));
  }

  private void saveQuestion1520() {
    Question question;

    question = questionRepository.save(new Question(3, "Eggs that are fried without being flipped over are typically described how?", "2018-05-04 19:04:58"));

    answerRepository.save(new Answer(question, 'A', "Sunny side up", true));
    answerRepository.save(new Answer(question, 'B', "Soft boiled", false));
    answerRepository.save(new Answer(question, 'C', "Over medium", false));
  }

  private void saveQuestion1521() {
    Question question;

    question = questionRepository.save(new Question(4, "What is the term in typography for adjusting the spacing between characters to create the best look?", "2018-05-04 19:05:33"));

    answerRepository.save(new Answer(question, 'A', "Kerning", true));
    answerRepository.save(new Answer(question, 'B', "Blocking", false));
    answerRepository.save(new Answer(question, 'C', "Strafing", false));
  }

  private void saveQuestion1522() {
    Question question;

    question = questionRepository.save(new Question(5, "With which of the following artists has Sting NOT recorded a song?", "2018-05-04 19:06:21"));

    answerRepository.save(new Answer(question, 'A', "Rod Stewart", false));
    answerRepository.save(new Answer(question, 'B', "Shaggy", false));
    answerRepository.save(new Answer(question, 'C', "Michael Bolton", true));
  }

  private void saveQuestion1523() {
    Question question;

    question = questionRepository.save(new Question(6, "The works of which artist are often used to illustrate the concept of tessellation?", "2018-05-04 19:07:03"));

    answerRepository.save(new Answer(question, 'A', "Claude Monet", false));
    answerRepository.save(new Answer(question, 'B', "MC Escher", true));
    answerRepository.save(new Answer(question, 'C', "Pablo Picasso", false));
  }

  private void saveQuestion1524() {
    Question question;

    question = questionRepository.save(new Question(7, "By definition, which of these would you need to “defenestrate” a prized belonging?", "2018-05-04 19:07:41"));

    answerRepository.save(new Answer(question, 'A', "Law degree", false));
    answerRepository.save(new Answer(question, 'B', "Window", true));
    answerRepository.save(new Answer(question, 'C', "Swimming pool", false));
  }

  private void saveQuestion1525() {
    Question question;

    question = questionRepository.save(new Question(8, "In their original theatrical run, the “Little Rascals” shorts of the 1930s and ’40s were called what?", "2018-05-04 19:08:22"));

    answerRepository.save(new Answer(question, 'A', "Our Gang… https://t.co/k06Tk76fJs", true));
  }

  private void saveQuestion1526() {
    Question question;

    question = questionRepository.save(new Question(9, "A centuries-old game called “Captain’s Mistress” is now often sold under what name?", "2018-05-04 19:09:00"));

    answerRepository.save(new Answer(question, 'A', "Battleship", false));
    answerRepository.save(new Answer(question, 'B', "Yahtzee", false));
    answerRepository.save(new Answer(question, 'C', "Connect Four", true));
  }

  private void saveQuestion1527() {
    Question question;

    question = questionRepository.save(new Question(10, "What athlete has played in the championship games of both the NFL and MLB?", "2018-05-04 19:09:52"));

    answerRepository.save(new Answer(question, 'A', "Bo Jackson", false));
    answerRepository.save(new Answer(question, 'B', "Deion Sanders", true));
    answerRepository.save(new Answer(question, 'C', "Brian Jordan", false));
  }

  private void saveQuestion1528() {
    Question question;

    question = questionRepository.save(new Question(11, "Which of these divisions of geologic time is the shortest?", "2018-05-04 19:10:27"));

    answerRepository.save(new Answer(question, 'A', "Era", false));
    answerRepository.save(new Answer(question, 'B', "Epoch", false));
    answerRepository.save(new Answer(question, 'C', "Age", true));
  }

  private void saveQuestion1529() {
    Question question;

    question = questionRepository.save(new Question(12, "Which film has the same director as the concert movie that opens with the line, “Hi, I’ve got a tape I want to play… https://t.co/U1GqdX3IYc", "2018-05-04 19:11:31"));

  }

  private void saveQuestion1530() {
    Question question;

    question = questionRepository.save(new Question(1, "Which of these kinds of chips would you use to make nachos?", "2018-05-05 01:20:18"));

    answerRepository.save(new Answer(question, 'A', "Tortilla", true));
    answerRepository.save(new Answer(question, 'B', "Poker", false));
    answerRepository.save(new Answer(question, 'C', "Bargaining", false));
  }

  private void saveQuestion1531() {
    Question question;

    question = questionRepository.save(new Question(2, "Modern automobiles typically run on which of these?", "2018-05-05 01:21:19"));

    answerRepository.save(new Answer(question, 'A', "Candle wax", false));
    answerRepository.save(new Answer(question, 'B', "Gasoline", true));
    answerRepository.save(new Answer(question, 'C', "Hand-wound springs", false));
  }

  private void saveQuestion1532() {
    Question question;

    question = questionRepository.save(new Question(3, "If planted properly, what kind of trees will acorns grow into?", "2018-05-05 01:21:55"));

    answerRepository.save(new Answer(question, 'A', "Oaks", true));
    answerRepository.save(new Answer(question, 'B', "Willows", false));
    answerRepository.save(new Answer(question, 'C', "Pines", false));
  }

  private void saveQuestion1533() {
    Question question;

    question = questionRepository.save(new Question(4, "Which phrase consists of two football terms AND describes an arrangement of pulleys?", "2018-05-05 01:22:25"));

    answerRepository.save(new Answer(question, 'A', "Snap and line", false));
    answerRepository.save(new Answer(question, 'B', "Punt and down", false));
    answerRepository.save(new Answer(question, 'C', "Block and tackle", true));
  }

  private void saveQuestion1534() {
    Question question;

    question = questionRepository.save(new Question(5, "What synonym for “evil” comes from an old term referring to the left-hand side?", "2018-05-05 01:23:08"));

    answerRepository.save(new Answer(question, 'A', "Sinister", true));
    answerRepository.save(new Answer(question, 'B', "Depraved", false));
    answerRepository.save(new Answer(question, 'C', "Malevolent", false));
  }

  private void saveQuestion1535() {
    Question question;

    question = questionRepository.save(new Question(6, "Which of these is a weapon in the classic version of the board game Clue?", "2018-05-05 01:23:41"));

    answerRepository.save(new Answer(question, 'A', "Wrench", true));
    answerRepository.save(new Answer(question, 'B', "Poison", false));
    answerRepository.save(new Answer(question, 'C', "Baseball bat", false));
  }

  private void saveQuestion1536() {
    Question question;

    question = questionRepository.save(new Question(7, "In which of these TV shows did the star NOT play a character with the same first name?", "2018-05-05 01:24:31"));

    answerRepository.save(new Answer(question, 'A', "The Drew Carey Show", false));
    answerRepository.save(new Answer(question, 'B', "Th… https://t.co/0g9NVOiErk", false));
  }

  private void saveQuestion1537() {
    Question question;

    question = questionRepository.save(new Question(8, "By definition, if a Middle Eastern dish has dopiaza in its name, it will include what ingredient?", "2018-05-05 01:25:06"));

    answerRepository.save(new Answer(question, 'A', "Onion", true));
    answerRepository.save(new Answer(question, 'B', "Tomato", false));
    answerRepository.save(new Answer(question, 'C', "Rice", false));
  }

  private void saveQuestion1538() {
    Question question;

    question = questionRepository.save(new Question(9, "Which of these MLS soccer teams does NOT play its home games in the US?", "2018-05-05 01:25:43"));

    answerRepository.save(new Answer(question, 'A', "Sounders", false));
    answerRepository.save(new Answer(question, 'B', "Timber", false));
    answerRepository.save(new Answer(question, 'C', "Impact", true));
  }

  private void saveQuestion1539() {
    Question question;

    question = questionRepository.save(new Question(10, "Which of these people served as vice president under the person on the US $50 bill?", "2018-05-05 01:26:27"));

    answerRepository.save(new Answer(question, 'A', "Aaron Burr", false));
    answerRepository.save(new Answer(question, 'B', "Andrew Johnson", false));
    answerRepository.save(new Answer(question, 'C', "Henry Wilson", true));
  }

  private void saveQuestion1540() {
    Question question;

    question = questionRepository.save(new Question(11, "What colors dominate the flag of the world’s smallest nation?", "2018-05-05 01:27:10"));

    answerRepository.save(new Answer(question, 'A', "Yellow / white", true));
    answerRepository.save(new Answer(question, 'B', "Red / white", false));
    answerRepository.save(new Answer(question, 'C', "Blue / white", false));
  }

  private void saveQuestion1541() {
    Question question;

    question = questionRepository.save(new Question(12, "The company whose stock symbol is simply “V” mainly provides which of these?", "2018-05-05 01:28:11"));

    answerRepository.save(new Answer(question, 'A', "Phone services", false));
    answerRepository.save(new Answer(question, 'B', "Cable TV", false));
    answerRepository.save(new Answer(question, 'C', "Financial services", true));
  }

  private void saveQuestion1542() {
    Question question;

    question = questionRepository.save(new Question(1, "In which of these directions can most standard elevators travel?", "2018-05-06 01:05:12"));

    answerRepository.save(new Answer(question, 'A', "North by northwest", false));
    answerRepository.save(new Answer(question, 'B', "Up", true));
    answerRepository.save(new Answer(question, 'C', "Left", false));
  }

  private void saveQuestion1543() {
    Question question;

    question = questionRepository.save(new Question(2, "Which of these statements appears in the famous “Sermon on the Mount” in the Bible?", "2018-05-06 01:06:15"));

    answerRepository.save(new Answer(question, 'A', "My car has a leak", false));
    answerRepository.save(new Answer(question, 'B', "Knee bo… https://t.co/IhKi9gDKUj", false));
  }

  private void saveQuestion1544() {
    Question question;

    question = questionRepository.save(new Question(3, "In what sport would you most likely use the term “bullseye”?", "2018-05-06 01:06:46"));

    answerRepository.save(new Answer(question, 'A', "Golf", false));
    answerRepository.save(new Answer(question, 'B', "Shuffleboard", false));
    answerRepository.save(new Answer(question, 'C', "Darts", true));
  }

  private void saveQuestion1545() {
    Question question;

    question = questionRepository.save(new Question(4, "The speed of sound is named for what Austrian physicist?", "2018-05-06 01:07:19"));

    answerRepository.save(new Answer(question, 'A', "Hans Warp", false));
    answerRepository.save(new Answer(question, 'B', "Klaus Züm", false));
    answerRepository.save(new Answer(question, 'C', "Ernst Mach", true));
  }

  private void saveQuestion1546() {
    Question question;

    question = questionRepository.save(new Question(5, "When used as a slang term for money, how much is a “rack”?", "2018-05-06 01:07:51"));

    answerRepository.save(new Answer(question, 'A', "$20", false));
    answerRepository.save(new Answer(question, 'B', "$100", false));
    answerRepository.save(new Answer(question, 'C', "$1000", true));
  }

  private void saveQuestion1547() {
    Question question;

    question = questionRepository.save(new Question(6, "For what object did “Time” magazine bend the rules for its “Person of the Year” award?", "2018-05-06 01:08:35"));

    answerRepository.save(new Answer(question, 'A', "Mirror", false));
    answerRepository.save(new Answer(question, 'B', "Television", false));
    answerRepository.save(new Answer(question, 'C', "Computer", true));
  }

  private void saveQuestion1548() {
    Question question;

    question = questionRepository.save(new Question(7, "The 2017 fantasy novel “The Dark Prophecy” is set in the same universe as what other novel?", "2018-05-06 01:09:17"));

    answerRepository.save(new Answer(question, 'A', "The Lightning Thief… https://t.co/jbid9zS97g", false));
  }

  private void saveQuestion1549() {
    Question question;

    question = questionRepository.save(new Question(8, "The first moons discovered orbiting a planet other than Earth are known as what?", "2018-05-06 01:09:57"));

    answerRepository.save(new Answer(question, 'A', "Newtonian", false));
    answerRepository.save(new Answer(question, 'B', "Galilean", true));
    answerRepository.save(new Answer(question, 'C', "Copernican", false));
  }

  private void saveQuestion1550() {
    Question question;

    question = questionRepository.save(new Question(9, "Which of these words means the opposite of “deasil”?", "2018-05-06 01:10:37"));

    answerRepository.save(new Answer(question, 'A', "Catty-corner", false));
    answerRepository.save(new Answer(question, 'B', "Widdershins", true));
    answerRepository.save(new Answer(question, 'C', "Clockwise", false));
  }

  private void saveQuestion1551() {
    Question question;

    question = questionRepository.save(new Question(10, "Which of these disputed territories is NOT claimed by the nation of Georgia?", "2018-05-06 01:11:29"));

    answerRepository.save(new Answer(question, 'A', "Transnistria", true));
    answerRepository.save(new Answer(question, 'B', "Abkhazia", false));
    answerRepository.save(new Answer(question, 'C', "South Ossetia", false));
  }

  private void saveQuestion1552() {
    Question question;

    question = questionRepository.save(new Question(11, "Which of these Triple Crown-winning horses ran the Kentucky Derby the fastest?", "2018-05-06 01:12:17"));

    answerRepository.save(new Answer(question, 'A', "War Admiral", false));
    answerRepository.save(new Answer(question, 'B', "American Pharoah", false));
    answerRepository.save(new Answer(question, 'C', "Seattle Slew", true));
  }

  private void saveQuestion1553() {
    Question question;

    question = questionRepository.save(new Question(12, "The lyric “dark side of the moon” is sung in what Pink Floyd song?", "2018-05-06 01:13:35"));

    answerRepository.save(new Answer(question, 'A', "Brain Damage", true));
    answerRepository.save(new Answer(question, 'B', "Eclipse", false));
    answerRepository.save(new Answer(question, 'C', "Any Colour You Like", false));
  }

}
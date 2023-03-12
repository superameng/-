package 语法分析器;

import java.util.Scanner;

public class yufa {
static char[] s = new char[100];
static int sing;
static int i; 
static int n;
 
static void P() {
if(sing==0) {
if(s[i]=='b') {
++i;
S();
if(s[i]=='e') {
++i;
}else{
sing=1;
System.out.println("error!--------不是结尾符号e");
System.exit(-1);
}
}else {
sing=1;
System.out.println("error!--------缺少开头符号b");
System.exit(-1);
}
}
}
static void S() {
if(sing==0) {
A();
if(s[i]==';') {
++i;
// if(s[i]!='e') {
S1();
// }
}else {
sing=1;
System.out.println("error!-----------缺少结尾符号;");
System.exit(-1);
}
}
}
static void S1() {
if(sing==0) {
if(s[i]!='e') {
// ++i;
S();
}
}
}
static void A() {
if(sing==0){
if(s[i+1]=='=') {
n=s[i];
++i;
++i;
E();
if(s[i]==')'||s[i]==';') {
if(s[i]==')') {
++i;
}
}else {
sing=1;
System.out.println("error!--------不是结尾符号；或者）");
System.exit(-1);
}
}else {
sing=1;
System.out.println("error!---------不是赋值语句");
}
}
}
static void E() {
if(sing==0){
T();
if(s[i]=='+'||s[i]=='-'||s[i]==';'||s[i]==')') {
E1();
}else {
sing=1;
System.out.println("error!-----------不是结尾符号+或者-或者）");
System.exit(-1);
}
}
}
static void T() {
if(sing==0){
F();
if(s[i]=='+'||s[i]=='-'||s[i]==';'||s[i]==')'||s[i]=='*'||s[i]=='/') {
T1();
}
}
}
static void F() {
if(sing==0){
if(s[i]=='(') {
++i;
E();
}else {
n=s[i];
++i;
}
}
}
static void T1() {
if(sing==0){
if(s[i]=='*') {
++i;
F();
T1();
}else if(s[i]=='/'){
++i;
F();
T1();
}
}
}
static void E1() {
if(sing==0){
if(s[i]=='+') {
++i;
T();
E1();
}else if(s[i]=='-'){
++i;
T();
E1();
}
}
}
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("请输入语句段：");
String str=sc.next();
s=str.toCharArray();
i=0;
sing=0;
if(s[0]=='#') System.exit(-1);
P();
if(s[i]=='#') {
System.out.println("合法字符串!");
}else {
System.out.println("error!-------不是结尾符号#");
System.exit(-1);
}
}
}

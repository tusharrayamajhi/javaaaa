#include<stdio.h>

int main(){
    // int n;
    // int m;
    // printf("enter a number");
    // scanf("%d%d",&n,&m);
    // int arr[n][m];
    // int ans[m][n];
    // for(int i = 0;i<n;i++){
    //     for(int j =0;j<m;j++){
    //         scanf("%d",&arr[i][j]);
    //     }
    // }
    // for(int i = 0;i<m;i++){
    //     for(int j =0;j<n;j++){
    //         ans[i][j]=arr[j][i];
    //     }
    // }
    // for(int i = 0;i<m;i++){
    //     for(int j =0;j<n;j++){
    //         printf("%d ",ans[i][j]);
    //     }
    //     printf("\n");
    // }
    int n;
    // int ans=1;
    scanf("%d",&n);
//    int a= 0;
//    int b = 1;
//    printf("%d %d ",a,b);
//    for(int i= 0;i<n-2;i++){
//     int c = a+b;
//     printf("%d ",c);
//     a = b;
//     b = c;
//    }
int sum =0;
while(n!=0){
    int a = n%10;
    if(a%2==0){
        sum += a;
    }
    n = n/10;
}
printf("%d",sum);
}
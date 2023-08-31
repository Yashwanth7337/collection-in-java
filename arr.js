const arr=[1,2,3,4,5]
for (let i=0;i<arr.length;i++)
{
    setTimeout(function(){
        console.log(arr[i])

    }, 5000);
}
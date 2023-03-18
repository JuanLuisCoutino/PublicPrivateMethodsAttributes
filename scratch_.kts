
var matrix = Array(5){IntArray(5)}
var increase = 1

for(i in 0 until matrix.size){
    for(j in 0 until matrix[i].size){
        matrix[i][j] = increase
        increase++
    }
}

for(i in 0 until matrix.size){
    for(j in 0 until matrix.size){
        print("${matrix[i][j]}\t")
    }
    println()
}

var diagonalPrincipal = IntArray(matrix.size)
var diagonalSecundaria = IntArray(matrix.size)

for(i in 0 until matrix.size){
    for(j in 0 until matrix[i].size){
        if(i==j){
            diagonalPrincipal[i] = matrix[i][j]
        }
        if((i+j)==matrix.size-1){
            diagonalSecundaria[i] = matrix[i][j]
        }
    }
}
var sumas = 0
diagonalPrincipal.forEach {
    print("$it\t")
    sumas = sumas+it}
print("= $sumas")

sumas = 0
diagonalSecundaria.forEach {
    print("$it\t")
    sumas = sumas + it
}
    print("= $sumas")




--1
eleva2 :: [Int] -> [Int]
eleva2 [] = []
eleva2 (x:xs) = x^2 : eleva2 (xs)

--2
contido :: Char -> String -> Bool
contido c [] = False
contido c (x:xs)
	| x==c = True
	| otherwise = contido c xs

--3
semVogais :: [Char] -> [Char]
semVogais [] = []
semVogais (x:xs)
	| elem x "aeiouAEIOU" = semVogais xs
 	| otherwise = x:(semVogais xs)

--4
translate :: [(Float,Float)] -> [(Float,Float)]
translate [] = []
translate (x:xs) = (fst(x)+2, snd(x)+2) : translate xs 

--5
geraTabela :: Int ->  [(Int,Int)]
geraTabela 0 = []
geraTabela n = (n,n^2) : geraTabela (n-1)
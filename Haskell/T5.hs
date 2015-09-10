--1
addSulffx :: String -> [String] -> [String]
addSulffx x y = [ y ++ x | y <- y]

--2
addSulffxR :: String -> [String] -> [String]
addSulffxR  _ [] = []
addSulffxR y (x:xs) = (x ++ y) : addSulffxR y xs

--3
countShorts :: [String] -> Int
countShorts [] = 0
countShorts (x:xs)
	| length(x) < 5 =  1 + countShorts xs
	|otherwise = 0 + countShorts xs

--4
countShorts2 :: [String] -> Int
countShorts2 x = length ([x| x<-x , length(x)<5])

--5
ciclo :: Int -> [Int] -> [Int]
ciclo  0 _ = []
ciclo n x =  x ++ ciclo (n-1) x

--6
combine :: [Int] -> [String] -> [(Int,String)]
combine [] [] = []
combine (x:xs)(c:cs) = (x,c) : combine xs cs

--7
numera :: [String] -> [(Int,String)]
numera []=[] 
numera x =let
	aux []=[]
	aux x = ((length(x), last x) : aux (init x))
	in reverse (aux x)

--9
crossProduct :: [a] -> [b] -> [(a,b)]
crossProduct _ []=[]
crossProduct [] _=[] 
crossProduct (y:ys) x = pairWithAll y x ++ crossProduct ys x

pairWithAll :: a -> [b] -> [(a,b)]
pairWithAll a []=[]
pairWithAll y (x:xs) = (y,x) : pairWithAll y xs


--11
funcTuple :: [(a,b)] -> ([a],[b])
funcTuple [] = ([],[])
funcTuple x =  let
	func1 []=[]
	func1  x = fst(head x) : func1 (tail x)
	func2 []=[]
	func2 x = snd(head x) : func2 (tail x)
	in (func1 x,func2 x)

--12
funcTuple2 :: [(a,b)] -> ([a],[b])
funcTuple2 x = ([fst(x) | x<-x], [snd(x) | x<-x])

--13
funcTuple3 :: [(a,b)] -> ([a],[b])
funcTuple3 x = (map(fst) x , map(snd) x)

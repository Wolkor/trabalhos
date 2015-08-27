--1
isEven :: Int -> Bool
isEven n = mod n 2 == 0

--2
somaQuad :: Int -> Int -> Int
somaQuad x y = x^2 + y^2

--3
doubleFrist :: [Int] -> Int
doubleFrist x= head x^2

--4
hasEqHeads ::[Int] -> [Int] -> Bool
hasEqHeads x y = head x == head y

--5
addMr :: [String] -> [String]
addMr x = map ("Mr." ++) x

--6
contEsp :: String -> Int
contEsp x = length(filter(==' ')x)

--7
cal :: [Double] -> [Double]
cal n = [3*n^2 + 2/n + 1 | n <- n] 

--8
idade :: [Int] -> [Int]
idade x = filter(< 1970) x

--9
serie :: Double -> [Double] -> Double
serie m list = foldr1(+)[x/m | x <- list]

--10
charFound :: Char -> String -> Bool
charFound x l = any (== x) l


--11
htmlListItems :: [String] -> [String]
htmlListItens [] = []
htmlListItems list = ["<LI>" ++ x ++ "<LI>" | x <- list]

--12
--takeWhile (/=2^3) [1,2,3,4,5,5,67,8,2,34]
--takeWhile (> 'd')"elwetasdgr"

--13
terminA :: [String] -> [String]
terminA [] = []
terminA x = filter(/=[]) [if last (takeWhile(/=' ') (x)) =='a' then x else [] | x<-x] 
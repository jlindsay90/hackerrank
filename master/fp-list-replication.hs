f :: Int -> [Int] -> [Int]
f n xs = concatMap (replicate n) xs

main :: IO ()
main = getContents >>=
       mapM_ print. (\ (n:arr) -> f n arr). map read. words


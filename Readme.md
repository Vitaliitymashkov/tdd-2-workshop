# TDD tips and tricks

This project is intended to emphasize the gaps in TDD approach - namely, to show when 100% tests coverage doesn't mean that code works as expected (having design issues).

    integer max value = 2,147,483,647 => 12!
    long max value  = 9,223,372,036,854,775,807 => 20!



Table with results

| Number                                                                   | Factorial value                                                                        |
|--------------------------------------------------------------------------|----------------------------------------------------------------------------------------|
| 12! = correct                                                            | 479 001 600                                                                            |
| 12! = Algorithm with int                                                 | 479 001 600                                                                            |
|                                                                          |                                                                                        |
| 13! = correct                                                            | 6 227 020 800                                                                          |
| <span style="color:red">13! = Algorithm with int <br/> Overflown! </red> | <span style="color:red">1 932 053 504 </red>                                           |
|                                                                          |                                                                                        |
| 14! = correct                                                            | 87 178 291 200                                                                         |
| <span style="color:red"> 14! = Algorithm with int <br/> Overflown! </red>                 | <span style="color:red"> 1 278 945 280 </red>                                          |
| 14! = Algorithm with long                                                | 87 178 291 200                                                                         |
|                                                                          |                                                                                        |
| 20! = correct                                                            | 2 432 902 008 176 640 000                                                              |
| <span style="color:red">20! = Algorithm with int <br/> Overflown! </red>                        | <span style="color:red"> -2 102 132 736</red>                                          |
| 20! = Algorithm with long                                                | 2 432 902 008 176 640 000                                                              |
|                                                                          |                                                                                        |
| 21! = correct                                                            | 2 432 902 008 176 640 000                                                              |
| <span style="color:red">21! = Algorithm with int  <br/> Overflown!   </red>                     | <span style="color:red"> -1 195 114 496</red>                                          |
| <span style="color:red">21! = Algorithm with long <br/> Overflown! </red>                       | <span style="color:red">-4 249 290 049 419 214 848 </red>                              |
|                                                                          |                                                                                        |
| 50! = correct                                                            | 30 414 093 201 713 378 043 612 608 166 064 768 844 377 641 568 960 512 000 000 000 000 |
| <span style="color:red">50! = Algorithm with int <br/> Overflown!  </red>                       | <span style="color:red">0</red>                                                        |
| <span style="color:red">50! = Algorithm with long <br/> Overflown! </red>                 | <span style="color:red">-3 258 495 067 890 909 184</red>                               |
|                                                                          |                                                                                        |


Exemplary figures

    https://www.thelearningpoint.net/home/mathematics/factorial
    https://www.thelearningpoint.net/home/mathematics/factorial/factorial-50


| Number       | Factorial                                                   |
|--------------|-------------------------------------------------------------|
| 0            | 1                                                           |
| 1	           | 1                                                           |
| 2	           | 2                                                           |
| 3	           | 6                                                           |
| 4	           | 24                                                          |
| 5	           | 120                                                         |
| 6	           | 720                                                         |
| 7	           | 5040                                                        |
| 8	           | 40320                                                       |
| 9	           | 362880                                                      |
| 10	          | 3628800                                                     |
| 11	          | 39916800                                                    |
| 12	          | 479001600                                                   |
| **int max**  | **2147483647**                                              |
| 13	          | 6227020800                                                  |
| 14	          | 87178291200                                                 |
| 15	          | 1307674368000                                               |
| 16	          | 20922789888000                                              |
| 17	          | 355687428096000                                             |
| 18	          | 6402373705728000                                            |
| 19	          | 121645100408832000                                          |
| 20	          | 2432902008176640000                                         |
| **long max** | 2,432,902,008,176,640,000<br/>**9,223,372,036,854,775,807** |
| 21           | 51090942171709440000                                        |


## Issues with the code in different modules

## TDD-1-factorial-integer

1. The code works well when number is less 13.
2. When number is 13 or above - result is wrong (probably overflow bit is set to indicate an issue, but it is not checked in the code). So 13! with this method equals 1932053504.

## TDD-2-factorial-long

1. The code works well when number is less 22.
2. When number is 22 or above - result is wrong (probably overflow bit is set to indicate an issue, but it is not checked in the code). So 22! with this method equals -1250660718674968576.

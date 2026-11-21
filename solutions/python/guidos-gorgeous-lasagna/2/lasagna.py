"""Functions used in preparing Guido's gorgeous lasagna.

Learn about Guido, the creator of the Python language:
https://en.wikipedia.org/wiki/Guido_van_Rossum

This is a module docstring, used to describe the functionality
of a module and its functions and/or classes.
"""


EXPECTED_BAKE_TIME = 40
PREPARATION_TIME = 2 



def bake_time_remaining(elapsed_bake_time ):
    """Calculate the bake time remaining.

    :param : int - baking time already elapsed.
    :return: int - remaining bake time.
    """
    return EXPECTED_BAKE_TIME - elapsed_bake_time




def preparation_time_in_minutes(number_of_layers):
    """Calculate the bake time remaining.

    :param elapsed_bake_time: int - baking time already elapsed.
    :return: int - remaining bake time (in minutes) derived from 'EXPECTED_BAKE_TIME'.
    """
    return number_of_layers * PREPARATION_TIME





def elapsed_time_in_minutes(number_of_layers: int, elapsed_bake_time: int) :
    """Calculate the elapsed minutes.

    :param elapsed_bake_time: int - baking time already elapsed.
    :param number_of_layers: int - number of layers they are baked
    :return: int - remaining bake time (in minutes) derived from 'EXPECTED_BAKE_TIME'.
    """
    
    return   preparation_time_in_minutes(number_of_layers) + elapsed_bake_time


print(elapsed_time_in_minutes(1,3))
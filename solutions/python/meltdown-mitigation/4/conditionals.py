"""Functions to prevent a nuclear meltdown."""


def is_criticality_balanced(temperature, neutrons_emitted):
    """Verify criticality is balanced.
    
    :param temperature: int or float
    :param neutrons_emitted: int or float
    :return: boolen - is criticality is balanced or not 
    """

    if temperature < 800 and neutrons_emitted > 500 and (temperature * neutrons_emitted ) < 500000:
        return True

    return False



def reactor_efficiency(voltage, current, theoretical_max_power):
    """Assess reactor efficiency zone.

    :param voltage: int or float
    :param current: int or float
    :param theoretical_max_power: int or float
    :return: str - the reactor efficiency 
    """

    genrated_power = voltage * current

    efficiency = ( genrated_power / theoretical_max_power ) * 100

    if efficiency >= 80:
        return "green"
    if  60 <=efficiency < 80 :
        return "orange"
    if 30 <= efficiency < 60:
        return "red"
    
    return "black"


def fail_safe(temperature,   neutrons_produced_per_second, threshold):
    """Assess and return status code for the reactor.

    :param temperature: (int or float) - The value of the temperature in kelvin.
    :param neutrons_produced_per_second: (int or float) - The neutron flux.
    :param threshold: (int or float) - The threshold for the category.

    :return: str - One of ('LOW', 'NORMAL', 'DANGER').

    Note:
        1. 'LOW' -> `temperature * neutrons per second` < 90% of `threshold`
        2. 'NORMAL' -> `temperature * neutrons per second` +/- 10% of `threshold`
        3. 'DANGER' -> `temperature * neutrons per second` is not in the above-stated ranges
    """

    product = temperature * neutrons_produced_per_second

    if  product < 0.9 * threshold:
        return "LOW"
    if 1.1 * threshold <= product >= 0.9 * threshold:
        return "NORMAL"
    
    return "DANGER"

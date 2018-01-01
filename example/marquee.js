import React, {Component} from 'react';
import {NativeModules, requireNativeComponent, View} from 'react-native';
import PropTypes from 'prop-types';

const MarqueeModule = {
    getDisplayEntity: (displayData) => {
        return NativeModules.MarqueeModule.getDisplayEntity(displayData)
    }
}

class MarqueeTextView extends Component {

    static propTypes = {
        items: PropTypes.array.isRequired,
        ...View.propTypes // 包含默认的View的属性
    }

    render() {
        return (
            <MarqueeTextViewNativeComponent
                {...this.props}
            />
        );
    }
}

const MarqueeTextViewNativeComponent = requireNativeComponent('MarqueeTextView', MarqueeTextView);

export {
    MarqueeTextView,
    MarqueeModule
};

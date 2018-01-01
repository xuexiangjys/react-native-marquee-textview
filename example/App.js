/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 * @flow
 */

import React, {Component} from 'react';
import {
    View
} from 'react-native';
import {MarqueeModule, MarqueeTextView} from "./marquee";

export default class App extends Component<{}> {

    state = {
        items: []
    }

    componentDidMount() {
        MarqueeModule.getDisplayEntity('《赋得古原草送别》|离离原上草，一岁一枯荣。|野火烧不尽，春风吹又生。|远芳侵古道，晴翠接荒城。|又送王孙去，萋萋满别情。').then(values => {
            this.setState({
                items: values
            })
        })
    }

    render() {
        return (
            <View style={{flex: 1}}>
                <MarqueeTextView items={this.state.items} style={{width: '100%', height: '5%', backgroundColor: '#DDDDDD'}}/>
            </View>
        );
    }
}
